package top.wangruns.trackstacking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import top.wangruns.trackstacking.service.SongService;
import top.wangruns.trackstacking.service.UserService;
import top.wangruns.trackstacking.utils.ReturnMsg;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class SongController {
    @Autowired
    private UserService userService;
    @Autowired
    private SongService songService;

    @PostMapping("deleteSong.do")
    public void deleteSong(HttpServletRequest request, Integer songIds[]) {
        if (userService.isHasPrivilege(request)) {
            songService.batchDeleteById(request, songIds);
        }

    }

    @PostMapping(value = "addSong.do")
    @ResponseBody
    public String addSong(HttpServletRequest request, MultipartFile song, MultipartFile lyric) {
        if (userService.isHasPrivilege(request) && songService.checkFormat(song, lyric)) {
            boolean isSuccessful = songService.addSong(request, song, lyric);
            if (isSuccessful) {
                return ReturnMsg.msg(HttpServletResponse.SC_OK, "上传成功");
            } else {
                return ReturnMsg.msg(HttpServletResponse.SC_BAD_REQUEST, "上传失败");
            }
        }

        return ReturnMsg.msg(HttpServletResponse.SC_BAD_REQUEST, "格式错误");
    }

}
