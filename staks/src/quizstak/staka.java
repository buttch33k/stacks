package quizstak;


import java.util.Scanner;
import java.util.Stack;

public class staka {


	static  Stack<String> pileofshit = new Stack<>();
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		inputcolor();
		
		
		
	}

	
	public static void choys() {
		// TODO Auto-generated method stub
		System.out.println(" ");
		System.out.println("select choices");
		System.out.println("ViewTop");
		System.out.println("RemoveTop");
		System.out.println("AddMore");
		System.out.println(" ");
		
		
		String choice = input.nextLine();
		if (choice.equalsIgnoreCase("ViewTop")) {
			accessthetop();
			
		} else if (choice.equalsIgnoreCase("RemoveTop")) {
			
			deletestak();
			
		} else if (choice.equalsIgnoreCase("AddMore")) {
			
			addmore();
			
		} else {
			System.out.println("Invalid");
			
			System.out.println("enter correct choices");
		
			choys();
		}
	}

	public static void addmore() {
		// TODO Auto-generated method stub
		System.out.println(" ");
		System.out.println("add more 5 colors: ");
		System.out.println("color: 1");
		String temp =input.nextLine();
		System.out.println("color: 2");
		String temp2 =input.nextLine();
		System.out.println("color: 3");
		String temp3 =input.nextLine();
		System.out.println("color: 4");
		String temp4 =input.nextLine();
		System.out.println("color: 5");
		String temp5 =input.nextLine();
		
		
		 pileofshit.push(temp);
		 pileofshit.push(temp2);
		 pileofshit.push(temp3);
		 pileofshit.push(temp4);
		 pileofshit.push(temp5);
		 
		 System.out.println(pileofshit);
		 System.out.println(" ");
		 
		 accessthetop();
		
	}


	public static void inputcolor() {
		// TODO Auto-generated method stub
		System.out.println(" ");
		System.out.println("Input 5 colors: ");
		System.out.println("color: 1");
		String temp =input.nextLine();
		System.out.println("color: 2");
		String temp2 =input.nextLine();
		System.out.println("color: 3");
		String temp3 =input.nextLine();
		System.out.println("color: 4");
		String temp4 =input.nextLine();
		System.out.println("color: 5");
		String temp5 =input.nextLine();
		System.out.println(" ");
		
		
		 pileofshit.push(temp);
		 pileofshit.push(temp2);
		 pileofshit.push(temp3);
		 pileofshit.push(temp4);
		 pileofshit.push(temp5);
		 
		 
		 System.out.println(pileofshit);
		 
		 
		 choys();
		 
	}

	public static void accessthetop() {
		// TODO Auto-generated method stub
		System.out.println(" ");
	     String view= pileofshit.peek();
	     System.out.println("peek()=>  "+ view);
	     System.out.println(" ");
         
	     choys();
         
	}
	public static void deletestak() {
		// TODO Auto-generated method stub
		System.out.println(" ");
		System.out.println();
		String DEL=pileofshit.pop();
		System.out.println(pileofshit);
		System.out.println(" ");
		choys();
	}

}





