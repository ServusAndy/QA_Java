package items;

public abstract class Animals {
	private String kind;
	private String subspacies;
	
	public Animals(String kind, String subspacies) {
		
		this.kind = kind;
		this.subspacies = subspacies;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getSubspacies() {
		return subspacies;
	}

	public void setSubspacies(String subspacies) {
		this.subspacies = subspacies;
	}

	@Override
	public String toString() {
		return "kind: " + kind + " subspacies: " + subspacies;
	}
	
	
}
