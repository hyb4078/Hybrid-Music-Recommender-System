package top.wangruns.trackstacking.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
public class Like {
    private int likeId;
    private int userId;
    private int reviewId;

    private Integer state;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private Long creator;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private Long updater;

    public Like(int userId, int reviewId) {
        this.userId = userId;
        this.reviewId = reviewId;
    }

}
