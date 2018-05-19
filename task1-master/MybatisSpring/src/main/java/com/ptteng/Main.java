package com.ptteng;

import com.ptteng.model.Student;
import com.ptteng.service.StudentService;
import com.ptteng.service.inplement.StudentServiceimpl;
import org.apache.log4j.Logger;

import java.net.ConnectException;
import java.util.List;

public class Main {
    static Logger logger = Logger.getLogger(Main.class);
    public static void main(String args[]) throws ConnectException {
        StudentService studentService = new StudentServiceimpl();
        //  select

        try {
            List<Student> list = studentService.listStudentByName("傻");
            System.out.println(list);
            if (list.size() > 0){
                logger.info("查找成功");
            }else {logger.info("查找失败");}
        }
        catch (Exception e){
            logger.info("查找异常");
            e.getStackTrace();
        }

        //插入
        Student student = new Student("傻子","779672655","20180518","北方工业大学","9527","2018011519","www.baidu.com","be coding god","乔宝");
        Long creat_at = System.currentTimeMillis();
        student.setCreat_at(creat_at);
        try {
            if(studentService.insertPerson(student)){
                logger.info("插入学生成功" + student.toString());
            }else {logger.info("插入失败");}
        }
        catch (Exception e){
            e.getStackTrace();
            logger.info("插入异常");
        }


        //删除全表
        try {
            studentService.deleteAll();
        }
        catch (Exception e){
            e.getStackTrace();
            logger.info("删除全表出现异常");
        }
        logger.info("清表成功");

        // 更新数据
        long updateTime = System.currentTimeMillis();
        try {
            Student student1 = studentService.selectPersonById(23l);
            student1.setName("二傻子");
            student1.setOnline_student_number("95280");
            student1.setUpdate_at(updateTime);
            logger.info("获取数据更改成功");
            if (studentService.updatePerson(student1)){
                logger.info("操作执行成功" + studentService.selectPersonById(23l));
            }else {logger.info("操作执行失败");}
        }
        catch (Exception e){
            e.getStackTrace();
        }


        //  删除单个人
        try {
            Long personId = 24L;
            if (studentService.deletePerson(personId)){
                logger.info("删除" + personId + "号 person成功");
            }else {logger.info("删除出错");}
        }
        catch (Exception e){
            e.getStackTrace();
            logger.info("删除信息出现异常");
        }

        //根据学号查找学员
        try {
            String number = "952";
            List<Student> list = studentService.getStudentByNumber(number);
            System.out.println(list);

            if (list.size() > 0) {
                logger.info("查找成功。");
            } else {
                logger.info("查找失败");
            }
        }
        catch (Exception e) {
            logger.info("根据学号查找出现异常");
        }
    }

    }


