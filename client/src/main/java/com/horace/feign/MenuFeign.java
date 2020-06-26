package com.horace.feign;

import com.horace.entity.Menu;
import com.horace.entity.MenuVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(value = "menu")
public interface MenuFeign {

    @GetMapping("/menu/findAll/{index}/{limit}")
    MenuVO findAll(@PathVariable("index") int index, @PathVariable("limit") int limit);
}
