package StudentCrud.StudentCrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import StudentCrud.StudentCrud.domain.Student;


public interface StudentRepos extends CrudRepository<Student, Long> {

}
