package jpabook.start;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.dsl.BooleanExpression;
import com.querydsl.jpa.impl.JPAQueryFactory;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class JpaMain {
    static EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpabook");

    public static void main(String[] args){
        EntityManager em = emf.createEntityManager();

        EntityTransaction tx = em.getTransaction();

        try{
            tx.begin();

//            Movies movie1 = CreateMovie("고스트버스터즈 라이즈",LocalDate.of(2021,12,01),Genre.ACTION,124);
//            Movies movie2 = CreateMovie("유체이탈자",LocalDate.of(2021,11,24),Genre.ACTION,108);
//            Movies movie3 = CreateMovie("라스트 나잇 인 소호",LocalDate.of(2021,11,30),Genre.HOROR,116);
//            Movies movie4 = CreateMovie("매트릭스 리저렉션",LocalDate.of(2021,11,25),Genre.ACTION,120);
//
//            Director director1 = createDirector(44, "Jason Reitman", "Canada");
//            Director director2 = createDirector(54, "윤재근", "대한민국");
//            Director director3 = createDirector(47, "Edgar Howard Wright", "England");
//            Director director4 = createDirector(44, "Lana Wachowski", "America");
//            Actors actor1 = createActor(57, "Keanu Reeves", "KR", 186);
//            Actors actor2 = createActor(39, "Priyanka Chopra", "PC", 165);
//            Actors actor3 = createActor(54, "Carrie-Anne Moss", "CAM", 173);
//            Actors actor4 = createActor(29, "Jessica Henwick", "JH", 168);
//            Actors actor5 = createActor(25, "Taylor-Joy", "TJ", 160);
//            Actors actor6 = createActor(21, "Thomasin McKenzie", "TM", 165);
//            Actors actor7 = createActor(39, "Matt Smith", "MS", 182);
//            Actors actor8 = createActor(35, "Oliver Phelps", "OP", 191);
//            Actors actor9 = createActor(39, "임지연", "JY", 166);
//            Actors actor10 = createActor(42, "윤계상", "GS", 182);
//            Actors actor11 = createActor(50, "박용우", "YW", 176);
//            Actors actor12 = createActor(41, "박지환", "JH", 170);
//            Actors actor13 = createActor(71, "William James Murray", "WJM", 187);
//            Actors actor14 = createActor(69, "Dan Aykroyd", "DA", 180);
//            Actors actor15 = createActor(52, "Paul Stephen Rudd", "PSR", 178);
//            Actors actor16 = createActor(75, "Ernie Hudson", "EH", 183);
//
//
//            Movie_Worker movieWorker1 = createMovieWorker(director1, movie1, RoleType.DIRECTOR);
//            Movie_Worker movieWorker2 = createMovieWorker(actor13, movie1, RoleType.MAIN);
//            Movie_Worker movieWorker3 = createMovieWorker(actor14, movie1, RoleType.MAIN);
//            Movie_Worker movieWorker4 = createMovieWorker(actor15, movie1, RoleType.SUB);
//            Movie_Worker movieWorker5 = createMovieWorker(actor16, movie1, RoleType.SUB);
//            Movie_Worker movieWorker6 = createMovieWorker(director2, movie2, RoleType.DIRECTOR);
//            Movie_Worker movieWorker7 = createMovieWorker(actor9, movie2, RoleType.MAIN);
//            Movie_Worker movieWorker8 = createMovieWorker(actor10, movie2, RoleType.MAIN);
//            Movie_Worker movieWorker9 = createMovieWorker(actor11, movie2, RoleType.SUB);
//            Movie_Worker movieWorker10 = createMovieWorker(actor12, movie2, RoleType.SUB);
//            Movie_Worker movieWorker11 = createMovieWorker(director3, movie3, RoleType.DIRECTOR);
//            Movie_Worker movieWorker12 = createMovieWorker(actor5, movie3, RoleType.MAIN);
//            Movie_Worker movieWorker13 = createMovieWorker(actor6, movie3, RoleType.MAIN);
//            Movie_Worker movieWorker14 = createMovieWorker(actor7, movie3, RoleType.SUB);
//            Movie_Worker movieWorker15 = createMovieWorker(actor8, movie3, RoleType.SUB);
//            Movie_Worker movieWorker16 = createMovieWorker(director4, movie4, RoleType.DIRECTOR);
//            Movie_Worker movieWorker17 = createMovieWorker(actor1, movie4, RoleType.MAIN);
//            Movie_Worker movieWorker18 = createMovieWorker(actor2, movie4, RoleType.MAIN);
//            Movie_Worker movieWorker19 = createMovieWorker(actor3, movie4, RoleType.SUB);
//            Movie_Worker movieWorker20 = createMovieWorker(actor4, movie4, RoleType.SUB);
//
//            Theaters theater1= createTheater("1상영관", "1층");
//            Theaters theater2= createTheater("2상영관", "2층");
//
//
//            Seats seat1= createSeats("1","1","o",theater1);
//            Seats seat2= createSeats("1","2","o",theater1);
//            Seats seat3= createSeats("1","3","o",theater1);
//            Seats seat4= createSeats("1","4","o",theater1);
//            Seats seat5= createSeats("1","5","o",theater1);
//            Seats seat6= createSeats("2","1","o",theater1);
//            Seats seat7= createSeats("2","2","o",theater1);
//            Seats seat8= createSeats("2","3","o",theater1);
//            Seats seat9= createSeats("2","4","o",theater1);
//            Seats seat10= createSeats("2","5","o",theater1);
//            Seats seat11= createSeats("1","1","o",theater2);
//            Seats seat12= createSeats("1","2","o",theater2);
//            Seats seat13= createSeats("1","3","o",theater2);
//            Seats seat14= createSeats("1","4","o",theater2);
//            Seats seat15= createSeats("1","5","o",theater2);
//            Seats seat16= createSeats("2","1","o",theater2);
//            Seats seat17= createSeats("2","2","o",theater2);
//            Seats seat18= createSeats("2","3","o",theater2);
//            Seats seat19= createSeats("2","4","o",theater2);
//            Seats seat20= createSeats("2","5","o",theater2);
//
//            Screens screens1 = createScreen(theater1,movie1, LocalDateTime.of(2021,12,1,12,0));
//            Screens screens2 = createScreen(theater1,movie2, LocalDateTime.of(2021,12,1,15,0));
//            Screens screens3 = createScreen(theater1,movie3, LocalDateTime.of(2021,12,1,18,0));
//            Screens screens4 = createScreen(theater2,movie4, LocalDateTime.of(2021,12,1,13,0));
//            Screens screens5 = createScreen(theater2,movie1, LocalDateTime.of(2021,12,1,16,0));
//            Screens screens6 = createScreen(theater2,movie2, LocalDateTime.of(2021,12,1,19,0));
//
//            Users user1 = CreateUser("seo", 23, "Gumi", "Daehakro", "467-6");
//            Users user2 = CreateUser("bang", 24, "Gumi", "Gisuksa", "203");
//
//            Tickets tickets1 = createTickets(1, 1, 2);
//            Tickets tickets2 = createTickets(1, 2, 2);
//
//            em.persist(movie1);
//            em.persist(movie2);
//            em.persist(movie3);
//            em.persist(movie4);
//
//            em.persist(director1);
//            em.persist(director2);
//            em.persist(director3);
//            em.persist(director4);
//
//            em.persist(actor1);
//            em.persist(actor2);
//            em.persist(actor3);
//            em.persist(actor4);
//            em.persist(actor5);
//            em.persist(actor6);
//            em.persist(actor7);
//            em.persist(actor8);
//            em.persist(actor9);
//            em.persist(actor10);
//            em.persist(actor11);
//            em.persist(actor12);
//            em.persist(actor13);
//            em.persist(actor14);
//            em.persist(actor15);
//            em.persist(actor16);
//
//            em.persist(movieWorker1);
//            em.persist(movieWorker2);
//            em.persist(movieWorker3);
//            em.persist(movieWorker4);
//            em.persist(movieWorker5);
//            em.persist(movieWorker6);
//            em.persist(movieWorker7);
//            em.persist(movieWorker8);
//            em.persist(movieWorker9);
//            em.persist(movieWorker10);
//            em.persist(movieWorker11);
//            em.persist(movieWorker12);
//            em.persist(movieWorker13);
//            em.persist(movieWorker14);
//            em.persist(movieWorker15);
//            em.persist(movieWorker16);
//            em.persist(movieWorker17);
//            em.persist(movieWorker18);
//            em.persist(movieWorker19);
//            em.persist(movieWorker20);
//
//            em.persist(theater1);
//            em.persist(theater2);
//
//            em.persist(seat1);
//            em.persist(seat2);
//            em.persist(seat3);
//            em.persist(seat4);
//            em.persist(seat5);
//            em.persist(seat6);
//            em.persist(seat7);
//            em.persist(seat8);
//            em.persist(seat9);
//            em.persist(seat10);
//            em.persist(seat11);
//            em.persist(seat12);
//            em.persist(seat13);
//            em.persist(seat14);
//            em.persist(seat15);
//            em.persist(seat16);
//            em.persist(seat17);
//            em.persist(seat18);
//            em.persist(seat19);
//            em.persist(seat20);
//
//            em.persist(screens1);
//            em.persist(screens2);
//            em.persist(screens3);
//            em.persist(screens4);
//            em.persist(screens5);
//            em.persist(screens6);
//
//            em.persist(user1);
//            em.persist(user2);
///////////////////////////////////////////////////////////////// 사전데이터 끝

            //1번
//            Users user = CreateUser("kim", 25, "Seoul", "abc", "111");
//            em.persist(user);

            //2번
//            Users findUser = ModifyUser(1,"hihi", 23, "Gumi", "Daehakro", "467-6");
//            em.persist(findUser);

            //3번
//            showMovieWithWorkerId(1);

            //4번
//            Workers director1 = new Director();
//            director1.setName("윤재근");
//            Workers actor1 = new Actors();
//            actor1.setName("");
//            findMovieWithWorkerOpeningDateRunningTime(director1, actor1, LocalDate.of(2021,11,24));

            //5번
//            findMovieWithWorker();

            //6번
//            showScreen(1);

            //7번
//            Tickets tickets = createTickets(1,3,2);

            //8번
//            cancelTickets(3);

            //9번
//            showTicket(3);

            //10번
            Users findUser = em.find(Users.class,1);
            em.remove(findUser);

            em.flush();
            em.clear();
            tx.commit();

        }catch(Exception e){
            tx.rollback();
        }finally{
            em.close();
        }
        emf.close();
    }

    static Movies CreateMovie(String name, LocalDate time, Genre genre, int run_time){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        Movies movie1 = new Movies();
        try{
            tx.begin();

            movie1.setName(name);
            movie1.setOpening_date(time);
            movie1.setGenre(genre);
            movie1.setRunning_time(run_time);
            movie1.setCreatedDate(LocalDateTime.now());
            em.persist(movie1);

            tx.commit();
        }catch(Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            em.close();
        }
        return movie1;
    }

    static Director createDirector(int age, String name, String birthdayPlace){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        Director director = new Director();

        try{
            tx.begin();
            director.setAge(age);
            director.setName(name);
            director.setBirthPlace(birthdayPlace);
            em.persist(director);
            tx.commit();
        }catch(Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            em.close();
        }
        return director;
    }

    static Actors createActor(int age, String name, String instagramId, int height){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        Actors actors = new Actors();

        try{
            tx.begin();
            actors.setAge(age);
            actors.setName(name);
            actors.setHeight(height);
            actors.setInstagramId(instagramId);
            em.persist(actors);
            tx.commit();
        }catch(Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            em.close();
        }
        return actors;
    }

    static Movie_Worker createMovieWorker(Workers worker, Movies movie, RoleType roleType){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        Movie_Worker movieWorker = new Movie_Worker();
        try{
            tx.begin();
            movieWorker.setWorker(worker);
            movieWorker.setMovieId(movie);
            movieWorker.setRoleType(roleType);
            em.persist(movieWorker);
            tx.commit();
        }catch(Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            em.close();
        }
        return movieWorker;
    }

    static Theaters createTheater(String name, String floor){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        Theaters theaters = new Theaters();

        try{
            tx.begin();
            theaters.setName(name);
            theaters.setFloor(floor);
            em.persist(theaters);
            tx.commit();
        }catch(Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            em.close();
        }
        return theaters;
    }

    static Seats createSeats(String seatRow, String seatCol, String status, Theaters theater){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        Seats seats = new Seats();

        try{
            tx.begin();
            seats.setSeatRow(seatRow);
            seats.setSeatColumn(seatCol);
            seats.setStatus(status);
            seats.setTheaterId(theater);
            em.persist(seats);
            tx.commit();
        }catch(Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            em.close();
        }
        return seats;
    }

    static Screens createScreen(Theaters theaters, Movies movies, LocalDateTime startTime){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        Screens screens = new Screens();

        try{
            tx.begin();
            screens.setTheaterId(theaters);
            screens.setMovieId(movies);
            screens.setStartTime(startTime);
            screens.setEndTime(startTime.plusMinutes(movies.getRunning_time()));
            em.persist(screens);
            tx.commit();
        }catch(Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            em.close();
        }
        return screens;
    }

    static Users CreateUser(String name, Integer age, String city, String street, String zipCode){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        Users users = new Users();
        Address address = new Address(city, street, zipCode);
        try{
            tx.begin();
            users.setName(name);
            users.setAge(age);
            users.setHomeAddress(address);
            users.setCreatedDate(LocalDateTime.now());
            em.persist(users);
            tx.commit();
        }catch(Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            em.close();
        }
        return users;
    }

    static Users ModifyUser(int id, String name, Integer age, String city, String street, String zipCode){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        Users findUsers = em.find(Users.class, id);
        Address address = new Address(city, street, zipCode);
        try{
            tx.begin();
            findUsers.setName(name);
            findUsers.setAge(age);
            findUsers.setHomeAddress(address);
            findUsers.setLastModifiedDate(LocalDateTime.now());
            tx.commit();
        }catch(Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            em.close();
        }
        return findUsers;
    }

    static void showMovieWithWorkerId(int moveId){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        JPAQueryFactory query = new JPAQueryFactory(em);
        try{
            tx.begin();
            QMovies qMovies = new QMovies("m");
            QMovie_Worker qMovieWorker = new QMovie_Worker("c");
            QWorkers qWorkers = new QWorkers("s");

            List<Movies> movies = query.selectFrom(qMovies).distinct()
                    .join(qMovies.movieWorkers, qMovieWorker).fetchJoin()
                    .join(qMovieWorker.worker, qWorkers).fetchJoin()
                    .orderBy(qMovies.name.desc())
                    .where(qMovies.movie_id.eq(moveId))
                    .fetch();
            movies.stream().forEach(m-> {
                System.out.println("영화제목 " + m.getName());
                System.out.println("개봉일 : " + m.getOpening_date());
                System.out.println("장르 : " + m.getGenre());
                System.out.println("러닝타임 : " + m.getRunning_time());
                for(int i = 0; i<m.getMovieWorkers().size(); i++){
                    System.out.println(m.getMovieWorkers().get(i).getRoleType() + " : " +m.getMovieWorkers().get(i).getWorker().getName());
                }
            });
            tx.commit();
        }catch(Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            em.close();
        }
    }

    static void findMovieWithWorkerOpeningDateRunningTime(Workers director, Workers actor, LocalDate openingDate){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        JPAQueryFactory query = new JPAQueryFactory(em);

        try{
            tx.begin();

            BooleanBuilder builder = new BooleanBuilder();

            QMovie_Worker qMW1 = new QMovie_Worker("f");
            QMovie_Worker qMW2 = new QMovie_Worker("ff");

            QMovies qMovies = new QMovies("m");

            if(director.getName()!=null && !director.getName().equals("")){
                builder.and(qMW1.worker.name.eq(director.getName()));
            }

            if(actor.getName()!=null && !actor.getName().equals("")){
                builder.and(qMW2.worker.name.eq(actor.getName()));
            }

            if(openingDate!=null){
                builder.and(qMovies.opening_date.eq(openingDate));
            }

            List<Movies> movies = query.selectFrom(qMovies).distinct()
                    .join(qMovies.movieWorkers,qMW1)
                    .join(qMovies.movieWorkers,qMW2)
                    .where(builder)
                    .orderBy(qMovies.name.desc())
                    .fetch();
            movies.stream().forEach(m-> System.out.println("영화제목 " + m.getName()));

            tx.commit();
        }catch(Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            em.close();
        }
    }

    static void findMovieWithWorker(){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        JPAQueryFactory query = new JPAQueryFactory(em);
        try{
            tx.begin();
            QMovies qMovies = new QMovies("m");
            QMovie_Worker qMovieWorker = new QMovie_Worker("c");
            QWorkers qWorkers = new QWorkers("s");
            int offsetV = 0;
            int page = 1;
            Scanner scan = new Scanner(System.in);

            while(offsetV != -1) {
                List<Movies> movies = query.selectFrom(qMovies).distinct()
                        .join(qMovies.movieWorkers, qMovieWorker).fetchJoin()
                        .join(qMovieWorker.worker, qWorkers).fetchJoin()
                        .offset(offsetV).limit(2)
                        .fetch();
                System.out.println("현재 페이지 번호 : " + page);
                movies.stream().forEach(m -> {
                    System.out.println("영화제목 " + m.getName());
                    for (int i = 0; i < m.getMovieWorkers().size(); i++) {
                        System.out.println(m.getMovieWorkers().get(i).getRoleType() + " : " + m.getMovieWorkers().get(i).getWorker().getName());
                    }
                });
                System.out.print("페이지 번호 : (0은 종료)");
                page = scan.nextInt();
                if(page == 1){
                    offsetV = 0;
                }
                else if (page == 2){
                    offsetV = 2;
                }
                else
                    offsetV = -1;
            }

            tx.commit();
        }catch(Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            em.close();
        }
    }

    static void showScreen(int scId){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        try{
            tx.begin();
            Screens findScreens = em.find(Screens.class, scId);
            Movies findMovies = em.find(Movies.class, findScreens.getMovieId().getMovie_id());
            Theaters findTheaters = em.find(Theaters.class, findScreens.getTheaterId().getTheaterId());
            List<Tickets> result = em.createQuery("select m from Tickets m join fetch m.screenId t where t.screenId="+scId, Tickets.class).getResultList();
            List<Seats> result2 = em.createQuery("select m from Seats m join fetch m.theaterId t where t.theaterId="+findTheaters.getTheaterId(), Seats.class).getResultList();
            System.out.println("영화 제목 : " + findMovies.getName());
            System.out.println("시작 시간 : " + findScreens.getStartTime());
            System.out.println("종료 시간 : " + findScreens.getEndTime());

            boolean[] seat = new boolean[11];
            for(Seats seats : result2){
                int tempNum = 0;
                if(seats.getSeatId()>10){
                    tempNum = seats.getSeatId()-10;
                }
                else
                    tempNum = seats.getSeatId();
                if(seats.getStatus().equals("o"))
                    seat[tempNum] = true;
                else
                    seat[tempNum] = false;
            }

            for(Tickets tickets : result){
                List<Screen_Seat> temp = em.createQuery("select m from Screen_Seat m where m.ticketId="+tickets.getTid(), Screen_Seat.class).getResultList();
                for(Screen_Seat screenSeat : temp){
                    int tempNum = 0;
                    if(screenSeat.getSeatId().getSeatId()>10){
                        tempNum = screenSeat.getSeatId().getSeatId()-10;
                    }
                    else
                        tempNum = screenSeat.getSeatId().getSeatId();
                    seat[tempNum] = false;
                }
            }
            for (int i = 1; i < 11; i++){
                if(seat[i])
                    System.out.print("o");
                else
                    System.out.print("x");
                if(i == 5)
                    System.out.println();
            }
            System.out.println();

            tx.commit();
        }catch(Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            em.close();
        }
    }

    static Tickets createTickets(int screenId, int userId, int count){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        Tickets tickets = new Tickets();
        try{
            tx.begin();
            Screens screens = em.find(Screens.class, screenId);
            Users users = em.find(Users.class, userId);
            tickets.setState("예매");
            tickets.setUsersUserId(users);
            tickets.setScreenId(screens);
            em.persist(tickets);
            for(int i = 0; i < count; i++){
                Scanner scanner = new Scanner(System.in);
                System.out.print("예약할 seatId : ");
                Seats seats = em.find(Seats.class, scanner.nextInt());
                Screen_Seat screenSeat = new Screen_Seat();
                screenSeat.setSeatId(seats);
                screenSeat.setTicketId(tickets);
                em.persist(screenSeat);
            }
            tx.commit();
        }catch(Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            em.close();
        }
        showScreen(screenId);
        return tickets;
    }

    static void cancelTickets(int ticketId){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        Tickets findTickets = em.find(Tickets.class, ticketId);
        try{
            tx.begin();
            List<Screen_Seat> result = em.createQuery("select m from Screen_Seat m join fetch m.ticketId t where t.tid="+findTickets.getTid(), Screen_Seat.class).getResultList();
            for(Screen_Seat screenSeat : result){
                em.remove(screenSeat);
            }
            findTickets.setState("예매취소");
            em.persist(findTickets);
            tx.commit();
        }catch(Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            em.close();
        }
        showScreen(findTickets.getScreenId().getScreenId());
    }

    static void showTicket(int ticketId){
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        Tickets findTickets = em.find(Tickets.class, ticketId);
        try{
            tx.begin();
            if(findTickets.getState().equals("예매")) {
                Screens findScreens = em.find(Screens.class, findTickets.getScreenId().getScreenId());
                Movies findMovies = em.find(Movies.class, findScreens.getMovieId().getMovie_id());
                Theaters findTheaters = em.find(Theaters.class, findScreens.getTheaterId().getTheaterId());
                List<Screen_Seat> result = em.createQuery("select m from Screen_Seat m join fetch m.ticketId t where t.tid=" + findTickets.getTid(), Screen_Seat.class).getResultList();

                System.out.println("영화제목 : " + findMovies.getName());
                System.out.println("상영관 : " + findTheaters.getName());
                for (Screen_Seat screenSeat : result) {
                    System.out.println("열 : " + screenSeat.getSeatId().getSeatRow() + " 행 : " + screenSeat.getSeatId().getSeatColumn());
                }
                System.out.println("시작시간 : " + findScreens.getStartTime());
            }
            else
                System.out.println("취소한 예매");
            tx.commit();
        }catch(Exception e){
            e.printStackTrace();
            tx.rollback();
        }finally {
            em.close();
        }
    }
}
