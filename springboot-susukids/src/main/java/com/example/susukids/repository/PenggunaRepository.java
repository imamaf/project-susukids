package com.example.susukids.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.susukids.model.Pengguna;

@Repository
public interface PenggunaRepository extends JpaRepository<Pengguna, Long>{
    @Query("select u from Pengguna u where u.email=?1 and u.password=?2" )
	public Pengguna login(String email, String password);
	
}
