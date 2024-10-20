public class Descon {
  public Descon(){
    System.out.println("Hello");
  }
  public void Finalize(){
    System.out.println("Destroyed");
  }  
 public static void main(String args[]){
   Descon obj = new Descon();
   obj = null;
   System.gc();
 }
}