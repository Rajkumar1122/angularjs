package com.collaborate.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.collaborate.DAO.ForumDao;
import com.collaborate.Model.Blog;
import com.collaborate.Model.Forum;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;


public class ForumDAOTest {

	static ForumDao forumDAO;
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext annotationConfigAppContext=new AnnotationConfigApplicationContext();
		annotationConfigAppContext.scan("com.collaborate");
		annotationConfigAppContext.refresh();
		forumDAO=(ForumDao)annotationConfigAppContext.getBean("forumDAO");
	}
	
@Test
	
	public void createForumTest()
	{
		
	Forum forum=new Forum();	
	
	forum.setForumId(1000);
	forum.setForumName("Rajkumar");
	forum.setForumContent("niit ");
	 
	forum.setStatus("NA");
	forum.setCreateDate(new java.util.Date());
	forum.setLikes(0);
	
	assertTrue("problem in blog Creation",forumDAO.createForum(forum));
	}
	
	
	
    @Test
	public void approveForumTest1()
	{
		
	Forum forum=new Forum();	
	
	forum.setForumId(1000);
	forum.setForumName("rajkumar");
	forum.setForumContent("");
	 
	forum.setStatus("NA");
	forum.setCreateDate(new java.util.Date());
	forum.setLikes(0);
	
	assertTrue("problem in Approving forum",forumDAO.approveForum(forum));
	}
	
	
	
	
	
	/*
    @Test
	public void approveForumTest()
	{
		
	Forum forum=new Forum();	
	
	forum.setForumId(1000);
	forum.setForumName("Sai Mahesh");
	forum.setForumContent("niit");
	
	forum.setStatus("NA");
	forum.setCreateDate(new java.util.Date());
	forum.setLikes(0);
	
	assertTrue("problem in Approving forum",forumDAO.approveForum(forum));
	}
	*/
	
	
	
	
}