package demo.concept.inversionofcontrol;

public class Oneplus implements Mobiles {
	Color color;

	public Oneplus(Color colorobj){
		this.color = colorobj;
	}
	@Override
	public void getModelAndColor() {
		System.out.println("Version:Android11\nModel: Oneplus 11 Pro\nTheme: Sky Blue");
		color.getOneplusColor();

	}

}
