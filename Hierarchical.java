import java.util.Scanner;
class A{
int a,b;
void input(){
Scanner sc = new Scanner(System.in);
System.out.println("Enter 1st number: ");
a = sc.nextInt();
System.out.println("Enter 2nd number: ");
b = sc.nextInt();
}
}
class B extends A{
void add(){
System.out.println("Addition is: "+(a+b));
}
}
class C extends A{
void sub(){
System.out.println("Subtraction is: "+(a-b));
}
}
class Hierarchical{
public static void main(String args[]){
B obj = new B();
C obj1 = new C();
obj.input();
obj.add();
obj1.input();
obj1.sub();
}
}