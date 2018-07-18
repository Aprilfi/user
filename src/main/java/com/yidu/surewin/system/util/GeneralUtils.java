package com.yidu.surewin.system.util;

import org.apache.shiro.crypto.hash.Md5Hash;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class GeneralUtils {

    public static String generateId() {
        UUID uuid=UUID.randomUUID();
        String str = uuid.toString();
        String uuidStr=str.replace("-", " ");
        return uuidStr;
    }

    public static Map<String, Object> generatePas(String password) {
        Map<String, Object> map = new HashMap<>();
        //生成随机盐
        String salt = UUID.randomUUID().toString();
        //根据随机盐加密密码
        Md5Hash md5Hash = new Md5Hash(password, salt, 2);

        map.put("password", md5Hash.toString());
        map.put("salt", salt);
        return map;
    }

}
