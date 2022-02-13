import java.util.Scanner;

public class PreworkAssignment {
   //function to checkPalindrome

   public void checkPalindrome(String input) {
      if (input == null || input.length() <= 0) {
         System.out.println("No number was entered.");
      } else {
         boolean flag = false;
         int length = input.length();
         for (int i = 0; i < length/2; ++i) {
            if (input.charAt(i) != input.charAt(length-i-1)) {
               flag = true;
               break;
            }
         }
         if (flag) {
            System.out.println("Not Palindrome!!");
         } else {
            System.out.println("Palindrome!!");
         }
      }
   }

   //function to printPattern

   public void printPattern(String input) {
      if (input == null || input.length() <= 0) {
         System.out.println("No number was entered.");
      } else {
         try {
            int n = Integer.parseInt(input);
            for (int i = 0; i < n; i++) {
               for (int j = 0; j < n-i; ++j) {
                  System.out.print("*");
               }
               System.out.println("");
            }
         } catch (NumberFormatException ex) {
            System.out.println("Input request is not a number.");
         }
      }
   }

   //function to check no is prime or not

   public void checkPrimeNumber(int input) {
      if (input == 0 || input == 1) {
         System.out.println("Prime !!!");
      } else {
         boolean flag = false;
         for (int i = 2; i <= input/2; i++) {
            if (input % i == 0) {
               flag =  true;
               break;
            }
         }
         if (flag) {
            System.out.println("Not Prime / Composite number !!!");
         } else {
            System.out.println("Prime !!!");
         }
      }
   }

   // function to print Fibonacci Series

   public void printFibonacciSeries(int n ) {
      //initialize the first and second value as 0,1 respectively.
      int first = 0, second = 1;
      System.out.print(first);
      System.out.print(",");
      System.out.print(second);
      System.out.print(",");
      for (int i = n-2; i > 0; --i) {
         int next = first + second;
         System.out.print(next);
         System.out.print(",");
         int temp = second;
         second = next;
         first = temp;
      }
   }

   //main method which contains switch and do while loop

   public static void main(String[] args) {

      PreworkAssignment obj = new PreworkAssignment();

      int choice;

      Scanner sc = new Scanner(System.in);

      do {

         System.out.println("Enter your choice from below list.\n" + "1. Find palindrome of number.\n"

               + "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"

               + "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");

         System.out.println();

         choice = sc.nextInt();
         switch (choice) {
         case 0:
            choice = 0;
            break;
         case 1: {
            String input = sc.next();
            obj.checkPalindrome(input);
         }
         break;
         case 2: {
            String input = sc.next();
            obj.printPattern(input);
         }
         break;
         case 3: {
            int input = sc.nextInt();
            obj.checkPrimeNumber(input);
         }
         break;
         case 4: {
            int input = sc.nextInt();
            obj.printFibonacciSeries(input);
         }
         break;
         default:

            System.out.println("Invalid choice. Enter a valid no.\n");

         }

      } while (choice != 0);

      System.out.println("Exited Successfully!!!");

      sc.close();

   }
}
