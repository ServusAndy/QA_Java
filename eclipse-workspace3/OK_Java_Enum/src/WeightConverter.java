
public enum WeightConverter {
	GR(1.0f),KG(1000.0f),TN(1000000.0f),LBS(453.592f);
	
	private float gramAmount;
	
	private WeightConverter(float gramAmount) {
		this.gramAmount = gramAmount;
	}
	
	public float convert(WeightConverter other) {
		return this.gramAmount/other.gramAmount;
	}
	
}
