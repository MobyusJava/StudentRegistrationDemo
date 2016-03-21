package dao;

import java.util.ArrayList;
import java.util.List;

import bean.StudentBean;

/**
 * Simple Data Access Object containing the stored data
 * @author Stijn
 *
 */
public class StudentDao {
	private List<StudentBean> students;

	public StudentDao() {
		students = new ArrayList<StudentBean>();
	}

	public List<StudentBean> getStudents() {
		return students;
	}

	public void setStudents(List<StudentBean> students) {
		this.students = students;
	}
}
