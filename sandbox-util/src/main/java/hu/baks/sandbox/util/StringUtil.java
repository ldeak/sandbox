package hu.baks.sandbox.util;

/**
 * String utility methods.
 */
public class StringUtil {
	
	public static final boolean isEmpty(String param) {
		return param == null || param.isEmpty();
	}
	
	public static final boolean isBlank(String param) {
		return isEmpty(param) || param.trim().isEmpty();
	}
}
