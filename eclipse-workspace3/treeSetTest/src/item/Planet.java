package item;

public class Planet implements Comparable<Planet>{
	private String name;
	private long size;
	private int timeToEarth;
	
	public Planet(String name, long size, int timeToEarth) {
		this.name = name;
		this.size = size;
		this.timeToEarth = timeToEarth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name==null||name=="") {
			System.out.println("WTF");
			return;
		}
		this.name = name;
	}

	public long getSize() {
		return size;
	}

	public void setSize(long size) {
		if(size<=0) {
			System.out.println("wrong size mather fucker");
			return;
		}
		this.size = size;
	}

	public int getTimeSize() {
		return timeToEarth;
	}

	public void setTimeToEarth(int timeToEarth) {
		if(timeToEarth<0) {
			System.out.println("are you crazy MuuFF!");
		}
		this.timeToEarth = timeToEarth;
	}

	@Override
	public String toString() {
		return "       " + name + "      " + size + "      \t" + timeToEarth;
	}

	@Override
	public int compareTo(Planet p) {
		// TODO Auto-generated method stub
		return timeToEarth -p.timeToEarth;
	}
	
	
	
	 
}
