package com.bl.model;

/**
 * Super class.
 * @author lennon
 *
 */
public class Dosen {
	
	protected String nidn;
	protected String nama;
	protected Integer sks;
	
	/*
	 * Constructor.
	 */
	public Dosen(String nidn, String nama, Integer sks) {
		super();
		this.nidn = nidn;
		this.nama = nama;
		this.sks = sks;
	}
	
	/*
	 * Getter and setter.
	 */
	public String getNidn() {
		return nidn;
	}
	public void setNidn(String nidn) {
		this.nidn = nidn;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public Integer getSks() {
		return sks;
	}
	public void setSks(Integer sks) {
		this.sks = sks;
	}
}
