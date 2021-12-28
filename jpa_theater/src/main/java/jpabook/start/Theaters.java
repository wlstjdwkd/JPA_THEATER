package jpabook.start;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name="THEATERS")
public class Theaters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int theaterId;
    @Column(length = 45)
    private String name;
    @Column(length = 45)
    private String floor;

    @OneToMany(mappedBy = "theaterId")
    private List<Seats> seats = new ArrayList<>();
    public List<Seats> getSeats() {
        return seats;
    }
    public void setSeats(List<Seats> seats) {
        this.seats = seats;
    }

    @OneToMany(mappedBy = "theaterId")
    private List<Screens> screens = new ArrayList<>();
    public List<Screens> getScreens() {
        return screens;
    }
    public void setScreens(List<Screens> screens) {
        this.screens = screens;
    }
}
