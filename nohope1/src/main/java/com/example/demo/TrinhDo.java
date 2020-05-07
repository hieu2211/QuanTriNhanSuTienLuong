package com.example.demo;

import java.util.Set;

import javax.persistence.*;

@Entity
public class TrinhDo {
	public Integer MaTD;
	public String TenTD;
	public Set<NhanVien> nhanVien;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getMaTD() {
		return MaTD;
	}
	public void setMaTD(Integer maTD) {
		MaTD = maTD;
	}
	public String getTenTD() {
		return TenTD;
	}
	public void setTenTD(String tenTD) {
		TenTD = tenTD;
	}
	@OneToMany(mappedBy = "trinhDo",cascade = CascadeType.ALL)
	
	public void setNhanVien(Set<NhanVien> nhanVien) {
		this.nhanVien = nhanVien;
	}
}
