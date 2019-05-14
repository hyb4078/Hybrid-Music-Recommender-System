package top.wangruns.trackstacking.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Song {
    private int songId;
    private String songName;
    private String songAddress;
    private String songCoverAddress;
    private String songType;
    private int songLength;
    private String lyricName;
    private String lyricAddress;
    private int trendingCoefficient;
    private boolean whetherCollected;

    public Song(String songName, String songAddress) {
        this.songName = songName;
        this.songAddress = songAddress;
    }

    public Song(String songName, String songAddress, String lyricName, String lyricAddress) {
        this.songName = songName;
        this.songAddress = songAddress;
        this.lyricName = lyricName;
        this.lyricAddress = lyricAddress;
    }

}
