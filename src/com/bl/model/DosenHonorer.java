package com.bl.model;

/**
 * Turunan class dosen.
 * @author lennon
 *
 */
public class DosenHonorer extends Dosen {
	
	private Integer uangTransport;
	private Integer totalGaji;
	
	/*
	 * Constructor.
	 */
	public DosenHonorer(String nidn, String nama, Integer sks,
			Integer uangTransport) {
		super(nidn, nama, sks);
		this.uangTransport = uangTransport;
	}
	
	/*
	 * Getter and setter.
	 */
	public Integer getUangTransport() {
		return uangTransport;
	}
	public void setUangTransport(Integer uangTransport) {
		this.uangTransport = uangTransport;
	}
	
	// Proses hitung total gaji.
	public Integer getTotalGaji() {
		this.totalGaji = uangTransport + (super.getSks() * 100000);
		return totalGaji;
	}

}
