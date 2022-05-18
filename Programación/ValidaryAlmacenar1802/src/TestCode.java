
public class TestCode {

	public static void main(String[] args) {
		int meses = 18;
		int euros = 200;
		int precioMes = 0;
		int mes = 0;
		/*for (int i = 0; i<10;i++) {
			mes++;
			precioMes = precioMes + euros;
			//System.out.println(i);
			System.out.println(mes);
			System.out.println(precioMes);
		}*/
		
		while(mes<meses) {
			mes++;
			precioMes = precioMes+euros;
			System.out.println("El mes " + mes + " deberá pagar: " + precioMes);
		}
		System.out.println(precioMes);

		/*for (int i = 0; i < meses; i++) {
			mes++;
			precioMes = precioMes + euros;
			
		}*/
		
	}

}
