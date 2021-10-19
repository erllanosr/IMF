
public class Casteo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//float datoFloat = 100.045f;
		//byte datoByte = 127;

		// De Byte a float
		// datoFloat = datoByte;
		// System.out.println(datoFloat);

		// De Float a Byte
		//datoByte = (byte) datoFloat;
		//System.out.println(datoByte);
		short datoShort=10000;
		int datoInt=20;
		
		// De SHORT a INT
		datoShort=(short) datoInt;
		System.out.println(datoShort);
		
		// De INT a SHORT
		datoInt=datoShort;
		System.out.println(datoInt);
	}

}
