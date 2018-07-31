package com.capgemini;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Movie_DetailsList{
//	List<Movie_Details> arrayList = new ArrayList<>();
	Set<Movie_Details> tl = new TreeSet<>(
			(arg0, arg1) -> arg0.getMov_Name().compareTo(arg1.getMov_Name()));
	public void add_movie(Movie_Details movie_Name) {
		tl.add(movie_Name);


	}

	public Set<Movie_Details> getAllMovies()
	{
		
		return tl;
	}
	

public void remove_movie(Movie_Details movie_Name) {
		
		tl.remove(movie_Name);
	}

	public Movie_Details find_movie_By_mov_Name(String movie_Name)
	{
		
		for (Movie_Details mov : tl)
		{
			if((mov.getMov_Name()).equals(movie_Name))
				return mov;
			
							
		}
		return null;

	}
public Movie_Details find_movie_By_Genre(String genre)
	{
		for (Movie_Details mov : tl)
		{
			if((mov.getGenre()).equals(genre))
				return mov;
			
							
		}
		return null;
	}
	public void remove_AllMovies(Set<Movie_Details> al) {
		// TODO Auto-generated method stub
		tl.removeAll(tl);
	}




	
	
}
