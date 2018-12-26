
public class Main {

	public static void main(String[] args) {
	
//		loneTeen(13, 99) → true
//		loneTeen(21, 19) → true
//		loneTeen(13, 13) → false
		
		System.out.println(notString("no"));
	}
	public static String notString(String str) {
		if(str==null || str=="" || str.length()<3)return str="";
		String not = str.substring(0, 3);
		if(not.equals("not")) {
			return str;
		}
		return "not"+" "+str.trim();
	}
	
	public boolean endsLy(String str) {
		  if(str.endsWith("ly"))
		  return true;
		  return false;
		}

}