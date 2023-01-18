// Module 3 Programming Assignment Isaac Frett 1/18/2023
// The purpose of this code is to write methods to return true or false based on a variable's value and to test those methods

public class Module3 {

    public static void main(String[] args) {

        // Three instances 2 of the same value and one of a different value
        IsaacInteger value1 = new IsaacInteger(23);
        IsaacInteger value2 = new IsaacInteger(23);
        IsaacInteger value3 = new IsaacInteger(54);

        // Test code to ensure get and set methods work using our instances created above
        System.out.println("Value1 is: " + value1.getIsaac() + "\n" + "Value2 is: " + value2.getIsaac() + "\n" + "Value3 is: " + value3.getIsaac());
        System.out.println();
        System.out.println("Value1 set to: " + value1.setIsaac(45) + "\n" + "Value2 set to: " + value2.setIsaac(14) + "\n" + "Value3 set to: " + value3.setIsaac(86));
        System.out.println();

          // Reset values
        value1.setIsaac(23);
        value2.setIsaac(23);
        value3.setIsaac(54);
        System.out.println("Values Reverted to:");
        System.out.println("Value1: " + value1.getIsaac());
        System.out.println("Value2: " + value2.getIsaac());
        System.out.println("Value3: " + value3.getIsaac());
        System.out.println();
                                
        // Test code for non-static functions
        System.out.println("Is Value1 Even: " + value1.isEven() + "\n" + "Is Value2 Even: " + value2.isEven() + "\n" + "Is Value3 Even: " + value3.isEven());
        System.out.println();
        System.out.println("Is Value1 Odd: " + value1.isOdd() + "\n" + "Is Value2 Odd: " + value2.isOdd() + "\n" + "Is Value3 Odd: " + value3.isOdd());
        System.out.println();
        System.out.println("Is Value1 Prime: " + value1.isPrime() + "\n" + "Is Value2 Prime: " + value2.isPrime() + "\n" + "Is Value3 Prime: " + value3.isPrime());
        System.out.println();


        // Test code for static functions using variables of int and Integer
        int value4 = 9;
        int value5 = 43;
        int value6 = 32;

        System.out.println("Is Value1 Even: " + IsaacInteger.isEven(value4) + "\n" + "Is Value2 Even: " + IsaacInteger.isEven(value5) + "\n" + "Is Value3 Even: " + IsaacInteger.isEven(value6));
        System.out.println();
        System.out.println("Is Value1 Odd: " + IsaacInteger.isOdd(value4) + "\n" + "Is Value2 Odd: " + IsaacInteger.isOdd(value5) + "\n" + "Is Value3 Odd: " + IsaacInteger.isOdd(value6));
        System.out.println();
        System.out.println("Is Value1 Prime: " + IsaacInteger.isPrime(value4) + "\n" + "Is Value2 Prime: " + IsaacInteger.isPrime(value5) + "\n" + "Is Value3 Prime: " + IsaacInteger.isPrime(value6));
        System.out.println();

        Integer value7 = 6;
        Integer value8 = 0;
        Integer value9 = 312;

        System.out.println("Is Value1 Even: " + IsaacInteger.isEven(value7) + "\n" + "Is Value2 Even: " + IsaacInteger.isEven(value8) + "\n" + "Is Value3 Even: " + IsaacInteger.isEven(value9));
        System.out.println();
        System.out.println("Is Value1 Odd: " + IsaacInteger.isOdd(value7) + "\n" + "Is Value2 Odd: " + IsaacInteger.isOdd(value8) + "\n" + "Is Value3 Odd: " + IsaacInteger.isOdd(value9));
        System.out.println();
        System.out.println("Is Value1 Prime: " + IsaacInteger.isPrime(value7) + "\n" + "Is Value2 Prime: " + IsaacInteger.isPrime(value8) + "\n" + "Is Value3 Prime: " + IsaacInteger.isPrime(value9));
        System.out.println();

    }
}

class IsaacInteger {

    int Isaac;

    // Constructor for IsaacInteger
    IsaacInteger(int Isaac) {
        this.Isaac = Isaac;
    }

    // Get and Set Methods
    public int getIsaac() {
        return Isaac;
    }

    public int setIsaac(int Isaac) {
        this.Isaac = Isaac;
        return Isaac;
    }

    // Non-static methods
    public boolean isEven() {
        if (Isaac % 2 == 0) {
            return true;
        }   
        else {
            return false;
        }
    }

    public boolean isOdd() {
        if (Isaac % 2 != 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isPrime() {
        if (Isaac <= 1) {
            return false;
        }   
        else {
            for (int i = 2; i <= Isaac/2; i++) {
                if ((Isaac % 2) == 0) {
                    return false;
                }
            }
            return true; 
        }
    }

    // Static methods for int 
    public static boolean isEven(int Isaac) {
        if (Isaac % 2 == 0) {
            return true;
        }   
        else {
            return false;
        }
    }

    public static boolean isOdd(int Isaac) {
        if (Isaac % 2 != 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isPrime(int Isaac) {
        if (Isaac <= 1) {
            return false;
        }   
        else {
            for (int i = 2; i <= Isaac/2; i++) {
                if ((Isaac % 2) == 0) {
                    return false;
                }
            }
            return true; 
        }
    }

    // Static methods for Integer
    public static boolean isEven(Integer Isaac) {
        if (Isaac % 2 == 0) {
            return true;
        }   
        else {
            return false;
        }
    }

    public static boolean isOdd(Integer Isaac) {
        if (Isaac % 2 != 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean isPrime(Integer Isaac) {
        if (Isaac <= 1) {
            return false;
        }   
        else {
            for (int i = 2; i <= Isaac/2; i++) {
                if ((Isaac % 2) == 0) {
                    return false;
                }
            }
            return true; 
        }
    }

    // Equals method for int
    public boolean equals(int Isaac) {
        if (this.Isaac == Isaac) {
            return true;
        }
        else {
            return false;
        }
    }

    // Equals method for Integer
    public boolean equals(Integer Isaac) {
        if (this.Isaac == Isaac) {
            return true;
        }
        else {
            return false;
        }
    }
}