import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC {
    public static void main(String args[]) throws SQLException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/zyhawesome","root","z13269801y");
            System.out.println("创建连接成功" + c);
            Statement st = c.createStatement();
            System.out.println("获取连接对象" + st);
            String sql = "select from person where name = 'zcc'";
            st.execute(sql);
            System.out.println("插入成功");
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        catch (SQLException e){
            e.printStackTrace();
        }
    }
}
