package com.telran.logic;

import com.telran.data.Place;

public interface IGuide {
	/**
	 * Add unique places to collection
	 * @param place Can't be Null
	 * @return true if added and false if place with id exist
	 * throws NullPointerException if addNull
	 * 
	 */
	boolean add(Place place);
	boolean remove(int id);
	Place get(int id);
	Place[] getByType(String type);
}
