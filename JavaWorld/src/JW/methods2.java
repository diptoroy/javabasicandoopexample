package JW;

public class methods2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		empolye_details();
		empolye_id(2017,00,2117);
		System.out.println(empolye_post("Post : Junior Developer"));

		 
	}

	public static void empolye_details() {
		System.out.println("Name : Dipto Roy\nNationality : Bangladeshi\nAge:23");
	}
	
	public static int empolye_id(int a,int b,int c) {
		
		int id = a+b+c;
		System.out.println("ID : "+id);
		return a;
		
	}
	
	public static String empolye_post(String post) {
		
		return post;
		
	}
}
