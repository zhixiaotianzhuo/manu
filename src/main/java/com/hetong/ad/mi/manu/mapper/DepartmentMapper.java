package com.hetong.ad.mi.manu.mapper;

import com.hetong.ad.mi.manu.bean.Department;
import org.apache.ibatis.annotations.Mapper;

/**
 * Created by MANU on 2018/7/2.
 */
@Mapper
public interface DepartmentMapper {

    public void insert(Department department);

    public Department getById(Integer id);

    public void update(Department department);

    public void deleteById(Integer id);
}
