package JW;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		name();
		age(23);
		System.out.println(details("Bangladeshi\n","BF0022562"));
	}
	
	public static void name() {
		
		System.out.println("Dipto Roy");
		
	}
	
	public static int age(int a) {
		System.out.println(+a);
		return a;
		
	}
	
	public static String details(String Nationality,String passport_number) {
		
		return Nationality + passport_number;
		
	}

}
