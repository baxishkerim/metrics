package com.example.repository;


import com.example.model.AdminMetrics;
import com.example.model.enums.AdminRoles;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Mapper
@Repository
public interface AdminRepository {



    @Select("insert into admin_table(roles,")
    void createMetricsByAdmin(AdminMetrics metrics);




    @Select("delete from admin_table where where id = #{id} and type = #{type}")
    void deleteByIdAndRole(Long id, Set<AdminRoles> roleSet);

}
