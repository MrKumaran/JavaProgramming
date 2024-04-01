import java.io.*;
import java.net.*;

public class urlConnection {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.coursera.org/learn/assets-threats-and-vulnerabilities/ungradedWidget/mUW7b/identify-steps-of-the-threat-model-process/");
            URLConnection urlcon = url.openConnection();
            InputStream stream = urlcon.getInputStream();
            int i;
            while ((i = stream.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}    