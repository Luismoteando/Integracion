package client;
import webservice.*;

public class AlmacenVinosWSClient {
	public static void main (String [] args) {
		
		AlmacenVinosWSSoapProxy proxy = new AlmacenVinosWSSoapProxy();

		proxy.setEndpoint("http://localhost:52606/Logica/AlmacenVinosWS.asmx");

		try {
			System.out.println(proxy.consulta());
			System.out.println(proxy.comprobarStock("1"));
			System.out.println(proxy.cambiarStock("4", "1"));
		} catch (Exception e) {
			System.out.println("Excepción al conectarse " + e.getMessage());
		}
		
	}
}
