import java.util.Scanner;
public class FuelCosts
{
    static void main()
    {
        Scanner in = new Scanner(System.in);
        double capacity = 0;
        double mpg = 0;
        double ppg = 0;
        boolean done = false;
        double cost100 = 0;
        double totalMiles = 0;
        String trash = "";


        do
        {
            IO.print("Enter tank capacity in gallons: ");

            if(in.hasNextDouble())
            {
                capacity = in.nextDouble();
                in.nextLine();
                done = true;

            }
            else
            {
                trash = in.nextLine();
                IO.println("You must enter a valid capacity not " + trash);
            }


        }while(!done);

        IO.println("The capacity is " + capacity);

        done = false;

        do
        {
            IO.print("Enter the miles per gallon: ");

            if(in.hasNextDouble())
            {
                mpg = in.nextDouble();
                in.nextLine();
                done = true;

            }
            else
            {
                trash = in.nextLine();
                IO.println("You must enter a valid miles per gallon measurement not " + trash);
            }


        }while(!done);
        IO.println("The miles per gallon is " + mpg);
        done = false;

        do
        {
            IO.print("Enter the price per gallon: ");

            if(in.hasNextDouble())
            {
                ppg = in.nextDouble();
                in.nextLine();
                done = true;

            }
            else
            {
                trash = in.nextLine();
                IO.println("You must enter a valid price per gallon measurement not " + trash);
            }
            IO.println("The price per gallon is " + ppg);

        }while(!done);

        cost100 =  100 / mpg * ppg;
        totalMiles = capacity * mpg;

        IO.println("The cost to drive 100 miles is " + cost100);
        IO.println("the total amount of miles you can drive on a full tank of gas is " + totalMiles);
    }
}
