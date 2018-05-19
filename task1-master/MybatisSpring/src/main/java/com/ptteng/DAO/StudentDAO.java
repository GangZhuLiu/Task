package com.ptteng.DAO;

import com.ptteng.model.Student;

import java.util.List;

public interface StudentDAO {
    boolean insertPerson(Student student) throws Exception;
    boolean deleteAll()throws Exception;
    boolean deletePerson(Long id)throws Exception;
    boolean updatePerson(Student student)throws Exception;
    Student selectPersonById(Long id)throws Exception;
    List<Student> listStudentByName(String name)throws Exception;
    List<Student> getStudentByNumber(String online_student_number) throws Exception;
}
