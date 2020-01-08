package com.example.demo;

import javax.persistence.*;

@Entity
public class NguoiDung {
	public Integer MaND;
	public String TenDangNhap;
	public String MatKhau;
	public QuyenHan quyenHan;
	public NhanVien nhanVien;
	
	public NguoiDung() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NguoiDung(Integer maND, String tenDangNhap, String matKhau) {
		super();
		MaND = maND;
		TenDangNhap = tenDangNhap;
		MatKhau = matKhau;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getMaND() {
		return MaND;
	}
	public void setMaND(Integer maND) {
		MaND = maND;
	}
	public String getTenDangNhap() {
		return TenDangNhap;
	}
	public void setTenDangNhap(String tenDangNhap) {
		TenDangNhap = tenDangNhap;
	}
	public String getMatKhau() {
		return MatKhau;
	}
	public void setMatKhau(String matKhau) {
		MatKhau = matKhau;
	}
	@ManyToOne
	@JoinColumn(name = "MaQH")
	public QuyenHan getQuyenHan() {
		return quyenHan;
	}
	public void setQuyenHan(QuyenHan quyenHan) {
		this.quyenHan = quyenHan;
	}
	@ManyToOne
	@JoinColumn(name = "MaNV")
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	
	
}
