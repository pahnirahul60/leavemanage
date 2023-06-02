package LeaveManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

import Entity.Leave;
import LeaveManagement.Service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    
    @GetMapping("employees/{employeeId}/leaves")
    public List<Leave> LeaveForEmployee(@PathVariable String EmployeeId){
    	return employeeService.getLeaves(EmployeeId);
    	
    }
    @GetMapping("employees/{employeeId}/leaves/{leaveId)")
    public List<Leave> LeaveForEmployee(@PathVariable String EmployeeId,@PathVariable String LeaveId){
    	return employeeService.getLeaves(StringId,EmployeeId);
    	
    }
    @PostMapping("employees/{employeeId}/leaves")
    public ResponseEntity addLeave(@PathVariable String EmployeeId,@PathVariable String LeaveId) {
    	Leave leave=employeeService.addCourse(EmployeeId,newLeave){
    		if(leave==null) {
    			ResponseEntity.noContent.build();
    			
    		}
    		URI loc=UriComponentBuilder.fromPath("/{id}".buildAndExpand(leave.getLeaveId().toUri();
    		return ResponseEntity.created(loc).build();
    }}
}
    
    

}