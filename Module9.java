// Isaac Frett 2/15/2023
// Purpose of this code is to demonstrate Lambda Function

import java.util.*;

public class Module9 {
    public static void main(String[] args) {  
        
        // Make a list and assign it values
        List<String> list=new ArrayList<String>();  
        list.add("Isaac");  
        list.add("Abe");  
        list.add("Ryan");  
        list.add("Sam");  
          
        // In this case we can use the forEach method on our list and create the 
        // varibale n that relates to each element in our list and for every element
        // in the list we are going to print that element out. 
        list.forEach((n) ->
            System.out.println(n)  
        );  
    }  
}
