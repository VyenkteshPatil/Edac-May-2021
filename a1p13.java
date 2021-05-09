import java.util.*;

class a1p13{
public static void main(String args[]){

Scanner sc = new Scanner(System.in);
System.out.print("Enter width(w): ");
double w = sc.nextDouble();
System.out.print("Enter height(h): ");
double h = sc.nextDouble();

double p = 2*(w+h);
double a = w*h;

System.out.println("Perimeter of the rectangle is: " +p);
System.out.print("Area of the rectangle is: " +a);

}
}