import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random gen = new Random();


        String[] names = {"Bob", "Carol", "Ted", "Alice"};
        System.out.println(names.length);

        System.out.println(names[0]);

        for (int i = 0; i < names.length; i++)
            System.out.printf("%8s", names[i]);

        int[] scores = new int[100]; // creates an array of 100 ints Not set yet
        for (int i = 0; i < scores.length; i++)
            scores[i] = 0;        // sets all the data points to 0


        int[] values = new int[100];

        for (int i = 0; i < values.length; i++) {
            values[i] = gen.nextInt(100) + 1; // sets all to 1 to 100
        }

        System.out.println("n\n");

        for (int i = 0; i < values.length; i++)
            System.out.printf("%4d", values[i]);

        //Array Algorithms
        //sum
        int sum = 0;
        double ave = 0;
        for (int i = 0; i < values.length; i++)
            sum += values[i];

        System.out.println("\nThe sum of values is " + sum);
        ave = (double) sum / values.length;
        System.out.printf("Ave is %5.2f", ave);
        System.out.println("The average is " + sum / values.length); // displays as an int TRUNCATED

        //Min Max
        int min = values[0];
        int max = values[0];

        for (int i = 0; i < values.length; i++) {
            if (values[i] < min) // New MIN!
                min = values[i]; //so save it
            if (values[i] > max) // New MAX!
                max = values[i]; //so save it
        }
        System.out.println("Min is " + min);
        System.out.println("Max is " + max);

        // Search algorithms
        // Find all or Find Any
        int target = 53;
        boolean found = false;
        for (int i = 0; i < values.length; i++)
        {
            if (values[i] == target) {
                System.out.println("Found at " + i);
                found = true;
            }
            if (!found)
                System.out.println("Value is not in the array!");

            //Find first
            target = 53;
            found = false;
            for (i = 0; i < values.length; i++)
            {
                if (values[i] == target) {
                    System.out.println("Find First Found at " + i);
                    found = true;
                    break;

                }
            }
            if (!found)
                System.out.println("Value is not in the array!");

            //Find last
            found = false;
            for (i = values.length - 1; i >= 0; i--)
            {
                if (values[i] == target) {
                    System.out.println("Find Last Found at " + i);
                    found = true;
                    break;

                }
            }
            if (!found)
                System.out.println("Value is not in the array!");


        }
    }
}