class sup{
	int a,b,c;
	sup(int x, int y){
      a = x;
      b = y;
	}  
    void add(){
	  c = a+b;
	  System.out.println("Addition: "+c);
	}
}
class sub extends sup{
	 int d;
	 sub(int x,int y, int z){
		 super(x,y);
		 d = z;
     }
	 void subtr(){
		 c = a-b-d;
		 System.out.println("Subtraction: "+c);
	 }
}
class derived extends sub{
	int p;
	derived(int x, int y, int z, int q){
		super(x,y,z);
		p = q;
    }
    void multi(){
        c = a*b*d*p;
        System.out.println("Multiplication: "+c);
	}
}
class Multilevel{
public static void main(String args[]){
	derived ob = new derived(20,10,2,30);
	ob.add();
	ob.subtr();
	ob.multi();
}
}		