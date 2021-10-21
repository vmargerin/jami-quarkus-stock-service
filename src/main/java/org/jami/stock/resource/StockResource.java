package org.jami.stock.resource;

import javax.annotation.security.RolesAllowed;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.jami.stock.model.ProductStock;

@Path("/stocks")
@RequestScoped
@RolesAllowed({ "order-flow" })
public class StockResource {

	@GET
	@Path("/{productSku}")
	@Produces(MediaType.APPLICATION_JSON)
	public ProductStock getStockBySku(@PathParam(value = "productSku") String productSku) {
		return new ProductStock(productSku, 10);
	}

}