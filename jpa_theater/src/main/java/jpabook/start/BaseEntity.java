package jpabook.start;

import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Setter
@MappedSuperclass
public abstract class BaseEntity {

    private LocalDateTime createdDate;
    private LocalDateTime lastModifiedDate;

}
