package javaload;

import java.util.ArrayList;

public class GCTest {
	private static ArrayList data = new ArrayList<Integer>();

	public static void main(String[] args) throws Exception {
		for (int i=0;i<200;i++) {
			data.add(new int[1 * 1024 * 1024]);
			Thread.sleep(500);
			System.out.println("1-MB-Allocation # "+i);
		}

		for (int i=0;i<200;i++) {
			data.remove(data.size()-1);
			Thread.sleep(500);
			System.out.println("1-MB-Deallocation # "+i);
		}
		
		System.out.println("Waiting for GC");
		Thread.sleep(6000);
		System.gc();
		System.out.println("Running GC");
		Thread.sleep(3600000);
		
	}
}
