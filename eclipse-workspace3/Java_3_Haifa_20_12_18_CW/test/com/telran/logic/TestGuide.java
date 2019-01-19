package com.telran.logic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.telran.data.History;
import com.telran.data.Museum;

public class TestGuide {

	
	IGuide guide;
	History tmpHistory;
	History hisClone;
	Museum tmpMuseum;
	
	public void setUp() {
		tmpHistory = new History(1,"Name","City","Address",true);
		tmpMuseum = new Museum(2,"Museum","City","Address",new String[] {"SUN","MON","TUE","WED"});
	}
	
	@Test
	public void testDefaultAdd() {
		assertTrue(guide.add(tmpHistory));
		assertEquals(tmpHistory.id(),guide.get(tmpHistory.id()).id());
		
		
	}
	
	public void testUniqueAdd() {
		guide.add(tmpHistory);
		assertFalse(guide.add(hisClone));
	}
	
	@Test
	void test() {
		assertEquals(8,(2+2)*2);
	}
	
	//sleduuchiy test doljen but na unicalnost 
	
	

}
