package top.wangruns.trackstacking.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {


    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }


    /**
     * 登出（退出登录）
     * @param request
     * @return
     */
    @RequestMapping(value = "logout.do")
    public String logout(HttpServletRequest request) {
        request.getSession().invalidate();
        System.out.println("logout success");
//      return "index";
        return "redirect:index";
    }

    @RequestMapping(value = "headerFrameLoad.do", method = {RequestMethod.GET})
    public ModelAndView headerFrameLoad(HttpServletRequest request) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("headerFrame");

        return modelAndView;
    }

}
