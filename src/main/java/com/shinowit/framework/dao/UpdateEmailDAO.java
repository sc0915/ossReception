package com.shinowit.framework.dao;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import javax.annotation.Resource;
import java.sql.Types;

/**
 * Created by SC on 2014/12/26.
 */
@Repository
public class UpdateEmailDAO {

    @Resource
    private JdbcTemplate jt;

    public boolean updateEmail(String username){
        boolean result=false;
        String sql="update TBa_MemberInfo set Status=1 where UserName=? ";
        int i=jt.update(sql,new Object[]{username},new int[]{Types.VARCHAR});
        if(i>0){
            result=true;
        }
        return result;
    }
}
