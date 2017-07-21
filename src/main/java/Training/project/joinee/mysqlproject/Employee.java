package Training.project.joinee.mysqlproject;

public class Employee {
	int id;
	String firstname;
	String lastname;
	String company;
	
	
	public Employee(){
	}
	
	public Employee(int id,String firstname,String lastname,String company) {
		this.id = id;
		this.firstname = firstname;
		this.lastname=lastname;
		this.company = company;
	}
	
	public long getid() {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getfirstname() {
		return firstname;
	}
	public void setfirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getlastname() {
		return lastname;
	}
	public void setlastname(String lastname) {
		this.lastname = lastname;
	}
	public String getcompany() {
		return company;
	}
	public void setcompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee[id=" +id +" firstname=" + firstname + ", lastname=" + lastname + " ,company=" + company 
				+ "]";
	}
	
	

}
