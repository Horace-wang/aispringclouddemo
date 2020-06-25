package com.horace.repository;

import com.horace.entity.Menu;

import java.util.List;

public interface MenuRepository {
    //查询全部
    List<Menu> findAll(int index,int limit);
    //返回总记录数
    int count();
    //通过id查询
    Menu findById(long id);
    //保存
    void save(Menu menu);
    //更新
    void update(Menu menu);
    //删除
    void deleteById(long id);
}
