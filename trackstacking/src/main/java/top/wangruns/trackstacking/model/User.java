package top.wangruns.trackstacking.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import top.wangruns.trackstacking.utils.MD5Util;

import java.util.Date;

@Data
@JsonIgnoreProperties({"password"})
public class User {

    private int userId;
    private String email;
    private String password;
    private String validateCode;
    private String username;
    private Integer disabled;
    private Integer deleted;
    private String nickname;
    private String tel;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private Long creator;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private Long updater;

    public void setPassword(String password) {
        this.password = MD5Util.string2MD5(password);
    }

}
