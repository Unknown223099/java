import java.util.Scanner;

class Reversestring1{
   public static void main(String args[]){
     String str;
     String reverse = " ";
     char ch;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a String to Reverse");
     str = sc.next();
     for(int i=0; i<str.length(); i++){
         ch=str.charAt(i);
         reverse = ch + reverse;
       }
      System.out.println("Reverse String is"+reverse);
    }
}