package com.zoe.httpclient;

import cn.gjing.http.HttpClient;
import cn.gjing.http.HttpClientFactory;
import cn.gjing.http.HttpMethod;

/**
 * @author zoe
 **/
public class HttpClientsTest {
    public static void main(String[] args) {
        HttpClientFactory.builder("127.0.0.1:2001/test", HttpMethod.GET).execute(HttpClient.class);
    }
}
