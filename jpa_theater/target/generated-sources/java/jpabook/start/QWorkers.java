package jpabook.start;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QWorkers is a Querydsl query type for Workers
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QWorkers extends EntityPathBase<Workers> {

    private static final long serialVersionUID = 340863967L;

    public static final QWorkers workers = new QWorkers("workers");

    public final NumberPath<Integer> age = createNumber("age", Integer.class);

    public final ListPath<Movie_Worker, QMovie_Worker> movieWorkers = this.<Movie_Worker, QMovie_Worker>createList("movieWorkers", Movie_Worker.class, QMovie_Worker.class, PathInits.DIRECT2);

    public final StringPath name = createString("name");

    public final NumberPath<Integer> workerId = createNumber("workerId", Integer.class);

    public QWorkers(String variable) {
        super(Workers.class, forVariable(variable));
    }

    public QWorkers(Path<? extends Workers> path) {
        super(path.getType(), path.getMetadata());
    }

    public QWorkers(PathMetadata metadata) {
        super(Workers.class, metadata);
    }

}

