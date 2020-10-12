/**
 * 
 */
package ningyuan.pan.spring.boot.servicex.application.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author ningyuan
 *
 */
@Component
@Order(value=1)
public class CLIRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("CLIRunner");
		
		for(String arg : args) {
			System.out.println(arg);
		}	
	}
}