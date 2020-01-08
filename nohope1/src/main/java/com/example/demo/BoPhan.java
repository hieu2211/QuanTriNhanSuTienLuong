package com.example.demo;

import java.util.Set;

import javax.persistence.*;

@Entity
public class BoPhan {
	public Integer MaBP;
	public String TenBP;
	public Set<PhongBan> phongBan;
	
	public BoPhan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public BoPhan(String tenBP) {
		super();
		TenBP = tenBP;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getMaBP() {
		return MaBP;
	}
	public void setMaBP(Integer maBP) {
		MaBP = maBP;
	}
	public String getTenBP() {
		return TenBP;
	}
	public void setTenBP(String tenBP) {
		TenBP = tenBP;
	}
	@OneToMany(mappedBy = "boPhan",cascade = CascadeType.ALL)
	public Set<PhongBan> getPhongBan() {
		return phongBan;
	}
	public void setPhongBan(Set<PhongBan> phongBan) {
		this.phongBan = phongBan;
	}
}
