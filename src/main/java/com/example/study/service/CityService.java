package com.example.study.service;

public interface CityService {
    /**
     * 根据城市名称，查询城市信息
     * @param cityName
     */
    City findCityByName(String cityName);
}
