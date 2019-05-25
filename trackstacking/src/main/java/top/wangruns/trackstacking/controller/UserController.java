package top.wangruns.trackstacking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import top.wangruns.trackstacking.model.User;
import top.wangruns.trackstacking.service.UserService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 删除用户
     * @param request
     * @param userIds
     */
    @RequestMapping(value = "deleteUser.do", method = {RequestMethod.POST})
    public void deleteUser(HttpServletRequest request, Integer userIds[]) {
        if (userService.isHasPrivilege(request)) {
            userService.batchDeleteById(userIds);
        }

    }

    /**
     * 查询所有用户，是否需要分页查询
     * @return
     */
    @GetMapping("/selectUser")
    public List<User> selectUser(){
        return userService.getAllRecords();
    }

}
