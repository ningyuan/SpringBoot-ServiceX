/**
 * 
 */
package ningyuan.pan.spring.boot.servicex.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import ningyuan.pan.spring.boot.servicex.XService;

/**
 * @author ningyuan
 *
 */
@Service(value="xserviceImpl")
@Scope(value="singleton")
public class XServiceImpl implements XService {
	
	@Autowired
	@Qualifier("restTemplate")
	private RestTemplate restTemplate;
	
	@Override
	public String getName() {
		return "ServiceX";
	}

	@Override
	public List<String> getNamesOfDependentServices() {
		List<String> ret = new ArrayList<String>();
		
		try {
			String name = restTemplate.getForObject("http://spring-boot-servicey/servicey/name", String.class);
			
			if(name != null) {
				ret.add(name);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return ret;
	}

}
