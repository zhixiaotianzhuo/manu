package com.hetong.ad.mi.manu.repository;

import com.hetong.ad.mi.manu.bean.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by MANU on 2018/7/2.
 */
public interface RoleRepository extends JpaRepository<Role, Integer> {
}
