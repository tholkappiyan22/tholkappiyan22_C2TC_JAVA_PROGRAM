package day1;

public class PrimitiveDataType {
	public static void main(String[] args) {
		byte byteMax = 127;
		byte byteMin = -128;
		
		System.out.println("min range of byte is" + byteMin+ "max range of byte is" +byteMax );
		
		short shortMax =32767;
		short shortMin=-32767;
		System.out.println("minit short range of the byte is" +shortMin+ "maxshort range of byte is" +shortMax);
		
		long maxLong = 9223372036854775807L;
		long minLong = -9223372036854775808L;
		System.out.println("Minlong range of byte is" +
				minLong+"Maxlong range of byte is "+maxLong);
		float f=3234.141243278345f;
		double d=3456.14124512345678902345678914f;
		System.out.println("float value is "+f+" double value is "+d);
		
		boolean flag=false;
		System.out.println("boolean value is "+flag);
		
	}
	

}
