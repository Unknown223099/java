abstract class clc{
   int s = 5, l = 6, b = 2;
   clc(){
   }
  abstract double area();
}
 class square extends clc{
   square(){
     super();
   }
   double area(){
   return s*s;
   }
 }
class rectangle extends clc{
   rectangle(){
    super();
   }
   double area(){
   double area = l*b;
   return area;
   }
}
class abstractex{
public static void main(String args[]){
square sq = new square();
rectangle re = new rectangle();
System.out.println("Area of square is:"+sq.area());
System.out.println("Area of rectangle is:"+re.area());
}
}
