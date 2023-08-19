package StudentCrud.StudentCrud.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;	
	@Column(name = "name")
    private String name;
    private String courseName;
    private int fees;
	public Student() {
		super();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public Student(Long id, String name, String courseName, int fees) {
		super();
		this.id = id;
		this.name = name;
		this.courseName = courseName;
		this.fees = fees;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", courseName=" + courseName + ", fees=" + fees + "]";
	}
    

}
