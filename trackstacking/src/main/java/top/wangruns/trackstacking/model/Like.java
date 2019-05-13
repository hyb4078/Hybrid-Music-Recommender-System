package top.wangruns.trackstacking.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Like {
    private int likeId;
    private int userId;
    private int reviewId;

    public Like(int userId, int reviewId) {
        this.userId = userId;
        this.reviewId = reviewId;
    }

}
