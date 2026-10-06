import java.util.Scanner;
public class CtoFConverter
{
    static void main()
    {
        Scanner in = new Scanner(System.in);
        double cVal = 0;
        double fVal = 0;
        boolean done = false;
        String trash = "";
        IO.print("Enter C value: ");


        do
        {

            if(in.hasNextDouble())
            {
                cVal = in.nextDouble();
                fVal = cVal / 9.0/5.0 +32;
                IO.print("The value " + cVal + " in Celsius is " + fVal + " degrees Fahrenheit.");
                done= true;
            }
            else
            {
                trash = in.nextLine();
                IO.println("You must enter a valid Celsius value, not " + trash);
                IO.println("Try again");
            }

        }while(!done);

    }
}
