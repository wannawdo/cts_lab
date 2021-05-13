package proxy.main;

import proxy.Client;
import proxy.ProxyClient;

public class Main {

	public static void main(String[] args) {
		
		Client c=new Client("ion", "nu femeie");
		ProxyClient proxy= new ProxyClient(c);
		proxy.cumparaLapte();
	}

}
