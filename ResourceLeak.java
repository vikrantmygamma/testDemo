public class ResourceLeak {
private int x ,y ,z;
	 public static void main(String args[]) throws Exception{  
	     System.out.println("Hello");  
	    }
	private boolean active;
	
	// EMB-ISSUE: CodeIssueNames.GETTERS_AND_SETTERS_SHOULD_ACCESS_THE_EXPECTED_FIELDS 
	public void setX(int val) {
		//this is for test
		this.y = val;
	}

	// EMB-ISSUE: CodeIssueNames.GETTERS_AND_SETTERS_SHOULD_ACCESS_THE_EXPECTED_FIELDS 
	public int getY() {
		return this.x;
	}

	// EMB-ISSUE: CodeIssueNames.GETTERS_AND_SETTERS_SHOULD_ACCESS_THE_EXPECTED_FIELDS
	  public boolean isActive()
		  {
		    return x;
		  }

	  		// EMB-ISSUE: CodeIssueNames.GETTERS_AND_SETTERS_SHOULD_ACCESS_THE_EXPECTED_FIELDS
		  public void setActive(boolean b)
		  {
		    this.y = b;
		  }
		  
		  // EMB-ISSUE: CodeIssueNames.GETTERS_AND_SETTERS_SHOULD_ACCESS_THE_EXPECTED_FIELDS/no-detect
		  public int getName() {	
			  System.out.println(" ");
			  return this.x;
			}
		  
			// EMB-ISSUE: CodeIssueNames.GETTERS_AND_SETTERS_SHOULD_ACCESS_THE_EXPECTED_FIELDS/no-detect
		  	public void setName(int val) {
			    System.out.println(" ");
				this.y = val;
			}
		  	
		 // EMB-ISSUE: CodeIssueNames.GETTERS_AND_SETTERS_SHOULD_ACCESS_THE_EXPECTED_FIELDS/no-detect 
			public void setZ(int val) {
				this.z = val;
			}
			
			public int getZ(int val) {
				 // EMB-ISSUE: CodeIssueNames.GETTERS_AND_SETTERS_SHOULD_ACCESS_THE_EXPECTED_FIELDS/no-detect 

				return x;
			}
			
}
