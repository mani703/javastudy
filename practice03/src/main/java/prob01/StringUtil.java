package prob01;

public class StringUtil {
	public static String concatenate(String[] str) {
		String resultStr = "";
		for(int i = 0; i < str.length; i++) {
			resultStr = resultStr.concat(str[i]);
		}
		return resultStr;
	}
}
