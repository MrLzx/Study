package com.example.study.dao;

import com.example.study.domain.City;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 城市 DAO 接口类
 * <p>
 * Created by bysocket on 07/02/2017.
 */
@Repository
@Mapper
public interface CityDao {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName 城市名
     */
    @Select("SELECT * FROM city where city_name='${cityName}'")
    City findByName(@Param("cityName") String cityName);

    @Select("select * from city")
    List<City> findAllCity();

    @Insert("insert into city (province_id, city_name, description) " +
            "values (#{province_id},#{city_name},#{description});")
    void insCity(City city);

    @Update("update city set city_name = #{city_name} where id= #{id};")
    void updCity(City city);

    @Delete("delete city when id=#{id}")
    void deleteCity(Integer id);
}
