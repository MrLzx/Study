package com.example.study.service;

import com.example.study.domain.City;

/**
 * 城市业务逻辑接口类
 * <p>
 * Created by bysocket on 07/02/2017.
 */
public interface CityService {

    /**
     * 根据城市名称，查询城市信息
     *
     * @param cityName
     */
    City findCityByName(String cityName);

    void insCity(City city);

    void updCity(City city);

    void deleteCity(Integer id);
}
