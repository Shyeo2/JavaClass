package study03;

public class Km2Mile extends Converter{
	public Km2Mile (double ratio) {
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src) {
		return Math.round(src/ratio*100)/100.0;
		
	}

	@Override
	protected String getSrcString() {
		
		return "Km";
	}

	@Override
	protected String getDestString() {
	
		return "mile";
	}
	
	public static void main(String[] args) {
		Km2Mile toMile = new Km2Mile(1.6);
		toMile.run();
	}
}
