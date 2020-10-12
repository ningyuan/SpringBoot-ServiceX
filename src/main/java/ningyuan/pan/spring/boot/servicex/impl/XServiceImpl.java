/**
 * 
 */
package ningyuan.pan.spring.boot.servicex.impl;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import ningyuan.pan.spring.boot.servicex.XService;

/**
 * @author ningyuan
 *
 */
@Service(value="xserviceimpl")
@Scope(value="singleton")
public class XServiceImpl implements XService {

	@Override
	public String getName() {
		return "ServiceX";
	}

}
