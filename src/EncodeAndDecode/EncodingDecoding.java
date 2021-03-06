package EncodeAndDecode;

import org.apache.commons.codec.binary.Base64;

public class EncodingDecoding {

	public static void main(String[] args) {
		String str = "obvamuser2";
	byte[] encodedstring =	Base64.encodeBase64(str.getBytes());
	System.out.println(new String(encodedstring));
	
	byte[] decodestring=Base64.decodeBase64(str);
	System.out.println(new String(decodestring));

	}

}
