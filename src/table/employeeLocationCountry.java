package table;

import java.util.ArrayList;

public class employeeLocationCountry {
	
	public static void main(String[] args) {
		ServiceImplement service = new ServiceImplement();
		ArrayList<empJoinDepartment> lists=new ArrayList<empJoinDepartment>();
				
		/*employees table natural with dempartment table*/ 
		for(employees e : service.employee()){
			for(departments d : service.department()){		
				if(e.getManager_id() == d.getManager_id() 
						&& e.getDepartment_id() == d.getDepartment_id() ){
					empJoinDepartment join = new empJoinDepartment();
					join.setManager_id(e.getManager_id());
					join.setDepartment_id(e.getDepartment_id());
					join.setLocation_id(d.getLocation_id());
					join.setSalary(e.getSalary());					
					lists.add(join);					
				}
			}
		}
		
		/*natural with location table*/
		for(location l : service.location()){
			for(empJoinDepartment ed : lists){				 										
				if(l.getLocation_id() == ed.getLocation_id() ){				
						ed.setCountry_id(l.getCountry_id());
				}
			}
		}
	
		
	}
}
