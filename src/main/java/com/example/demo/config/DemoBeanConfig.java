package com.example.demo.config;

import com.example.demo.entity.CuaHang;
import com.example.demo.viewModel.CuaHangVM;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoBeanConfig {
    @Bean("bean1")
    public CuaHangVM getCuaHang1(){
        CuaHangVM cuaHang = new CuaHangVM();
        cuaHang.setMa("1111");
        cuaHang.setTen("1111");
        return cuaHang;
    }

    @Bean("bean2")
    public CuaHangVM getCuaHang2(){
        CuaHangVM cuaHang = new CuaHangVM();
        cuaHang.setMa("2222");
        cuaHang.setTen("2222");
        return cuaHang;
    }
}
