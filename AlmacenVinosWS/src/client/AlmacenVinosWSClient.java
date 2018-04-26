package client;
import webservice.*;

public class AlmacenVinosWSClient {
	public static void main (String [] args) {
		
		AlmacenVinosWSSoapProxy proxy = new AlmacenVinosWSSoapProxy();

		proxy.setEndpoint("http://localhost:52606/AlmacenVinosWS.asmx");

		try {
			System.out.println(proxy.consulta());
		} catch (Exception e) {
			System.out.println("Excepción al conectarse " + e.getMessage());
		}
		
	}
}
