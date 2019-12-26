package staks;

import java.util.Stack;

public class SStacks {
	public static void main(String[] args) {
//Creating a Stack
        Stack<String> stackOfCards = new Stack<>();
        
////Pushing new items to the Stack
//      	stackOfCards.push("Jack");
//     	System.out.println("Stack => " + stackOfCards);
//              System.out.println();

//***********************************************************
     
        
//        Pushing new items to the Stack
        stackOfCards.push("Jack");
        stackOfCards.push("Queen");
        stackOfCards.push("King");
        stackOfCards.push("Ace");
//Popping items from the Stack     
        String cardAtTop = stackOfCards.pop();
        System.out.println("Stack.pop() => " + cardAtTop);
              
//***********************************************************
//        
////Pushing new items to the Stack
//          stackOfCards.push("Jack");
//          stackOfCards.push("Queen");
//          stackOfCards.push("King");
//          stackOfCards.push("Ace");
//
//
////Get the item at the top of the stack without removing it
//          String cardAtTop = stackOfCards.peek();
//          System.out.println("Stack.peek() => " + cardAtTop);

	}

}
