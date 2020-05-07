package com.example.demo;

import java.util.Set;

import javax.persistence.*;

@Entity
public class PhongBan {
	public Integer MaPB;
	public String TenPB;
	public BoPhan boPhan;
	public Set<NhanVien> nhanVien;
	
	
	
	public PhongBan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PhongBan(String tenPB) {
		super();
		TenPB = tenPB;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getMaPB() {
		return MaPB;
	}
	public void setMaPB(Integer maPB) {
		MaPB = maPB;
	}
	public String getTenPB() {
		return TenPB;
	}
	public void setTenPB(String tenPB) {
		TenPB = tenPB;
	}

	@ManyToOne
	@JoinColumn(name = "TenBP")
	public BoPhan getBoPhan() {
		return boPhan;
	}
	public void setBoPhan(BoPhan boPhan) {
		this.boPhan = boPhan;
	}
	@OneToMany(mappedBy = "phongBan", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	
	public void setNhanVien(Set<NhanVien> nhanVien) {
		this.nhanVien = nhanVien;
	}
}
