package top.wangruns.trackstacking.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

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

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private Long creator;

    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    private Long updater;

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
