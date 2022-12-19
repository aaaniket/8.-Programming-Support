package com.mycompany.carconsumptionconvert;

import java.util.*;

// Public Main class 
public class CarConsumptionConvert {
    public static void main(String args[]) {
        // Getting scanner object
        Scanner s = new Scanner(System.in);
        
        // Getting input
        System.out.println("Enter your consumption in litres/100 KM and press enter: ");
        
        // Getting input value in double format
        double input = s.nextDouble();
        
        // Getting converted value
        double mpgValue = convert(input);
        
        // Printing output
        System.out.println("Converted value to MPG(Miles Per Gallon) is : "+mpgValue);
    }
    
    // Function to convert litres/100 KM to MPG(Miles Per Gallon)
    public static double convert(double value) {
        // Standard conversion rate for L/100KM to MPG
        double convertRate = 235.215;
        
        // Converting to mpgvalue
        double mpgValue = convertRate/value;
        
        // Returning value
        return mpgValue;
    }
}
