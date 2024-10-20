interface bike{
int speed = 50;
public void total_dist();
}
interface cycle{
int distance = 150;
public void speed();
}
class twowheeler implements bike,cycle{
  int total_dist;
  int avg_speed;
  public void total_dist()
  {
    total_dist = speed*distance;
    System.out.println("Distance: "+total_dist);
  }
public void speed(){
avg_speed = total_dist/speed;
System.out.println("Average speed: "+avg_speed);
}
}
class Multiple{
public static void main(String args[]){
twowheeler ob = new twowheeler();
ob.total_dist();
ob.speed();
}
}