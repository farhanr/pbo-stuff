package assignment.two;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Login login = new Login();
        login.auth("naim", "Naim");
        login.status();
    }
}