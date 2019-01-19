package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class SetPropertyTest { // HOME WORK

	private static final int NUM_NUM = 20;
	static Random gen = new Random();
	static HashSet<Integer> hsi;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		hsi = new HashSet<>();
		for (int i = 0; i < NUM_NUM; i++) {
			hsi.add(gen.nextInt(100));
		}
		for (Integer i : hsi) {
			System.out.print(i + " ");
		}
		System.out.println();

		System.out.println("=============");
		System.out.println(hsi.size());
		System.out.println("=============");

	}

	@Test
	void testUnique() { // Home Work
		ArrayList<Integer> arr = new ArrayList<>();
		for (Integer i : hsi) {
			arr.add(i);
		}
		Collections.sort(arr);
		for (int i = 1; i < arr.size(); i++) {
			assertNotEquals(arr.get(i), arr.get(i - 1));
		}
	}

	@Test
	void test1() { // Class Work
		ArrayList<Integer> arr = new ArrayList<>();
		hsi.add(arr.get(hsi.size() - 1));
		boolean flag = true;
		int als = arr.size();
		boolean stop = false;
		for (int i = 0; i < als; i++) {
			int value = arr.get(i);
			for (int j = i + 1; j < als; j++) {
				if (arr.get(j) == value) {
					flag = false;
					stop = true;
					break;
				}
			}
			if (stop)
				break;
		}
		assertTrue(flag);
	}
}
