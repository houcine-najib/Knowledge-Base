package javaload;

import java.util.ArrayList;

public class GCTest {
	private static ArrayList data = new ArrayList<>();

	public static void main(String[] args) throws Exception {
		for (int i=0;i<200;i++) {
			data.add(new byte[ 1024 * 1024]);
			Thread.sleep(500);
			System.out.println("1-MB-Allocation # "+i);
		}

		Thread.sleep(3600000);
		
	}
}
