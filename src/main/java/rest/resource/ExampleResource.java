package rest.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import rest.model.Example;

@Path("/examples")
public class ExampleResource {
	private static List<Example> examples = new ArrayList<>();
	
	static {
		examples.add(new Example(1, "Example 1"));
		examples.add(new Example(2, "Example 2"));
		examples.add(new Example(3, "Example 3"));
	}
    
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Example> getAllExamples() {
        return examples;
	}
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Example getExampleById(@PathParam("id") int id) {
		return examples.get(id-1);
	}
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Example putExampleById(@PathParam("id") int id, Example updatedExample) {
		return examples.set(id-1, updatedExample);
	}
	
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Example newExample(Example newExample) {
        examples.add(newExample);
        return newExample;
	}
	
	@DELETE
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Example deleteExampleById(@PathParam("id") int id) {
		return examples.remove(id-1);
	}
}