package week04_self_practice;

public class Automation {
    public static void main(String[] args) {
        String url = "www.google.com";
        String browser = "Chrome";

        for (int i = 1; i < 8 ; i++) {

            System.out.println("Opening the " + browser + " browser");
            System.out.println("Navigating to the " + url);

            System.out.println("Execute the test case " + i);

            System.out.println("Get the test result " + i);
            System.out.println("Closing " + browser + " browser");
            System.out.println("____________________________");


        }

    }
}

/*
1. Create a class named Automation and write a Java program that simulates simple web automation for a given URL.

The program structure should include the following steps for automating 7 test cases:

        1. Open the specified browser
        2. Navigate to the URL

        3. Execute the test case

        4. Get the test result
        5. Close the browser

The program structure should be designed to perform these steps for each of the 7 test cases on the provided URL.

 */