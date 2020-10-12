/**
 * 
 */
package ningyuan.pan.spring.boot.servicex.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ningyuan.pan.spring.boot.servicex.XService;

/**
 * @author ningyuan
 *
 */
@RestController
@RequestMapping(value={"/servicex"})
public class XServiceController {
	
	@Autowired
	@Qualifier(value="xserviceimpl")
	XService xservice;
	
	@GetMapping(value="/name")
	public String getName() {
		return xservice.getName();
	}
}
