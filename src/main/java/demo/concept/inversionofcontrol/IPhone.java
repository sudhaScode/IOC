package demo.concept.inversionofcontrol;

public class IPhone implements Mobiles {
	Color color;
	
	public IPhone(Color colorObj) {
		this.color=colorObj;
	}
	@Override
	public void getModelAndColor() {
    System.out.println("Version: Mac 11\nModel: Iphone 13 Pro\nTheme: Grey Apple");	
    color.getIphoneColor();
			}
}
