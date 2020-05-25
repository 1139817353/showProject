package cn.ekgc.show.pojo.vo;

import com.github.pagehelper.PageInfo;

import java.io.Serializable;
import java.util.List;

public class Page<E> implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer pageNum;
	private Integer pageSize;
	private List<E> list;
	private Long totalCount;
	private Long totalPage;

	public Page() {}
	public Page(Integer pageNum, Integer pageSize) {
		if (pageNum != null && pageNum > 0) {
			this.pageNum = pageNum;
		} else {
			this.pageNum = 1;
		}

		if (pageSize != null && pageSize > 0) {
			this.pageSize = pageSize;
		} else {
			this.pageSize = 10;
		}
	}

	public Integer getPageNum() {
		return pageNum;
	}

	public void setPageNum(Integer pageNum) {
		this.pageNum = pageNum;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public List<E> getList() {
		return list;
	}

	public void setList(List<E> list) {
		this.list = list;
	}

	public Long getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(Long totalCount) {
		this.totalCount = totalCount;
	}

	public Long getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Long totalPage) {
		this.totalPage = totalPage;
	}

	public void parseToSystemPage(PageInfo<E> pageInfo) {
		this.list = pageInfo.getList();
		this.totalCount = pageInfo.getTotal();
		this.totalPage = (long) pageInfo.getPages();
	}
}
