package com.example.weixin.menu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.weixin.domain.SelfMenu;

@Repository
public interface SelfMenuRepository extends JpaRepository<SelfMenu, String> {

}
