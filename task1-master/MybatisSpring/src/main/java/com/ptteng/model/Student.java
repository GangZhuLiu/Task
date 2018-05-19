package com.ptteng.model;

public class Student {
    private Long id;
    private String name;
    private String QQ;
    private String Enrolment_time;
    private String graduate_institutions;
    private String online_student_number;
    private String entering;
    private String daily_link;
    private String wishes;
    private String personal_tutor;
    private Long creat_at;
    private Long update_at;

    public Student(Long id, String name, String QQ, String enrolment_time, String graduate_institutions, String online_student_number, String entering, String daily_link, String wishes, String personal_tutor, Long creat_at, Long update_at) {
        this.id = id;
        this.name = name;
        this.QQ = QQ;
        Enrolment_time = enrolment_time;
        this.graduate_institutions = graduate_institutions;
        this.online_student_number = online_student_number;
        this.entering = entering;
        this.daily_link = daily_link;
        this.wishes = wishes;
        this.personal_tutor = personal_tutor;
        this.creat_at = creat_at;
        this.update_at = update_at;
    }

    public Student(String name, String QQ, String enrolment_time, String graduate_institutions, String online_student_number, String entering, String daily_link, String wishes, String personal_tutor) {
        this.name = name;
        this.QQ = QQ;
        Enrolment_time = enrolment_time;
        this.graduate_institutions = graduate_institutions;
        this.online_student_number = online_student_number;
        this.entering = entering;
        this.daily_link = daily_link;
        this.wishes = wishes;
        this.personal_tutor = personal_tutor;
    }

    public Student(Long id,String name, String QQ, String  enrolment_time, String graduate_institutions, String online_student_number, String entering, String daily_link, String wishes, String personal_tutor) {
        this.name = name;
        this.QQ = QQ;
        Enrolment_time = enrolment_time;
        this.graduate_institutions = graduate_institutions;
        this.online_student_number = online_student_number;
        this.entering = entering;
        this.daily_link = daily_link;
        this.wishes = wishes;
        this.personal_tutor = personal_tutor;
        this.id = id;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", QQ='" + QQ + '\'' +
                ", Enrolment_time='" + Enrolment_time + '\'' +
                ", gruduate_institutions='" + graduate_institutions + '\'' +
                ", online_student_number='" + online_student_number + '\'' +
                ", entering='" + entering + '\'' +
                ", daily_link='" + daily_link + '\'' +
                ", wishes='" + wishes + '\'' +
                ", personal_tutor='" + personal_tutor + '\'' +
                ", creat_at=" + creat_at +
                ", update_at=" + update_at +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQQ() {
        return QQ;
    }

    public void setQQ(String QQ) {
        this.QQ = QQ;
    }

    public String getEnrolment_time() {
        return Enrolment_time;
    }

    public void setEnrolment_time(String enrolment_time) {
        Enrolment_time = enrolment_time;
    }

    public String getGruduate_institutions() {
        return graduate_institutions;
    }

    public void setGruduate_institutions(String gruduate_institutions) {
        this.graduate_institutions = gruduate_institutions;
    }

    public String getOnline_student_number() {
        return online_student_number;
    }

    public void setOnline_student_number(String online_student_number) {
        this.online_student_number = online_student_number;
    }

    public String getEntering() {
        return entering;
    }

    public void setEntering(String entering) {
        this.entering = entering;
    }

    public String getDaily_link() {
        return daily_link;
    }

    public void setDaily_link(String daily_link) {
        this.daily_link = daily_link;
    }

    public String getWishes() {
        return wishes;
    }

    public void setWishes(String wishes) {
        this.wishes = wishes;
    }

    public String getPersonal_tutor() {
        return personal_tutor;
    }

    public void setPersonal_tutor(String personal_tutor) {
        this.personal_tutor = personal_tutor;
    }


    public Long getCreat_at() {
        return creat_at;
    }

    public void setCreat_at(Long creat_at) {
        this.creat_at = creat_at;
    }

    public Long getUpdate_at() {
        return update_at;
    }

    public void setUpdate_at(Long update_at) {
        this.update_at = update_at;
    }
}
