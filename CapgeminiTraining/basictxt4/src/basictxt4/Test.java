package basictxt4;

public class Test {

	public static void main(String[] args) {
	Top1 t=new Top1();    //Object creation of parent class
	
	Bottom1 b1=new Bottom1();      //Object creation of child classes
	Bottom2 b2=new Bottom2();
	Bottom3 b3=new Bottom3();
	
	t.display();
	
	b1.display();  //Override methods being called
	b2.display();
	b3.display();
	
	}

}
