/**
 * 
 */
package ningyuan.pan.spring.boot.servicex.application.listener;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * @author ningyuan
 *
 */
@Component
public class AppStartedListener implements ApplicationListener<ApplicationStartedEvent>{

	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
		System.out.println("Application Started bean definition count:" + event.getApplicationContext().getBeanDefinitionCount());
	}

}
