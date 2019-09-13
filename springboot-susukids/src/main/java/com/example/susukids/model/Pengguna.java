package com.example.susukids.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "pengguna")
public class Pengguna {

    private long id;
    private String nama_lengkap;
    private String email;
    private String no_telepon;
    private String alamat;
    private String role;
    private String password;
    private String konfirm_password;

    public Pengguna () {
        
    }
        public Pengguna(String nama_lengkap, String email, String no_telepon, String alamat, String role, String password, String konfirm_password){
		   this.nama_lengkap = nama_lengkap;
           this.email = email;
           this.no_telepon = no_telepon;
           this.alamat = alamat;
           this.role = role;
           this.password = password;
		   this.konfirm_password = konfirm_password;

        }


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
   
    @Column(name = "nama_lengkap", nullable = false)
    public String getNama_lengkap() {
        return nama_lengkap;
    }

    public void setNama_lengkap(String nama_lengkap) {
        this.nama_lengkap = nama_lengkap;
    }
	
    @Column(name = "email", nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
	
    @Column(name = "no_telepon", nullable = false)
    public String getNo_telepon() {
        return no_telepon;
    }

    public void setNo_telepon(String no_telepon) {
        this.no_telepon = no_telepon;
    }
	
    @Column(name = "alamat", nullable = false)
    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
	
    @Column(name = "role", nullable = false)
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
	
    @Column(name = "password", nullable = false)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
	
    @Column(name = "konfirm_password", nullable = false)
    public String getKonfirm_password() {
        return konfirm_password;
    }

    public void setKonfirm_password(String konfirm_password) {
        this.konfirm_password = konfirm_password;
    }
	
    
    @Override
    public String toString(){
        return "Pengguna [id=" + id + ", nama_lengkap=" + nama_lengkap + ", email=" + email + ", no_telepon=" + no_telepon + ", alamat=" + alamat + ", role=" + role + ", password=" + password + ", konfirm_password=" + konfirm_password + "]";
    }

}