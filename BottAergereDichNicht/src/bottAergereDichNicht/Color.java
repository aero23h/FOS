package bottAergereDichNicht;

public class Color {
	private ColorItem red;
	private ColorItem green;
	private ColorItem blue;
	private ColorItem yellow;
	private ColorItem reset;
	
	public Color() {
		this.red = new ColorItem("\u001b[31m", "red");
		this.green = new ColorItem("\u001b[32m","green");
		this.blue = new ColorItem("\u001b[34m","blue");
		this.yellow = new ColorItem("\u001b[33m","yellow");
		this.reset = new ColorItem("\u001b[0m","reset");
	}
	
	// ################################################################################################################
	
	public String getColoredName(ColorItem color){
		return color.getCode() + color.getName() + this.reset();
	}
	
	public String reset() {
		return this.reset.getCode();
	}
	
	// ################################################################################################################
	
	public ColorItem getRed() {
		return this.red;
	}

	public ColorItem getGreen() {
		return this.green;
	}

	public ColorItem getBlue() {
		return this.blue;
	}

	public ColorItem getYellow() {
		return this.yellow;
	}

	public ColorItem getReset() {
		return this.reset;
	}

}
