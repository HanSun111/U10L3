import java.util.Scanner;

public class Bacteria
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("How many bacterias? ");
        int init = input.nextInt();
        System.out.print("How many hours will the bacteria sit? ");
        int hours = input.nextInt();
        long bacteria = numBacteriaAlive(init, hours);
        System.out.println("After " + hours + ", there will be " + bacteria + " bacteria");
    }

    public static long numBacteriaAlive(int init, int hour)
    {
        // WRITE THIS METHOD to use RECURSION to find the number of bacteria!
        if(hour == 0){
            return init;
        }
        long num = numBacteriaAlive(init,hour - 1);
        return num + num * 2;
    }
}
