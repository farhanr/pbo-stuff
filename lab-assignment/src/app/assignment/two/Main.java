package app.assignment.two;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        // Login login = new Login();
        // login.auth("naim", "Naim");
        // login.status();
        // ap<String, User> userMap;
        HashMap<Integer, UserDetail> userDetailMap = new HashMap<>();
        FileReader fileReader = null;
        BufferedReader reader = null;
        try {
            fileReader = new FileReader("userdetail.txt");
            reader = new BufferedReader(fileReader);
            String s;
            while ((s = reader.readLine()) != null) {
                ArrayList<String> sList = new ArrayList<String>(Arrays.asList(s.split(";")));
                UserDetail userDetail = new UserDetail(Integer.valueOf(sList.get(0)), sList.get(1), sList.get(2),
                        sList.get(3));
                userDetailMap.put(Integer.valueOf(sList.get(0)), userDetail);
            }
            System.out.println(userDetailMap);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (fileReader != null) {
                    fileReader.close();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
        }
    }
}