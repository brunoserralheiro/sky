/**
 * 
 */
package net.sky;

/**
 * @author Bruno Serralheiro
 *
 */
public class Customer {

	long id = 0;
	String name = "";
	Classification classification;
	
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Classification getClassification() {
		return classification;
	}



	public void setClassification(Classification classification) {
		this.classification = classification;
	}



	
	

}
