import com.ptteng.model.Student;
import com.ptteng.service.StudentService;
import com.ptteng.service.inplement.StudentServiceimpl;

import java.util.List;

public class Test {
    @org.junit.Test
    public void Test1()throws Exception{
        StudentService studentService = new StudentServiceimpl();
        studentService.deleteAll();
    }
    @org.junit.Test
    public void Test2()throws Exception{
        StudentService studentService = new StudentServiceimpl();
        Student student = new Student("傻子","779672655","2018年05月18日","北方工业大学","编号9527","2018日05月19日","www.baidu.com","be coding god","乔宝");
        studentService.insertPerson(student);

    }
    @org.junit.Test
    public void Test3() throws Exception{
        StudentService studentService = new StudentServiceimpl();
        List<Student> list = studentService.listStudentByName("傻子");
        System.out.println(list);
    }
    @org.junit.Test
    public void Test4() throws Exception{
        StudentService studentService = new StudentServiceimpl();
        Student student = studentService.selectPersonById(23L);
        student.setName("二傻子");
        studentService.updatePerson(student);
    }
    @org.junit.Test
    public void Test5() throws Exception{
        StudentService studentService = new StudentServiceimpl();
        List<Student> list = studentService.getStudentByNumber("952");
        System.out.println(list);
    }
}
