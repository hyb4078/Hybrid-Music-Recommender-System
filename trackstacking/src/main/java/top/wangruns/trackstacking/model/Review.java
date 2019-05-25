package top.wangruns.trackstacking.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * 评论 实体
 */
@Data
@NoArgsConstructor
public class Review {
    private int reviewId;
    private int userId;
    private int songId;

    // 评论内容
    private String reviewContent;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private Long creator;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private Long updater;
    //评论点赞数目
    private int likeCoefficient;
    //发表该评论的用户昵称
    private String userName;
    //当前用户是否对该评论点赞
    private Boolean whetherLiked;

    public Review(int userId, int songId, String reviewContent) {
        this.userId = userId;
        this.songId = songId;
        this.reviewContent = reviewContent;
    }

}
