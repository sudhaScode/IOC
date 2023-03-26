package demo.concept.inversionofcontrol.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import demo.concept.inversionofcontrol.*;

@Configuration
public class MobilesConfig {
	
	@Bean
	public Color getColor() {
		return new Color();
	}
	@Bean
	public Mobiles getOnePlusObject(Color getcolor) {
		return new Oneplus(getcolor);		
	}
	@Bean
	public Mobiles getIphoneObject(Color getcolor) {
		return new IPhone(getcolor);
		
	}
}
