package com.horace.controller;

import com.horace.entity.Menu;
import com.horace.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menu")
public class MenuHandler {
    @Autowired
    private MenuRepository menuRepository;

    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    public String index(){
        return this.port;
    }

    @GetMapping("/findAll/{index}/{limit}")
    public List<Menu> findAll( @PathVariable("index") int index, @PathVariable("limit") int limit){
        return menuRepository.findAll(index,limit);
    }
}
