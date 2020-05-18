package java_13_Interfaces.challenge;

import java.util.List;

/**
 * @author kiran dalai
 *
 */
public interface ISaveable {
	List<String> write();
	void read(List<String> savedvalues);
}
