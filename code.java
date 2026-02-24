import java.util.Scanner;

public class Mad_Libs_Game {

    public static void main(String[] args) {

        //MAD LIBS GAME

        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String noun1;
        String noun2;
        String verb1;
        String adjective2;
        String adjective3;

        System.out.print("Enter an Adjective (Description of Something): ");
        adjective1 = scanner.nextLine();

        System.out.print("Enter a Noun (name of animal or person): ");
        noun1 = scanner.nextLine();

        System.out.print("Enter a Noun (name of animal or person): ");
        noun2 = scanner.nextLine();

        System.out.print("Enter another adjective: ");
        adjective2 = scanner.nextLine();

        System.out.print("Enter a Verb (action word, ending with -ing): ");
        verb1 = scanner.nextLine();

        System.out.print("Enter another Adjective: ");
        adjective3 = scanner.nextLine();


        System.out.println(" ");
        System.out.println("Today, I work at an " + adjective1 + " " + "office" + "." );
        System.out.println("My " + noun1 + " " + "is after my life " + ".");
        System.out.println( noun2 + " " + "is not helping matters with their " + adjective2 + " " + "of 'dress codes', which is " + verb1 + "." );
        System.out.println("May God " + adjective3 + " " + "us all" + "!" );

        scanner.close();

    }
}
