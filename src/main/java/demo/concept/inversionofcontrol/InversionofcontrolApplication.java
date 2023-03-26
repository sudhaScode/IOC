package demo.concept.inversionofcontrol;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import demo.concept.inversionofcontrol.config.MobilesConfig;
@SpringBootApplication
public class InversionofcontrolApplication {
	public static void main(String[] args) throws IOException {
		Scanner s =new Scanner(System.in);
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MobilesConfig.class);
		System.out.println("1.Iphone\n2.OnePlus");
		int n=  s.nextInt();
		switch (n) {
		case 1: {
			Mobiles obj = context.getBean("getIphoneObject", Mobiles.class);
			obj.getModelAndColor();
			break;
		}

		case 2:
			Mobiles obj = context.getBean("getOnePlusObject", Mobiles.class);
			obj.getModelAndColor();
			break;
		default:
			throw new IllegalArgumentException("Unexpected value: " + n);
		}


	}
}
