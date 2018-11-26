package javaoopconcept;

class myroll {
	void showroll() {
	System.out.println("My Roll no is 2017002117");
	
	}
}

class froll1 extends myroll{
	void showroll() {
		System.out.println("Shawon Roll no is 2017002103");
		
	}
}

class froll2 extends myroll{
	void showroll() {
		System.out.println("Asif Roll no is 2017002115");
		
	}
}
public class Polymorphism {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myroll r1 = new myroll();
		myroll r2 = new froll1();
		myroll r3 = new froll2();
		r1.showroll();
		r2.showroll();
		r3.showroll();

	}

}
