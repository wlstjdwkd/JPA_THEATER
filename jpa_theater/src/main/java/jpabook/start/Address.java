package jpabook.start;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address {
    @Column(length = 20)
    private String city;
    @Column(length = 20)
    private String street;
    @Column(length = 20)
    private String zipCode;
}
