package com.bl.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Utility class untuk membaca input dari console
 * @author Bustanil Arifin
 *
 */
public abstract class ConsoleInput {
	
	public static String read(String message) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print(message);
			String input = br.readLine();
			return input;
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
}
