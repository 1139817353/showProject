package cn.ekgc.show.service.impl;

import cn.ekgc.show.dao.HotEventsDao;
import cn.ekgc.show.pojo.entity.HotEvents;
import cn.ekgc.show.pojo.vo.Page;
import cn.ekgc.show.service.HotEventsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("hotEventsService")
@Transactional
public class HotEventsServiceimpl implements HotEventsService {
	@Autowired
	private HotEventsDao hotEventsDao;
	/**
	 * <b>分页查询集合</b>
	 * @param hotEventsPage
	 * @param searchKey
	 * @return
	 * @throws Exception
	 */
	public Page<HotEvents> getListByQuery(Page<HotEvents> hotEventsPage, String searchKey) throws Exception {
		HotEvents hotEvents = new HotEvents();
		if (searchKey != null && !"".equals(searchKey.trim())){
			hotEvents.setKeyWord(searchKey);
		}
		PageHelper.startPage(hotEventsPage.getPageNum(),hotEventsPage.getPageSize());
		List<HotEvents> events = hotEventsDao.findHotEventsList(hotEvents);
		hotEventsPage.parseToSystemPage(new PageInfo<HotEvents>(events));
		return hotEventsPage;
	}

	/**
	 * <b>根据id查询评论信息</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	public HotEvents getById(Long id) throws Exception {
		HotEvents hotEvents = new HotEvents();
		hotEvents.setId(id);
		List<HotEvents> events = hotEventsDao.findHotEventsList(hotEvents);
		if(events != null){
			return events.get(0);
		}
		return null;
	}
}
