package com.qwazer.demo.tibco.mock.account;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.jaxrs.config.SwaggerContextService;
import io.swagger.jaxrs.listing.ApiListingResource;
import io.swagger.models.Swagger;
import org.glassfish.jersey.server.ResourceConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.ServletConfigAware;

import javax.servlet.ServletConfig;
import javax.ws.rs.ApplicationPath;

@Component
@ApplicationPath("/rest")
public class AppResourceConfig extends ResourceConfig implements ServletConfigAware {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    private ServletConfig servletConfig;

	public AppResourceConfig() {
		register(AccountRestServiceImpl.class);
		configureSwagger();
	}

	private void configureSwagger() {
		register(ApiListingResource.class);
		BeanConfig beanConfig = new BeanConfig();
		beanConfig.setPrettyPrint(true);
		beanConfig.setScan();
        Swagger swagger = new Swagger();
        new SwaggerContextService().withServletConfig(servletConfig).updateSwagger(swagger);
    }

    @Override
    public void setServletConfig(ServletConfig servletConfig) {
        logger.info("Setting ServletConfig");
        this.servletConfig = servletConfig;
    }
}
