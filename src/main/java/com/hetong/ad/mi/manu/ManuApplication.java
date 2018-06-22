package com.hetong.ad.mi.manu;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ManuApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ManuApplication.class);
		// app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
}
