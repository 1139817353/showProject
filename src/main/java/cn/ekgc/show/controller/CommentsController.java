package cn.ekgc.show.controller;

import cn.ekgc.show.dao.CommentsDao;
import cn.ekgc.show.pojo.entity.Comments;
import cn.ekgc.show.pojo.entity.HotEvents;
import cn.ekgc.show.service.CommentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

@Controller("commentsController")
@RequestMapping("/comments")
public class CommentsController extends HotEventsController {
	@Autowired
	private CommentsService commentsService;
	/**
	 * <b>保存评论</b>
	 * @param id
	 * @param content
	 * @return
	 * @throws Exception
	 */
	@PostMapping(value = "/save")
	@ResponseBody
	public boolean save(Long id,String content)throws Exception{
		HotEvents hotEvents = new HotEvents();
		Comments comments = new Comments();
		hotEvents.setId(id);
		comments.setHotEvents(hotEvents);
		comments.setContent(content);
		comments.setCommentDate(new Date());
		return commentsService.save(comments);
	}

	/**
	 * <b>查询集合</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping(value = "/query")
	@ResponseBody
	public List<Comments> queryList(Long id) throws Exception {
		return commentsService.getListByQuery(id);
	}
}
