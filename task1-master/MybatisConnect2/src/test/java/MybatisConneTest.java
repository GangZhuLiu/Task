import dao.PersonMapper;
import model.Person;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;


public class MybatisConneTest {
    @Test
    public void addPerson() throws IOException {
            String resource = "Mybatis-cfg.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession ss = sf.openSession(true);
            PersonMapper testDAO = ss.getMapper(PersonMapper.class);
            Person per = new Person("zyh",77,778899);
            testDAO.addPerson(per);
            System.out.println("插入成功" + per.getId() );
    }
    @org.junit.Test
    public void deletePerson() throws IOException{
        String resource = "Mybatis-cfg.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession ss = sf.openSession(true);
        PersonMapper personMapper = ss.getMapper(PersonMapper.class);
        personMapper.deletePerson(1);
    }
    @org.junit.Test
    public void updatePerson() throws IOException{
        String resource = "Mybatis-cfg.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession ss = sf.openSession(true);
        PersonMapper personMapper = ss.getMapper(PersonMapper.class);
        Person per = new Person(4,"kxf",546321,94651);
        personMapper.updatePerson(per);
    }

    @org.junit.Test
    public void selectPerson() throws IOException{
        String resource = "Mybatis-cfg.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession ss = sf.openSession(true);
        PersonMapper personMapper = ss.getMapper(PersonMapper.class);
        System.out.println(personMapper.selectPerson(3));
    }
    @Test
    public void selectAll() throws IOException{
        String resource = "Mybatis-cfg.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession ss = sf.openSession(true);
        PersonMapper personMapper = ss.getMapper(PersonMapper.class);
        System.out.println(personMapper.ListAll());
    }
}