package day3country;

import java.util.Scanner;

public class CountryTest {

	public static void main(String[] args) {
		Country country=new Country();
		String[] cname=new String[20];
		double[] carea=new double[20];
		int[] cpop=new int[20];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of countries you want to observe:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name of the countries:");
		cname[i]=sc.next();
		System.out.println("Enter the area of the countries:");
		carea[i]=sc.nextDouble();
	     System.out.println("Enter the population of the countries:");
		cpop[i]=sc.nextInt();
		}
		System.out.println("The country with largest area is" +(country.largestarea()));
		System.out.println("The country with largest population is" +(country.largestpopulation()));
		System.out.println("The country with largest population density is" +(country.largestarea()));
}
}
