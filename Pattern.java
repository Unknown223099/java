import javax.swing.JOptionPane;
public class Pattern {

    public static void main(String[] args) {
     int n = Integer.parseInt (JOptionPane.showInputDialog ("Enter any number"));
     int N = (n*2)-1;
     for(int i = 1; i<= n; i++){
         for(int j = 1; j<= N;j++){
          int a = i + j;
           if(a<=(n*2)&&a%2==0&&i<=j)
            {
              System.out.print("*");
            }
            else
            {
               System.out.print(" ");
            }
         }
        System.out.println() ;    
     }
   }
} 