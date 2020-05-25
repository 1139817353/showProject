package cn.ekgc.show.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * <b>评论</b>
 */
public class Comments implements Serializable {
	private static final long serialVersionUID = 1L;
	private Long id;
	private HotEvents hotEvents;
	private Date commentDate;
	private String content;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public HotEvents getHotEvents() {
		return hotEvents;
	}

	public void setHotEvents(HotEvents hotEvents) {
		this.hotEvents = hotEvents;
	}

	public Date getCommentDate() {
		return commentDate;
	}

	public void setCommentDate(Date commentDate) {
		this.commentDate = commentDate;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
