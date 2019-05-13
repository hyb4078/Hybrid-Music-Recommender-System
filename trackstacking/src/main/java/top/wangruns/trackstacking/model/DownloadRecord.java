package top.wangruns.trackstacking.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
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
