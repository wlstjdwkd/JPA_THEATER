package jpabook.start;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;


/**
 * QDirector is a Querydsl query type for Director
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QDirector extends EntityPathBase<Director> {

    private static final long serialVersionUID = -2107430494L;

    public static final QDirector director = new QDirector("director");

    public final QWorkers _super = new QWorkers(this);

    //inherited
    public final NumberPath<Integer> age = _super.age;

    public final StringPath birthPlace = createString("birthPlace");

    //inherited
    public final ListPath<Movie_Worker, QMovie_Worker> movieWorkers = _super.movieWorkers;

    //inherited
    public final StringPath name = _super.name;

    //inherited
    public final NumberPath<Integer> workerId = _super.workerId;

    public QDirector(String variable) {
        super(Director.class, forVariable(variable));
    }

    public QDirector(Path<? extends Director> path) {
        super(path.getType(), path.getMetadata());
    }

    public QDirector(PathMetadata metadata) {
        super(Director.class, metadata);
    }

}

