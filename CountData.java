import java.util.Scanner;

class CountData {
  public static void main(String[] args) {
     String str;
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a String input with different data types");
     str = sc.next();
     count(str);
  }
  
  public static void count(String s) {
     char []ch=s.toCharArray();
     int letter=0,num=0,space=0,other=0;
     for(int i=0; i<s.length(); i++)
     {   
         if(Character.isLetter(ch[i]))
            letter++;
         else if(Character.isDigit(ch[i]))
            num++;
         else if(Character.isSpaceChar(ch[i]))
            space++;
         else
            other++;
     }
     System.out.println("Letters: "+letter);
     System.out.println("Spaces: "+space);
     System.out.println("Numbers: "+num);
     System.out.println("Other Characters: "+other);  
  }
}
                 