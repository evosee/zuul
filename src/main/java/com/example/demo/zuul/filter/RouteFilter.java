/*
package com.example.demo.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import javax.servlet.http.HttpServletRequest;
import java.net.MalformedURLException;
import java.net.URL;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.REQUEST_URI_KEY;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.SERVICE_ID_KEY;


@Component
public class RouteFilter extends ZuulFilter {
    @Autowired
    private RestTemplate restTemplate;
    @Override
    public String filterType() {
        return "route";
    }

    @Override
    public int filterOrder() {
        return 3;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String url = request.getRequestURI();
        if(url.indexOf("a/feignProvider")!=-1){
            String urla = "http://serviceb/b/first";


                requestContext.set(SERVICE_ID_KEY,"serviceb");
            requestContext.set(REQUEST_URI_KEY,"/b/first");
            */
/*ResponseEntity<String> responseEntity = restTemplate.exchange(urla, HttpMethod.GET, null, String.class);
            System.out.println(responseEntity.getBody());
            requestContext.setSendZuulResponse(false);*//*

            // return responseEntity;
        }
        return null;
    }
}
*/
