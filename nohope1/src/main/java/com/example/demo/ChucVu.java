package com.example.demo;

import java.util.Set;

import javax.persistence.*;

@Entity
public class ChucVu {
	public Integer MaCV;
	public String TenCV;
	public Set<NhanVien> nhanVien;
	
	public ChucVu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public ChucVu(String tenCV, Set<NhanVien> nhanVien) {
		super();
		TenCV = tenCV;
		this.nhanVien = nhanVien;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getMaCV() {
		return MaCV;
	}
	public void setMaCV(Integer maCV) {
		MaCV = maCV;
	}
	public String getTenCV() {
		return TenCV;
	}
	public void setTenCV(String tenCV) {
		TenCV = tenCV;
	}
	
	@OneToMany(mappedBy = "chucVu",cascade = CascadeType.ALL) 
	public void setNhanVien(Set<NhanVien> nhanVien) {
		this.nhanVien = nhanVien;
	}
	
}
