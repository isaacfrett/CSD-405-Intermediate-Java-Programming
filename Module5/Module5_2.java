// Module 5 Programming Assigment Program 2 Isaac Frett 1/28/2023
// The purpose of this program is to create a file and write random numbers to the file, or append random numbers if the
// file already exists and then display the contents of the file

package Module5;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Module5_2 {
    public static void main(String[] args) {
        String pathname = "C:\\Users\\isaac\\OneDrive\\Desktop\\data.file";
        File myFile = new File(pathname);
        try {
            if (myFile.createNewFile()) {
              System.out.println("File created: " + myFile.getName());
              addRandomInts(pathname);
              openAndReadFile(myFile);
            } 
            else {
              System.out.println("File already exists");
              addRandomInts(pathname);
              openAndReadFile(myFile);
            }
        } 
        catch (IOException e) {
            System.out.println("An error occurred");
        }
    }


    public static void addRandomInts(String pathname) {
        try {
            FileWriter myWriter = new FileWriter(pathname, true);
            myWriter.append(getRandomInts());
            myWriter.close();
            System.out.println("Successfully wrote to the file");
          } 
        catch (IOException e) {
            System.out.println("An error occurred.");
        }
    }


    private static String getRandomInts() {
        String ints = "";
        for (int i = 0; i < 10; i++) {
            int randomNum = ThreadLocalRandom.current().nextInt(0, 100 + 1);
            Integer number = randomNum;
            String numberAsString = number.toString();
            ints += numberAsString + " ";
        }
        return ints;
    }

    public static void openAndReadFile(File filename) {
        try {
            Scanner myReader = new Scanner(filename);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
    }
}
