package com.loon.mybatis.core.controller;

import com.loon.mybatis.core.pojo.UserInfo;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * User:李辉
 * date:2017-02-04 17:21
 */
@Controller
@RequestMapping("/user")
//@SessionAttributes(names = "aa")
public class USerController {
    public static String SUCCESS = "view/success";


    @RequestMapping("/testModelAttribute")
    public String testModelAttribute(UserInfo userInfo,Model model){
        model.addAttribute("aa",userInfo);
        return SUCCESS;
    }
    /*
   *
   * @ModelAttribute 标记的方法会在每个目标方法执行前运行，
   * 获取用户信息，存放到map中key为userinfo,当spring的目标方法 使用了这个key的属性时会取出来进行更新。
   *
   * */
    @ModelAttribute(value = "/testModelAttribute",binding = true)
    public void getUser(@RequestParam(value = "uId",required = false) Integer id, Map<String,Object> map){
        if (null != id){
            UserInfo userInfo = new UserInfo(1,"liki",12,"123456");
            System.out.println(userInfo);
            "11,11,1111".replaceAll(",","|");
            map.put("userInfo",userInfo);
        }
    }
    @RequestMapping("/testSession")
    public String testSession(Map<String,Object> map){
        map.put("aa",new UserInfo(1,"name",13));
        return SUCCESS;
    }
    @RequestMapping("testMap")
    @DateTimeFormat(style = "YYYY-MM-SS")
    public String testMap(Map<String,Object> map){

                String ss = "2015-2-23";

        map.put("names",Arrays.asList("Tom","Jerry"));
        return "view/testsuccess";
    }
    @RequestMapping(value = "/testParam")
    public String testParam(@RequestParam("uId") Integer uId,
                            @RequestParam("userName") String userName,
                            @RequestParam(value = "age",required = false) Integer age,Model model){
        UserInfo userInfo = new UserInfo();
        userInfo.setuId(uId);
        userInfo.setUserName(userName);
        userInfo.setAge(age);
        model.addAttribute("aa",userInfo);
        return SUCCESS;
    }
    @RequestMapping("/testMethod")
    public ModelAndView testMethod(){
        Map<String,Object> map = new HashMap<String,Object>();
        UserInfo userInfo =  new UserInfo();
        userInfo.setuId(1);
        userInfo.setUserName("软件一班");
        userInfo.setAge(3);
        map.put("aa",userInfo);
        return new ModelAndView(SUCCESS,map);
    }
    @RequestMapping(value = "testMethodPost",method = RequestMethod.POST)
    public String testMethodPost(UserInfo userInfo , Model model){
       model.addAttribute("aa",userInfo);
       return SUCCESS;
    }
    @RequestMapping(value = "testMethodParams",params = {"username","age!=11"})
    public String testMethodParams(){
        return "view/testsuccess";
    }
    @RequestMapping(value = "testPathVariable/{cId}")
    public ModelAndView testPathVariable(@PathVariable(value = "cId") Integer cId){
        Map<String,Object> map = new HashMap<String,Object>();
        UserInfo userInfo =  new UserInfo();
        userInfo.setuId(1);
        map.put("aa",userInfo);
        return new ModelAndView(SUCCESS,map);
    }
    @RequestMapping(value = "testMethodPut/{cId}",method = RequestMethod.PUT)
    public ModelAndView testMethodPut(@PathVariable Integer cId){
        Map<String,Object> map = new HashMap<String,Object>();
        UserInfo userInfo =  new UserInfo();
        userInfo.setuId(cId);
        userInfo.setUserName("PUT");
        map.put("aa",userInfo);
        return new ModelAndView(SUCCESS,map);
    }
    @RequestMapping(value = "testMethodDelete/{cId}",method = RequestMethod.DELETE)
    public ModelAndView testMethodDelete(@PathVariable Integer cId){
        Map<String,Object> map = new HashMap<>();
        UserInfo userInfo =  new UserInfo();
        userInfo.setuId(cId);
        userInfo.setUserName("Delete");
        map.put("aa",userInfo);
        return new ModelAndView(SUCCESS,map);
    }
}
