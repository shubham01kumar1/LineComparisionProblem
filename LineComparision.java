import java.util.Scanner;
public class LineComparision {
    public static void main(String[] args) {
        Line l1=new Line();
        Line l2=new Line();
        System.out.println("Enter the coordinate of end-point of first line");
        l1.input();
        System.out.println("Enter the coordinate of end-point of second line");
        l2.input();
        String line1=String.valueOf(l1.length(l1.x,l1.y));
        String line2 =String.valueOf(l2.length(l2.x,l2.y));
        if(line1.equals(line2))
            System.out.println("Length of both lines are equal and is "+line1);
        else
            System.out.println("Lenth of both lines are not equal");

    }
}
class Line {
    double x;
    double y;
    Scanner sc=new Scanner(System.in);
    void input() {
        System.out.println("Enter the X-Coordinate of the point:");
        x=sc.nextDouble();
        System.out.println("Enter the Y-Coordinate of point:");
        y=sc.nextDouble();
    }
    double length(double x,double y) {
        double length = Math.sqrt(Math.pow((x - 0), 2) + Math.pow((y - 0), 2));
        return length;
    }
}