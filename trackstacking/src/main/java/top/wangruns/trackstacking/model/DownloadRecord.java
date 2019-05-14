package top.wangruns.trackstacking.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class DownloadRecord {
    private int downloadId;
    private int userId;
    private int songId;

    public DownloadRecord(int userId, int songId) {
        this.userId = userId;
        this.songId = songId;
    }

}
