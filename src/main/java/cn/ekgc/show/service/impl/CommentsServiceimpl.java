package cn.ekgc.show.service.impl;

import cn.ekgc.show.dao.CommentsDao;
import cn.ekgc.show.pojo.entity.Comments;
import cn.ekgc.show.pojo.entity.HotEvents;
import cn.ekgc.show.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("commentsService")
@Transactional
public class CommentsServiceimpl implements CommentsService {
	@Autowired
	private CommentsDao commentsDao;

	/**
	 * <b>保存评论</b>
	 * @param comments
	 * @return
	 * @throws Exception
	 */
	public boolean save(Comments comments) throws Exception {
		int index = commentsDao.save(comments);
		if (index > 0){
			return true;
		}
		return false;
	}

	/**
	 * <b>查询评论列表</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public List<Comments> getListByQuery(Long id) throws Exception {
		HotEvents hotEvents = new HotEvents();
		hotEvents.setId(id);
		Comments comments = new Comments();
		comments.setHotEvents(hotEvents);
		return commentsDao.findListByQuery(comments);
	}



}
