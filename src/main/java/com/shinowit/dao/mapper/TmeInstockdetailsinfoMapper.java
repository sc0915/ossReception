package com.shinowit.dao.mapper;

import com.shinowit.model.TmeInstockdetailsinfo;
import com.shinowit.model.TmeInstockdetailsinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmeInstockdetailsinfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int countByExample(TmeInstockdetailsinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int deleteByExample(TmeInstockdetailsinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int insert(TmeInstockdetailsinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int insertSelective(TmeInstockdetailsinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    List<TmeInstockdetailsinfo> selectByExample(TmeInstockdetailsinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    TmeInstockdetailsinfo selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int updateByExampleSelective(@Param("record") TmeInstockdetailsinfo record, @Param("example") TmeInstockdetailsinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int updateByExample(@Param("record") TmeInstockdetailsinfo record, @Param("example") TmeInstockdetailsinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int updateByPrimaryKeySelective(TmeInstockdetailsinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_InStockDetailsInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int updateByPrimaryKey(TmeInstockdetailsinfo record);

    List<TmeInstockdetailsinfo> selectPage(TmeInstockdetailsinfoExample example);

    Long selectMaxPrimaryKeyValue();
}