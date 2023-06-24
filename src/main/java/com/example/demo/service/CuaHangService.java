package com.example.demo.service;

import com.example.demo.entity.CuaHang;

import java.util.ArrayList;
import java.util.List;

public class CuaHangService {
    private List<CuaHang> list= new ArrayList<>();
//    public List<CuaHang> getList(){
//        list.add(new CuaHang("1","ch01","linhnv","HaNoi","VietNam"));
//        list.add(new CuaHang("2","ch02","tiennh21","HaNoi","VietNam"));
//        list.add(new CuaHang("3","ch03","linhnv","HaNoi","VietNam"));
//        return list;
//    }
    public CuaHang getOne(String id){
        for (CuaHang cuaHang : list){
            if (cuaHang.getId().equals(id)){
                return cuaHang;
            }
        }
        return null;
    }
    public void delete(String id){
        CuaHang cuaHang = getOne(id);
        list.remove(cuaHang);
    }

    public void add(CuaHang cuaHang){
        list.add(cuaHang);
    }

    public void update(String id, CuaHang cuaHang){
        for (CuaHang ch : list){
            if (id.equals(ch.getId())){
                ch.setId(cuaHang.getId());
                ch.setMa(cuaHang.getMa());
                ch.setTen(cuaHang.getTen());
                ch.setDiaChi(cuaHang.getDiaChi());
                ch.setQuacGia(cuaHang.getQuacGia());
            }
        }
    }
}
