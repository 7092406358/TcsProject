package utilities;

import java.nio.charset.StandardCharsets;
	import java.util.Base64;
	
	public class StringUtils{

	public StringUtils() {}

	public static String base64ToString(String inputString) {

	byte[] decoded = Base64.getDecoder().decode(inputString);

	return new String(decoded, StandardCharsets.UTF_8);

	}
}
