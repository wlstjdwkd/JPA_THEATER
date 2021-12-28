package jpabook.start;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="SCREEN_SEAT")
public class Screen_Seat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ticketSeatId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SEAT_ID", nullable = false)
    private Seats seatId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TICKET_ID", nullable = false)
    private Tickets ticketId;
}
