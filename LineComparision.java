import java.util.Scanner;
public class LineComparision {
    double x;
    double y;
    LineComparision(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the x-coordinate of end-point of line");
        this.x=sc.nextDouble();
        System.out.println("Enter the y-coordinate of end-point of line");
        this.y=sc.nextDouble();
    }
    double length(){
        double len = Math.sqrt(Math.pow((this.x - 0), 2) + Math.pow((this.y - 0), 2));
        return len;
    }
    public static void main(String[] args) {
        System.out.println("*******Enter the coordinate of end-points of first line********");
        LineComparision l1=new LineComparision();
        System.out.println("*******Enter the coordinate of end-points of second line*******");
        LineComparision l2=new LineComparision();

        String line1=String.valueOf(l1.length());
        String line2 =String.valueOf(l2.length());

        int compare=line1.compareTo(line2);
        if(compare==0)
            System.out.println("Length of both lines are equal and is "+line1);
        else if(compare>0)
            System.out.println("length of first line is greater");
        else
            System.out.println("Length of second line is greater");
    }
}
