package com.zoe.design;

/**
 * @author zoe
 **/
public interface IDBQuery {
    /**
     * ...
     * @return .
     */
    String request();
}

class DBQuery implements IDBQuery{

    public DBQuery() {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public String request() {
        return "request string";
    }
}

class DBQueryProxy implements IDBQuery{

    private DBQuery real = null;

    @Override
    public String request() {
        if (real == null){
            real = new DBQuery();
        }
        return real.request();
    }
}

class Main{
    public static void main(String[] args) {
        IDBQuery query = new DBQueryProxy();
        query.request();
    }
}

