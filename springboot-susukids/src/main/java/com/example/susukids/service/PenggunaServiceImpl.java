package com.example.susukids.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.susukids.model.Pengguna;
import com.example.susukids.repository.PenggunaRepository;

@Service
public class PenggunaServiceImpl implements PenggunaService {

    @Autowired
    private PenggunaRepository penggunaRepository;

	@Override
	public Pengguna login(String email, String password) {

		return penggunaRepository.login(email, password);
	}

}