package com.zoe.cglib;

/**
 * @author zoe
 **/
public class CgLibTest {
    public static void main(String[] args) {
        CgLibCanteen cgLibCanteen = new CgLibCanteen();
        CgLibCanteen libCanteen = new CgLibProxy(cgLibCanteen).proxy();
        libCanteen.sell();
    }
}
