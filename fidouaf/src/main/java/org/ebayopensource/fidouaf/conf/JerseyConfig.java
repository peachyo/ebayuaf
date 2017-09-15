package org.ebayopensource.fidouaf.conf;

import javax.ws.rs.ApplicationPath;

import org.ebayopensource.fidouaf.res.FidoUafResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Configuration
@Component
//@ApplicationPath("/uaf/v1")
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(FidoUafResource.class);
	}

}
