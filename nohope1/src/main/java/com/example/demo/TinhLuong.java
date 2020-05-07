package com.example.demo;

import java.util.Set;

import javax.persistence.*;

@Entity
public class TinhLuong {
	public Integer MaTL;
	public String LuongCoBan;
	public String HeSo;
	public String PhuCap;
	public String BHXH;
	public String BHYT;
	public NhanVien nhanVien;
	public Set<BangLuong> bangLuong;
	
	public TinhLuong() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TinhLuong(Integer maTL, String luongCoBan, String heSo, String phuCap, String bHXH, String bHYT) {
		super();
		MaTL = maTL;
		LuongCoBan = luongCoBan;
		HeSo = heSo;
		PhuCap = phuCap;
		BHXH = bHXH;
		BHYT = bHYT;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getMaTL() {
		return MaTL;
	}
	public void setMaTL(Integer maTL) {
		MaTL = maTL;
	}
	public String getLuongCoBan() {
		return LuongCoBan;
	}
	public void setLuongCoBan(String luongCoBan) {
		LuongCoBan = luongCoBan;
	}
	public String getHeSo() {
		return HeSo;
	}
	public void setHeSo(String heSo) {
		HeSo = heSo;
	}
	public String getPhuCap() {
		return PhuCap;
	}
	public void setPhuCap(String phuCap) {
		PhuCap = phuCap;
	}
	public String getBHXH() {
		return BHXH;
	}
	public void setBHXH(String bHXH) {
		BHXH = bHXH;
	}
	public String getBHYT() {
		return BHYT;
	}
	public void setBHYT(String bHYT) {
		BHYT = bHYT;
	}
	@ManyToOne
	@JoinColumn(name = "MaNV")
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	@OneToMany(mappedBy = "tinhLuong",cascade = CascadeType.ALL)
	
	public void setBangLuong(Set<BangLuong> bangLuong) {
		this.bangLuong = bangLuong;
	}
	
}
