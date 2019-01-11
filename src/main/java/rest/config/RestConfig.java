package rest.config;

import org.glassfish.jersey.server.ResourceConfig;

public class RestConfig extends ResourceConfig {
	public RestConfig() {
		packages("rest");
	}
}