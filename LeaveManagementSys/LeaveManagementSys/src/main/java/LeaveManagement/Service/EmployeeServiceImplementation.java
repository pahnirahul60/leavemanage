package LeaveManagement.Service;

import org.springframework.stereotype.Service;

import Entity.Employee;
import Entity.Leave;

import java.util.ArrayList;
import java.util.List;

@Service

public class EmployeeServiceImplementation implements EmployeeService {
	private static final List<Employee> employees=new ArrayList<>();
	static {
		// Initialize data
		Leave lesveone=new Leave(1,13052023,15032023,"Casual",3)
		Employee empone=new Employee(1,"Hari","abc@","130622",List.of("casual","emergency"));
		Employee emptwo=new Employee(2,"krishna","def@","130622",List.of("casual","emergency"));
		Employee empthree=new Employee(3,"vishnu","ghi@","130622",List.of("casual","emergency"));
		employess.add(empone);
		employee.add(emptwo);
		employee.add(empthree);}
		
	    @Override
		public List<Employee> getAllEmployee(){
			return employees;}
	    
	    @Override
	    public Employee getEmployeeById(String EmployeeId) {
	    	for (Employee e:employees) {
	    		if(e.getId().equals(EmployeeId))
	    			{return e;}
	    	}
	    	return null;
	    	
	    }
	    @Override
	    
	    public List<Employee> getLeaves(String EmployeeId){
	    	for (Employee e:employees) {
	    		if(e.getId().equals(EmployeeId))
	    			{return e.leaves;}
	    	}
	    	return null;
	    	
	    }
	    public Leave addLeave(String studentId,Leave leaveType) {
	    	
	    }
	    
		}
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
	}
	

}
3