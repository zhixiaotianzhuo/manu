package com.hetong.ad.mi.manu;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ManuApplication extends SpringBootServletInitializer {

	/**
	 * 打包成部署的 war 包
	 * @param application
	 * @return
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		/*SpringbootApplication 类继承 SpringBootServletInitializer 并重写 configure 方法*/
		return application.sources(ManuApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(ManuApplication.class);
		// app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
}
