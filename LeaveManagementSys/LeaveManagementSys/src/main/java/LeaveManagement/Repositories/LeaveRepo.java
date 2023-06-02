package LeaveManagement.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Entity.Leave;

@Repository

public interface LeaveRepo extends JpaRepository<Leave, Long> {
    List<Leave> findAllByEmployeeId(Long empId);
}


