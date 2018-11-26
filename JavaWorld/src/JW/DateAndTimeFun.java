package JW;

import java.util.*;
import java.text.*;
import java.util.Scanner;

public class DateAndTimeFun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date dT = new Date();
		SimpleDateFormat fd = new SimpleDateFormat("dd:MM:yyyy E");
		SimpleDateFormat ft = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println("Current Date : "+fd.format(dT));
		System.out.println("Current Time : "+ft.format(dT));
		
		Scanner bc = new Scanner(System.in);
		//System.out.println(bc.nextLine());
		int no = 123;
		int id = bc.nextInt();
		
		if (id == no ) {
			System.out.println("ID correct!");
		}else {
			System.out.println("ID noncorrect!");
		}
		
		

	}

}
