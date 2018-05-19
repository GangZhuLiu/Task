package Interface;

import model.user;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface UserAnno {
    @Insert("insert into user(id,username,password) values (#{id},#{username},#{password})")
    int insertUser(user user);
    @Delete("delete from user where id = #{id}")
    int deleteUser(user user);
    @Update("update user set username = #{username},password = #{password} where id = #{id}")
    int updateUser(user user);
    @Select("select * from user where id = #{id}")
    user selectOne(int id);
    @Select("select * from user")
    List<user> getAll();
}

