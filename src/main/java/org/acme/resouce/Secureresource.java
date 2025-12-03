package org.acme.resouce;

import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/secure")
public class Secureresource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    @RolesAllowed("USER")
    public String secureEndpoint() {
        return "Acesso permitido! 🔐✔️";
    }
}
