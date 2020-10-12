/**
 * 
 */
package ningyuan.pan.spring.boot.servicex.application.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author ningyuan
 *
 */
@Component
public class ContextRefreshedListener implements ApplicationListener<ContextRefreshedEvent>{

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("Context Refreshed bean definition count:" + event.getApplicationContext().getBeanDefinitionCount());
	}

}
