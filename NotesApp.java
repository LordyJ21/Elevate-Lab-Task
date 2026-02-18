import java.io.*;
import java.util.Scanner;

public class NotesApp {

    static final String FILE_NAME = "notes.txt";

    // Write new note
    public static void writeNote() {
        try {
            FileWriter fw = new FileWriter(FILE_NAME, true); // true = append mode
            BufferedWriter bw = new BufferedWriter(fw);
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter note: ");
            String note = sc.nextLine();

            bw.write(note);
            bw.newLine();
            bw.close();

            System.out.println("Note saved successfully.");

        } catch (IOException e) {
            System.out.println("Error writing file.");
        }
    }

    // Read notes
    public static void readNotes() {
        try {
            FileReader fr = new FileReader(FILE_NAME);
            BufferedReader br = new BufferedReader(fr);

            String line;
            System.out.println("\n--- Your Notes ---");

            while ((line = br.readLine()) != null) {
                System.out.println("- " + line);
            }

            br.close();

        } catch (FileNotFoundException e) {
            System.out.println("No notes found yet.");
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Notes App =====");
            System.out.println("1. Add Note");
            System.out.println("2. View Notes");
            System.out.println("0. Exit");
            System.out.print("Choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    writeNote();
                    break;
                case 2:
                    readNotes();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}
