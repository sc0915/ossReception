package com.shinowit.framework.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.Types;
import java.util.List;
import java.util.Map;

/**
 * Created by SC on 2014/12/26.
 */
@Repository
public class MerchandiseinfoDAO {

    @Resource
    private JdbcTemplate jt;

    public List<Map<String,Object>> merchandlist(String merid){
        String sql="select top 8 * from TMe_MerchandiseInfo a inner join TMe_MerchandiseCInfo b " +
                "on a.MerchandiseCID=b.MerchandiseCID where b.MerchandiseCID=?";
        List<Map<String,Object>> list=jt.queryForList(sql,new Object[]{merid},new int[]{Types.VARCHAR});
        return list;
    }

    public List<Map<String,Object>> prostatus(String proid){
        String sql="select top 8 * from TMe_MerchandiseInfo a inner join TMe_ProStatusInfo b " +
                "on a.ProStatusID=b.ProStatusID where b.ProStatusID=?";
        List<Map<String,Object>> list=jt.queryForList(sql,new Object[]{proid},new int[]{Types.VARCHAR});
        return list;
    }

    public List<Map<String,Object>> merchand(){
        String sql="select top 8 * from TMe_MerchandiseInfo";
        List<Map<String,Object>> list=jt.queryForList(sql);
        return list;
    }
}




