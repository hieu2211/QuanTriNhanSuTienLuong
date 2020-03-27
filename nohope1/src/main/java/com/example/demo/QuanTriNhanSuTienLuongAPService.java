package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequestMapping(value = "/quantrinhansutienluong")
public class QuanTriNhanSuTienLuongAPService {
	@Autowired
	daoBangLuong bangluong;
	@Autowired
	daoBoPhan bophan;
	@Autowired
	daoChamCong chamcong;
	@Autowired
	daoChucVu chucvu;
	@Autowired
	daoHopDong hopdong;
	@Autowired
	daoNguoiDung nguoidung;
	@Autowired
	daoNhanVien nhanvien;
	@Autowired
	daoPhongBan phongban;
	@Autowired
	daoQuyenHang quyenhang;
	@Autowired
	daoTinhLuong tinhluong;
	@Autowired
	daoTrinhDo trinhdo;

	// 1 Get all data nhanvien
	public List<NhanVien> getAllDataNhanVien() {
		return nhanvien.findAll();
	}

	// 1 Get all data chucvu
	public List<ChucVu> getAllDataChucVu() {
		return chucvu.findAll();
	}
}
