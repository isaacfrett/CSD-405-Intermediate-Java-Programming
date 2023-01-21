// Module 4 Programming Assignemnt Isaac Frett 1/21/2023
// The purpose of this code is to take user input of numbers and return to them the highest value they entered

import java.util.ArrayList;
import java.util.Scanner;

public class Module4 {
    public static void main(String[] args) {

        // ArrayList to store our user input
        ArrayList<Integer> list = new ArrayList<>();

        // Setup user input and variables for output/while loop
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number:");

        Integer largest_value = 0;
        int i = 0;

        // While loop to scan over user input and add to list, stop if user input is a 0
        while (i == 0) {
            int current_num = scanner.nextInt();

            if (current_num != 0) {
                list.add(current_num);
                continue;
            }

            if (current_num == 0) {
                list.add(current_num);
                scanner.close();
                largest_value = IsaacArrayListTest.max(list);
                i++;
                break;
            }
        }

        // Output the user the returned vallue of calling our method from the while loop
        System.out.println("The largest value you entered is: " + largest_value);
    }
}


// class to store our max method to return the largest value given an input of a list
class IsaacArrayListTest {

    public static Integer max(ArrayList<Integer> list) {
        
        int largest_int = 0;

        for (Integer value : list) {
            if (value > largest_int) {
                largest_int = value;
            }
        }
        
        return largest_int;
    }
}