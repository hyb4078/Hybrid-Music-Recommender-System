package top.wangruns.trackstacking.model;

import lombok.*;

@Data
@NoArgsConstructor
public class Collection {
    private int collectionId;
    private int userId;
    private int songId;

    public Collection(int userId, int songId) {
        this.userId = userId;
        this.songId = songId;
    }

}
