/**
 * 
 */
package ningyuan.pan.spring.boot.servicex.application.runner;

import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author ningyuan
 *
 */
@Component
@Order(value=2)
public class AppRunner implements ApplicationRunner{

	@Override
	public void run(ApplicationArguments args) throws Exception {
		System.out.println("AppRunner");
		
		Set<String> opts = args.getOptionNames();
		for(String opt : opts) {
			System.out.println(opt+": "+args.getOptionValues(opt));
		}
	}

}
