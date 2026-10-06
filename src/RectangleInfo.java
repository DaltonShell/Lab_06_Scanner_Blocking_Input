
import java.util.Scanner;
public class RectangleInfo
{
    static void main()
    {
        Scanner in = new Scanner(System.in);
        double h = 0;
        double w = 0;
        double area = 0;
        double perimeter = 0;
        double diagonal = 0;
        boolean done = false;
        String trash = "";

        do
        {
            IO.print("Enter height: ");
            if(in.hasNextDouble())
            {
                h = in.nextDouble();
                done= true;
            }
            else
            {
                trash = in.nextLine();
                IO.println("You must enter a valid height value, not" + trash);
                IO.println("Try again");
            }

        }while(!done);
         done = false;
        do
        {
            IO.print("Enter width: ");
            if(in.hasNextDouble())
            {
                w = in.nextDouble();
                done= true;
            }
            else
            {
                trash = in.nextLine();
                IO.println("You must enter a valid width value, not" + trash);
                IO.println("Try again");
            }

        }while(!done);

        perimeter = w * 2 + h * 2;
        area = h*w;
        diagonal = Math.sqrt(Math.pow(w,2)+Math.pow(h,2));

        IO.println("The perimeter is " + perimeter);
        IO.println("The area is " + area);
        IO.println("The hypotenuse is " + diagonal);

    }
}
