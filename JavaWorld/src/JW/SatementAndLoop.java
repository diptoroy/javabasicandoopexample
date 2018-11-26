package JW;

public class SatementAndLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean cn = true;
		boolean name = false;
		
		int lic1 = 3219;
		int lic2 = 3209;
		
		if ((cn && name ) || (lic1 > lic2)) {
			
			System.out.println("Right");
			
		}else {
			
			System.out.println("Worng");
			
		}
		
		System.out.println(i(32,54));
		
	}
	
	public static int i(int f1,int f2) {
		
		int max;
		if(f1 > f2) {
			
			max = f1;
			
		}else {

			max = f2;
			
		}
		
		return max;
	}

}
