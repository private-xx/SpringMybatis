package com.loon.mybatis.core.controller;

import java.text.SimpleDateFormat;
import java.util.*;

/**
 * User:李辉
 * date:2017-02-27 11:02
 */
public class Hello {
    public static void main(String[] args) {
        //System.out.println(mao().toString());
        //getDateafterthirtyM("2017-03-07 16:01:33");
        StringBuilder stringBuilder = new StringBuilder("#clm_id,clm_appl_status,clm_batch_no,clm_branch_no,clm_busi_no,clm_dg_status,clm_has_checked,\n" +
                "\t\t\tclm_import_date,clm_inv_status,clm_is_locked,clm_is_timeout,clm_lock_user,clm_return_date,clm_status,\n" +
                "\t\t\tclm_time,clm_timeout_time,clm_dg_bytes,clm_image_num# ");
        System.out.println(stringBuilder.toString().replaceAll(",","#,#"));
    }


    public static String getDateafterthirtyM(String date){
        try {
            SimpleDateFormat simpleDateFormat= new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
            Date date1 = simpleDateFormat.parse("2017-03-07 16:01:33");
            long time= date1.getTime();
            long time2=System.currentTimeMillis();
            long time3= 1000*60*30;
            if (time2 - time > time3){
                System.out.println("当前时间超过了30分钟");
            }else{
                System.out.println("当前时间没超过30分钟");
            }

        }catch (Exception e){

        }
        return "";
    }
    public static int test(int i){
        try {
            i= 10/i;
            return i;
        }catch (Exception e)
        {
            return i;
        }finally {
            i++;
            System.out.println(i);
        }
    }

    public static Map mao(){
        Map map = new HashMap();
        List<Map> list = mapji(1);
        for (int i=0; i <= 2;i++){
            map.put("time"+(i+1),list.size()<i+1 ?"":list.get(i).get("time"));
        }
        return map;
    }
    public static List<Map> mapji(int i){
        List<Map> list = new ArrayList();
        for (int j=0;j<i;j++){
            Map map = new HashMap();
            map.put("time",123);
            list.add(map);
        }
        return list;

    }
}
