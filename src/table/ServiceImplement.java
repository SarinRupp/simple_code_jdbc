package table;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import simple_code_jdbc.connectionDB;

public class ServiceImplement{

	private ResultSet emp_rs,dep_rs,locat_rs;
	Connection con;
	
	public ArrayList<employees> employee() {		
		con = new connectionDB().getConnection();
		employees emp ;
		try{
			ArrayList<employees> arr_employee=new ArrayList<employees>();
		Statement emp_sql=con.createStatement();
		emp_rs=emp_sql.executeQuery("SELECT SALARY,DEPARTMENT_ID,MANAGER_ID from EMPLOYEES");
		
		while (emp_rs.next()) {
			emp=new employees();
			emp.setDepartment_id(emp_rs.getInt("DEPARTMENT_ID"));			
			emp.setSalary(emp_rs.getInt("SALARY"));
			emp.setManager_id(emp_rs.getInt("MANAGER_ID"));
			arr_employee.add(emp);						
		}
		return arr_employee;
		}catch(SQLException e){
			e.printStackTrace();
		}
			
		finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;
		
	}
	
	public ArrayList<departments> department() {		
		con = new connectionDB().getConnection();
		departments department ;
		try{
			ArrayList<departments> arr_department=new ArrayList<departments>();
		Statement dep_sql=con.createStatement();
		dep_rs=dep_sql.executeQuery("SELECT * from DEPARTMENTS");
		
		while (dep_rs.next()) {
			department=new departments();
			department.setDepartment_id(dep_rs.getInt("DEPARTMENT_ID"));			
			department.setManager_id(dep_rs.getInt("MANAGER_ID"));
			department.setLocation_id(dep_rs.getInt("LOCATION_ID"));
			arr_department.add(department);						
		}
		return arr_department;
		}catch(SQLException e){
			e.printStackTrace();
		}			
		finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;		
	}
	
	public ArrayList<location> location() {		
		con = new connectionDB().getConnection();
		location location;
		try{
			ArrayList<location> arr_location=new ArrayList<location>();
		Statement	locat_sql=con.createStatement();
		locat_rs=locat_sql.executeQuery("SELECT * from LOCATIONS");
		
		while (locat_rs.next()) {
			location=new location();
			location.setLocation_id(locat_rs.getInt("LOCATION_ID"));
			location.setCity(locat_rs.getString("CITY"));
			location.setCountry_id(locat_rs.getString("COUNTRY_ID"));
			arr_location.add(location);						
		}
		return arr_location;
		}catch(SQLException e){
			e.printStackTrace();
		}			
		finally{
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return null;		
	}
	
}
