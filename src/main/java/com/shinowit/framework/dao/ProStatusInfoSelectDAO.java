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
public class ProStatusInfoSelectDAO {

    @Resource
    private JdbcTemplate jt;

    public List<Map<String,Object>> prostatusinfoList(){
        String sql="select top 16 * from TMe_ProStatusInfo";
        List<Map<String,Object>> list=jt.queryForList(sql);
        return list;
    }
}
