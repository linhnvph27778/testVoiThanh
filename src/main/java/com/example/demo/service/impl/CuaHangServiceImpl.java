package com.example.demo.service.impl;

import com.example.demo.entity.CuaHang;
import com.example.demo.repository.CuaHangRepository;
import com.example.demo.service.CuaHangServiceJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CuaHangServiceImpl implements CuaHangServiceJpa {
    @Autowired
    private CuaHangRepository cuaHangRepository;

    @Override
    public List<CuaHang> getAll() {
        return cuaHangRepository.findAll();
    }

    @Override
    public void add(CuaHang cuaHang) {
        cuaHangRepository.save(cuaHang);
    }

    @Override
    public void delete(UUID id) {
        cuaHangRepository.deleteById(id);
    }

    @Override
    public Optional<CuaHang> getOne(UUID id) {
        Optional<CuaHang> cuaHang = cuaHangRepository.findById(id);
        return cuaHang;
    }
}
