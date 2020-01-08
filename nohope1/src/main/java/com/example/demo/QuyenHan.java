package com.example.demo;

import java.util.Set;

import javax.persistence.*;

@Entity
public class QuyenHan {
	public Integer MaQH;
	public String TenQH;
	public Set<NguoiDung> nguoiDung;
	
	public QuyenHan() {
		super();
		// TODO Auto-generated constructor stub
	}
	public QuyenHan(Integer maQH, String tenQH) {
		super();
		MaQH = maQH;
		TenQH = tenQH;
	}
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getMaQH() {
		return MaQH;
	}
	public void setMaQH(Integer maQH) {
		MaQH = maQH;
	}
	public String getTenQH() {
		return TenQH;
	}
	public void setTenQH(String tenQH) {
		TenQH = tenQH;
	}
	@OneToMany(mappedBy = "quyenHan",cascade = CascadeType.ALL)
	public Set<NguoiDung> getNguoiDung() {
		return nguoiDung;
	}
	public void setNguoiDung(Set<NguoiDung> nguoiDung) {
		this.nguoiDung = nguoiDung;
	}
	
}
