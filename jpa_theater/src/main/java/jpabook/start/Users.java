package jpabook.start;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name="USERS")
public class Users extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private int userId;

    @Column(length = 10, nullable = false)
    private String name;

    @Column(nullable = false)
    private int age;

    @Embedded
    private Address homeAddress;

    @OneToMany(mappedBy = "usersUserId", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Tickets> tickets = new ArrayList<Tickets>();
    public List<Tickets> getTickets(){
        return tickets;
    }
    public void setTickets(List<Tickets> tickets) {
        this.tickets = tickets;
    }
}
