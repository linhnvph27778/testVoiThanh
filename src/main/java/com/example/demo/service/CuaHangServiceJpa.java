package com.example.demo.service;

import com.example.demo.entity.CuaHang;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CuaHangServiceJpa {

    List<CuaHang> getAll();
    void add(CuaHang cuaHang);

    void delete(UUID id);

    Optional<CuaHang> getOne(UUID id);
}
