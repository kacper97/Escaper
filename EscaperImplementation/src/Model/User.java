package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class User {
    private String name;
    private String surname;

    public String[] login(String username, String password, String privilige) {
        String nameAndSurename[] = new String[2];
        String userData;
        File file = new File("src\\Model\\UserDataBase.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (sc.hasNextLine()) {
            userData = sc.nextLine();

            if (username.equals(userData.split(";")[0]) && password.equals(userData.split(";")[1]) && privilige.equals(userData.split(";")[4])) {

                nameAndSurename[0] = userData.split(";")[2];
                nameAndSurename[1] = userData.split(";")[3];
                sc.close();
                return nameAndSurename;
            }





        }
        sc.close();
        throw new RuntimeException("Login Problem");
    }
}

