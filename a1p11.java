import java.util.*;

class a1p11{
public static void main(String args[]){

Scanner circle = new Scanner(System.in);
System.out.print("Enter radius: ");
double radius;
radius = circle.nextDouble();

double perimeter = 2*3.14d*radius;
double area = 3.14d*radius*radius;

System.out.println("Perimeter of circle: "+perimeter);
System.out.println("Area of circle: "+area);
}
}
