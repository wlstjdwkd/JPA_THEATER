package jpabook.start;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QMovies is a Querydsl query type for Movies
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QMovies extends EntityPathBase<Movies> {

    private static final long serialVersionUID = -413725991L;

    public static final QMovies movies = new QMovies("movies");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdDate = _super.createdDate;

    public final EnumPath<Genre> genre = createEnum("genre", Genre.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> lastModifiedDate = _super.lastModifiedDate;

    public final NumberPath<Integer> movie_id = createNumber("movie_id", Integer.class);

    public final ListPath<Movie_Worker, QMovie_Worker> movieWorkers = this.<Movie_Worker, QMovie_Worker>createList("movieWorkers", Movie_Worker.class, QMovie_Worker.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final DatePath<java.time.LocalDate> opening_date = createDate("opening_date", java.time.LocalDate.class);

    public final NumberPath<Integer> running_time = createNumber("running_time", Integer.class);

    public final ListPath<Screens, QScreens> screens = this.<Screens, QScreens>createList("screens", Screens.class, QScreens.class, PathInits.DIRECT2);

    public QMovies(String variable) {
        super(Movies.class, forVariable(variable));
    }

    public QMovies(Path<? extends Movies> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMovies(PathMetadata metadata) {
        super(Movies.class, metadata);
    }

}

