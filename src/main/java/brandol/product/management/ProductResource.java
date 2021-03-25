package brandol.product.management;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

@Path("/products")
public class ProductResource {
	
	String[] products = {"Books", "Computers", "Fruits","Phones"};
		
	@GET
	public String getAllProducts() {
		return String.join(", ", products);
	}
		
	@GET
	@Path("/{index}")
	public String getProduct(@PathParam("index") int index) {
		return products[index];
	}
	
}