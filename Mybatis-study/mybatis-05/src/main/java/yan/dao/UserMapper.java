package yan.dao;

import org.apache.ibatis.annotations.*;
import yan.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    @Select("select * from mybatis.user")
    List<User> getUsers();

    @Select("select * from mybatis.user where id = #{id}")
    User getUserById(@Param("id") int id);

    @Insert("insert into user(id,name,pwd) value (#{id},#{name},#{password})")
    int addUser(User user);

    @Update("update user set name=#{name},pwd=#{password} where id = #{id}")
    int updateUser(User user);

    @Delete("delete from mybatis.user where id = #{id}")
    int deleteUser(@Param("id") int id);
}
