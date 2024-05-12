package javacoursework;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;





public class TeacherGui {
    JFrame frame;
    JTextField teacherIdTF;
    JTextField teacherNameTF;
    JTextField addressTF;
    JTextField workingTypeTF;
    JTextField employmentStTF;
    JTextField workingHrsTF;
    JTextField departmentTF;
    JTextField yearsOfExperienceTF;
    JTextField gradedScoreTF;
    JTextField salaryTF;
    JTextField specializationTF;
    JTextField academicTF;
    JTextField performanceIndexTF;
    JPanel teacherPanel;
    JPanel lecturePanel;
    JPanel tutorPanel;
    JPanel buttonPanel;
    private ArrayList<Teacher> teacherList = new ArrayList<Teacher>();
   public TeacherGui()
   {
    frame = new JFrame("Teacher GUI");
    frame.setSize(900,800);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   // frame.setResizable(false);
    frame.setLayout(null);
    frame.setLocationRelativeTo(null);
    frame.setForeground(Color.GRAY);


    JLabel userlbl = new JLabel("TEACHER GUI");
    userlbl.setBounds(250,05,350,40);
    userlbl.setFont(new Font("Serif", Font.BOLD,  16));
    frame.add(userlbl);


    //Panel for teacher 
    teacherPanel=new JPanel();
    teacherPanel.setBounds(10,50,400,300);
    teacherPanel.setBackground(Color.LIGHT_GRAY);
    teacherPanel.setLayout(null);
    frame.add(teacherPanel);

    //creating userlabel name for teacher
    JLabel teacherlbl = new JLabel("Teacher Information ");
teacherlbl.setBounds(100,03,180,30);
teacherlbl.setFont(new Font("Serif", Font.PLAIN,  18));
teacherPanel.add(teacherlbl);


 //creating label for teacherID
   JLabel teacherIdlbl = new JLabel("Teacher ID:");
   teacherIdlbl.setBounds(15, 30,120,30);
  teacherPanel.add(teacherIdlbl);


   //textField for teacherId
   teacherIdTF=new JTextField();
   teacherIdTF.setBounds(150,30,180,30);
   teacherPanel.add(teacherIdTF);

     //label for teacherName
    JLabel teacherNamelbl = new JLabel("Teacher Name:");
    teacherNamelbl.setBounds(15,60,130,30);
    teacherPanel.add(teacherNamelbl);

//     //textField for teacherName
     teacherNameTF = new JTextField();
     teacherNameTF.setBounds(150,60,180,30);
     teacherPanel.add(teacherNameTF);

//       //label for address
        JLabel addressLbl = new JLabel("Address:");
        addressLbl.setBounds(15,100,80,30);
        teacherPanel.add(addressLbl);

//       //textField for address
     addressTF = new JTextField();
     addressTF.setBounds(150,100,180,30);
     teacherPanel.add(addressTF);


//     //label for workingType
     JLabel workingTypelbl = new JLabel("Working Type:");
    workingTypelbl.setBounds(15,140,130,30);
    teacherPanel.add(workingTypelbl);

//      //textfield for working type
      workingTypeTF = new JTextField();
      workingTypeTF.setBounds(150,140,180,30);
     teacherPanel.add(workingTypeTF);

     
//     // label for employment status
     JLabel employmentStlbl = new JLabel("Employment Status:");
     employmentStlbl.setBounds(15,180,130,30);
     teacherPanel.add(employmentStlbl);


//     //text field for employment status
    employmentStTF = new JTextField();
     employmentStTF.setBounds(150,180,180,30);
     teacherPanel.add(employmentStTF);

//      //label for working hours
     JLabel workingHrsLbl = new JLabel("Working Hours:");
     workingHrsLbl.setBounds(15,220,130,30);
      teacherPanel.add(workingHrsLbl);


    //text field for working hours
    workingHrsTF = new JTextField();
    workingHrsTF.setBounds(150,220,180,30);
    teacherPanel.add(workingHrsTF);

     //panel for lecture
     lecturePanel = new JPanel();
     lecturePanel.setBackground(Color.LIGHT_GRAY);
     lecturePanel.setLayout(null);
     lecturePanel.setBounds(450,50,400,300);
     frame.add(lecturePanel);
     

     //creating label for lecture information
     JLabel lecturelbl = new JLabel("Lecturer Information");
     lecturelbl.setBounds(100,10,200,30);
     lecturelbl.setFont(new Font("serif",Font.PLAIN,18));
     lecturePanel.add(lecturelbl);


    //label for department
    JLabel departmentlbl = new JLabel("Department:");
    departmentlbl.setBounds(15,40,130,30);
    lecturePanel.add(departmentlbl);


    //textfield for department
    

    this.departmentTF= new JTextField();
    departmentTF.setBounds(150,40,180,30);
    lecturePanel.add(departmentTF);

    //label for yearsOfexperience
    JLabel yrsOfexplbl = new JLabel("years Of Experience:");
    yrsOfexplbl.setBounds(15,70,130,30);
    lecturePanel.add(yrsOfexplbl);


//text field for yearsofexperience
this.yearsOfExperienceTF = new JTextField();
yearsOfExperienceTF.setBounds(150,70,180,30);
lecturePanel.add(yearsOfExperienceTF);


//label for graded score
JLabel gradedScorelbl = new JLabel("Graded Score");
gradedScorelbl.setBounds(15,100,130,30);
lecturePanel.add(gradedScorelbl);

//text field for graded score
this.gradedScoreTF = new JTextField();
gradedScoreTF.setBounds(150,100,180,30);
lecturePanel.add(gradedScoreTF);

//button to grade assignment
JButton gradeAssignmentbtn = new JButton("Grade Assignment");
gradeAssignmentbtn.setBounds(50,140,150,30);
gradeAssignmentbtn.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        addGradeAssignment();
}

});
gradeAssignmentbtn.setForeground(Color.BLUE);
lecturePanel.add(gradeAssignmentbtn);

//button to display lectures
JButton displaylecturebtn = new JButton();
displaylecturebtn.setText("Display Lectures");
displaylecturebtn.setBounds(50,180,150,30);
displaylecturebtn.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        displayLecture();
}

   
});
displaylecturebtn.setForeground(Color.blue);
lecturePanel.add(displaylecturebtn);


//button to add lecture
JButton addlecturebtn = new JButton("Add lecture");
addlecturebtn.setBounds(200,140,150,30);
addlecturebtn.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e)
    {
        addLecture();
    }

    //method to add lecture
    private void addLecture() {
        try{
            int teacherId = Integer.parseInt(getTextFromTextField(teacherIdTF));
            String name = getTextFromTextField(teacherNameTF);
            String address = getTextFromTextField(addressTF);
            String workingType = getTextFromTextField(workingTypeTF);
            String employmentStatus = getTextFromTextField(employmentStTF);
            int workingHour=Integer.parseInt(getTextFromTextField(workingHrsTF));
            String department = getTextFromTextField(departmentTF);
            int yearsOfExperience= Integer.parseInt(getTextFromTextField(yearsOfExperienceTF));
             //Double GradedScore = Double.parseDouble(getTextFromTextField(yearsOfExperienceTF));
            if (teacherId<0 || workingHour<0 || yearsOfExperience<0) 
            {
                throw new NumberFormatException();   
            }

            if(isIDRepeated(teacherId))
            {
                JOptionPane.showMessageDialog(frame, "Id  is already exist.Please enter another one.","Error",JOptionPane.ERROR_MESSAGE); 
                return;
            }
            else{
                // int teacherId,String teacherName, String address,String workingType,int workingHours,String employmentStatus,
                // String department,int YearsOfExperience
            Lecturer lecturer = new Lecturer(teacherId,name,address,workingType,workingHour,employmentStatus,department,yearsOfExperience);
            teacherList.add(lecturer);
            JOptionPane.showMessageDialog(frame,"Lecture added Successfully");
            } 
          
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(frame,"Please enter valid inputs.Teacher Id must be in number form.","Error",JOptionPane.ERROR_MESSAGE);
        }
        catch(IllegalArgumentException ex)
        {
            JOptionPane.showMessageDialog(frame,"Fill all the fields" );
        }
        
            
            
        }
        public String getTextFromTextField(JTextField textfield)
        {
           String text = textfield.getText().trim();  
           if(text.isEmpty())
           {
            throw new IllegalArgumentException();
           }
           return text;
        }
    
});
addlecturebtn.setForeground(Color.blue);
lecturePanel.add(addlecturebtn);


// Panel for tutor information
tutorPanel = new JPanel();
tutorPanel.setLayout(null);
tutorPanel.setBounds( 15,380,400,300);
tutorPanel.setBackground(Color.LIGHT_GRAY);
frame.add(tutorPanel);


//tutor info
JLabel tutorlbl = new JLabel("Tutor Information");
tutorlbl.setFont(new Font("serif",Font.PLAIN,18));
tutorlbl.setBounds(100,05,150,30);
tutorPanel.add(tutorlbl);


//label for salary
JLabel salarylbl = new JLabel("Salary:");
salarylbl.setBounds(15,30,80,30);
tutorPanel.add(salarylbl);

//text field for salary
this.salaryTF = new JTextField();
salaryTF.setBounds(165,30,180,30);
tutorPanel.add(salaryTF);

//label for sepcialization
JLabel sepcializationlbl = new JLabel("Specialization:");
sepcializationlbl.setBounds(15,70,150,30);
tutorPanel.add(sepcializationlbl);

//text field for specialization
this.specializationTF = new JTextField();
specializationTF.setBounds(165,70,180,30);
tutorPanel.add(specializationTF);

//label for academicQualification
JLabel academiclbl = new JLabel("Academic Qualification:");
academiclbl.setBounds(15,110,150,30);
tutorPanel.add(academiclbl);

//text field for academicQualification
this.academicTF = new JTextField();
academicTF.setBounds(165,110,180,30);
tutorPanel.add(academicTF);


//label for perfomance Index
JLabel performanceIndexlbl = new JLabel("Performance Index:");
performanceIndexlbl.setBounds(15,150,150,30);
tutorPanel.add(performanceIndexlbl);


//text field for performanceIndex
this.performanceIndexTF = new JTextField();
performanceIndexTF.setBounds(165,150,180,30);
tutorPanel.add(performanceIndexTF);

//butoon to set salary
JButton setSalarybtn = new JButton("Set Salary");
setSalarybtn.setBounds(50,200,130,30);
setSalarybtn.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        setSalary();
}});
setSalarybtn.setForeground(Color.blue);
tutorPanel.add(setSalarybtn);

//button to remove tutor
JButton RemoveTutorbtn = new JButton("Remove Tutor");
RemoveTutorbtn.setBounds(220,200,130,30);
RemoveTutorbtn.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        removeTutor();
}});
RemoveTutorbtn.setForeground(Color.blue);
tutorPanel.add(RemoveTutorbtn);

//button to add tutor
JButton tutorbtn = new JButton("Add Tutor");
tutorbtn.setBounds(200,250,100,30);
tutorbtn.addActionListener(new ActionListener(){

    @Override
    public void actionPerformed(ActionEvent e) {
       addTutor();
    }

});


tutorbtn.setForeground(Color.blue);
tutorPanel.add(tutorbtn);

JButton displaytutorbtn = new JButton();
displaytutorbtn.setText("Display Tutors");
displaytutorbtn.setBounds(50, 250,150, 30);
displaytutorbtn.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e)
    {
        displayTutor();
    }
});
displaytutorbtn.setForeground(Color.blue);
tutorPanel.add(displaytutorbtn);


//Panel for buttons
buttonPanel = new JPanel();
buttonPanel.setLayout(null);
buttonPanel.setBounds( 500,380,200,100);
buttonPanel.setBackground(Color.LIGHT_GRAY);
frame.add(buttonPanel);

//label to show buttons
JLabel  buttonLabel= new JLabel ("Buttons: ");
buttonLabel.setFont(new Font("serif",Font.PLAIN,18));
buttonLabel.setBounds (90 ,10,140,30);
buttonPanel.add(buttonLabel);

//Clear button
JButton clearbtn = new JButton("Clear");
clearbtn.setBounds(50,50,100,30);
clearbtn.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        clearFields();
}});

    
clearbtn.setForeground(Color.blue);
buttonPanel.add(clearbtn);


//Display Button
// JButton displaybtn = new JButton("Display");
// displaybtn.setBounds(150,50,100,30);
// displaybtn.setForeground(Color.blue);
// buttonPanel.add(displaybtn);










  
    frame.setVisible(true);

   }

     //method for adding tutor
   private void addTutor()
   {
    
        try{
        int teacherId = Integer.parseInt(getTextFromTextField(teacherIdTF));
        String name = getTextFromTextField(teacherNameTF);
        String address = getTextFromTextField(addressTF);
        String workingType = getTextFromTextField(workingTypeTF);
        String employmentStatus = getTextFromTextField(employmentStTF);
        int workingHour =Integer.parseInt(getTextFromTextField(workingHrsTF));
        Double Salary = Double.parseDouble(getTextFromTextField(salaryTF));
        String specialization = getTextFromTextField(specializationTF);
        String academicQualification = getTextFromTextField(academicTF);
        int performanceIndex =Integer.parseInt(getTextFromTextField(performanceIndexTF));
    
       Tutor tutor = new Tutor(teacherId,name,address,workingType,employmentStatus,workingHour,Salary,specialization,academicQualification,performanceIndex);
        teacherList.add(tutor); 
        JOptionPane.showMessageDialog(frame,"Tutor added Successfully");
        
      
        }
        catch(IllegalArgumentException ex)
        {
            JOptionPane.showMessageDialog(frame,"Fill all the fields" );
        }
        
        
    }
    private String getTextFromTextField(JTextField textfield)
    {
       String text = textfield.getText().trim();  
       if(text.isEmpty())
       {
        throw new IllegalArgumentException();
       }
       return text;
    }
    
//method to grade assignment for lecturer
   private void addGradeAssignment()
   {
       try {
           int teacherId =Integer.parseInt(teacherIdTF.getText().trim());
           String dept = departmentTF.getText().trim();
           int exp = Integer.parseInt(yearsOfExperienceTF.getText().trim());
           int gscore = Integer.parseInt(gradedScoreTF.getText().trim());
           //if (gscore < 0 || gscore > 100) throw new Exception("Invalid Gradescore.");
           //create a new object of GradeAssignments and call the method to insert into database
   
   
   
           Teacher teacher = getTeacherByID(teacherId);
   
           if(teacher == null)
           {
               JOptionPane.showMessageDialog(frame, "Lecturer not found");
           }
         if(!(teacher instanceof Lecturer))
         {
           JOptionPane.showMessageDialog(frame,"This is not a lecturer.");
           return;
         }
         
         Lecturer lecturer = (Lecturer)teacher;
        lecturer.gradeAssignment(gscore,dept,exp);
        JOptionPane.showMessageDialog(frame,"Successfully Graded Score");
       
   
       } catch (IllegalArgumentException e) {
          JOptionPane.showMessageDialog(frame,  "Empty field");
       }
   }

   //code for set salary method
   private void setSalary(){
    try {
        int teacherId =Integer.parseInt(teacherIdTF.getText().trim());
        Double salary=Double.parseDouble(salaryTF.getText().trim());
        int performanceIndex = Integer.parseInt(performanceIndexTF.getText().trim());
        
        Teacher teacher = getTeacherByID(teacherId);
        
        if(teacher==null){
            JOptionPane.showMessageDialog(frame, "No such teacher exists!");
            
        }
        else if (!(teacher instanceof Tutor))
        {
            JOptionPane.showMessageDialog(frame,"Tutor didnot found.Please enter a valid ID","Error",JOptionPane.ERROR_MESSAGE );
            return;
        }
        
      else{
        Tutor tutor = (Tutor) teacher;
        tutor.Calculate(salary, performanceIndex);
        JOptionPane.showMessageDialog(frame, "Salary has been Setted Successfully!");
      }
       


    
}
    catch (NumberFormatException e) {
       JOptionPane.showMessageDialog(frame, "Please enter valid numbers only!");
    }
   }

   //method to clear data from all fields
   private void clearFields() {
        teacherIdTF.setText("");
        teacherNameTF.setText("");
        addressTF.setText("");
        workingTypeTF.setText("");
        employmentStTF.setText("");
        workingHrsTF.setText("");
        departmentTF.setText("");
        yearsOfExperienceTF.setText("");
        gradedScoreTF.setText("");
        salaryTF.setText("");
        specializationTF.setText("");
        academicTF.setText("");
        performanceIndexTF.setText("");
        
       
   };

   //method to remove tutor from arraylist
   private void removeTutor()
   {
    try {
        int teacherid=Integer.parseInt(getTextFromTextField(teacherIdTF));

        for(Teacher tutor: teacherList)
        {
            if(tutor.getTeacherID()== teacherid && tutor instanceof Tutor )
            {
                teacherList.remove(tutor);
                JOptionPane.showMessageDialog(frame,"Tutor removed successfully.");
                return;
            }
        }
        JOptionPane.showMessageDialog(frame,"Tutor didnot found.please enter valid ID!");
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(frame,"Please enter a valid ID for the tutor to remove.");
    }
   }


//method to check if id is repeated or not
   private boolean isIDRepeated(int id) {
        boolean isFound = false;
        for (Teacher teacher : teacherList) {
            if (teacher.getTeacherID()==(id)) {
                isFound = true;
             break;
            }
        }
    return isFound;
   }

   //method to get teacher by its id
   private Teacher getTeacherByID(int teacherId) {
    for (Teacher teacher : teacherList) {
     if (teacher.getTeacherID()==(teacherId)) {
            return teacher;
    }
}
    return null;
}

//method to call displayLecture
private void displayLecture() {
    try {
        boolean isFound = false;
        for (Teacher teacher: teacherList)
        {
            if(teacher instanceof Lecturer)
            {
                isFound=true;
                Lecturer lecturer = (Lecturer) teacher;
                lecturer.display();
                System.err.println();
            }
        }
       if(isFound){
        JOptionPane.showMessageDialog(frame,"Successfully displayed in terminal.");
    }
    else{
        JOptionPane.showMessageDialog(frame," please add lecture first.");     
    }
     
    }
    catch(IllegalArgumentException e)
    {
        JOptionPane.showMessageDialog(frame, "Invalid input");
    }
}

//method to display tutor informations
private void displayTutor()
{
    try {
        boolean isFound = false;
        for (Teacher teacher: teacherList)
        {
            if(teacher instanceof Tutor)
            {
                isFound=true;
                Tutor tutor = (Tutor) teacher;
                tutor.display();
                System.err.println();
            }
        }
       if(isFound){
        JOptionPane.showMessageDialog(frame,"Successfully displayed in terminal.");
    }
    else{
        JOptionPane.showMessageDialog(frame," please add Tutor first.");     
    }
     
    }
    catch(IllegalArgumentException e)
    {
        JOptionPane.showMessageDialog(frame, "Invalid input");
    } 
}
public static void main(String[] args) {
    new TeacherGui();
   }
  
}