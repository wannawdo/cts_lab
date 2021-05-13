package proxy;

public class ProxyClient implements IClient{
	private Client client;
	
	
	public ProxyClient(Client client) {
		super();
		this.client = client;
	}


	@Override
	public void cumparaLapte() {
		if(client.getGen()=="femeie" || client.getGen()=="Femeie") {
			client.cumparaLapte();
		}
		else
		{
			System.out.println("esti barbat");
		}
		
	}

}
