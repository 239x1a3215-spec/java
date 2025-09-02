package day1;

public class Employee {
		int id;
	    String name;

	    public Employee(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }

	    public void display() {
	        System.out.println("ID: " + id);
	        System.out.println("Name: " + name);
	    }

	    public static void main(String[] args) {
	        Employee emp = new Employee(1, "Rahul");
	        emp.display();
	    }
	}



