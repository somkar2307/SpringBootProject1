package carWasher.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;import javax.servlet.annotation.WebServlet;

@WebFilter("/CarWasherServlet")
public class CarWasherFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		response.getWriter().write("before custom filter...");
		chain.doFilter(request, response);
		response.getWriter().write("after custom filter...");
		
	}

}
