class Value{
  private double radius;
    public Value(){
      radius = 5;
     }
    public void area(){
      System.out.println("area of circle is"+(Math.PI*radius*radius));
     }
    public void perimeter(){
       System.out.println("perimeter of circle is"+(2*Math.PI*radius));
    }
}
class Circle1{
 public static void main(String args[]){
     Value myvalue = new Value();
      myvalue.area();
      myvalue.perimeter();
   }
}