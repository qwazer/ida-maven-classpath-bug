package com.qwazer.demo.tibco.mock.account;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.UnavailableException;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;


@Path("v1")
@Api(basePath = "/rest/v1/")
public interface AccountRestService {

    @POST
    @Path("account")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    @ResponseBody Object accounts(@RequestBody List<Object> list) throws UnavailableException;

}
