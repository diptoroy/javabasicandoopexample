package javaoopconcept;

class Faculty{
	String name;
	 Faculty(String _name) {
		 
		 name = _name;
		
	}
	
}

 class sub_class extends Faculty{
	
	int id;
	sub_class(String _name,int _id){
		super(_name);
		id = _id;
	}
	
	void display() {
		System.out.println(id + name);
		
	}
	
}

public class Inheritance{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sub_class ok = new sub_class("CST",0212);
		ok.display();
		

	}

}
