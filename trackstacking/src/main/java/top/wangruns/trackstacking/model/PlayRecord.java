package top.wangruns.trackstacking.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PlayRecord {
    private int playId;
    private int userId;
    private int songId;

    public PlayRecord(int userId, int songId) {
        this.userId = userId;
        this.songId = songId;
    }

}
