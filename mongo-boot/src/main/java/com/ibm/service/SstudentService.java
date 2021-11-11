package com.ibm.service;

import java.util.List;

import com.ibm.model.Student;

public interface SstudentService {
	
	void save(Student s);
	
	Student fetch(int rollNo);
	
	List<Student> fetchAll();
}
