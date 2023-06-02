package Entity;

import java.sql.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "leave")
public class Leave{
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long leaveId;

    Date startDate;
    
    Date endDate;
    
    String leaveType;
    
    Long leaveCount;
 
    @ManyToOne
    @JoinColumn(name = "employee_id")
    @JsonBackReference
    private Employee employee;

	public Leave(Long leaveId, Date startDate, Date endDate, String leaveType, Long leaveCount, Employee employee) {
		super();
		this.leaveId = leaveId;
		this.startDate = startDate;
		this.endDate = endDate;
		this.leaveType = leaveType;
		this.leaveCount = leaveCount;
		this.employee = employee;
	}

	public Long getLeaveId() {
		return leaveId;
	}

	public void setLeaveId(Long leaveId) {
		this.leaveId = leaveId;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public String getLeaveType() {
		return leaveType;
	}

	public void setLeaveType(String leaveType) {
		this.leaveType = leaveType;
	}

	public Long getLeaveCount() {
		return leaveCount;
	}

	public void setLeaveCount(Long leaveCount) {
		this.leaveCount = leaveCount;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Leave [leaveId=" + leaveId + ", startDate=" + startDate + ", endDate=" + endDate + ", leaveType="
				+ leaveType + ", leaveCount=" + leaveCount + ", employee=" + employee + "]";
	}
    

}

