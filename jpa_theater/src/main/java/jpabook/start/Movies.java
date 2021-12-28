package jpabook.start;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

import java.util.ArrayList;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name="MOVIES")
public class Movies extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int movie_id;

    @Column(length = 45)
    private String name;

    @Column(length = 45)
    private LocalDate opening_date;

    @Enumerated(EnumType.STRING)
    @Column(length = 45)
    private Genre genre;

    private int running_time;

    @OneToMany(mappedBy = "movieId")
    private List<Screens> screens = new ArrayList<>();
    public List<Screens> getScreens() {
        return screens;
    }
    public void setScreens(List<Screens> screens) {
        this.screens = screens;
    }

    @OneToMany(mappedBy = "movieId")
    private List<Movie_Worker> movieWorkers = new ArrayList<>();
    public List<Movie_Worker> getMovieWorkers() {
        return movieWorkers;
    }
    public void setMovieWorkers(List<Movie_Worker> movieWorkers) {
        this.movieWorkers = movieWorkers;
    }

}
