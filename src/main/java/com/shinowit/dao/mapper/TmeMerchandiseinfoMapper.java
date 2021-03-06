package com.shinowit.dao.mapper;

import com.shinowit.model.TmeMerchandiseinfo;
import com.shinowit.model.TmeMerchandiseinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TmeMerchandiseinfoMapper {

    TmeMerchandiseinfo selectmerchandAndUnitNameByPrimaryKey(String merchandiseid);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int countByExample(TmeMerchandiseinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int deleteByExample(TmeMerchandiseinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int deleteByPrimaryKey(String merchandiseid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int insert(TmeMerchandiseinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int insertSelective(TmeMerchandiseinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    List<TmeMerchandiseinfo> selectByExample(TmeMerchandiseinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    TmeMerchandiseinfo selectByPrimaryKey(String merchandiseid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int updateByExampleSelective(@Param("record") TmeMerchandiseinfo record, @Param("example") TmeMerchandiseinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int updateByExample(@Param("record") TmeMerchandiseinfo record, @Param("example") TmeMerchandiseinfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int updateByPrimaryKeySelective(TmeMerchandiseinfo record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TMe_MerchandiseInfo
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int updateByPrimaryKey(TmeMerchandiseinfo record);

    List<TmeMerchandiseinfo> selectPage(TmeMerchandiseinfoExample example);

    String selectMaxPrimaryKeyValue();
}