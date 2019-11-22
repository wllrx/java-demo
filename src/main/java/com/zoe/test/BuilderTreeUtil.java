package com.zoe.test;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * @author zoe
 **/
public class BuilderTreeUtil {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        buildTree(list);
    }

    /**
     * 构建树
     *
     * @param data 目标数据
     * @return 返回数据
     */
    public static <T> List<T> buildTree(List<T> data) {
        Type type = data.getClass().getGenericSuperclass();
        System.out.println(type);

        return null;
    }

}
