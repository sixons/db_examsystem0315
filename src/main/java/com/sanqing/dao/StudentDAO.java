package com.sanqing.dao;

import java.util.List;

import com.sanqing.po.Student;

public interface StudentDAO {
	Student findByStudentID(String studentID);//��ѯ����������ѧ��ID��ѯ
	void updateStudent(Student student);//����ѧ����Ϣ
	List<Student> findByStudentName(String studentName);//����ѧ����������ѧ��
	List<Student> findByStudentClass(String sclass);//���ݰ༶����ѧ��
}
