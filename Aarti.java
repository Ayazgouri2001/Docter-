import java.util.*;

public class Aarti {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object
        System.out.print("Enter your name: ");  // Prompt user input
        String name = sc.nextLine();  // Use nextLine() to read full input
        System.out.println("Your name is: " + name);
        sc.close();  // Close the Scanner to avoid resource leak
    } 
}
