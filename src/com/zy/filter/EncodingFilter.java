package com.zy.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EncodingFilter implements Filter {
	private FilterConfig filterconfig;

	public void init(FilterConfig filterconfig) throws ServletException{
		this.filterconfig = filterconfig;
	}
	
	public void destroy() {
		this.filterconfig = null;
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		request.setCharacterEncoding(filterconfig.getInitParameter("Encoding"));
		chain.doFilter(request, response);
		
	}
	

}
