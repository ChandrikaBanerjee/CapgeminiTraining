import java.util.Scanner;

public class CountryTest {

	public static void main(String[] args) {
		String name;
		int area;
		int population;
		int density, i;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the number of countries you want to:");
		int n = sc.nextInt();
		Country arr[] = new Country[10];
		for (i = 0; i < n; i++) {
			System.out.println("Enter the name of the country:");
			name = sc.next();
			System.out.println("Enter the area of the country:");
			area = sc.nextInt();
			System.out.println("Enter the population of the country:");
			population = sc.nextInt();
			density = (population / area);
			arr[i] = new Country(name, area, population, density);

		}
//inintialize

		String largestAreaCountryName = "";
		String largestPopulationCountryName = "";
		String largestPopulationDensityName = "";
		int largestarea = arr[0].getArea();             //assigning the first element as the largest and comparing to get the largest*/
		int largestpop = arr[0].getPopulation();
		int largestden = arr[0].getDensity();
		for (i = 0; i < n; i++) {
			if ((arr[i].getArea()) > largestarea)
			{

				largestarea = arr[i].getArea();
				largestAreaCountryName = arr[i].getName();
			}

		}

		for (i = 0; i < n; i++) {
			if ((arr[i].getPopulation()) > largestpop)

				largestpop = arr[i].getPopulation();
			largestPopulationCountryName = arr[i].getName();
		}

		for (i = 0; i < n; i++) {
			if ((arr[i].getDensity()) > largestden)

				largestden = arr[i].getDensity();
			largestPopulationDensityName = arr[i].getName();
		}
		System.out.println("The country with largest area is " +largestAreaCountryName);
		System.out.println("The country with largest population is " + largestPopulationCountryName);
		System.out.println("The country with largest population density is " + largestPopulationDensityName);
	}

}
