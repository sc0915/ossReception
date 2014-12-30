package com.shinowit.dao.mapper;

import com.shinowit.model.TmeProstatusinfo;
import com.shinowit.model.TmeProstatusinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmeProstatusinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_ProStatusInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int countByExample(TmeProstatusinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_ProStatusInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int deleteByExample(TmeProstatusinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_ProStatusInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int deleteByPrimaryKey(Integer prostatusid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_ProStatusInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int insert(TmeProstatusinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_ProStatusInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int insertSelective(TmeProstatusinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_ProStatusInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    List<TmeProstatusinfo> selectByExample(TmeProstatusinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_ProStatusInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    TmeProstatusinfo selectByPrimaryKey(Integer prostatusid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_ProStatusInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int updateByExampleSelective(@Param("record") TmeProstatusinfo record, @Param("example") TmeProstatusinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_ProStatusInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int updateByExample(@Param("record") TmeProstatusinfo record, @Param("example") TmeProstatusinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_ProStatusInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int updateByPrimaryKeySelective(TmeProstatusinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_ProStatusInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int updateByPrimaryKey(TmeProstatusinfo record);

    List<TmeProstatusinfo> selectPage(TmeProstatusinfoExample example);

    Integer selectMaxPrimaryKeyValue();
}