package LeaveManagement.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Entity.Employee;
import Entity.Leave;
import LeaveManagement.Repositories.EmployeeRepo;

	@Service
	public interface EmployeeService {

	    public List<Employee> getAllEmployee();
	    public Employee getEmployeeById(String EmployeeId);
	    public List<Employee> getLeaves(String EmployeeId);
	    public Leave addLeave(String studentId,Leave leaveType);
	    
	    
	    
	    

}