package com.example.study.controller;

import com.example.study.domain.City;
import com.example.study.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CityRestController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/api/city", method = RequestMethod.GET)
    public City findOneCity(@RequestParam(value = "cityName", required = true) String cityName) {
        return cityService.findCityByName(cityName);
    }

    @RequestMapping(value = "/api/city", method = RequestMethod.POST)
    public void insCity(@RequestBody City city) {
        cityService.insCity(city);
    }

    @RequestMapping(value = "/api/city", method = RequestMethod.PUT)
    public void updCity(@RequestBody City city) {
        cityService.updCity(city);
    }

    @RequestMapping(value = "/api/city", method = RequestMethod.DELETE)
    public void delCity(@PathVariable("id") Integer id) {
        cityService.deleteCity(id);
    }
}
