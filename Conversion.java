import java.util.Scanner;

class Conversion {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      {
         int num;
         int index = 0;
         int arr[] = new int[10];

         System.out.print("Enter a Decimal Number : ");
         num = sc.nextInt();

         while(num>0) {
            arr[index] = num%2;
            index++;
            num = num/2;
         } 
         System.out.print("Binary Number is : ");
         for(int i = index-1; i>=0; i--) {
            System.out.print(arr[i]);
         }
       }
       System.out.println();
       Scanner sp = new Scanner(System.in);
       {
         int bin;
         int remainder;
         int dec = 0;
         int i = 1;

         System.out.print("Enter a Binary Number : ");
         bin = sp.nextInt();

         while(bin!=0) {
            remainder = bin%10;
            dec = dec + remainder * i;
            i = i*2;
            bin = bin/10;
         } 
         System.out.print("Decimal Number is : "+dec);
       }
    }
}