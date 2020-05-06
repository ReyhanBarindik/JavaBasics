package com.syntax.class31;

import java.io.File;
import java.io.FileReader;

public class JustTest {

	public static void main(String[] args) {

		File f = new File("r.txt");

		try {

			FileReader fr = new FileReader(f);
			int c = fr.read();

			while (c != -1) {
				char k = (char) c;
				System.out.print(k + " ");
				c = fr.read();
			}

			fr.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
