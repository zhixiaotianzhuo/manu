package com.one.zero.manu.mapper;

import com.one.zero.manu.bean.Department;
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
