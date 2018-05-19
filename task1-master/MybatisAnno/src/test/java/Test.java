

import Interface.UserAnno;
import model.user;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class Test {
    @org.junit.Test
    public void Test1() throws IOException {
        String resource = "MybatisCfg.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession ss = sf.openSession(true);
        UserAnno userAnno = ss.getMapper(UserAnno.class);
        int insert = userAnno.insertUser(new user("sd",6));
        System.out.println(insert);

        ss.close();
    }

    @org.junit.Test
    public void Test2() throws IOException{
        String resource = "MybatisCfg.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession ss = sf.openSession(true);
        UserAnno userAnno = ss.getMapper(UserAnno.class);
        int delete = userAnno.deleteUser(new user(8));
        System.out.println("删除成功" + delete);
        ss.close();
    }
    @org.junit.Test
    public void Test3() throws IOException{
        String resouce = "MybatisCfg.xml";
        InputStream inputStream = Resources.getResourceAsStream(resouce);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession ss = sf.openSession(true);
        UserAnno userAnno = ss.getMapper(UserAnno.class);
        userAnno.updateUser(new user(9,"fuck",65465));
        ss.close();
    }
    @org.junit.Test
    public void Test4() throws IOException{
        String resouce = "MybatisCfg.xml";
        InputStream inputStream = Resources.getResourceAsStream(resouce);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession ss = sf.openSession(true);
        UserAnno userAnno = ss.getMapper(UserAnno.class);
        user selectOne = userAnno.selectOne(12);
        System.out.println("信息为" + selectOne);
    }
    @org.junit.Test
    public void Test5() throws IOException{
        String resouce = "MybatisCfg.xml";
        InputStream inputStream = Resources.getResourceAsStream(resouce);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession ss = sf.openSession(true);
        UserAnno userAnno = ss.getMapper(UserAnno.class);
        List<user> ListAll = userAnno.getAll();
        System.out.println("表格信息为" + ListAll);
    }
}
