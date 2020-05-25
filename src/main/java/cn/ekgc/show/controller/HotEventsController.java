package cn.ekgc.show.controller;

import cn.ekgc.show.controller.Base.BaseController;
import cn.ekgc.show.pojo.entity.HotEvents;
import cn.ekgc.show.pojo.vo.Page;
import cn.ekgc.show.service.HotEventsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller("hotEventsController")
@RequestMapping("/hotE")
public class HotEventsController extends BaseController {
	@Autowired
	private HotEventsService hotEventsService;
	/**
	 * <b>转发至首页面</b>
	 * @return
	 * @throws Exception
	 */
	@GetMapping(value = "/index")
	public String forward()throws Exception{
		return "forward/hot_index";
	}

	/**
	 * <b>分页查询集合</b>
	 * @param pageNum
	 * @param pageSize
	 * @param searchKey
	 * @return
	 * @throws Exception
	 */
	@PostMapping(value = "/list")
	@ResponseBody
	public Page<HotEvents> getListByQuery(Integer pageNum,Integer pageSize,String searchKey)throws Exception{
		Page<HotEvents> hotEventsPage = new Page<HotEvents>(pageNum,pageSize);
		hotEventsPage = hotEventsService.getListByQuery(hotEventsPage,searchKey);
		return hotEventsPage;
	}


	/**
	 * <b>转发到详情页面</b>
	 * @param id
	 * @param map
	 * @return
	 * @throws Exception
	 */
	@GetMapping(value = "/detail")
	public String forwardDetail(Long id, ModelMap map) throws Exception {
		map.put("id", id);
		return "forward/hot_detail";
	}
	/**
	 * <b>根据id查询评论</b>
	 * @param id
	 * @return
	 * @throws Exception
	 */
	@PostMapping(value = "/detail")
	@ResponseBody
	public HotEvents getHotEvents(Long id)throws Exception{
		return hotEventsService.getById(id);
	}
}
