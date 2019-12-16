package com.zoe.java8.answer;

/**
 * @author zoe
 **/
public class ParentImpl implements Parent {

    private String body;

    @Override
    public void message(String body) {
        this.body = body;
    }

    @Override
    public String getLastMessage() {
        return body;
    }
}

class Test {
    public static void main(String[] args) {
        Parent parent = new ParentImpl();
        parent.welcome();
        System.out.println(parent.getLastMessage());
        System.out.println(("hello parent".equals(parent.getLastMessage())));
    }


}