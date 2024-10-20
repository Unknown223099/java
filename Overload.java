class Overload{
  void add(){
   int a = 10, b= 20;
   System.out.println("Addition of (a+b):"+(a+b));
  }
  void add(int x,int y){
   int c = x+y;
   System.out.println("Addition of (x+y):"+(x+y));
  }
  void add(int p, double q){
   double c = p+q;
   System.out.println("Addition of (p+q):"+c);
  }
  public static void main(String args[]){
    Overload ob = new Overload();
    ob.add();
    ob.add(5,5);
    ob.add(6,11.5);
  }
}