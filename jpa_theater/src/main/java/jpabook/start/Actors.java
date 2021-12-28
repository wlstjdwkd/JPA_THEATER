package jpabook.start;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter
@Entity
@DiscriminatorValue("A")
@Table(name="ACTORS")
public class Actors extends Workers{

    @Column(nullable = false)
    private int height;
    @Column(length = 45)
    private String instagramId;

}
