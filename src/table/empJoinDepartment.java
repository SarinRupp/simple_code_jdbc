package table;

public class empJoinDepartment {
	private int location_id;
	private int department_id;
	private int manager_id;
	private int salary;
	private String country_id;
	
	public String getCountry_id() {
		return country_id;
	}
	@Override
	public String toString() {
		return "empJoinDepartment [location_id=" + location_id + ", department_id=" + department_id + ", manager_id="
				+ manager_id + ", salary=" + salary + ", country_id=" + country_id + "]";
	}
	public void setCountry_id(String country_id) {
		this.country_id = country_id;
	}
	public int getLocation_id() {
		return location_id;
	}
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	public int getDepartment_id() {
		return department_id;
	}
	public void setDepartment_id(int department_id) {
		this.department_id = department_id;
	}
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
