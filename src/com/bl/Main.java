package com.bl;

import java.util.ArrayList;
import java.util.List;

import com.bl.model.DosenHonorer;
import com.bl.model.DosenTetap;
import com.bl.util.ConsoleInput;

public class Main {

	static String newLine = System.getProperty("line.separator"); // This will retrieve line separator dependent on OS.
	
	public static void main(String[] args) {
		
		// List buat nampung objek dosen tetap.
		List<DosenTetap> dosenTetapList = new ArrayList<DosenTetap>();
		// List buat nampung objek dosen honorer.
		List<DosenHonorer> dosenHonorerList = new ArrayList<DosenHonorer>();
		
		// Variabel buat notikasi exit.
		boolean exit = false;
		
		while (!exit){
			
			// Triger menu.
			tampilkanMenu();
			
			// Menu yang dipilih.
			String pilihan = ConsoleInput.read("Masukkan pilihan anda :");
			
			if (pilihan.equals("A")) {
				
				String indn = ConsoleInput.read("Masukkan INDN:");
				String nama = ConsoleInput.read("Masukkan Nama:");
				String sks = ConsoleInput.read("Masukkan Jumlah SKS:");
				String gajiPokok = ConsoleInput.read("Masukkan Gaji Pokok:");
				String tunjanganKeahlian = ConsoleInput.read("Masukan Jumlah Tunjangan:");
				
				// Buat objek dosen tetap sesuai input console.
				DosenTetap dosenTetap = new DosenTetap(indn, nama, Integer.parseInt(sks), Integer.parseInt(gajiPokok), Integer.parseInt(tunjanganKeahlian));
				
				// Tampung di list.
				dosenTetapList.add(dosenTetap);
				
			} else if (pilihan.equals("B")){
				
				String indn = ConsoleInput.read("Masukkan INDN:");
				String nama = ConsoleInput.read("Masukkan Nama:");
				String sks = ConsoleInput.read("Masukkan Jumlah SKS:");
				String uangTransport = ConsoleInput.read("Masukan Jumlah Uang Transport:");
				
				// Buat objek dosen honorer sesuai input console.
				DosenHonorer dosenHonorer = new DosenHonorer(indn, nama, Integer.parseInt(sks), Integer.parseInt(uangTransport));
				
				// Tampung di list.
				dosenHonorerList.add(dosenHonorer);
				
			} else if (pilihan.equals("C")){
				
				// Validasi jika list dosen tetap ga kosong.
				if (!dosenTetapList.isEmpty()){
					
					// Tampilin Header.
					System.out.println(newLine + 
					"-------------------------------------------" + newLine +
					"DATA DOSEN TETAP" + newLine +
					"-------------------------------------------" + newLine 
					);
					
					// Iterasi list.
					for (DosenTetap d : dosenTetapList){
						System.out.println("NIDN: " + d.getNidn());
						System.out.println("Nama: " + d.getNama());
						System.out.println("Jumlah SKS: " + d.getSks());
						System.out.println("Jumlah Gaji Pokok: " + d.getGajiPokok());
						System.out.println("Jumlah Tunjangan Keahlian: " + d.getTunjanganKeahlian());
						System.out.println("Total Gaji: " + d.getTotalGaji()+ newLine +
								"--------------------------------------------" + newLine);
					}

				} else {
					System.err.println( newLine + "Data Dosen Tetap Kosong.");
				}
				
			} else if (pilihan.equals("D")){
				
				// Validasi jika list dosen honorer ga kosong.
				if (!dosenHonorerList.isEmpty()){
					
					// Tampilin Header.
					System.out.println(newLine + 
					"-------------------------------------------" + newLine +
					"DATA DOSEN HONORER" + newLine +
					"-------------------------------------------" + newLine 
					);
					
					// Iterasi list.
					for (DosenHonorer d : dosenHonorerList){
						System.out.println("NIDN: " + d.getNidn());
						System.out.println("Nama: " + d.getNama());
						System.out.println("Jumlah SKS: " + d.getSks());
						System.out.println("Total Gaji: " + d.getTotalGaji() + newLine +
								"--------------------------------------------" + newLine);
					}
				} else {
					System.err.println(newLine + "Data Dosen Honorer Kosong.");
				}
				
			} else {
				System.err.println(newLine + "Menu Tidak Ada Yang Cocok.");
			}
			
			
		}
	}
	
	static void tampilkanMenu(){
		// Tampilin menu program.
		System.out.println(
				newLine + 
				"-------------------------------------------" + newLine +
				"MENU PROGRAM" + newLine +
				"-------------------------------------------" + newLine +
				"A. Entry Dosen Tetap" + newLine +
				"B. Entry Dosen Honorer" + newLine +
				"C. Tampil Semua Dosen Tetap" + newLine +
				"D. Tampil Semua Dosen Honorer" + newLine +
				"--------------------------------------------" +
				newLine
		);
	}
	
	
}
