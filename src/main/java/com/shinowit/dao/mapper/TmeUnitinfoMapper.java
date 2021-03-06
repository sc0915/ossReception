package com.shinowit.dao.mapper;

import com.shinowit.model.TmeUnitinfo;
import com.shinowit.model.TmeUnitinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmeUnitinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int countByExample(TmeUnitinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int deleteByExample(TmeUnitinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int deleteByPrimaryKey(Integer unitid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int insert(TmeUnitinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int insertSelective(TmeUnitinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    List<TmeUnitinfo> selectByExample(TmeUnitinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    TmeUnitinfo selectByPrimaryKey(Integer unitid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int updateByExampleSelective(@Param("record") TmeUnitinfo record, @Param("example") TmeUnitinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int updateByExample(@Param("record") TmeUnitinfo record, @Param("example") TmeUnitinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int updateByPrimaryKeySelective(TmeUnitinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_UnitInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int updateByPrimaryKey(TmeUnitinfo record);

    List<TmeUnitinfo> selectPage(TmeUnitinfoExample example);

    Integer selectMaxPrimaryKeyValue();
}