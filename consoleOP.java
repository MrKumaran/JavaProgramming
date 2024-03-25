// connot run in IDLE since it doesn't system.console()
// But can be run in Console(Therminal)

import java.io.*;

public class consoleOP {
    public static void main(String[] args) {
        try {
            Console c = System.console();
            String uname = c.readLine();
            char[] pwd = c.readPassword();
            System.out.println(uname);
            for (char ch : pwd)
                System.out.print(ch);


        } catch (Exception e) {
            System.out.print("Error: " + e);
        }

    }
}
