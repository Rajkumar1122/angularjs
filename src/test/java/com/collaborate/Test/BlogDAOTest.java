package com.collaborate.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.collaborate.DAO.BlogDao;
import com.collaborate.Model.Blog;
import static org.junit.Assert.*;
import javax.transaction.Transactional;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
public class BlogDAOTest {
	static BlogDao blogDAO;
	static Blog blog;
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext annotationConfigAppContext=new AnnotationConfigApplicationContext();
		annotationConfigAppContext.scan("com.collaborate");
		annotationConfigAppContext.refresh();
		blogDAO=(BlogDao)annotationConfigAppContext.getBean("blogDAO");
	    blog=(Blog)annotationConfigAppContext.getBean("blog");
	}
	
	@Test
	public void createBlogtest()
	{
		//Blog blog=new Blog();
		blog.setBlogId(111);
		blog.setBlogName("Raju");
		blog.setBlogContent("Rajkumar");
		
		blog.setCreateDate(new java.util.Date());
		blog.setStatus("NA");
		blog.setLikes(0);
		assertTrue("Problem in Blog Creation",blogDAO.createBlog(blog));
	
	}
	
	@Ignore
	@Test
	public void editBlogTest()
	{
	Blog blog = new Blog();
	blog.setBlogId(111);
	blog.setBlogName("Raju");
	blog.setBlogContent("Rajkumar");
	blog.setCreateDate(new java.util.Date());
	blog.setUsername("naveen");
	blog.setStatus("NA");
	blog.setLikes(0);
	assertTrue("Problem in approving Blog",blogDAO.editBlog(blog.getBlogId()));	
	}
	
	@Ignore
	@Test
	public void deleteBlogTest()
	{
	Blog blog = new Blog();
	blog.setBlogId(111);
	assertTrue("Problem in approving Blog",blogDAO.deleteBlog(blog.getBlogId()));	
	}
	
	@Ignore
	@Test
	public void getBlogTest()
	{
	Blog blog = new Blog();
	blog.setBlogId(111);
	}
	@Ignore
	@Test
	public void approveBlogTest()
	{
		Blog blog=new Blog();
		blog.setBlogId(111);
		blog.setBlogName("Raju");
		blog.setBlogContent("Rajkumar");
		blog.setCreateDate(new java.util.Date());
		blog.setStatus("NA");
		blog.setLikes(0);
		assertTrue("Problem in approving Blog",blogDAO.approveBlog(blog));	
	}
}