import java.util.Scanner;
    public class Employee
    {
        int e_no;
        int  e_salary;
        int allowances;
        int deduction;
        String e_name;
    
        public void getdetails()
        {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter the Employee name");
            e_name=input.nextLine();
    
            System.out.println("Enter the Employee number");
            e_no=input.nextInt();
    
            System.out.println("Enter the Employee salary");
            e_salary=input.nextInt();
    
            System.out.println("Enter the Employee Allowances");
            allowances=input.nextInt();
    
            System.out.println("Enter the Employee Deductions");
            deduction=input.nextInt();
    
           
        } 
    public int CalculateSalary()
        {
            int salary=e_salary+allowances+deduction;
            return salary;
    
        }
        
    
        public static void main(String[] args)
        {
        int n=1;
        while(n<=2)
    {       
            
            Employee obj=new Employee();
            obj.getdetails();
            int net_salary=obj.CalculateSalary();
            System.out.println("Net Salary is  : "+net_salary);
    n=n+1;
                   
    }
    
    
}  
}
