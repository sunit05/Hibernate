package many_to_many_bi;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Course1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String c_name;
	
	@ManyToMany(mappedBy = "course1s", cascade = CascadeType.ALL)
	private List<Student1> student1s;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getC_name() {
		return c_name;
	}

	public void setC_name(String c_name) {
		this.c_name = c_name;
	}

	public List<Student1> getStudent1s() {
		return student1s;
	}

	public void setStudent1s(List<Student1> student1s) {
		this.student1s = student1s;
	}

	
}
