package JW;

import java.util.Arrays;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		int[] e_Number = {2,5,7,8,9,11,56,67,89,90};
//		int i;
//		
//		for(i = 0; i <= e_Number.length ; i++) {
//			System.out.println(+e_Number[i]);
//		}
		
		String[] name = {"Dipto Roy","Tipu Das"};
		int j;
		
		for( j = 0; j < name.length ; j++) {
			System.out.println(name[j]);
		}
		
		String[][] l_no = {{"BE004478","WT56743"},{"YS453209","MK328964"},{"AL234076","UH903465"}};
		int k;
		
		for(k = 0; k < l_no.length; k++) {
			for(int l = 0; l<l_no[k].length; l++) {
				System.out.println(l_no[k][l]);
			}
			
		}
		System.out.println(Arrays.deepToString(l_no));
		

	}

}
