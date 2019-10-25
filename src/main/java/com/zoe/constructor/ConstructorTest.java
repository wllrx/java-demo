package com.zoe.constructor;

/**
 * @author zoe
 **/
public class ConstructorTest {

    /**
     * excel文件名
     */
    private String fileName;

    /**
     * excel列表头
     */
    private String header;


    public ConstructorTest(String fileName, String header) {
        this.fileName = fileName;
        this.header = header;
    }

    public ConstructorTest() {
    }

    public ConstructorTest test(){
        System.out.println("顶顶顶顶顶顶");
        return null;
    }
    public ConstructorTest test1(){
        System.out.println("反反复复反反复复");
        return null;
    }

}
class AA{
     public static ConstructorTest test3(){
         return new ConstructorTest("fileName","111");
     }

    public static void main(String[] args) {
        ConstructorTest constructorTest = AA.test3().test().test1();
    }
}
