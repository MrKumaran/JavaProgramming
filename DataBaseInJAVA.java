import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseInJAVA{
    public static void main(String[] args) throws Exception{
        String url = "jdbc:mysql://localhost:3306/new";
        String username = "root"; // MySQL credentials
        String password = "Kumaran@4376";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        String query = "Select * from no";
        ResultSet rs = st.executeQuery(query);
        while (rs.next()){
            System.out.println(rs.getInt(1));
        }
        st.close();
        con.close();
    }
}