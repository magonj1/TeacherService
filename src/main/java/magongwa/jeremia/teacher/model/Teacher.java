package magongwa.jeremia.teacher.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Teacher")
public class Teacher {
	
	@Id
	private ObjectId teacher_id;
	private String teacher_No;
	private String firstName;
	private String LastName;
	
	
	
	public Teacher(String teacher_No, String firstName, String lastName) {
		super();
		this.teacher_No = teacher_No;
		this.firstName = firstName;
		LastName = lastName;
	}
	
	public ObjectId getTeacher_id() {
		return teacher_id;
	}
	public void setTeacher_id(ObjectId teacher_id) {
		this.teacher_id = teacher_id;
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
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}

	@Override
	public String toString() {
		return "Teacher [teacher_id=" + teacher_id + ", teacher_No=" + teacher_No + ", firstName=" + firstName
				+ ", LastName=" + LastName + "]";
	}
	
	

}