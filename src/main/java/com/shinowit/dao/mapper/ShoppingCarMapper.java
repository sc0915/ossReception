package com.shinowit.dao.mapper;

import com.shinowit.model.ShoppingCar;
import com.shinowit.model.ShoppingCarExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoppingCarMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_car
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int countByExample(ShoppingCarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_car
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int deleteByExample(ShoppingCarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_car
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_car
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int insert(ShoppingCar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_car
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int insertSelective(ShoppingCar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_car
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    List<ShoppingCar> selectByExample(ShoppingCarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_car
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    ShoppingCar selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_car
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int updateByExampleSelective(@Param("record") ShoppingCar record, @Param("example") ShoppingCarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_car
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int updateByExample(@Param("record") ShoppingCar record, @Param("example") ShoppingCarExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_car
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int updateByPrimaryKeySelective(ShoppingCar record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shopping_car
     *
     * @mbggenerated Mon Dec 29 09:56:18 CST 2014
     */
    int updateByPrimaryKey(ShoppingCar record);

    List<ShoppingCar> selectPage(ShoppingCarExample example);

    String selectMaxPrimaryKeyValue();
}