package exeriments;
import java.util.*;

public class Employee {
String name;
int employeeid;
float salary;
Scanner sc=new Scanner(System.in);

public Employee() {
	System.out.println("Enter the name,id and salary");
	String n=sc.next();
	int m=sc.nextInt();
	float f=sc.nextFloat();
	name=n;
	employeeid=m;
	salary=f;
}
public void show_details(){
	System.out.println(name);
	System.out.println(employeeid);
	System.out.println(salary);
}
public float increase_salary() {
	System.out.print("Enter the percentage increase");
	float g=sc.nextFloat();
	float percentage=g;
	System.out.println("The salary increases by percentage: "+percentage);
	float result= (percentage/100)*salary;
	System.out.println("The increase in salary comes out as" +result);
	float new_salary= salary+result;
	System.out.println("Your new salary will be: "+new_salary);
	return new_salary;	
}
}

