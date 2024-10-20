class Constr{
   double a1; double a2;
   Constr(double x,double y){
   a1 = x; a2 = y;
   }
   Constr(){
    a1 = 10;
    a2 = 2;
   }
   double add(){
    return a1+a2;
   }
}
class Coverload{
   public static void main(String args[]){
     Constr ob1 = new Constr(10.0,11.0);
     Constr ob2 = new Constr();
     double v;
     v = ob1.add();
     System.out.println("Addition is "+v);
     v = ob2.add();
     System.out.println("Addition is "+v);
   }
}