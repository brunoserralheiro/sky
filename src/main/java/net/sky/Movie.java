package net.sky;

/**
 * @author Bruno Serralheiro 
 * on 25/08/2016. 
 */
	
public class Movie {
	

    public long id = 0;
    public String title = "";
    public String category = "";
    public Classification recommentedClassification ;
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Classification getRecommentedClassification() {
		return recommentedClassification;
	}
	public void setRecommentedClassification(Classification recommentedClassification) {
		this.recommentedClassification = recommentedClassification;
	}
	
    
	

    
   
}



	
	
