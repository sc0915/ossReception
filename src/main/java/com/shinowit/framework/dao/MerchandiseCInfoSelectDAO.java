package com.shinowit.framework.dao;


import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by SC on 2014/12/26.
 */
@Repository
public class MerchandiseCInfoSelectDAO {

    @Resource
    private JdbcTemplate jt;

    public List<Map<String,Object>> merchandisecinfoList(){
        String sql="select top 10 * from TMe_MerchandiseCInfo";
        List<Map<String,Object>> result=jt.queryForList(sql);
        return result;
    }
}
