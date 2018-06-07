package model;

import java.io.*;
import java.util.Scanner;

public class User {
    public String[] login(String username, String password, String privilige) {
        String nameAndSurename[] = new String[2];
        String userData;
        File file = new File("Databases\\UserDataBase.txt");
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

    public void register(String username, String password, String name, String surname, String privilige){
        Writer output;
        String newUserData = username+";"+password+";"+name+";"+surname+";"+privilige;
        try {
            output = new BufferedWriter(new FileWriter("Databases\\UserDataBase.txt",true));
            ((BufferedWriter) output).newLine();
            output.append(newUserData);
            output.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

