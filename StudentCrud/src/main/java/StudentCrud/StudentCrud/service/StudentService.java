package StudentCrud.StudentCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import StudentCrud.StudentCrud.domain.Student;
import StudentCrud.StudentCrud.repository.StudentRepos;

@Component
public class StudentService {

	@Autowired
	private StudentRepos repo;
	
//	public List<Student> listAll() {
//		return repo.findAll();
//	}
	
	public void save(Student std) {
		repo.save(std);
	}
	
	public Student get(long id) {
		return repo.findById(id).get();
	}
	
	public void delete(long id) {
		repo.deleteById(id);
	}
}
