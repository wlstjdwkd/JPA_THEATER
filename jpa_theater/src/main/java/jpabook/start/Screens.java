package jpabook.start;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name="SCREENS")
public class Screens {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SCREEN_ID")
    private int screenId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "THEATER_ID", nullable = false)
    private Theaters theaterId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MOVIE_ID", nullable = false)
    private Movies movieId;

    @OneToMany(mappedBy = "tid")
    private List<Tickets> tickets = new ArrayList<>();
    public List<Tickets> getTickets() {
        return tickets;
    }
    public void setTickets(List<Tickets> tickets) {
        this.tickets = tickets;
    }

    @Column(length = 45)
    private LocalDateTime startTime;

    @Column(length = 45)
    private LocalDateTime endTime;
}
