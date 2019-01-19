
public enum Week {
	SUN,MON,TUE,WEN,THU,FRI,SAT;
	
	public Week plus(int days) {
		int cur = this.ordinal();
	//	int res = (cur+days)%7;
		Week[] weekDays = values();
		return weekDays[(cur+days)%7]; // res
	}
}
