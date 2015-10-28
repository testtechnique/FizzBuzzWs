package tv.spideo.recruitment;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("fizz-buzz")
@Produces(MediaType.APPLICATION_JSON)
public class FizzBuzzWs {

	@GET
	public String getFizzBuzz(HttpServletRequest request, HttpServletResponse response) {
		string r = request.getParameter[0];
		int i =Integer.parseInt(r);
		
		if (i mod 3 == 0)
			System.out.println("FIZZ");
		else if (i mod 5 == 0)
			System.out.println("BUZZ");
		else System.out.println(i);;
	}
	
	@POST
	public String postFizzBuzz(HttpServletRequest request, HttpServletResponse response) {
		string r = request.getParameter[0];
		string s = request.getParameter[1];
		int j =Integer.parseInt(r);
		int k =Integer.parseInt(s);
		
		for (i=j; i<=k; i++){
		if (i mod 3 == 0)
			System.out.print("FIZZ");
		else if (i mod 5 == 0)
			System.out.print("BUZZ");
		else System.out.print(i);
		}
	}
}
