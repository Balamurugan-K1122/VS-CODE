package com.example;

import java.util.List;  // Unused import that will trigger a warning in Codacy

public class Main {
    public static void main(String[] args) {
        // Hardcoded value - Codacy might suggest using constants instead
        String greeting = "Hello world!";
        
        // Potential inefficiency - using a non-optimal way to concatenate strings
        String message = greeting + " Let's learn coding."; 

        System.out.println(message);  // This will display the concatenated string
    }
}
// happy coding