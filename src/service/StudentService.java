package service;

import java.util.List;

import bean.StudentBean;
import dao.StudentDao;

public class StudentService {
	private StudentDao dao;
	public StudentService(){
		dao = new StudentDao();
	}
	public List<StudentBean> getRegister(){
		return dao.getStudents();
	}
	
	public void registerStudent(StudentBean student) throws Exception{
		for(StudentBean s : dao.getStudents()){
			if(s.compareTo(student)==0){
				throw new Exception("Duplicate Student");
			}
		}
		dao.getStudents().add(student);
	}
}
