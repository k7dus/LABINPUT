import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println(" wat u pi");
        double myPiVal = keyboard.nextDouble();

        keyboard.nextLine();

        System.out.println("what ur name");
        String name = keyboard.nextLine();

        System.out.println("how old r u");
        int age = keyboard.nextInt();

        System.out.println("Your name is " + name);
        System.out.println("you are " + age + " years old");
    }
}