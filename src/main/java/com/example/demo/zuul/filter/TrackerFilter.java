package com.example.demo.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.UUID;

@Component
public class TrackerFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    private final String RELATION_ID = "relation_id";
    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest request = requestContext.getRequest();
        String id = request.getHeader("RELATION_ID");
        if(Strings.isBlank(id)){
            if(Strings.isBlank(requestContext.getZuulRequestHeaders().get(RELATION_ID))){
                id = UUID.randomUUID().toString();
                requestContext.addZuulRequestHeader(RELATION_ID,id);
            }
        }
        return null;
    }
}
