class P{
int a = 15;
int b = 5;
int c;
P(){
c = a*b;
}
void show(){
System.out.println("Multiplication is: "+c);
}
}
class Q extends P{
int i = 20;
int j = 10;
int q;
Q(){
q = i/j;
}
void show(){
super.show();
System.out.println("Division is: "+q);
}
}
class Overridden{
public static void main(String args[]){
Q ob = new Q();
ob.show();
}
}