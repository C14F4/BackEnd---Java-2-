package com.ciafa.portfolio.security;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

import static java.util.Collections.emptyList;

public class JwtUtil {

    static void addAuthentication(HttpServletResponse res, String username) {

        String token = Jwts.builder()
            .setSubject(username)

            .setExpiration(new Date(System.currentTimeMillis() + 3600000))

            .signWith(SignatureAlgorithm.HS512, "C14f4")
            .compact();
        //String respuesta = "{ \"accessToken\" : \""+ token +"\"}";
        res.addHeader("Authorization", "Bearer " + token);
        //res.getWriter().write(respuesta);
    }

    static Authentication getAuthentication(HttpServletRequest request) {

        String token = request.getHeader("Authorization");

        if (token != null) {
            String user = Jwts.parser()
                    .setSigningKey("C14f4")
                    .parseClaimsJws(token.replace("Bearer", "")) 
                    .getBody()
                    .getSubject();

            return user != null ?
                    new UsernamePasswordAuthenticationToken(user, null, emptyList()) :
                    null;
        }
        return null;
    }
}
