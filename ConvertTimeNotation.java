/*
Kurt Kaiser
CTIM-168
7/23/2018
Convert Time
Chapter 9 - Project 1
 */

import java.util.Scanner;

public class ConvertTimeNotation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a time in 24-hour notation: ");
        String time = scan.next();
        try {
            int colon = time.indexOf(":");
            if (colon < 0)
                throw new TimeFormatException("Your input is not formatted correctly.");
            int hour = Integer.parseInt(time.substring(0, colon));
            int minutes = Integer.parseInt(time.substring(colon + 1));
            if (hour <= 0 || hour > 24)
                throw new TimeFormatException("Hours must be greater than 0 and less than 24.");
            if (minutes <= 0 || minutes > 60)
                throw new TimeFormatException("Minutes can not be less than 0 or 60 or greater.");
            String ampm = "am";
            if (hour >= 12) {
                ampm = "pm";
                hour = hour - 12;
            }
            System.out.print("In 12-hour notation: " + hour + ":" + minutes + ampm);
        }
        catch (TimeFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}


