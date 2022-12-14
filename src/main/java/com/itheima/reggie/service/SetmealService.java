package com.itheima.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itheima.reggie.dto.SetmealDto;
import com.itheima.reggie.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    // 新增套餐，同时保存套餐和菜品关联关系
    public void saveWithDish(SetmealDto setmealDto);

    //删除套餐，同时删除菜品关联的数据
    public void removeWithDish(List<Long> ids);

    // 查找套餐信息，同时查找关联到的菜品信息
    public SetmealDto getByIdWithDish(Long id );

    // 修改套餐信息，与关联的菜品信息一起保存
    public void updateWithDish(SetmealDto setmealDto);
}
