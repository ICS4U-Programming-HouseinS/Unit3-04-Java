// Java code for stack implementation

import java.io.*;
import java.util.*;

class main {
  public static void main(String[] args) {
    MyIntStack myStack = new MyIntStack();

    Scanner myReader = new Scanner(System.in);
    String ans;

    while (true) {
      while (true) {
        System.out.println("Would you like to pop, push, peek, or clear?");
        ans = myReader.nextLine();

        ans.toLowerCase();

        if (!ans.equals("pop") && !ans.equals("push") && !ans.equals("peek") && !ans.equals("clear")) {
          System.out.println("Error: invalid input");
        } else {
          break;
        }
      }

      if (ans.equals("pop")) {
        try {
          System.out.println(myStack.stack_pop());
        } catch (EmptyStackException e) {
          System.out.println("Error: stack is empty");
        }
      }

      if (ans.equals("peek")) {
        try {
          System.out.println(myStack.stack_peek());
        } catch (EmptyStackException e) {
          System.out.println("Error: stack is empty");
        }
      }

      if (ans.equals("clear")) {
        System.out.println("Stack has been cleared");
        myStack.stack_clear();
      }

      String userNumStr;
      int userNumInt;

      if (ans.equals("push")) {

        while (true) {
          System.out.println("Enter a number to push: ");
          userNumStr = myReader.nextLine();

          // checks if the user's input is a number
          try {
            userNumInt = Integer.parseInt(userNumStr);
          } catch (NumberFormatException e) {
            userNumInt = -1;
          }

          if (userNumInt == -1) {
            System.out.println("Error: invalid input");
          } else {
            myStack.stack_push(userNumInt);
            break;
          }
        }
      }
    }
  }
}