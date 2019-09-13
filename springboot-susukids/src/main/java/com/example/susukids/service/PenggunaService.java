package com.example.susukids.service;

import com.example.susukids.model.Pengguna;

public interface PenggunaService {
	Pengguna login(String email, String password);
}