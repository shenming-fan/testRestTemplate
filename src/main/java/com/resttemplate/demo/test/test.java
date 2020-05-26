package com.resttemplate.demo.test;

import com.resttemplate.demo.entity.Quote;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;

public class test {
    public static void main(String[] args) throws UnsupportedEncodingException {
        RestTemplate restTemplate = new RestTemplate();
        String str = restTemplate.getForObject("https://tenapi.cn/yiyan/get/?code=js",String.class);

        System.out.println(str);
        String  quote = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random",String.class);
        System.out.println(quote);

    }
}
