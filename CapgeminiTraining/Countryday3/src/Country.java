/*Country Class*/
public class Country {
private String name;
private int population;
private int area;
private int density;
public Country(String name,int population,int area,int density)
{
	this.name=name;
	this.population=population;
	this.area=area;
	this.density=population/area;
}
public String getName() {       /*using getters to get the values*/
	
	return name;
}

public int getPopulation() {
	return population;
}

public int getArea() {
	return area;
}

public int getDensity() {
	return density;
}

}
