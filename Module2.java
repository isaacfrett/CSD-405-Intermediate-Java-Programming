// Module 2 Programming Assignment Isaac Frett 1/7/2023
// The purpose of this code is to create methods to display both a collection or an individual instance of the Fan class

import java.util.ArrayList;
import java.util.List;

public class Module2 {
    public static void main(String[] args) {

        // Three instances of our Fan class, one default, one with arguments
        Fan Fan1 = new Fan();
        Fan Fan2 = new Fan(2, true, 4, "black");
        Fan Fan3 = new Fan(4, true, 2, "yellow");

        // Creating a list and displaying it, displaying an instance of the list
        UseFans.display_list(UseFans.create_list(Fan1, Fan2, Fan3));
        UseFans.display_one(Fan2);
    }
}


class Fan {

    // Constants for the Fan class
    final int STOPPED = 0;
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;

    // fields of every Fan class that can be modified
    private int speed = STOPPED;
    private boolean on = false;
    private int radius = 6;
    String color = "white";

    // Getters and Setters for Fan class
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    // Two constructors, first one is default or no arguments, second one is with arguments or parameters
    Fan() {}
    Fan(int speed, boolean on, int radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
}

class UseFans {

    // creation of a collection of fan instances
    public static List<Fan> create_list(Fan... fan_instance) {
        List<Fan> fan_list = new ArrayList<Fan>();
        for (Fan i : fan_instance) {
            fan_list.add(i);
        }
        return fan_list;  
    }

    // To display a collection of fans without toString()
    public static void display_list(List<Fan> fan_list) {
        for (Fan i : fan_list) {
            System.out.println("The fan speed is set to: " + i.getSpeed());
            System.out.println( "The fan is on true/false: " + i.isOn());
            System.out.println("The radius of the fan is: " + i.getRadius());
            System.out.println("The color of the fan is: " + i.getColor());
            System.out.println("");
        }
    }

    // To display one instance of the fan without toString()
    public static void display_one(Fan fan_instance) {
        System.out.println("The fan speed is set to: " + fan_instance.getSpeed());
        System.out.println( "The fan is on true/false: " + fan_instance.isOn());
        System.out.println("The radius of the fan is: " + fan_instance.getRadius());
        System.out.println("The color of the fan is: " + fan_instance.getColor());
    
    }
}
