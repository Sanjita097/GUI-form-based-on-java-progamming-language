package javacoursework;

public class Tutor extends Teacher
{
    //declaring variable which is instance//
    private double salary;
    private String specialization;
    private String academicQualifications;
    private int performanceIndex;
    private boolean isCertified;
    
    //Constructor//
    public Tutor(int teacherId,String teacherName, String address,String workingType, String employmentStatus,
    int workingHours,double salary,String specialization,String academicQualifications, int performanceIndex)
    {
        super(teacherId,teacherName,address,workingType,employmentStatus);
        super.setWorkingHours(workingHours);
        this.salary = salary;
        this.specialization = specialization;
        this.academicQualifications = academicQualifications;
        this.performanceIndex = performanceIndex;
        this. isCertified = false;
    }
    //getter method
    public double getsalary()
    {
        return salary;
    }
    //setter method
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    //gretter method
    public String getspecialization()
    {
        return specialization;
    }
    public String getAcademicQualifications()
    {
        return academicQualifications;
    }
    public int getPerformanceIndex()
    {
        return performanceIndex;
    }
    public boolean getIsCertified()
    {
        return isCertified;
    }
    public void Calculate(double newSalary, int newPerformanceIndex){
        if (!isCertified){
            double appraisalPercantage = 0;
            if (newPerformanceIndex >= 5 && getWorkingHours() >= 20){
               
               if (newPerformanceIndex > 5 && getWorkingHours() <=7)
               {
                   appraisalPercantage= 0.05;

               }
               else if (newPerformanceIndex >=8 && newPerformanceIndex <=9)
               {
                    appraisalPercantage= 0.10;
               }
               else{
                   appraisalPercantage = 0.2;
               }
            } 
        
            double appraisalAmount = newSalary *  appraisalPercantage;

            this.salary = newSalary + appraisalAmount;  
             
            this.isCertified = true;
            System.out.println("Salary approved with appraisal\nNew Salary: " + salary);
        }
        else 
        {
            System.out.println("Salary cannot be approved. Tutor has not been certified");
        }
        
    }
    //remove//
      public void removeTutor() 
    {
        if (!isCertified == true) 
        {
            this.salary = 0.0;
            this.specialization = "";
            this.academicQualifications = "";
            this.performanceIndex = 0;
            this.isCertified = false;
            System.out.println("Tutor removed successfully.");
        } else 
        {
            System.out.println("Tutor removed successfully.");
        }
    }
    //display//
    public void display()
    {
          if (isCertified) 
          {
              
              System.out.println("Tutor Details:");
              System.out.println("Salary: " + salary);
              System.out.println("Specialization: " + specialization);
              System.out.println("Academic Qualifications: " + academicQualifications);
              System.out.println("Performance Index: " + performanceIndex);
              System.out.println("Certified: " + isCertified);
              
              
          }
          
          
    }
}
