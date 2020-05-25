package cn.ekgc.show.dao;

import cn.ekgc.show.pojo.entity.Comments;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentsDao {
	/**
	 * <b>保存评论</b>
	 * @param comments
	 * @return
	 * @throws Exception
	 */
	 int save(Comments comments) throws Exception;

	/**
	 * <b>查询评论列表</b>
	 * @param comments
	 * @return
	 * @throws Exception
	 */
	List<Comments> findListByQuery(Comments comments)throws Exception;
}
