package com.resttemplate.demo.test;

import com.resttemplate.demo.entity.Quote;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;

public class test {
    public static void main(String[] args)  {
        RestTemplate restTemplate = new RestTemplate();

        String  quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random",String.class);
        System.out.println(quote);

    }
}
