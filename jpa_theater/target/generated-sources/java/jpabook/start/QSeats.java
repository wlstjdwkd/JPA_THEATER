package jpabook.start;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSeats is a Querydsl query type for Seats
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QSeats extends EntityPathBase<Seats> {

    private static final long serialVersionUID = 1515898040L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSeats seats = new QSeats("seats");

    public final ListPath<Screen_Seat, QScreen_Seat> screenSeats = this.<Screen_Seat, QScreen_Seat>createList("screenSeats", Screen_Seat.class, QScreen_Seat.class, PathInits.DIRECT2);

    public final StringPath seatColumn = createString("seatColumn");

    public final NumberPath<Integer> seatId = createNumber("seatId", Integer.class);

    public final StringPath seatRow = createString("seatRow");

    public final StringPath status = createString("status");

    public final QTheaters theaterId;

    public QSeats(String variable) {
        this(Seats.class, forVariable(variable), INITS);
    }

    public QSeats(Path<? extends Seats> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSeats(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSeats(PathMetadata metadata, PathInits inits) {
        this(Seats.class, metadata, inits);
    }

    public QSeats(Class<? extends Seats> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.theaterId = inits.isInitialized("theaterId") ? new QTheaters(forProperty("theaterId")) : null;
    }

}

