package com.collaborate.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.collaborate.DAO.BlogCommentDAO;
import com.collaborate.Model.BlogComment;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;


public class BlogCommentDAOTest {

	static BlogCommentDAO blogcommentDAO;
	
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext annotationConfigAppContext=new AnnotationConfigApplicationContext();
		annotationConfigAppContext.scan("com.collaborate");
		annotationConfigAppContext.refresh();
		blogcommentDAO=(BlogCommentDAO)annotationConfigAppContext.getBean("blogcommentDAO");
	
	}
	
	@Test
	public void createBlogCommenttest()
	{
		BlogComment blogcomment=new BlogComment();
		blogcomment.setId(111);
		blogcomment.setUserId(11);
		blogcomment.setComment(" rajkumar");
	blogcomment.setBlogId(1108);
		
		
		assertTrue("Problem in BlogComment Creation",blogcommentDAO.createBlog(blogcomment));
	}
}
	
	