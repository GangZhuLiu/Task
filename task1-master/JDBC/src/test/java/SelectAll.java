
import org.junit.Test;

import java.sql.*;

public class SelectAll {
    @Test
    public void SelectAll(){
        try {Class.forName("com.mysql.jdbc.Driver");
            System.out.println("获取驱动成功");
        String sql = "select * from person";
        Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/zyhawesome","root","z13269801y");
        System.out.println("连接数据库成功");
        Statement st = c.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while (rs.next()){
            int id = rs.getInt("id");
            String name = rs.getString("name");
            int age = rs.getInt("age");
            int QQ = rs.getInt("QQ");
            System.out.println("id:" + id + "name:" + name + "age:" + age + "QQ:" + QQ);
        }Release.release(rs,st,c);
        System.out.println("接口关闭成功");
        }
        catch (SQLException e){
            e.printStackTrace();
        }
        catch (ClassNotFoundException e){
            e.printStackTrace();
        }

    }
}
