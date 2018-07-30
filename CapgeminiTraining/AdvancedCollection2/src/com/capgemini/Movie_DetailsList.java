package com.capgemini;

import java.util.ArrayList;
import java.util.List;

public class Movie_DetailsList implements Comparable{
	List<Movie_Details> arrayList = new ArrayList<>();

	public void add_movie(Movie_Details movie_Name) {
		arrayList.add(movie_Name);


	}

	public List<Movie_Details> getAllMovies()
	{
		
		return arrayList;
	}
	

	public void remove_movie(Movie_Details movie_Name) {
		
		arrayList.remove(movie_Name);
	}

	public Movie_Details find_movie_By_mov_Name(String movie_Name)
	{
		
		for (Movie_Details mov : arrayList)
		{
			if((mov.getMov_Name()).equals(movie_Name))
				return mov;
			
							
		}
		return null;

	}
	public Movie_Details find_movie_By_Genre(String genre)
	{
		for (Movie_Details mov : arrayList)
		{
			if((mov.getGenre()).equals(genre))
				return mov;
			
							
		}
		return null;
	}
	public void remove_AllMovies(List<Movie_Details> al) {
		// TODO Auto-generated method stub
		arrayList.removeAll(arrayList);
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}


	
	
}
