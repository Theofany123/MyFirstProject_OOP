import java.util.Scanner;

public class MyFirstProgram {
    public static void main(String[] args) {
        boolean main = true;
        int choose = 0;
        System.out.println(" \u001B[48;5;214m" + "\u001B[38;5;34m" + "-H E L L O G U Y S-" + "\u001B[0m"); 
        String nama;
        System.out.print("\u001B[38;5;218m");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Are You Boy/Girl: ");
        String Gender = scanner.nextLine();
        System.out.print("\u001B[38;5;218m");
        System.out.print("What is your Name: ");
        nama = scanner.nextLine();
        

        System.out.print("\u001B[48;5;159m");if (Gender.equals("Boy"))  {
            System.out.println("Hello, " + nama + " Handsome\u001B[0m\n");}
        else if (Gender.equals("boy")) {
            System.out.println("Hello, " + nama + " Handsome\u001B[0m\n");}
        if (Gender.equals("Girl")) {
            System.out.println("Hello, " + nama + " Pretty\u001B[0m\n");}
        else if (Gender.equals("girl")) {
            System.out.println("Hello, " + nama + " Pretty\u001B[0m\n");}
        
    
        String[] facts = {
            "- Java is the second most popular language and is very popular among the developers.",
            "- Java is Among the highest-Paid Programming Language.",
            "- Java was created by James Gosling in 1991.",
            "- Minecraft was its first game App.",
            "- Java comes after C.",
            "- A name inspired by Coffe.",
            "- The initial name of java was OAK. ",
            "- Java 1.0 was officially released on May 23, 1995.",
            "- Java is an object-oriented programming (OOP) language.",
            "- Java is used for server-side programming.",
            "- Java has very strong security features. .",
            "- Java is used for building large-scale enterprise applications.",
            "- Java is a platform-independent language.",
        };

        String versiJava = System.getProperty("java.version");
        System.out.println("\u001B[48;5;214mVersi javamu = " + versiJava + "\u001B[0m");

        while (main) {
        
        System.out.println("\n\u001B[34m" + "**********************************" + "\u001B[0m");
        System.out.println("\u001B[38;5;218m" + "  \u001B[1m~INTERESTING FACTS ABOUT JAVA~ \u001B[0m   ");
        System.out.println("\u001B[34m" + "**********************************" + "\u001B[0m");

        System.out.println("\u001B[38;5;51m" + facts[choose]);
        System.out.println("\u001B[48;5;170m" + "Other or stop (Yes/No)"+ "\u001B[0m ");
        choose = choose + 1;  
        String response = scanner.next().trim();

        main = response.equalsIgnoreCase("Yes"); 
        }
        
        System.out.println("\u001B[48;5;149m" + "Okey, that's all the interesting facts about Java. Thank You + \u001B[0m ");
       
        scanner.close();

    }
}