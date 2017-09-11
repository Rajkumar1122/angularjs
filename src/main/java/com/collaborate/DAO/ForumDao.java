package com.collaborate.DAO;

import java.util.List;

import com.collaborate.Model.Forum;

public interface ForumDao {

	public boolean createForum(Forum forum);
	public Forum getForumdetails(int forumId);
	public List<Forum> getForum();
	public boolean approveForum(Forum forum);
	public boolean editForum(int forumId);
	public boolean deleteForum(int forumId);
}