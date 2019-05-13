package top.wangruns.trackstacking.model;

import lombok.Getter;
import lombok.Setter;
import top.wangruns.trackstacking.utils.MD5Util;

@Getter
@Setter
public class User {
    private int userId;
    private String email;
    private String password;
    private String validateCode;
    private String userName;

    public void setPassword(String password) {
        this.password = MD5Util.string2MD5(password);
    }

}
