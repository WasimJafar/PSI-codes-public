package com.sapient.oms.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.token.TokenService;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.endpoint.FrameworkEndpoint;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JdbcTokenStore;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@FrameworkEndpoint
@CrossOrigin
public class RevokeTokenEndpoint {


    @Qualifier("getJdbcTokenStore")
    @Autowired
    private TokenStore tokenStore;
    @RequestMapping(value = "/oauth/revoke-token", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.OK)
    public String logout(HttpServletRequest request) {
    	HttpSession session = request.getSession();
    	System.out.println();
    	if(session!=null)
    	{
    		session.invalidate();
    	}
        String authHeader = request.getHeader("Authorization");
        if (authHeader != null) {
            String tokenValue = authHeader.replace("Bearer", "").trim();
            OAuth2AccessToken accessToken = tokenStore.readAccessToken(tokenValue);
            tokenStore.removeAccessToken(accessToken);
        }
        return "done";
    }

}