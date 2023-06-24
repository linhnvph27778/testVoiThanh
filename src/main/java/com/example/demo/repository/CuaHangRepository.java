package com.example.demo.repository;

import com.example.demo.entity.CuaHang;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface CuaHangRepository extends JpaRepository<CuaHang, UUID> {
    @Query("select ch from CuaHang ch where ch.ma=?1")
    public CuaHang findByMa(String ma);
}
