package com.resttemplate.demo.test;

import com.resttemplate.demo.entity.Quote;
import org.apache.tomcat.util.json.JSONParser;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class test {
    public static void main(String[] args)  {
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("task run "+new Date());
            }
        };
        Timer timer = new Timer();
        timer.schedule(timerTask,10,3000);

    }
}
