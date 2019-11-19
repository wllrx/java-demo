package com.zoe.test;

import cn.gjing.http.HttpClient;
import cn.gjing.http.HttpMethod;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zoe
 **/
public class HttpTest {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>(16);
        map.put("fromDate", "2019-11-11 00:00:00");
        map.put("toDate", "2019-11-12 23:59:59");
        Map resultMap = HttpClient
                .builder("http://47.97.111.86:8090/api/PostdateManagement/PostdateManagement/PostDataList", HttpMethod.POST, Map.class)
                .body(map)
                .get();
        System.out.println(resultMap);
    }
}
