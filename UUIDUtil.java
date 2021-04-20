package com.xxxx.seckill.utils;

import java.util.UUID;
/**
 * UUID 工具类
 */

public class UUIDUtil {
    public static String uuid(){
        return UUID.randomUUID().toString().replace("-", "");
    }
}
