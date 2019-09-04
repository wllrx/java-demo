package com.zoe.zxing;

/**
 * @author Zoe
 **/
public class CodeTest {
    public static void main(String[] args) {
        // 生成路径
        String filePath = "F:\\document\\first.png";

        // 生成二维码
        QRCodeUtil.encodeQRCode("http://www.fjkysq.com/", filePath);

        // 解码二维码
        //QRCodeUtil.decodeQRCode(filePath);

    }
}
