package com.example.shoppingmall.utils;

//配置各个页面连网地址
class Constants {
     public static final String BASE = "http://192.168.51.104:8080/atguiu/json/Home_URL.json";

    // 请求 Json 数据基本 URL
    public static final String Base_URL_JSON = BASE + "/atguigu/json/";
    // 请求图片基本 URL
    public static final String Base_URl_IMAGE = BASE + "/atguigu/img";
    //主页路径
    public static final String HOME_URL = Base_URL_JSON + "HOME_URL.json";
    public static final String TAG_URL = Base_URL_JSON + "TAG_URL.json";
    public static final String SKIRT_URL = Base_URL_JSON + "SKIRT_URL.json";
    public static final String NEW_POST_URL = Base_URL_JSON + "NEW_POST_URL.json";
    public static final String HOT_POST_URL = Base_URL_JSON + "HOT_POST_URL.json";
    public static final String JACKET_URL = Base_URL_JSON + "JACKET_URL.json";
    public static final String PANTS_URL = Base_URL_JSON + "PANTS_URL.json";
    public static final String OVERCOAT_URL = Base_URL_JSON +
            "PANTS_URL.json/OVERCOAT_URL.json";
    //配件
    public static final String ACCESSORY_URL = Base_URL_JSON +
            "PANTS_URL.json/ACCESSORY_URL.json";
    public static final String BAG_URL = Base_URL_JSON + "BAG_URL.json";
    //装扮
    public static final String DRESS_UP_URL = Base_URL_JSON + "DRESS_UP_URL.json";
    //居家宅品
    public static final String HOME_PRODUCTS_URL = Base_URL_JSON +
            "HOME_PRODUCTS_URL.json";
    //文具
}