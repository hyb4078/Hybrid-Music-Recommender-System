package top.wangruns.trackstacking.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Collection {
    private int collectionId;
    private int userId;
    private int songId;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    public Collection(int userId, int songId) {
        this.userId = userId;
        this.songId = songId;
    }

}
