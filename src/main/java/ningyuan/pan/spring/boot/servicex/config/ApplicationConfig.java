/**
 * 
 */
package ningyuan.pan.spring.boot.servicex.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


/**
 * @author ningyuan
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan({"ningyuan.pan.spring.boot.servicex.application", 
	"ningyuan.pan.spring.boot.servicex.impl"})
@Import({WebConfig.class})
public class ApplicationConfig {

}
