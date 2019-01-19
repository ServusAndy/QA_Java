package app;

import exception.WrongDataException;
import model.NumRange;

public class NumRangeApp {

	public static void main(String[] args) throws WrongDataException {
		NumRange numRange = new NumRange(-20,100);
		
		for(Integer i : numRange) {
			System.out.print(i+" ");
		}
		System.out.println();
		
	}
	

}
