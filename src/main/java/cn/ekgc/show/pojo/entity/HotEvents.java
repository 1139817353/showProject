package cn.ekgc.show.pojo.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * <b>热搜事件</b>
 */
public class HotEvents implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private String keyWord;
	private String hotContent;
	private Long searchSum;
	private Date createDate;
	private List<Comments> commentsList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public String getHotContent() {
		return hotContent;
	}

	public void setHotContent(String hotContent) {
		this.hotContent = hotContent;
	}

	public Long getSearchSum() {
		return searchSum;
	}

	public void setSearchSum(Long searchSum) {
		this.searchSum = searchSum;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public List<Comments> getCommentsList() {
		return commentsList;
	}

	public void setCommentsList(List<Comments> commentsList) {
		this.commentsList = commentsList;
	}
}
