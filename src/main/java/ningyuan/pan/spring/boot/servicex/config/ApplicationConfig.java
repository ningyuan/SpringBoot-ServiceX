/**
 * 
 */
package ningyuan.pan.spring.boot.servicex.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


/**
 * @author ningyuan
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan({"ningyuan.pan.spring.boot.servicex.application", "ningyuan.pan.spring.boot.servicex.impl",
	"ningyuan.pan.spring.boot.servicex.web.controller"})
public class ApplicationConfig {

}
