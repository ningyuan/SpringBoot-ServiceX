/**
 * 
 */
package ningyuan.pan.spring.boot.servicex.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author ningyuan
 *
 */
@Configuration
public class BeanConfig {
	
	@Bean(name="restTemplate")
	// Eureka restful service consumer with the client-side load balancer Ribbon
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}
}
