package magongwa.jeremia.teacher.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Teacher")
public class Teacher {
	
	@Id
	private String teacherId;
	private String teacher_No;
	private String firstName;
	private String lastName;
	
	
	
	public Teacher(String teacher_No, String firstName, String lastName) {
		super();
		this.teacher_No = teacher_No;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getTeacher_id() {
		return teacherId;
	}
	public void setTeacher_id(String teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacher_No() {
		return teacher_No;
	}
	public void setTeacher_No(String teacher_No) {
		this.teacher_No = teacher_No;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		lastName = lastName;
	}

	@Override
	public String toString() {
		return "Teacher [teacher_id=" + teacherId + ", teacher_No=" + teacher_No + ", firstName=" + firstName
				+ ", LastName=" + lastName + "]";
	}
	
	

}