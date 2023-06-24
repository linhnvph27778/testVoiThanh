package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.UUID;

public class NhanVien {
    @Id
    @Column(name = "Id", unique = true, nullable = false, length = 36)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "Ma")
    @NotBlank(message = "Không được bỏ trống")
    private String ma;

    @Column(name = "Ten")
    @NotBlank(message = "Không được bỏ trống")
    private String ten;

    @Column(name = "TenDem")
    @NotBlank(message = "Không được bỏ trống")
    private String tenDem;

    @Column(name = "Ho")
    @NotBlank(message = "Không được bỏ trống")
    private String ho;

    @Column(name = "GioiTinh")
    private String gioiTinh;

    @Column(name = "NgaySinh")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @NotNull(message = "Không được bỏ trống")
    private Date ngaySinh;

    @Column(name = "DiaChi")
    @NotBlank(message = "Không được bỏ trống")
    private String diaChi;

    @Column(name = "Sdt")
    @NotBlank(message = "Không được bỏ trống")
    private String sdt;

    @Column(name = "MatKhau")
    @NotBlank(message = "Không được bỏ trống")
    private String matKhau;

    @ManyToOne
    @JoinColumn(name = "IdCH")
    private CuaHang cuaHang;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "idCV")
//    private ChucVu chucVu;

    @Column(name = "TrangThai")
    @NotNull(message = "Không được bỏ trống")
    private int trangThai;
}
