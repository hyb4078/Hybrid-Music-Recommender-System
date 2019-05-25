package top.wangruns.trackstacking.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class DownloadRecord {
    private int downloadId;
    private int userId;
    private int songId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private Long creator;

    public DownloadRecord(int userId, int songId) {
        this.userId = userId;
        this.songId = songId;
    }

}
