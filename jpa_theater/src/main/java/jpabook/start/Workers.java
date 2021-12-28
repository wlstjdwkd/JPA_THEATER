package jpabook.start;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@Inheritance(strategy =  InheritanceType.JOINED)
@DiscriminatorColumn(name = "DTYPE", length = 45)
@Table(name="WORKERS")
public abstract class Workers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="WORKER_ID")
    private int workerId;
    @Column(length = 45)
    private String name;
    private int age;

    @OneToMany(mappedBy = "worker")
    private List<Movie_Worker> movieWorkers = new ArrayList<>();
    public List<Movie_Worker> getMovieWorkers() {
        return movieWorkers;
    }
    public void setMovieWorkers(List<Movie_Worker> movieWorkers) {
        this.movieWorkers = movieWorkers;
    }

}
