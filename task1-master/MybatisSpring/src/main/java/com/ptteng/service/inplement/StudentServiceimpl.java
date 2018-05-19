package com.ptteng.service.inplement;

import com.ptteng.DAO.StudentDAO;
import com.ptteng.model.Student;
import com.ptteng.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class StudentServiceimpl implements StudentService {
    public static ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/applicationContext.xml");
    public static StudentDAO studentDAO = applicationContext.getBean(StudentDAO.class);
    @Override
    public boolean deleteAll() throws Exception{
        boolean value = studentDAO.deleteAll();
        return value;
    }

    @Override
    public boolean deletePerson(Long id) throws Exception {
        boolean value = studentDAO.deletePerson(id);
        return value;
    }

    @Override
    public boolean insertPerson(Student student)throws Exception {
        boolean value = studentDAO.insertPerson(student);
        return value;
    }

    @Override
    public boolean updatePerson(Student student) throws Exception{
        boolean value = studentDAO.updatePerson(student);
        return value;
    }

    @Override
    public Student selectPersonById(Long id) throws Exception{
        return studentDAO.selectPersonById(id);
    }

    @Override
    public List<Student> getStudentByNumber(String online_student_number) throws Exception {
        return studentDAO.getStudentByNumber(online_student_number);
    }

    @Override
    public List<Student> listStudentByName(String name)throws Exception {
        return studentDAO.listStudentByName(name);
    }
}
