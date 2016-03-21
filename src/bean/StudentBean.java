package bean;

import java.io.Serializable;

public class StudentBean implements Serializable, Comparable<StudentBean> {
	private static final long serialVersionUID = 1L;
	
	private String firstName = null;
	private String lastName = null;

	public StudentBean() {
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public int compareTo(StudentBean s1) {
		if(s1.getFirstName().equalsIgnoreCase(this.firstName)
				&& s1.getLastName().equalsIgnoreCase(this.lastName))
			return 0;
		
		return -1;
	}
}
