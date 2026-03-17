package student_obj;

public class Student {
	private int id;
	private String name;
	private String email;
	private long phone_no;
	public Student() {
		
	}
	public Student(int id, String name, String email, long phone_no) {
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone_no = phone_no;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	
	
	
}
