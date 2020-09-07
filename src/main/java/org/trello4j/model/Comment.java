/*
 * @author Damien Cuvillier
 */

package org.trello4j.model;

import java.util.Date;

public class Comment {

	private String id;
	private String text;
	private Member author;
	private Date date;

	public Comment(final Action action) {
		super();
		this.text = action.getData().getText();
		this.date = action.getDate();
		this.id = action.getId();
		this.author = action.getMemberCreator();
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Member getAuthor() {
		return author;
	}

	public void setAuthor(Member author) {
		this.author = author;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
