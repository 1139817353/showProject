package cn.ekgc.show.dao;

import cn.ekgc.show.pojo.entity.HotEvents;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HotEventsDao {
	/**
	 * <b>分页查询集合</b>
	 * @param hotEvents
	 * @return
	 * @throws Exception
	 */
	List<HotEvents> findHotEventsList(HotEvents hotEvents)throws Exception;
}
