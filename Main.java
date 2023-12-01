import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // Sabiha
    // Mad Libs

    // Variables
    String noun = "", verb = "", adj = "", color = "", place = "";

    // Collect the data
    Scanner reader = new Scanner(System.in);
    System.out.println("Welcome to my Mad Libs program!");
    System.out.print("Give me a noun: ");
    noun = reader.next();
    System.out.print("Give me a verb: ");
    verb = reader.next();
    System.out.print("Give me a adjective: ");
    adj = reader.next();
    System.out.print("Give me a color: ");
    color = reader.next();
    System.out.print("Give me a place: ");
    place = reader.next();
    reader.close();

    // Output paragraph
    System.out.println("I can't wait to go to the " + place + " next Thursday. I will wear my " + color
        + " shirt. I'll bring my favorite " + noun + ". I will also " + verb
        + " further than I ever have before. It will be a " + adj + " day.");
  }
}