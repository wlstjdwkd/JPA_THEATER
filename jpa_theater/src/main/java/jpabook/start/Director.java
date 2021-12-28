package jpabook.start;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@DiscriminatorValue("D")
@Table(name="DIRECTORS")
public class Director extends Workers{

    @Column(length = 45, nullable = false)
    private String birthPlace;
}
