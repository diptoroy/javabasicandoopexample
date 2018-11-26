package javaoopconcept;

class brand {
	
	void bname() {
		System.out.println("Lenovo");
	}
	
}

class brand2 extends brand{
	
	
}

public class Inheritancepractice extends brand2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		brand2 b = new brand2();
		b.bname();

	}

}
