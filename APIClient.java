package assignment;

public class APIClient {

	public void sendRequest(String endpoint) {
		System.out.println("Enter the endpoint:" +endpoint);
	}
	public void sendRequest(String endpoint, String requestbody,boolean requestStatus) {
		System.out.println("Enter the value:"+endpoint+requestbody+requestStatus);
	}

}

