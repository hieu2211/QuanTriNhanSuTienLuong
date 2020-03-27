package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuanTriNhanSuTienLuongAPIController {
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
}
