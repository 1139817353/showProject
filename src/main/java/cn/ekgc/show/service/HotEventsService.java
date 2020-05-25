package cn.ekgc.show.service;

import cn.ekgc.show.pojo.entity.HotEvents;
import cn.ekgc.show.pojo.vo.Page;

public interface HotEventsService {
	/**
	 * <b>分页查询集合</b>
	 * @param hotEventsPage
	 * @param searchKey
	 * @return
	 * @throws Exception
	 */
	Page<HotEvents> getListByQuery(Page<HotEvents> hotEventsPage, String searchKey)throws Exception;

	/**
	 * <b>根据id查询评论信息</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	HotEvents getById(Long id)throws Exception;
}
