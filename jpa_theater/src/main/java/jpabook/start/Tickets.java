package jpabook.start;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="TICKETS")
public class Tickets {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TICKET_ID")
    private int tid;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SCREEN_ID", nullable = false)
    private Screens screenId;

    @Column(name = "STATE", nullable = false, length = 45)
    private String state;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "USER_ID", nullable = false)
    private Users usersUserId;

    @OneToMany(mappedBy = "ticketId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Screen_Seat> screenSeats = new ArrayList<>();
    public List<Screen_Seat> getScreenSeats() {
        return screenSeats;
    }
    public void setScreenSeats(List<Screen_Seat> screenSeats) {
        this.screenSeats = screenSeats;
    }
}
