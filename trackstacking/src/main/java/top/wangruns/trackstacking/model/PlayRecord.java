package top.wangruns.trackstacking.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class PlayRecord {
    private int playId;
    private int userId;
    private int songId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private Long creator;

    public PlayRecord(Integer userId, Integer songId) {
        this.userId = userId;
        this.songId = songId;
    }

}
