package net.kv.carpool.filters;
 
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.MDC;
 
public class AuthenticationFilter implements Filter
{
 
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException,
        ServletException
    {
 
        HttpServletRequest httpServletRequest = (HttpServletRequest) request;
        try
        {
            /*
             * This code puts the value "userName" to the Mapped Diagnostic context. Since MDc is a static class, we can
             * directly access it with out creating a new object from it. Here, instead of hard coding the user name,
             * the value can be retrieved from a HTTP Request object.
             */
 
            if (null != httpServletRequest.getRemoteUser())
            {
 
                MDC.put("userName", httpServletRequest.getRemoteUser());
                MDC.put("sessionID", httpServletRequest.getSession().getId());
 
            }
 
            chain.doFilter(request, response);
 
        }
        finally
        {
           MDC.remove("userName");
           MDC.remove("sessionID");
        }
 
    }
 
    @Override
    public void destroy()
    {
 
    }
 
    @Override
    public void init(FilterConfig arg0) throws ServletException
    {
 
    }
 
}