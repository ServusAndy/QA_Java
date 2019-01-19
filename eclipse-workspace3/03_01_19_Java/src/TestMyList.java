
public class TestMyList {

	public static void main(String[] args) {
		MyList<Parent> parentList = new MyList<>();
		MyList<Child> childList = new MyList<>();
		
		parentList.add(new Parent());
		parentList.add(new Child());
		System.out.println(parentList.size());
		childList.add(new Child());
//		Parent p = childList.get(0);
//		System.out.println(p);
		
		//parentList.addAll(childList);
		//childList.addAll(parentList);
		print(10);
		print(120,"String1","String2","String3");
		String[] ar = {"1","2","3"};
		print(13,ar);
		
		Parent[] arr1 = new Child[10];
		
		String[] stringArr = {"A","B","C"};
		Object[] object;
		object = stringArr;
		object[0] = new Integer(123);
	}
	//Varargs
	public static void print(int i,String... string) {
		for(i=0;i<string.length;i++) {
			System.out.println(string[i]);
		}
	}

}
