import java.util.ArrayList;
class Manager extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int incentive = 5000;
        return salary+incentive;       
    }
}

class Labour extends Assignment2Q2 {
    @Override
    public int getSalary(int salary) {
        int overtime = 500;
        return salary+overtime;
    }
}

public class Assignment2Q2 {
    static int salary = 10000;
    public int getSalary(int salary){
    	return salary;
    }
    
    public static void main(String[] args) {
    	Assignment2Q2 obj = new Assignment2Q2();
    	Manager m1 = new Manager();
    	int MS=m1.getSalary(salary);
    	Labour l1 = new Labour();
    	int LS = l1.getSalary(salary);
    	ArrayList<Integer> employeeSalaries = new ArrayList<Integer>();
    	employeeSalaries.add(MS);
    	employeeSalaries.add(LS);
    	System.out.println(obj.totalEmployeesSalary(employeeSalaries));	
    }
    public int totalEmployeesSalary(ArrayList<Integer> employeeSalaries)
    {
    	int sum =0;
    	for(int i : employeeSalaries)
    	{
    		sum= sum+i;
    	}
    	return sum;
    }
    
}

