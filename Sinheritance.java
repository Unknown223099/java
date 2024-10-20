class student{
int rollno;
String name;
student(int x,String y){
rollno = x;
name = y;
}
void display(){
System.out.println("Student Roll no. is: "+rollno);
System.out.println("Student Name is: "+name);
}
}
class simple extends student{
int marks;simple(int x, String y,int z){
super(x,y);
marks=z;
}
void display(){
System.out.println("Student Marks is: "+marks);
}
void finaldisplay(){
super.display();
}
}
class Sinheritance{
public static void main(String args[]){
simple s = new simple(68,"Ritej",78);
s.display();
s.finaldisplay();
}
}

