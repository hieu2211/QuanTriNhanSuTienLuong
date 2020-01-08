package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequestMapping(value = "/quantrinhansutienluong")
public class QuanTriNhanSuTienLuongAPService {
	@Autowired
	QuanTriNhanSuTienLuongAPService service;
}
