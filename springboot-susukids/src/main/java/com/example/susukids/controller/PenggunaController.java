package com.example.susukids.controller;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.JsonParser;
import org.springframework.boot.json.JsonParserFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.susukids.exception.ResourceNotFoundException;
import com.example.susukids.model.Pengguna;
import com.example.susukids.repository.PenggunaRepository;

@RestController
@RequestMapping("/api/v3")
public class PenggunaController {
	@Autowired
	private PenggunaRepository penggunaRepository;

	@CrossOrigin
	@GetMapping("/pengguna/login")
	public List<Pengguna> getAllUsers() {
		return penggunaRepository.findAll();
	}

	// @GetMapping("/pengguna/login")
	// public ResponseEntity<Pengguna> loginControl(
	// 		@Valid @RequestBody String data) throws NoSuchAlgorithmException {
	// 			System.out.println(data);
	// 	JsonParser springParse = JsonParserFactory.getJsonParser();
	// 	Map<String, Object> map = springParse.parseMap(data);
		
	// 	Pengguna pengguna = penggunaRepository.login(map.get("email").toString(),
	// 			getMD5(map.get("password").toString()));
	// 	return ResponseEntity.ok().body(pengguna);
	// }


	@CrossOrigin
	@GetMapping("/pengguna/{id}")
	public ResponseEntity<Pengguna> getUsersById(@PathVariable(value = "id") Long id)
			throws ResourceNotFoundException {
		Pengguna pengguna = penggunaRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Users not found for this id :: " + id));
		return ResponseEntity.ok().body(pengguna);
	}

	@CrossOrigin
	@PostMapping("/pengguna/register")
	public Pengguna createUsers(@Valid @RequestBody Pengguna pengguna) throws NoSuchAlgorithmException {
		pengguna.setRole("Customer");

		pengguna.setPassword(getMD5(pengguna.getPassword()));
		pengguna.setKonfirm_password(getMD5(pengguna.getKonfirm_password()));

		return penggunaRepository.save(pengguna);
	}

	@PutMapping("/pengguna/update/{id}")
	public ResponseEntity<Pengguna> updateUsers(@PathVariable(value = "id") Long id,
			@Valid @RequestBody String penggunaDetails) throws ResourceNotFoundException, NoSuchAlgorithmException {
			
			JsonParser springParse = JsonParserFactory.getJsonParser();
			Map<String, Object> map = springParse.parseMap(penggunaDetails); 
	
			Pengguna pengguna = penggunaRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Users not found for this id :: " + id));

		pengguna.setNama_lengkap(map.get("nama_lengkap").toString());
		pengguna.setEmail(map.get("email").toString());
        pengguna.setNo_telepon(map.get("no_telepon").toString());
		pengguna.setAlamat(map.get("alamat").toString());
		pengguna.setRole("Customer");

		pengguna.setPassword(getMD5(map.get("password").toString()));
		pengguna.setKonfirm_password(getMD5(map.get("konfirm_password").toString()));
		
		final Pengguna updatedPengguna = penggunaRepository.save(pengguna);
		return ResponseEntity.ok(updatedPengguna);
	}


	@DeleteMapping("/pengguna/delete/{id}")
	public Map<String, Boolean> deleteUsers(@PathVariable(value = "id") Long id)
			throws ResourceNotFoundException {
		Pengguna pengguna = penggunaRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Users not found for this id :: " + id));

		penggunaRepository.delete(pengguna);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}

	public static String getMD5(String data)
	throws NoSuchAlgorithmException {
		MessageDigest messageDigest = MessageDigest.getInstance("MD5");

	messageDigest.update(data.getBytes());
		byte[] digest = messageDigest.digest();
		StringBuffer sb = new StringBuffer();
		for ( byte b : digest) {
			sb.append(Integer.toHexString((int)(b & 0xff)));
		} 
	return sb.toString();
	}



}
