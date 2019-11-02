package 이욱_2018204044_과제2;

import java.util.PriorityQueue;

class Employee implements Comparable<Employee> {
	String name;
	int age, salary;

	public Employee(String name, int age, int salary) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee target) {
		if (this.age < target.age) {
			return 1;
		} else if (this.age == target.age) {
			if (this.salary < target.salary) {
				return 1;
			} else if (this.salary == target.salary) {
				return this.name.compareTo(target.name);
			} else
				return -1;
		} else
			return -1;
	}

	@Override
	public String toString() {
		return "name : " +
name + ", Age : " + age + ", salary : " + salary;
	}
}

public class Problem01 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		PriorityQueue<Employee> priorityQueue = new PriorityQueue<>();

		priorityQueue.add(new Employee("John", 31, 100000));
		priorityQueue.add(new Employee("Lisa", 32, 115000));
		priorityQueue.add(new Employee("Chris", 32, 145000));
		priorityQueue.add(new Employee("Angelina", 32, 110000));
		priorityQueue.add(new Employee("Bob", 31, 100000));

		while (!priorityQueue.isEmpty())
			System.out.println(priorityQueue.remove());
	}

}
