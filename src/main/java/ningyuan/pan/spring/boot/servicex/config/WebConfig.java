package ningyuan.pan.spring.boot.servicex.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author ningyuan
 *
 */
@Configuration
@ComponentScan({"ningyuan.pan.spring.boot.servicex.web.controller", 
		"ningyuan.pan.spring.boot.servicex.web.interceptor"})
public class WebConfig implements WebMvcConfigurer{
	
	@Autowired
	@Qualifier("interceptor1")
	private HandlerInterceptor interceptor1;
	
	@Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(interceptor1).addPathPatterns("/**");
    }
}
