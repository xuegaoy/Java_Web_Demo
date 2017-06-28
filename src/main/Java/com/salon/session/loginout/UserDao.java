package com.salon.session.loginout;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by gaogao on 2017/6/29.
 */
public class UserDao {
    private  UserDao(){

    }
    private static Map<String,String> map=new HashMap<String, String>();
    static {
        map.put("小一","111");
        map.put("小二","222");
        map.put("小三","333");
        map.put("小四","444");
    }
    public static boolean valiNamePsw(String getName,String getPs){
        if (map.containsKey(getName)&&map.get(getName).equals(getPs)){
            return true;
        }else{
            return false;
        }

    }
}
