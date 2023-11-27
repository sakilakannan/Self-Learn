package assignment;

public class APIOverloading extends APIClient {

	public static void main(String[] args) {
		APIClient overld=new APIClient();
		overld.sendRequest("Happy Birthday");
		overld.sendRequest("Happy Birthday, offering today, true");

	}

}
