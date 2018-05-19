import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JdbcPrepareSt {
    public static void main(String[] args) {
        String sql1="insert into person values(?,?,?,null)";
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }try (Connection c= DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/zyhawesome","root","z13269801y");
              PreparedStatement p = c.prepareStatement(sql1);
        )
        { for (int i = 0; i < 100; i++) {
            p.setString(1,"lisi"+i);        //直接利用PS接口中的设置参数的方法，设置指定位置通配符的值
            p.setInt(2,15+i);
            p.setString(3,"20111111");
            p.execute();               //这里因为直接执行语句就行，不需要方法中带参数sql1
        }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}