package top.wangruns.trackstacking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class BaseController {


    /**
     * 动态跳转界面
     * @param formName 页面名称
     * @return
     */
    @GetMapping("{formName}")
    public String forwordForm(@PathVariable String formName) {
        return formName;
    }
}
