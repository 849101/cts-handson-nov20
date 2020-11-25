package Class2_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDao {
	@Autowired
	private DBConfig db; 
	public void store() {
		System.out.println("store() method in DAO layer");
		db.toString();
		db.print();
	}
}
