package net.myinfosys.novembertraining.IO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class DataStreams {

	static final String dataFile = "invoicedata";

	static final double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
	static final int[] units = { 12, 8, 13, 29, 50 };
	static final String[] descs = { "Java T-shirt", "Java Mug",
			"Duke Juggling Dolls", "Java Pin", "Java Key Chain" };

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataOutputStream dos = null;

		try {
			dos = new DataOutputStream(new BufferedOutputStream(
					new FileOutputStream(dataFile)));
			for (int i = 0; i < prices.length; i++) {
				dos.writeDouble(prices[i]);
				dos.writeInt(units[i]);
				dos.writeUTF(descs[i]);
			}
		} catch (IOException e) {
			System.out.println(e.toString());
		} finally {
			dos.close();
		}

		DataInputStream dis = null;
		double total = 0.0;
		try {
			dis = new DataInputStream(new BufferedInputStream(new FileInputStream(dataFile)));
			double price;
			int unit;
			String desc;

			try {
				while (true) {
					price = dis.readDouble();
					unit = dis.readInt();
					desc = dis.readUTF();
					System.out.format("You ordered %d units of %s at $%.2f%n",unit, desc, price);
					total += unit * price;
				}
			} catch (EOFException e) {
			}
			System.out.format("For a TOTAL of: $%.2f%n", total);
		} finally {
			dis.close();
		}
	}

}
