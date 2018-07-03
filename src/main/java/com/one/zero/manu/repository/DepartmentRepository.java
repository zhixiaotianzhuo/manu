package com.one.zero.manu.repository;

import com.one.zero.manu.bean.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by Manu on 2018/7/3.
 */
public interface DepartmentRepository extends MongoRepository<Department, Integer> {
}

