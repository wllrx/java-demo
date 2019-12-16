package com.zoe.httpclient;

import cn.gjing.http.HttpClient;
import cn.gjing.http.HttpMethod;
import com.google.gson.Gson;

import java.util.*;

/**
 * @author zoe
 **/
public class HttpClientsTest {
    public static void main(String[] args) {
        Gson gson = new Gson();
        Map<String, Object> map = new HashMap<>(15);
        List<String> list = new ArrayList<>(2);
        list.add("201907040009");
        map.put("meterAddr", list);
        map.put("area", "A");
        System.out.println(list);
        System.out.println(gson.toJson(map));
        ReceiveVO resultMap = HttpClient
                .builder("http://47.97.111.86:8090/api/MeterTimedTask/MdcpTask/ReadPositiveActivePower", HttpMethod.POST, ReceiveVO.class)
                .body(map)
                .execute()
                .get();
        System.out.println(resultMap.getData());
        /*map.clear();
        map.put("meterAddr","201907040001,201907040002");
        map.put("buildingNo","0001");
        map.put("gatewayNO","0012");
        System.out.println(gson.toJson(map));
        Map resultMap1 = HttpClient
                .builder("http://xx.com/api/user/register", HttpMethod.POST, Map.class)
                .body(map)
                .execute()
                .get();
        System.out.println(resultMap1);*/
    }
}
