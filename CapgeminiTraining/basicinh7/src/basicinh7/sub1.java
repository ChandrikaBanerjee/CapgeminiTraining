package basicinh7;

class sub1 extends base1 { // Performs inheritance using extends keyword
	static int i;
	private int l;
	private int k;

	sub1() {
		super(i);       //Explicitly invoking parent constructor
	}

	sub1(int k, int l) {    //Parameterized constructor of child class in which parent class constructor is explicitly invkoed
		super(i);
		this.k = k;
		System.out.println("   hello..");
	}

}
