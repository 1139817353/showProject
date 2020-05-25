package cn.ekgc.show.service;

import cn.ekgc.show.pojo.entity.Comments;

import java.util.List;

public interface CommentsService {
	/**
	 * <b>保存评论</b>
	 * @param comments
	 * @return
	 * @throws Exception
	 */
	boolean save(Comments comments)throws Exception;


	List<Comments> getListByQuery(Long id)throws Exception;
}
