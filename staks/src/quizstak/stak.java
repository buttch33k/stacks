package quizstak;

import java.util.Scanner;
import java.util.Stack;

public class stak {
	static  Stack<String> pileofshit = new Stack<>();
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		inputstackablestack();
		
		
		
	}

	
	public static void choys() {
		// TODO Auto-generated method stub

		System.out.println("1. view top stack");
		System.out.println("2. delete top stak");
		
		
		int choice = input.nextInt();
		if (choice == 1) {
			accessthetop();
			
		} else if (choice == 2) {
			
			deletestak();
			
		} else {
			System.out.print("Invalid");
			inputstackablestack();
		}
	}

	public static void inputstackablestack() {
		// TODO Auto-generated method stub
		
		System.out.println("Enter 4 shits: ");
		String temp =input.nextLine();
		
		String temp2 =input.nextLine();
		
		String temp3 =input.nextLine();
		
		String temp4 =input.nextLine();
		
		
		 pileofshit.push(temp);
		 pileofshit.push(temp2);
		 pileofshit.push(temp3);
		 pileofshit.push(temp4);
		 
		 
		 
		 choys();
		 
	}

	public static void accessthetop() {
		// TODO Auto-generated method stub
	     String view= pileofshit.peek();
	     System.out.println("peek()=>  "+ view);
         
	     choys();
         
	}
	private static void deletestak() {
		// TODO Auto-generated method stub
		System.out.println();
		String DEL=pileofshit.pop();
		System.out.println(pileofshit);
		
		choys();
	}

}





