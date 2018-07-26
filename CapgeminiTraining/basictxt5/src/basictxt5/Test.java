package basictxt5;

public class Test {

	public static void main(String[] args) {
		
Shape arr[]=new Shape[5];   //Creating an array of object type of Shape class

arr[1]=new Triangle();
arr[2]=new Polygon();
arr[3]=new Circle();  //Inserting the different class objects in the array

arr[1].draw();
arr[2].draw(); 
arr[3].draw();}

}
