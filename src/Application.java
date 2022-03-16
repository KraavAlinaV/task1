import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Application {

    static String nameFile = "C:\\Users\\alina.kraav\\IdeaProjects\\test java stag\\untitled1\\other\\text.txt";

    static public void main(String[] args){
        task1();
        task2();
    }

    public static void task1() {
        List<User> users = readInFile(nameFile);
        for(User user : users){
            System.out.println(user);
        }
    }

    public static void task2() {
        List<User> users = readInFile(nameFile);
        Collections.sort(users, User.COMPARE_BY_AGE);
        for(User user : users){
            System.out.println(user);
        }
    }

    public static List<User> readInFile(String nameFile) {
        List<User> users = new ArrayList<>();
        try (FileReader newFile = new FileReader(nameFile)) {
            Scanner scan = new Scanner(newFile);
            while (scan.hasNextLine()) {
                users.add(readUserInFile(scan));
            }
        }
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        return users;
    }

    public static User readUserInFile(Scanner scan){
        return new User(scan.nextLine(), scan.nextLine(), Integer.parseInt(scan.nextLine()));
    }


}
