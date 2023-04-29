package com.hdfc.employee.client.config;


import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;

import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.ssl.SSLContextBuilder;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.util.ResourceUtils;
import org.springframework.web.client.RestTemplate;

@Configuration
public class Clientconfig {
	 
		@Bean
	    RestTemplate restTemplate(RestTemplateBuilder builder) {
	        return builder
	        		.requestFactory(()-> validateSSL())
	                .build();
	    }
	   
	    private HttpComponentsClientHttpRequestFactory validateSSL(){
	        String location = "/home/raj/Desktop/HDFC-Capstone-Project/WebClient/src/main/resources/employee.p12";
	        String pass = "password";
	        SSLContext sslContext = null;
	        try{
	            sslContext = SSLContextBuilder.create().loadTrustMaterial(ResourceUtils.getFile(location), pass.toCharArray())
	                    .build();
	        }catch (Exception e){

	        }
	        SSLConnectionSocketFactory csf = new SSLConnectionSocketFactory(sslContext,new LocalHostnameVerifier());
	        CloseableHttpClient httpclient = HttpClients.custom().setSSLSocketFactory(csf).build();
	        HttpComponentsClientHttpRequestFactory requestFactory = new HttpComponentsClientHttpRequestFactory(httpclient);

	        return requestFactory;
	    }

	    private class LocalHostnameVerifier implements HostnameVerifier {
	        
			@Override
			public boolean verify(String s, SSLSession sslsession) {
				// TODO Auto-generated method stub
				return "localhost".equalsIgnoreCase(s) || "192.168.49.2".equals(s);
			}
	    }


}
