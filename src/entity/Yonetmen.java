package com.bilgeadam.model;

public class Yonetmen {
	private Integer yonetmenId ;
	private Integer yonetmenAdi ;
	
	public Yonetmen() {
		
	}

	public Yonetmen(Integer yonetmenId, Integer yinetmenAdi) {
		super();
		this.yonetmenId = yonetmenId;
		this.yonetmenAdi = yinetmenAdi;
	}

	public Integer getYonetmenId() {
		return yonetmenId;
	}

	public void setYonetmenId(Integer yonetmenId) {
		this.yonetmenId = yonetmenId;
	}

	public Integer getYinetmenAdi() {
		return yonetmenAdi;
	}

	public void setYinetmenAdi(Integer yinetmenAdi) {
		this.yonetmenAdi = yinetmenAdi;
	}
	
	

}
