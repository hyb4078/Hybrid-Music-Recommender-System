package top.wangruns.trackstacking.dao;

import top.wangruns.trackstacking.model.Review;
import top.wangruns.trackstacking.model.Song;
import top.wangruns.trackstacking.model.User;

import java.util.List;

public interface SearchDao {

	/**
	 * 根据关键字模糊查询歌曲信息
	 * @param keyword
	 * 关键字
	 * @return
	 * 若查询不到，返回empty
	 */
	List<Song> selectSongLikeKeyword(String keyword);

	/**
	 * 根据关键字模糊查询评论信息
	 * @param keyword
	 * 评论信息
	 * @return
	 * 若查询不到，返回empty
	 */
	List<Review> selectReviewLikeKeyword(String keyword);

	/**
	 * 根据关键字模糊查询用户信息
	 * @param keyword
	 * 用户名/用户邮箱
	 * @param userId
	 * @return
	 * 若查询不到，返回empty
	 */
	List<User> selectUserLikeKeyword(String keyword, Integer userId);

}
