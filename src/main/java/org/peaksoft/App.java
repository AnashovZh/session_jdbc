package org.peaksoft;

import org.peaksoft.services.MovieService;
import org.peaksoft.services.ShowTimeService;
import org.peaksoft.services.impl.MovieServiceImpl;
import org.peaksoft.services.impl.ShowTimeServiceImpl;

import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        MovieService movieService = new MovieServiceImpl();
//        movieService.createMovie("movies", List.of(
//                "id serial primary key ",
//                " title varchar",
//                "genre varchar",
//                "duration int")
//        );
//        movieService.createMovie("theatres", List.of(
//                "id serial primary key ",
//                "name varchar",
//                "location varchar"));
        //Long movieId, Long theatreId, LocalDateTime startTime, LocalDateTime endTime
        ShowTimeService showTimeService=new ShowTimeServiceImpl();
        showTimeService.createShowTime("show_times",List.of(
                "id serial primary key ",
                "movie_id int references movies(id)",
                "theatre_id int references theatres (id)",
                "start_time timestamp",
                "end_time timestamp"));
        ShowTimeService showService=new ShowTimeServiceImpl();
        Scanner scanner=new Scanner(System.in);
        Scanner scannerForTitle=new Scanner(System.in);

//while(true){
//    switch (new Scanner(System.in).nextLine()){
//        case "1","save"->{
//            System.in.out("Write title: ")
//        String title=scannerForTitle.nextLine();
//        }
//
//    }
}
//    }
}
