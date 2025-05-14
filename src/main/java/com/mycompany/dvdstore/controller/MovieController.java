package com.mycompany.dvdstore.controller;

import com.mycompany.dvdstore.entity.Movie;
import com.mycompany.dvdstore.service.MovieService;

import java.util.Scanner;

public class MovieController {

    MovieService movieService = new MovieService();

    public void addUsingConsole(){
        System.out.println("Print title : ");
        Scanner sc = new Scanner(System.in);

        String title = sc.next();
        System.out.println( "Print genre : " );
        String genre = sc.next();
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setGenre(genre);

        movieService.registerMovie(movie);

    }
}
