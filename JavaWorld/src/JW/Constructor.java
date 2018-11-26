package JW;

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//call object
		Constructor cond1 = new Constructor(101,"Ford"); 
		Constructor cond2 = new Constructor(102,"TATA");
		
		//show output
		cond1.display();
		cond2.display();

	}
	
	int id;
	String brand;
	
	//call a constructor
	Constructor(int id,String brand){
		this.id = id;
		this.brand = brand;
	}
	
	
	//call a method which display output
	void display()
	{
		System.out.println(id+" "+brand);
	}
	
	

}
