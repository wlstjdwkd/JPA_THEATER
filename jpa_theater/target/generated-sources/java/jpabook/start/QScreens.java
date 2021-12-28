package jpabook.start;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QScreens is a Querydsl query type for Screens
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QScreens extends EntityPathBase<Screens> {

    private static final long serialVersionUID = 742087857L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QScreens screens = new QScreens("screens");

    public final DateTimePath<java.util.Date> endTime = createDateTime("endTime", java.util.Date.class);

    public final QMovies movieId;

    public final NumberPath<Integer> screenId = createNumber("screenId", Integer.class);

    public final DateTimePath<java.util.Date> startTime = createDateTime("startTime", java.util.Date.class);

    public final QTheaters theaterId;

    public final ListPath<Tickets, QTickets> tickets = this.<Tickets, QTickets>createList("tickets", Tickets.class, QTickets.class, PathInits.DIRECT2);

    public QScreens(String variable) {
        this(Screens.class, forVariable(variable), INITS);
    }

    public QScreens(Path<? extends Screens> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QScreens(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QScreens(PathMetadata metadata, PathInits inits) {
        this(Screens.class, metadata, inits);
    }

    public QScreens(Class<? extends Screens> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.movieId = inits.isInitialized("movieId") ? new QMovies(forProperty("movieId")) : null;
        this.theaterId = inits.isInitialized("theaterId") ? new QTheaters(forProperty("theaterId")) : null;
    }

}

