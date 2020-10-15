/**
 * 
 */
package ningyuan.pan.spring.boot.servicex.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
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
	@Qualifier(value="xserviceImpl")
	private XService xservice;
	
	@Value("${server.port}")
	private String port;
	
	@GetMapping(value="/name")
	public String getName() {
		return xservice.getName() + " from port: "+port;
	}
	
	@GetMapping(value="/name/dependentServices")
	public List<String> getNamesOfDependentServices() {
		return xservice.getNamesOfDependentServices();
	} 
}
