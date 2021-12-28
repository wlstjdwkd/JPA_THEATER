package jpabook.start;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="SEATS")
public class Seats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int seatId;

    @Column(length = 3, nullable = false)
    private String seatRow;

    @Column(length = 3, nullable = false)
    private String seatColumn;
    @Column(length = 45)
    private String status;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "THEATER_ID", nullable = false)
    private Theaters theaterId;

    @OneToMany(mappedBy = "seatId")
    private List<Screen_Seat> screenSeats = new ArrayList<>();
    public List<Screen_Seat> getScreenSeats() {
        return screenSeats;
    }
    public void setScreenSeats(List<Screen_Seat> screenSeats) {
        this.screenSeats = screenSeats;
    }
}
