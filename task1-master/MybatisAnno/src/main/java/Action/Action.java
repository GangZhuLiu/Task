package Action;

import Interface.UserAnno;
import model.user;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class Action {
    public static void main(String args[]) throws IOException {
        String resource = "MybatisCfg.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession ss = sf.openSession(true);
        UserAnno userAnno = ss.getMapper(UserAnno.class);
        int insert = userAnno.insertUser(new user("Daddy", 6969));
        System.out.println("插入成功" + insert);
        ss.close();
    }
}
