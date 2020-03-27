package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/quantri")
public class QuanTriNhanSuTienLuongAPIController {
	@Autowired
	QuanTriNhanSuTienLuongAPService service;

	// 1 Get all data nhan vien
	// link: QuanTriNhanSuTienLuong/html/listNV.html
	@CrossOrigin(value = "*")
	@RequestMapping(value = "/getAllDataNhanVien")
	public List<NhanVien> getAllDataNhanVien() {
		return service.getAllDataNhanVien();
	}

	// 1 Get all data chucvu
	// link: QuanTriNhanSuTienLuong/html/listCV.html
	@CrossOrigin(value = "*")
	@RequestMapping(value = "/getAllDataChucVu")
	public List<ChucVu> getAllDataChucVu() {
		return service.getAllDataChucVu();
	}

}
