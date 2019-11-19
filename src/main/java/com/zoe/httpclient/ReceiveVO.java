package com.zoe.httpclient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author zoe
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReceiveVO<T> {
    Integer code;
    String msg;
    List<T> data;

    @Override
    public String toString() {
        return "ReceiveVO{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", data='" + data + '\'' +
                '}';
    }
}
