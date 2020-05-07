package com.example.demo;

import java.util.Set;

import javax.persistence.*;

@Entity
public class ChamCong {
	public Integer MaCC;
	public String SoNgayCong;
	public NhanVien nhanVien;
	public Set<BangLuong> bangLuong;

	public ChamCong() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ChamCong(Integer maCC, String soNgayCong) {
		super();
		MaCC = maCC;
		SoNgayCong = soNgayCong;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getMaCC() {
		return MaCC;
	}
	public void setMaCC(Integer maCC) {
		MaCC = maCC;
	}
	public String getSoNgayCong() {
		return SoNgayCong;
	}
	public void setSoNgayCong(String soNgayCong) {
		SoNgayCong = soNgayCong;
	}
	@ManyToOne
	@JoinColumn(name = "MaNV")
	public NhanVien getNhanVien() {
		return nhanVien;
	}
	public void setNhanVien(NhanVien nhanVien) {
		this.nhanVien = nhanVien;
	}
	@OneToMany(mappedBy = "chamCong",cascade = CascadeType.ALL)
	
	public void setBangLuong(Set<BangLuong> bangLuong) {
		this.bangLuong = bangLuong;
	}
}
