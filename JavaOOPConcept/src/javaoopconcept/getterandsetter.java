package javaoopconcept;

public class getterandsetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		getterandsetter gs = new getterandsetter();
		
		gs.setCapacity(23);
		gs.setItemname("Book");
		gs.display();
		gs.setSize(5);
		
		System.out.println(gs.getSize());

	}
	
	
	private int capacity;
	private String itemname;
	private int size;
	
	public getterandsetter(int capacity, String itemname, int size) {
		this.capacity = capacity;
		this.itemname = itemname;
		this.size = size;
	}

	public getterandsetter() {
		
	}
	
	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	
	public int getSize() {
		return size;
	}
	
	public void setSize(int size) {
		this.size = size;
	}

	
	void display(){
		
		System.out.println(capacity + "\n" + itemname);
	}
	
	
	
	
	

}
