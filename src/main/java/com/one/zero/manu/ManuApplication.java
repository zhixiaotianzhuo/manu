package com.one.zero.manu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;

import javax.servlet.ServletException;

@EnableCaching
@SpringBootApplication
public class ManuApplication extends SpringBootServletInitializer {

    /**
     * 针对自定义 Servlet、Filter 和 Listener 的配置 - 与 WebConfig 之中的配置方式效果一致
     * @param servletContext
     * @throws ServletException
     */
    /*@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// 配置 Servlet
		servletContext.addServlet("servletUtil",new ServletUtil())
				.addMapping("/servletTest");
		// 配置过滤器
		servletContext.addFilter("timeFilterUtil",new TimeFilterUtil())
				.addMappingForUrlPatterns(EnumSet.of(DispatcherType.REQUEST),true,"/*");
		// 配置监听器
		servletContext.addListener(new ListenerUtil());
	}*/

    /**
     * 打包成部署的 war 包
     *
     * @param application
     * @return
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		/* SpringbootApplication 类继承 SpringBootServletInitializer 并重写 configure 方法 */
        return application.sources(ManuApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(ManuApplication.class);
        // app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }
}
