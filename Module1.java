// Module 1 Programming Assignment Isaac Frett 1/4/2023
// The purpose of this code is to create a Fan class with default attributes, 
// add constructors to our Fan class that allow us to modify those attributes, 
// and print out any instances of our class with the deafult or modified attributes.

public class Module1 {
    public static void main(String[] args) {

        // Two instances of our Fan class, one default, one with arguments
        Fan Fan1 = new Fan();
        Fan Fan2 = new Fan(2, true, 4, "black");

        // Display the two instances above
        System.out.println(Fan1.toString());
        System.out.println(Fan2.toString());
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

    // Override the toString() default method to change it's return structure
    @Override
    public String toString() {
        return getSpeed() + " " + isOn() + " " + getRadius() + " " + getColor();
    }
}
