/**
 * 
 */
package ningyuan.pan.spring.boot.servicex;

import java.util.List;

/**
 * @author ningyuan
 *
 */
public interface XService {
	
	public String getName();
	
	public List<String> getNamesOfDependentServices();
	
}
