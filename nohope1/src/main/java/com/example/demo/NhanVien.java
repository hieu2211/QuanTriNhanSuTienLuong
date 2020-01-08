package com.example.demo;

import java.util.Set;

import javax.persistence.*;

@Entity
public class NhanVien {
	public Integer MaNV;
	public String Ho;
	public String Ten;
	public String DiaChi;
	public String SoDT;
	public String GioiTinh;
	public String TinhTrangHonNhan;
	public String CMND;
	public String NguyenQuan;
	public String ThuongTru;
	public ChucVu chucVu;
	public TrinhDo trinhDo;
	public PhongBan phongBan;
	public Set<BangLuong> bangLuong;
	public Set<ChamCong> chamCong;
	public Set<TinhLuong> tinhLuong;
	public Set<HopDong> hopDong;
	public Set<NguoiDung> nguoiDung;
	
	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NhanVien(String ho, String ten, String diaChi, String soDT, String gioiTinh, String tinhTrangHonNhan,
			String cMND, String nguyenQuan, String thuongTru) {
		super();
		Ho = ho;
		Ten = ten;
		DiaChi = diaChi;
		SoDT = soDT;
		GioiTinh = gioiTinh;
		TinhTrangHonNhan = tinhTrangHonNhan;
		CMND = cMND;
		NguyenQuan = nguyenQuan;
		ThuongTru = thuongTru;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getMaNV() {
		return MaNV;
	}
	public void setMaNV(Integer maNV) {
		MaNV = maNV;
	}
	public String getHo() {
		return Ho;
	}
	public void setHo(String ho) {
		Ho = ho;
	}
	public String getTen() {
		return Ten;
	}
	public void setTen(String ten) {
		Ten = ten;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public String getSoDT() {
		return SoDT;
	}
	public void setSoDT(String soDT) {
		SoDT = soDT;
	}
	public String getGioiTinh() {
		return GioiTinh;
	}
	public void setGioiTinh(String gioiTinh) {
		GioiTinh = gioiTinh;
	}
	public String getTinhTrangHonNhan() {
		return TinhTrangHonNhan;
	}
	public void setTinhTrangHonNhan(String tinhTrangHonNhan) {
		TinhTrangHonNhan = tinhTrangHonNhan;
	}
	public String getCMND() {
		return CMND;
	}
	public void setCMND(String cMND) {
		CMND = cMND;
	}
	public String getNguyenQuan() {
		return NguyenQuan;
	}
	public void setNguyenQuan(String nguyenQuan) {
		NguyenQuan = nguyenQuan;
	}
	public String getThuongTru() {
		return ThuongTru;
	}
	public void setThuongTru(String thuongTru) {
		ThuongTru = thuongTru;
	}
	@ManyToOne
	@JoinColumn(name = "MaCV")
	public ChucVu getChucVu() {
		return chucVu;
	}
	public void setChucVu(ChucVu chucVu) {
		this.chucVu = chucVu;
	}
	@ManyToOne
	@JoinColumn(name = "MaTD")
	public TrinhDo getTrinhDo() {
		return trinhDo;
	}
	public void setTrinhDo(TrinhDo trinhDo) {
		this.trinhDo = trinhDo;
	}
	@ManyToOne
	@JoinColumn(name = "MaPB")
	public PhongBan getPhongBan() {
		return phongBan;
	}
	public void setPhongBan(PhongBan phongBan) {
		this.phongBan = phongBan;
	}
	@OneToMany(mappedBy = "nhanVien",cascade = CascadeType.ALL)
	public Set<BangLuong> getBangLuong() {
		return bangLuong;
	}
	public void setBangLuong(Set<BangLuong> bangLuong) {
		this.bangLuong = bangLuong;
	}
	@OneToMany(mappedBy = "nhanVien",cascade = CascadeType.ALL)
	public Set<ChamCong> getChamCong() {
		return chamCong;
	}
	public void setChamCong(Set<ChamCong> chamCong) {
		this.chamCong = chamCong;
	}
	@OneToMany(mappedBy = "nhanVien",cascade = CascadeType.ALL)
	public Set<TinhLuong> getTinhLuong() {
		return tinhLuong;
	}
	public void setTinhLuong(Set<TinhLuong> tinhLuong) {
		this.tinhLuong = tinhLuong;
	}
	@OneToMany(mappedBy = "nhanVien",cascade = CascadeType.ALL)
	public Set<HopDong> getHopDong() {
		return hopDong;
	}
	public void setHopDong(Set<HopDong> hopDong) {
		this.hopDong = hopDong;
	}
	@OneToMany(mappedBy = "nhanVien",cascade = CascadeType.ALL)
	public Set<NguoiDung> getNguoiDung() {
		return nguoiDung;
	}
	public void setNguoiDung(Set<NguoiDung> nguoiDung) {
		this.nguoiDung = nguoiDung;
	}
	
	
}

