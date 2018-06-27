package com.hetong.ad.mi.manu.config;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.hetong.ad.mi.manu.utils.ListenerUtil;
import com.hetong.ad.mi.manu.utils.ServletUtil;
import com.hetong.ad.mi.manu.utils.TimeFilterUtil;
import com.hetong.ad.mi.manu.utils.TimeInterceptorUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * 配置管理类 WebConfig
 *
 * Created by MANU on 2018/6/26.
 */
@Configuration
public class WebConfig  extends WebMvcConfigurerAdapter {

    /**
     *
     * @return
     */
    // todo 不知它用来干啥的 ?
    @Bean
    public HttpMessageConverters fastJsonHttpMessageConverters() {
        FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();

        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);

        fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);

        HttpMessageConverter<?> converter = fastJsonHttpMessageConverter;

        return new HttpMessageConverters(converter);

    }

    /**
     * 项目启动时，配置 Servlet
     * @return
     */
    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new ServletUtil(),"/servletTest");
    }

    /**
     * 项目启动时，配置过滤器
     * @return
     */
    @Bean
    public FilterRegistrationBean timeFilter() {
        FilterRegistrationBean registrationBean = new FilterRegistrationBean();

        TimeFilterUtil timeFilter = new TimeFilterUtil();
        registrationBean.setFilter(timeFilter);

        List<String> urls = new ArrayList<>();
        urls.add("/*");
        registrationBean.setUrlPatterns(urls);

        return registrationBean;
    }

    /**
     * 项目启动时，配置监听器
     * @return
     */
    @Bean
    public ServletListenerRegistrationBean<ListenerUtil> servletListenerRegistrationBean() {
        return new ServletListenerRegistrationBean<ListenerUtil>(new ListenerUtil());
    }

    @Autowired
    private TimeInterceptorUtil timeInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(timeInterceptor);
    }
}
