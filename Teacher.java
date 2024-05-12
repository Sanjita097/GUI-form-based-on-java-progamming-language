package javacoursework;

public class Teacher
{
    //declaration of instance variable
    private int teacherId;
    private String teacherName;
    private String address;
    private String workingType;
    private String employmentStatus;
    private int workingHours;
    
    //constructor//
    public Teacher(int teacherId,String teacherName, String address,String workingType, String employmentStatus)
    {
        this.teacherId = teacherId;
        this.teacherName = teacherName;
        this.address = address;
        this.workingType = workingType;
        this.employmentStatus = employmentStatus;
        
    }
    
    public int getTeacherID()
    {
        return teacherId;
    }
    public String getTeacherName()
    {
        return teacherName;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public String getWorkingType()
    {
        return workingType;
    }
    
    public String getEmploymentStatus()
    {
        return employmentStatus;
    }
    public int getWorkingHours()
    {
        return workingHours;
    }
    public void setWorkingHours(int workingHours)
    {
        this.workingHours = workingHours;
    }
    //display methods
    public void display(){
        System.out.println("TeacherId:"+teacherId);
        System.out.println("Teachername :" +teacherName);
        System.out.println("Address : "+address);
        System.out.println("Workingtype :"+workingType);
        System.out.println("Employmentstatus :" +employmentStatus);
        
        if (workingHours ==0)
        {
            System.out.println("WorkingHours is not assigned");
            
        }
        else
        {
            System.out.println("WorkingHours:"+ workingHours);
        }
    }
}