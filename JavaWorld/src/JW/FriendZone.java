package JW;

public class FriendZone {
	
	public String friName;
	public String friType;
	public int friPhn;
	public static double friPoint;
	
	//call a constructor
	public FriendZone(String name) {
		
		friName = name;
		
	}
	
	//simple method using parameter
	public static String type(String tp) {
		
		System.out.println(tp);
		return tp;
		
	}
	
	public void phn(int no) {
		
		friPhn = no;
		
	}
	
	public static double point(double p , double t) {
		
		friPoint = p+t;
		return friPoint;
		
	}
	
	
	//Output method
	public void ShowFriDetails() {
		System.out.println("Name : " +friName);
		System.out.println("Phone Number : " +friPhn);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//create a object
		FriendZone f1 = new FriendZone("Jack kalies");
		f1.phn(+98543267);
		type("friend Type : Close");
		System.out.println("Friend point : " +point(3.2,4.5));
		
		f1.ShowFriDetails();

	}

}
