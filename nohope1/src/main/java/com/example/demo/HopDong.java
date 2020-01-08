package com.example.demo;

import javax.persistence.*;

@Entity
public class HopDong {
	public Integer MaHD;
	public String LoaiHD;
	public String NgayKi;
	public String NgayKetThuc;
	public NhanVien nhanVien;
	
	public HopDong() {
		super();
		// TODO Auto-generated constructor stub
	}
	public HopDong(Integer maHD, String loaiHD, String ngayKi, String ngayKetThuc) {
		super();
		MaHD = maHD;
		LoaiHD = loaiHD;
		NgayKi = ngayKi;
		NgayKetThuc = ngayKetThuc;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getMaHD() {
		return MaHD;
	}
	public void setMaHD(Integer maHD) {
		MaHD = maHD;
	}
	public String getLoaiHD() {
		return LoaiHD;
	}
	public void setLoaiHD(String loaiHD) {
		LoaiHD = loaiHD;
	}
	public String getNgayKi() {
		return NgayKi;
	}
	public void setNgayKi(String ngayKi) {
		NgayKi = ngayKi;
	}
	public String getNgayKetThuc() {
		return NgayKetThuc;
	}
	public void setNgayKetThuc(String ngayKetThuc) {
		NgayKetThuc = ngayKetThuc;
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
