class Value { 
    private double radius;  
    public Value() { 
        radius=5; 
    }   
    public void perimeter() { 
        System.out.println("perimeter ="+ (2 * Math.PI * radius)); 
    }   
    public void area() { 
        System.out.println("area ="+ (Math.PI * radius * radius)); 
    }
}
class Circle {
    public static void main(String [] args) {
      Value myValue=new Value();
      myValue.area(); 
      myValue.perimeter();
  } 
}