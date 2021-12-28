package jpabook.start;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTickets is a Querydsl query type for Tickets
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QTickets extends EntityPathBase<Tickets> {

    private static final long serialVersionUID = 1787692561L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTickets tickets = new QTickets("tickets");

    public final QScreens screenId;

    public final ListPath<Screen_Seat, QScreen_Seat> screenSeats = this.<Screen_Seat, QScreen_Seat>createList("screenSeats", Screen_Seat.class, QScreen_Seat.class, PathInits.DIRECT2);

    public final StringPath state = createString("state");

    public final NumberPath<Integer> tid = createNumber("tid", Integer.class);

    public final QUsers usersUserId;

    public QTickets(String variable) {
        this(Tickets.class, forVariable(variable), INITS);
    }

    public QTickets(Path<? extends Tickets> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTickets(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTickets(PathMetadata metadata, PathInits inits) {
        this(Tickets.class, metadata, inits);
    }

    public QTickets(Class<? extends Tickets> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.screenId = inits.isInitialized("screenId") ? new QScreens(forProperty("screenId"), inits.get("screenId")) : null;
        this.usersUserId = inits.isInitialized("usersUserId") ? new QUsers(forProperty("usersUserId"), inits.get("usersUserId")) : null;
    }

}

