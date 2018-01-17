package Timebox1.tb1;

import com.ibm.watson.developer_cloud.discovery.v1.Discovery;
import com.ibm.watson.developer_cloud.discovery.v1.model.environment.CreateEnvironmentRequest;
import com.ibm.watson.developer_cloud.discovery.v1.model.environment.CreateEnvironmentResponse;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Discovery discovery = new Discovery("2017-11-07");
    	discovery.setEndPoint("https://gateway.watsonplatform.net/discovery/api/");
    	discovery.setUsernameAndPassword("{username}", "{password}");
    	String environmentName = "my_environment";
    	String environmentDesc = "My environment";

    	CreateEnvironmentRequest.Builder createRequestBuilder = new CreateEnvironmentRequest.Builder(environmentName, CreateEnvironmentRequest.Size.ONE);
    	createRequestBuilder.description(environmentDesc);
    	CreateEnvironmentResponse createResponse = discovery.createEnvironment(createRequestBuilder.build()).execute();
    }
}
