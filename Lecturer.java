package javacoursework;
/**
 * Write a description of class Hello here.
 *
 * @author (sanjita Chaudhary)
 * @version (a version number or a date)
 */

public class Lecturer extends Teacher
{
    //declaring variable which is instance
    private String Department;
    private int YearsOfExperience;
    private int gradedScore;
    private boolean hasGraded;
    
    public Lecturer(int teacherId,String teacherName, String address,String workingType,int workingHours,String employmentStatus,
                    String department,int YearsOfExperience)
    {
        super(teacherId,teacherName,address,workingType,employmentStatus);
        this.Department = department;
        this.YearsOfExperience = YearsOfExperience;
        this.gradedScore = 0;
        this.hasGraded = false;
    }
    public String getDepartment()
    {
        return Department;
    }
    public int getYearsOfExperience()
    {
        return YearsOfExperience;
    } 
    public void setgradedScore(int gradedScore)
    {
        this.gradedScore = gradedScore;
    }
    public boolean hasGraded()
    {
        return this.hasGraded;
    }
    //Method of grade Assignment
    public void gradeAssignment(int gradedScore,String Department, int YearsOfExperience)
    {
        if(YearsOfExperience >=5 && Department.equals(this.getDepartment()))
        {
            if(gradedScore>=70 && gradedScore<=100)
            {
                System.out.println("A");
                this.gradedScore = gradedScore;
            }
            else if(gradedScore>=60 && gradedScore<=100)
            {
                System.out.println("B");
                this.gradedScore = gradedScore;
            }
            else if(gradedScore>=50 && gradedScore<=100)
            {
                System.out.println("C");
                this.gradedScore = gradedScore;
            }
            else if(gradedScore>=40 && gradedScore<=100){
                System.out.println("D");
                this.gradedScore = gradedScore;
            }
            else
            {
                System.out.println("E");
            }
            this.hasGraded =true;
        }
        else{
            System.out.println("Lecturer cannot grade the Student");
        }
            
    }
    //Display Method
    public void display()  
    {
        
        super.display();
        System.out.println("department:"+ Department);
        System.out.println("yearsofexperience:" + YearsOfExperience);
        if(!hasGraded)
        {
            System.out.println("GradedScore:" +gradedScore);
        }
        else{
            System.out.println("GradedScore:Not Graded yet");
        }
    }
}