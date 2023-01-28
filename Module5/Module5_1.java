// Module 5 Programming Assigment Program 1 Isaac Frett 1/28/2023
// The purpose of this program is to display a list to the user, request input of a selection from that list, and return that item from the list, if the input is invalid throw an exception

package Module5;
import java.util.*;

public class Module5_1 {
    
    public static List<String> teams = Arrays.asList(
        "Packers", "Bears", "Chargers", 
        "Broncos", "Raiders", "Colts", "Eagles", 
        "Bills", "Bengals", "Patriots");


    public static void main(String[] args) {
        printNames(teams);
        getUserInput();
    }

    public static void getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which team would you like to see again?");
        String user_input = scanner.nextLine();
        boolean contains = teams.contains(user_input);
        if (!contains) {
            invalidUserInput(user_input, teams);
        }
        if (contains) {
            System.out.println("The returned team is: " + user_input);
        }
        scanner.close();

    }

    private static void invalidUserInput(String user_input, List<String> teams) {
        try {
            invalidInput();
        } 
        catch (Exception e) {
        }
        finally {
            main(null);
        }
    }

    public static void invalidInput() throws Exception {
        System.out.println("Out of Bounds");
        System.out.println();
    }


    public static void printNames(List<String> teams) {
        for (String team : teams) {
            System.out.println(team);
        }
    }
    
}

