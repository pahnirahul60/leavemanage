package LeaveManagement.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class LeaveController {



    @PostMapping("/leave/apply/{empId}")
    public ResponseEntity enterNewLeaveRequest(@RequestBody LeaveRequest leaveRequest, @PathVariable Long empId) {
        try {
            return new ResponseEntity<>(leaveServicesFactory.getService(leaveRequest.getLeaveType().trim().toLowerCase()).enterNewLeaveRequest(leaveRequest, empId), HttpStatus.OK);
        } catch (Exception e) {
            log.error("Exception in applying leave of an employee with empId: " + empId + "\nException: " + e.toString());
            CustomMessageMap customMessageMap=new CustomMessageMap("Exception occurred",e.getMessage());
            return new ResponseEntity(customMessageMap.getMessageMap(),HttpStatus.BAD_REQUEST);
        }

    }

    @GetMapping("/employee/{id}/leavebalance")
    public ResponseEntity getAllLeaves(@PathVariable Long id) {
        try {
            return new ResponseEntity("Out Of Office (OOO) Leave Balance= " + leaveServicesFactory.getService("ooo").getLeaveBalance(id), HttpStatus.OK);
        } catch (Exception e) {
            log.error("Exception in getting the leave balance of an employee with id: " + id + "\nException: " + e.toString());
            CustomMessageMap customMessageMap=new CustomMessageMap("Exception occurred",e.getMessage());
            return new ResponseEntity(customMessageMap.getMessageMap(),HttpStatus.BAD_REQUEST);
        }

    }
}


