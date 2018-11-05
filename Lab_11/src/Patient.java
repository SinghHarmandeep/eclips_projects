
public class Patient extends Person {
	private String id;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
		
	public String toString() {
		return super.toString() + "'s id is: " + id ;
	}
	
	
}
