package exApril_25;

import java.util.Scanner;

public class lab0044 {
public static void main (String [] args){
    //Program to add the switch statement start the browser by user enter
    Scanner scanner =new Scanner(System.in);
    System.out.println("Enter the browser name");
    String browsername = scanner.nextLine();
    browsername = browsername.toLowerCase();
    switch (browsername) {
        case "chrome":
            System.out.println("start the chrome browser");
            break;
        case "firefox":
            System.out.println("strart the firefox browser");
            break;
        case "opera":
            System.out.println("srats the opera browser");
            break;
        default:
          System.out.println("no browser here");
        }
    }
}

