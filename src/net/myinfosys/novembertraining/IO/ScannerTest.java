package net.myinfosys.novembertraining.IO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) throws IOException {
		BufferedWriter bw = null;
		Scanner scan = null;

		try {
			bw = new BufferedWriter(new FileWriter("Output.txt"));
			scan = new Scanner(new BufferedReader(new FileReader("Input.txt")));
			scan.useDelimiter(",");
			while (scan.hasNext()) {
				System.out.println(scan.next());
			}
		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {
			scan.close();
			bw.close();
		}
	}
}
