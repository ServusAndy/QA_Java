
public class Child extends Parent{
	private String nameChild;

	public Child() {}
	
	public Child(String name, String nameChild) {
		super(name);
		this.nameChild = nameChild;
	}

	public String getNameChild() {
		return nameChild;
	}

	public void setNameChild(String nameChild) {
		this.nameChild = nameChild;
	}

	@Override
	public String toString() {
		return "Child [nameChild=" + nameChild + "]";
	}
	
	
	

}
