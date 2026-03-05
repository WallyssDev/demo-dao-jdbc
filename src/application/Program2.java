package application;

import java.util.List;
import java.util.Scanner;
import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;


public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentdao = DaoFactory.createDepartmentDao();
		
		System.out.println("\n=== TEST 1: Department findById ===== ");
		
		Department department = departmentdao.findById(3);
		System.out.println(department);
		
		System.out.println("\n=== TEST 2: Department findAll ===== ");
		List<Department> list = departmentdao.findAll();
		
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: Department insert ===== ");
		Department newDepartment = new Department(null, "Music");
		departmentdao.insert(newDepartment);
		System.out.println("Inserted! New id = " + newDepartment.getId());
		
		System.out.println("\n=== TEST 4: Department Update ===== ");
		department = departmentdao.findById(6);
		
		department.setName("Mecanics");
		departmentdao.update(department);
		System.out.println("Update Complete");
		
		System.out.println("\n=== TEST 4: Department Delete ===== ");
		System.out.println("Enter id for delete test: ");
		
		int id = sc.nextInt();
		departmentdao.deleteById(id);
		
		System.out.print("Delete complete.");
		
		
		
		
		
		
		sc.close();

	}

}
