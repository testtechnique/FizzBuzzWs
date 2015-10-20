package tv.spideo.recruitment;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("fizz-buzz")
@Produces(MediaType.APPLICATION_JSON)
public class FizzBuzzWs {

	@GET
	public String getFizzBuzz() {
		return "It works!";
	}
}
