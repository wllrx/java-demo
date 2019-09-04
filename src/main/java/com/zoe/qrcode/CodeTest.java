package com.zoe.qrcode;

import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.datamatrix.encoder.SymbolShapeHint;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Zoe
 **/
public class CodeTest {
    public static void main(String[] args) {
        QRCodeUtils qrCodeUtils = new QRCodeUtils();
        /* 生成二维码图片 */
        String filePath = "F:\\test\\test2.png";
        try {
            qrCodeUtils.create("1111111111", filePath);
        } catch (WriterException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class TestCode{
    public static void main(String[] args) {
        QRCodeUtils qrCodeUtils = new QRCodeUtils();
        Map<EncodeHintType,Object> map = new HashMap<>();
        map.put(EncodeHintType.CHARACTER_SET,"UTF-8");
        map.put(EncodeHintType.DATA_MATRIX_SHAPE, SymbolShapeHint.FORCE_RECTANGLE);
        map.put(EncodeHintType.MARGIN,0);
        map.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.H);

        //生成带logo的二维码
        String filePath = "F:\\test\\code1.png";
        String logoPath = "F:\\Idea背景3.jpg";

        try {
            qrCodeUtils.createWithLogo("https://wllrx.oss-cn-beijing.aliyuncs.com/zoe/20190903092139.gif", filePath, logoPath,map);
        } catch (WriterException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

class TestCode1{
    public static void main(String[] args) throws IOException, WriterException {
        QRCodeUtils qrCodeUtils = new QRCodeUtils();
        String logoPath = "F:\\Idea背景3.jpg";
        File file = new File("F:\\test\\code2.png");
        OutputStream outputStream = qrCodeUtils.createWithLogo("https://wllrx.oss-cn-beijing.aliyuncs.com/zoe/20190903092139.gif",logoPath);
        OutputStream stream = null;
        stream = new FileOutputStream(file,true);
        stream.write(outputStream.toString().getBytes());
        stream.flush();
        System.out.println(stream);
    }
}