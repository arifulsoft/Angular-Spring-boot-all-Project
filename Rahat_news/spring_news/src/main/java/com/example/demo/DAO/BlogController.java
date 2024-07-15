package com.example.demo.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Blog;
import com.example.demo.Entity.Comments;
import com.example.demo.Entity.Reply;

@RestController
@CrossOrigin("*")
public class BlogController {

	public BlogController() {
		// TODO Auto-generated constructor stub
	}

	@GetMapping("/getAllBlog")
	public List<Blog> getAllBlog() {

		BlogDAO dao = new BlogDAO();
		List<Blog> blog = dao.getBlog();

		return blog;

	}

//	getBlog by id 
	
	
	
	@GetMapping("/getBlogById/{blog_id}")
	public Blog getBlogById(@PathVariable int blog_id) {
		BlogDAO dao = new BlogDAO();
		System.out.println(blog_id);
		Blog blogById = dao.getBlogById(blog_id);

		return blogById;
	}

	
	  public BlogController(BlogDAO blogDAO) {
	    }

//	getBlog by category 
	@GetMapping("/category/{category}")
	public List<Blog>getBlogByCategory(@PathVariable String category) {
		BlogDAO dao = new BlogDAO();
		System.out.println(category);
		List<Blog>blog =  dao.getBlogCategory(category);

		return blog;
	}
	

	
	
	
	
	
	
	
	@GetMapping("/getAllReply")
	public List<Reply> getAllReply() {
		BlogDAO dao = new BlogDAO();
		List<Reply> replyData = dao.getReplyData();
		return replyData;
	}

//	saveComment

	@PostMapping("/saveComments")
	public void saveComment(@RequestBody Comments c) {
		BlogDAO dao = new BlogDAO();
		dao.saveComments(c);
	}

	@GetMapping("/getAllComments")
	public List<Comments> getAllComments() {
		BlogDAO dao = new BlogDAO();
		List<Comments> allComments = dao.getAllComments();
		return allComments;
	}

	@PutMapping("/updateComment")
	public Comments updateComments(@RequestBody Comments c) {
		BlogDAO dao = new BlogDAO();
		Comments updateComments = dao.updateComments(c);

		return updateComments;

	}
	
	
//	saving blog 
	@PostMapping("saveBlog")
	public void saveBlog(@RequestBody Blog b) {
		BlogDAO dao = new BlogDAO();
		dao.saveBlog(b);
	}

//	 comment update

}
