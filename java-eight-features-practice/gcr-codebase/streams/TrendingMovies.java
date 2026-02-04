package Streams;
import java.util.*;
public class TrendingMovies {
	String name;
	int rating;
	int releaseYear;
	TrendingMovies(String name,int rating,int releaseYear){
		this.name=name;
		this.rating=rating;
		this.releaseYear=releaseYear;
		
			
	}
	@Override
    public String toString() {
        return name + " | rating:" + rating + " | releaseYear:" + releaseYear;
    }	
	
	public static void main(String[] args) {
		ArrayList<TrendingMovies> movieList=new ArrayList<>();
		 movieList.add(new TrendingMovies("Border", 4, 2025));
	     movieList.add(new TrendingMovies("Insidious", 3, 2010));
	     movieList.add(new TrendingMovies("Inception", 5, 2010));
	     movieList.add(new TrendingMovies("Avatar", 4, 2009));
	     movieList.add(new TrendingMovies("Interstellar", 5, 2014));
	     movieList.add(new TrendingMovies("Joker", 4, 2019));
	     movieList.add(new TrendingMovies("Oppenheimer", 5, 2023));
	     
	     // filter by rating 
	     List<TrendingMovies> filterbyrating =movieList.stream().sorted((a,b)->(b.rating-a.rating) ).limit(5).toList();
		filterbyrating.forEach(s -> System.out.println(s));
		System.out.println("Filter by year");
		// filter by release;
		List<TrendingMovies> filterByYear=movieList.stream().sorted((a,b)->(b.releaseYear-a.releaseYear)).limit(5).toList();
		filterByYear.forEach(s -> System.out.println(s));
		
	}

}
