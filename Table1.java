import java.util.Scanner;
 
class Table1{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int Number = sc.nextInt();
    System.out.println("Table of"+Number+":");
    for(int i=0; i<11; i++){
       int result = Number*i;
       System.out.println(Number+" x "+i+" = "+result);
    }
    sc.close();
  }
}