package Entity;

import java.sql.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="employee")
public class Employee {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String email;
	    
	    private Date joiningDate;

	    @OneToMany(mappedBy = "employee")
	    @JsonManagedReference
		private List<Leave> leaves;
	    

		public Employee(Long id, String name, String email, Date joiningDate, List<Leave> leaves) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.joiningDate = joiningDate;
			this.leaves = leaves;
		}

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public Date getJoiningDate() {
			return joiningDate;
		}

		public void setJoiningDate(Date joiningDate) {
			this.joiningDate = joiningDate;
		}

		public List<Leave> getLeaves() {
			return leaves;
		}

		public void setLeaves(List<Leave> leaves) {
			this.leaves = leaves;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", joiningDate=" + joiningDate
					+ ", leaves=" + leaves + "]";
		}
	    



	}

 

