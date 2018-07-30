package com.capgemini;

import java.util.ArrayList;
import java.util.List;

public class MovieTest {
	public static void main(String args[]) {
		Movie_Details mv1 = new Movie_Details("DDLJ", "Shahrukh", "Kajol", "Romantic");
		Movie_Details mv2 = new Movie_Details("K3G", "Shahrukh", "Kajol", "Movie");
		Movie_Details mv3 = new Movie_Details("ABCD", "Varun", "Shraddhya", "Passion");

		Movie_DetailsList md = new Movie_DetailsList();

		md.add_movie(mv1);
		md.add_movie(mv2);
		md.add_movie(mv3);
		List<Movie_Details> al=new ArrayList<>();
		al = md.getAllMovies();

		for (Object o : al) { // Printing the movie list
			System.out.println(o + "\n");
		}

		md.remove_movie(mv3);
		al = md.getAllMovies();

		for (Object o : al) { // Printing the movie list
			System.out.println(o + "\n");
		}

		md.remove_AllMovies(al);
		al = md.getAllMovies();
		System.out.println("All Movies Removed");
		for (Object o : al) { // Printing the movie list
			System.out.println(o + "\n");

	}
    
	Movie_Details alm;
	alm =	md.find_movie_By_mov_Name("K3G");
    System.out.println("Movie:"+alm);
  alm=  md.find_movie_By_Genre("Romantic");

   System.out.println(alm);
}
}
