package com.zoe.base;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @author zoe
 **/
public class OssUtil {

    public static OssUtil of(){
        return new OssUtil();
    }

    public String test(){
        return ".....";
    }
    public String more(List<MultipartFile> multipartFiles){

        return "";
    }
}

class OssTest{
    public static void main(String[] args) {
        String test = OssUtil.of().test();
    }
}
