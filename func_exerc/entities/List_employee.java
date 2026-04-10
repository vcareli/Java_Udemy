package entities;

import java.util.List;
import java.util.ArrayList;

public class List_employee {
	private List<Employee> employee = new ArrayList<>();

	public boolean setEmployee(Employee f) {
		if (verify_id(f.getId())) {
			return false;	
		}
		employee.add(f);
		return true;
	}

	public boolean verify_id(int id) {
		for (Employee f : employee) {
			if (f.getId() == id) {
				return true;
			}
		}
		return false;
	}

	public boolean changer_salaire(int id, int percent) {
		for (Employee f : employee) {
			if (f.getId() == id) {
				
				f.setSalaire(percent);
				return true;
			}
		}
		return false;
	}

	public List<Employee> getEmployee() {
		return employee;
	}
}
