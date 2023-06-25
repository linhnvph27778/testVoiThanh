package com.example.demo.controllers;

import com.example.demo.config.ModelMapperConfig;
import com.example.demo.entity.CuaHang;
import com.example.demo.service.CuaHangService;
import com.example.demo.service.CuaHangServiceJpa;
import com.example.demo.viewModel.CuaHangVM;
import jakarta.validation.Valid;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.UUID;
//hùng test thử github trên intellij
@Controller
@RequestMapping("/cua-hang")
public class CuaHangController {
    private CuaHangService cuaHangService = new CuaHangService();
//    private List<CuaHang> getList = cuaHangService.getList();

    @Autowired
    private CuaHangServiceJpa cuaHangServiceJpa;

    @Autowired
    @Qualifier("bean1")
    private CuaHangVM vm;

    @Autowired
    private ModelMapper modelMapper;


    @GetMapping("/index")
    public String getAll(Model model){
        model.addAttribute("list",cuaHangServiceJpa.getAll());
        return "index";
    }

    @GetMapping("/detail/{id}")
    public String getOne(Model model,@PathVariable("id") UUID id){
//        model.addAttribute("ch", cuaHangService.getOne(id));
//        System.out.println(cuaHangService.getOne(id));
//        System.out.println(id);
        cuaHangServiceJpa.delete(id);
        return "index";
    }


    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") UUID id){
        cuaHangServiceJpa.delete(id);
        return "redirect:/cua-hang/index";
    }


//    @GetMapping("/view-add")
//    public String viewAdd(){
//        return "add";
//    }

    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("ch",vm);
        model.addAttribute("action","/cua-hang/store");
        return "create";
    }
    @PostMapping("/store")
    public String store(@Valid @ModelAttribute("ch") CuaHangVM vm,
                        BindingResult result  //ket qua validate
                        ){
        if (result.hasErrors()){
            return "create";

        }else {
            CuaHang ch = new CuaHang();
            ch.setMa( vm.getMa() );
            ch.setTen( vm.getTen() );
            ch.setDiaChi( vm.getDiaChi() );
            ch.setThanhPho( vm.getThanhPho() );
            ch.setQuacGia( vm.getQuacGia() );

          //CuaHang cuaHang = modelMapper.map(vm, CuaHang.class);
          cuaHangServiceJpa.add(ch);
            return "redirect:/cua-hang/index";
        }


    }

    @GetMapping("/viewUpdate/{id}")
    public String viewUpdate(@PathVariable("id") CuaHang cuaHang,Model model){
//        model.addAttribute("ch", cuaHangServiceJpa.getOne(id));
        model.addAttribute("action","/cua-hang/update");
        System.out.println("sdfsdfsfsdf");
        System.out.println("lịnh thêm");

        System.out.println("lịnh thêm l2");

        System.out.println("nhan thêm");
        System.out.println("nhan thêm lần 4");

        System.out.println("lịnh thêm l3");
        return "update";
    }
    @PostMapping("/update")
    public String update(@Valid @ModelAttribute("ch") CuaHangVM cuaHangVM,BindingResult bindingResult){
        if (bindingResult.hasErrors()){
            return "update";
        }else {
            CuaHang cuaHang = modelMapper.map(vm, CuaHang.class);
            cuaHangServiceJpa.add(cuaHang);
            return "redirect:/cua-hang/index";
        }

    }


}
