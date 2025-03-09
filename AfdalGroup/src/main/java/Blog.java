
	import java.sql.Timestamp;

	public class Blog {
	    private int id;
	    private String blogTitle;
	    private String blogDescription;
	    private String blogContent;
	    private String blogImage;
	    private Timestamp createdAt;
	    
	    // Getters and Setters
	    public int getId() { return id; }
	    public void setId(int id) { this.id = id; }
	    
	    public String getBlogTitle() { return blogTitle; }
	    public void setBlogTitle(String blogTitle) { this.blogTitle = blogTitle; }
	    
	    public String getBlogDescription() { return blogDescription; }
	    public void setBlogDescription(String blogDescription) { this.blogDescription = blogDescription; }
	    
	    public String getBlogContent() { return blogContent; }
	    public void setBlogContent(String blogContent) { this.blogContent = blogContent; }
	    
	    public String getBlogImage() { return blogImage; }
	    public void setBlogImage(String blogImage) { this.blogImage = blogImage; }
	    
	    public Timestamp getCreatedAt() { return createdAt; }
	    public void setCreatedAt(Timestamp createdAt) { this.createdAt = createdAt; }
	}


