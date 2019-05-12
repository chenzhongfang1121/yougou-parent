package cn.itsource.yougou.controller;

import cn.itsource.yougou.util.AjaxResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class LoginController {

    /**
     * 前端使用vue，vue建议时间axios发送ajax请求
     * axios发送post请求，参数以json体的形式发送的
     *
     *  http://localhost:8080/login?username=xxx&password=xxx
     *
     *  http://localhost:8080/login
     *  {
     *      "username":"admin",
     *      "password":"admin"
     *  }
     * 后端封装json体，使用@RequestBody
     * @param params
     * @return
     */
    @PostMapping("/login")
    @ApiOperation(value = "登录接口")
    public AjaxResult login(@RequestBody Map<String,Object> params){
        String username = (String)params.get("username");
        String password = (String)params.get("password");
        if ("admin".equals(username) && "admin".equals(password)) {
            //登录成功
            return AjaxResult.me();
        } else {
          //登录失败
          return AjaxResult.me().setSuccess(false).setMessage("用户名或密码错误");
        }

    }


}
