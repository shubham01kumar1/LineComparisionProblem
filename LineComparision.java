import java.util.Scanner;
public class LineComparision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the X-Coordinate of point");
       double x = sc.nextDouble();
        System.out.println("Enter the Y-Coordinate of point");
        double y = sc.nextDouble();
        double length = Math.sqrt(Math.pow((x - 0), 2) + Math.pow((y - 0), 2));
        System.out.println("Length of line is " + length);
    }
}