package com.bilgeadam.model;

public class Kategori {
	private Integer kategoriid;
	private String kategoriadi;
	public Kategori() {
		super();
	}
	public Kategori(Integer kategoriid, String kategoriadi) {
		super();
		this.kategoriid = kategoriid;
		this.kategoriadi = kategoriadi;
	}
	public Integer getKategoriid() {
		return kategoriid;
	}
	public void setKategoriid(Integer kategoriid) {
		this.kategoriid = kategoriid;
	}
	public String getKategoriadi() {
		return kategoriadi;
	}
	public void setKategoriadi(String kategoriadi) {
		this.kategoriadi = kategoriadi;
	}
	

}
