import java.util.Scanner;

class AddBinary {
  public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter 1st Binary Number : ");
     String x = sc.next();
     System.out.println("Enter 2nd Binary Number : ");
     String y = sc.next(); 

     int n1 = Integer.parseInt(x, 2);
     int n2 = Integer.parseInt(y, 2); 
     int n3 = n1 + n2;
        
     System.out.println("n1 : "+Integer.toBinaryString(n1));
     System.out.println("n2 : "+Integer.toBinaryString(n2));     
     System.out.println("n3 = n1 + n2 : "+Integer.toBinaryString(n3));
  }
}   