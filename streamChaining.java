import java.io.*;

public class streamChaining {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("file1.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            DataOutputStream dos = new DataOutputStream(bos);
            dos.writeUTF("Java");
            dos.writeInt(11);
            dos.writeChar('.');
            dos.writeDouble(.22);
            dos.close();
            bos.close();
            fos.close();
            FileInputStream fis = new FileInputStream("file1.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            DataInputStream dis = new DataInputStream(bis);
            System.out.print(dis.readUTF());
            System.out.print(dis.readInt());
            System.out.print(dis.readChar());
            System.out.print(dis.readDouble());
            dis.close();
            bis.close();
            fis.close();
        } catch (Exception e) {
            System.out.print
                    (e);
        }

    }
}
