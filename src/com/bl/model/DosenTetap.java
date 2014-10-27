package com.bl.model;

/**
 * Turunan class dosen.
 * @author lennon
 *
 */
public class DosenTetap extends Dosen {
	
	private Integer gajiPokok;
	private Integer tunjanganKeahlian;
	private Integer totalGaji;
	
	/*
	 * Constructor
	 */
	public DosenTetap(String nidn, String nama, Integer sks, Integer gajiPokok, Integer tunjanganKeahlian) {
		super(nidn, nama, sks);
		this.tunjanganKeahlian = tunjanganKeahlian;
		this.gajiPokok = gajiPokok;
	}
	
	/*
	 * Getter and setter.
	 */
	public Integer getGajiPokok() {
		return gajiPokok;
	}
	public void setGajiPokok(Integer gajiPokok) {
		this.gajiPokok = gajiPokok;
	}
	public Integer getTunjanganKeahlian() {
		return tunjanganKeahlian;
	}
	public void setTunjanganKeahlian(Integer tunjanganKeahlian) {
		this.tunjanganKeahlian =  tunjanganKeahlian;
	}
	
	// Proses hitung total gaji.
	public Integer getTotalGaji() {
		this.totalGaji = gajiPokok + tunjanganKeahlian + (super.getSks() * 100000);
		return totalGaji;
	}
	
}
