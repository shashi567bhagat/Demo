package collection_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

class movie  implements Comparable<movie>{

	private double rating;
    private String name;
    private int year;
    
	public movie(double rating, String name, int year) {
		super();
		this.rating = rating;
		this.name = name;
		this.year = year;
	}
	
	public double getRating() {
		return rating;
	}
	
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	
	
	@Override
	public String toString() {
		return "movie [rating=" + rating + ", name=" + name + ", year=" + year + "]";
	}

	@Override
	public int compareTo(movie m) {
		
	return	this.year-m.year;
		
		
	}
}
   class RatingMovie implements Comparator<movie>
   {
   @Override
	public int compare(movie o1, movie o2) {
		
	   if(o1.getRating()>o2.getRating()) return 1;
	   
	   if(o1.getRating()<o2.getRating()) return -1;
	   
	   else 
	   
	  return 0;
	   
	  }
	   
	}
	

	class NameCompare implements Comparator<movie>
	{

		@Override
		public int compare(movie o1, movie o2) {
			
			return (o1.getName().compareTo(o2.getName()));	
		}
		
		
		
	}
	

	public class Comparable_3 {

	public static void main(String[] args) {
		
		ArrayList<movie> tt=new ArrayList<>();
		
	    tt.add(new movie(8.3, "Force Awakens",2015));
		tt.add(new movie(8.7, "star wars", 1977));
		tt.add(new movie(8.8, "Empire Strikes Back",1980));
		tt.add(new movie(8.4, "Return of the jedi", 1983));
		 
		 System.out.println("Sorted by rating");
		
		 RatingMovie ratingcompare=new RatingMovie();
		 
		//Collections.sort(tt, new RatingMovie());
		 
		 Collections.sort(tt,ratingcompare);//obje pass krke bhi kr sakte hai
		 for(movie m:tt)
		 {
			System.out.println(m.getRating()+ " " + m.getName()+ " " + m.getYear()+ " "); 
		 }
		 
		 
		 System.out.println("\nSorted by name");
		 
		 NameCompare nc=new NameCompare();
		 
		 Collections.sort(tt,nc);
		 
		 for(movie m:tt)
		 {
			 System.out.println(m.getName()+ " " + m.getRating()+ " " + m.getYear());
					 
		 }
		 
		 System.out.println("\nSorted by year");
		 
		 Collections.sort(tt);
		 
		 for(movie m:tt)
		 {
			 System.out.println(m.getYear()+ " "+ m.getName()+ " "+ m.getRating());
		 }
		 
		 
		 }
		
	}

