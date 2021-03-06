package com.collaborate.Test;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.collaborate.DAO.ForumDao;
import com.collaborate.Model.Forum;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
public class ForumDAOTest {
	static ForumDao forumDAO;
	static Forum forum;
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext annotationConfigAppContext=new AnnotationConfigApplicationContext();
		annotationConfigAppContext.scan("com.collaborate");
		annotationConfigAppContext.refresh();
		forumDAO=(ForumDao)annotationConfigAppContext.getBean("forumDAO");
	    forum=(Forum)annotationConfigAppContext.getBean("forum");
	}
	
	@Test
	public void createForumtest()
	{
		//Forum forum=new Forum();        
		forum.setForumId(111);
		forum.setForumName("Raju");
		forum.setForumContent("Rajkumar");
		
		forum.setCreateDate(new java.util.Date());
		forum.setStatus("NA");
		
		assertTrue("Problem in Forum Creation",forumDAO.createForum(forum));
	
	}
	
	
	@Test
	public void editForumTest()
	{
	Forum forum = new Forum();
	forum.setForumId(111);
	forum.setForumName("Raju");
	forum.setForumContent("Rajkumar");
	forum.setCreateDate(new java.util.Date());
	forum.setUserId(1001);
	forum.setStatus("NA");
	assertTrue("Problem in approving forum",forumDAO.editForum(forum.getForumId()));	
	}
	
	
	@Test
	public void deleteForumTest()
	{
	Forum forum = new Forum();
	forum.setForumId(111);
	assertTrue("Problem in approving Forum",forumDAO.deleteForum(forum.getForumId()));	
	}
	
	@Ignore
	@Test
	public void getForumTest()
	{
	Forum forum = new Forum();
	forum.setForumId(111);
	}

	@Test
	public void approveForumTest()
	{
		Forum forum=new Forum();
		forum.setForumId(111);
		forum.setForumName("Raju");
		forum.setForumContent("Rajkumar");
		forum.setCreateDate(new java.util.Date());
		forum.setStatus("NA");
		assertTrue("Problem in approving Forum",forumDAO.approveForum(forum));	
	}
}