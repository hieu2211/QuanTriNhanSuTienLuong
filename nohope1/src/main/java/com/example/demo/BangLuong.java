package com.example.demo;

import javax.persistence.*;

@Entity
public class BangLuong {
	public Integer MaBL;
	public String Thang;
	public String Nam;
	public String TamUng;
	public String TruLuong;
	public String Tong;
	public String Conlai;
	public NhanVien NhanVien;
	public ChamCong chamCong;
	public TinhLuong tinhLuong;
		
	public BangLuong() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BangLuong(String thang, String nam, String tamUng, String truLuong, String tong, String conlai) {
		super();
		Thang = thang;
		Nam = nam;
		TamUng = tamUng;
		TruLuong = truLuong;
		Tong = tong;
		Conlai = conlai;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getMaBL() {
		return MaBL;
	}
	public void setMaBL(Integer maBL) {
		MaBL = maBL;
	}
	public String getThang() {
		return Thang;
	}
	public void setThang(String thang) {
		Thang = thang;
	}
	public String getNam() {
		return Nam;
	}
	public void setNam(String nam) {
		Nam = nam;
	}
	public String getTamUng() {
		return TamUng;
	}
	public void setTamUng(String tamUng) {
		TamUng = tamUng;
	}
	public String getTruLuong() {
		return TruLuong;
	}
	public void setTruLuong(String truLuong) {
		TruLuong = truLuong;
	}
	public String getTong() {
		return Tong;
	}
	public void setTong(String tong) {
		Tong = tong;
	}
	public String getConlai() {
		return Conlai;
	}
	public void setConlai(String conlai) {
		Conlai = conlai;
	}
	@ManyToOne
	@JoinColumn(name = "MaNV")
	public NhanVien getNhanVien() {
		return NhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		NhanVien = nhanVien;
	}
	@ManyToOne
	@JoinColumn(name = "MaCC")
	public ChamCong getChamCong() {
		return chamCong;
	}
	public void setChamCong(ChamCong chamCong) {
		this.chamCong = chamCong;
	}
	@ManyToOne
	@JoinColumn(name = "MaTL")
	public TinhLuong getTinhLuong() {
		return tinhLuong;
	}
	public void setTinhLuong(TinhLuong tinhLuong) {
		this.tinhLuong = tinhLuong;
	}
}
