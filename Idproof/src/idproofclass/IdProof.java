package idproofclass;

import java.util.*;
import java.util.Scanner;
import java.text.*;

public class IdProof {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Id proof detail
		
		/** method pDetails
		* String name; @ok
		* String passport; @ok
		* String gender; @ok
		* int id; @ok
		* boolean marital_status; @ok
		* String Nationality; @ok
		* char blood_group; @ok
		* String father_name; @ok
		* String mother_name; @ok
		* String address;
		* String religion; @ok
		* String password; @ok
		*/
		
		/* Using java basic */
		//method @done
		//constructor @done
		//statement @done
		//loop @done
		//array
		//thread and expection @done
		//hashmap @done
		//issue date @done
		
		System.out.println("Put your id : ");
		Scanner in = new Scanner(System.in);
		int id = 2017002117;
		int open = in.nextInt();
		
		System.out.println("Enter your password : ");
		Scanner pa = new Scanner(System.in);
		String pass = "Diptoroy54";
		
		
		if((open == id) ) {
			
			System.out.println("***********---------> ID Details <---------***********");
			
			//thread
			
			Thread all = new Thread() {
				
				public void run() {
					
					for(int i = 0; i<1 ; i++) {
						try{
							sleep(1300);
							
							//method
							
							System.out.println(pDetail("Name : Dipto Roy\n","Passport Number : BF0022562\n","Gender : Male"));
							
							//constructor
							
							IdProof nation = new IdProof("Nationality : Bangladeshi","Father's name : Nimai Roy","Mother's name : Mukta Roy","Religion : Hindu",'A','+');
							nation.dIsplay();
							
							//statement
							
							boolean marital_status = false;
							 if(marital_status == true) {
									
									System.out.println("Marital status : Married");
									
								}else {
									
									System.out.println("Marital status : Unmarried");
									
								}
						        
							 //hashmap
							 
						        HashMap<Integer,String> ip = new HashMap<Integer,String>();
						        
						        ip.put(1, "ID : HU2017002117");
						        ip.put(2,"Password : Diptoroy54");
						        
						        try {
						        for(Map.Entry<Integer, String> entry : ip.entrySet()) {
						        	
						        	Integer key = entry.getKey();
						        	String ippass = entry.getValue();
						        	System.out.println(ippass);
						        	
						        }
						        
						      //issue date
						        
						        Date dt = new Date();
						        SimpleDateFormat fd = new SimpleDateFormat("dd:MM:yyyy E");
						        SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss a"); 
						        
						        System.out.println("Issuing date : "+fd.format(dt));
						        System.out.println("Issuing time : "+ft.format(dt));
						        }
						        catch(Exception e) {
						        	System.out.println("error 404");
						        }
						}
						catch(Exception e) {
							
						}
					}
				}
			};
			
			all.start();
			
		}else {
			
			System.out.println("Your id is incorrect!please try again!!!!!!");
			
		}
		
		
              
	}
	
	public static String pDetail(String pName,String pPassport,String pGender) {
		
		return pName+pPassport+pGender;
	}
	
	String nationality;
	String f_name;
	String m_name;
	String religion;
	char blood_group;
	char blood_state;
	
	IdProof(String nationality,String f_name,String m_name,String religion,char blood_group,char blood_state) {
		
		this.nationality = nationality;
		this.f_name = f_name;
		this.m_name = m_name;
		this.religion = religion;
		this.blood_group = blood_group;
		this.blood_state = blood_state;
	}

	
	void dIsplay() {
		
		System.out.println(nationality+ "\n" +f_name + "\n" +m_name + "\n" +religion + "\n" + "Blood group : " +blood_group +blood_state );
		
	}
	

}
