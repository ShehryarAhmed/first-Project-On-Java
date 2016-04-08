import java.util.*;
 class students{
Scanner inputdata = new Scanner(System.in);
private String name;
private String DegreeProgram;
private String GRNO;
private String BachNo;
void add(){
System.out.println("Enter Name : ");
name = inputdata.nextLine();
System.out.println("Enter Degreeprogram : ");
DegreeProgram = inputdata.nextLine();
System.out.println("Enter GRNo : ");
GRNO = inputdata.nextLine();
System.out.println("Enter BatchNO : ");
BachNo = inputdata.nextLine();
}
}







public class student{
public static void main(String[] arg){
students newstudent = new students();
Scanner input = new Scanner(System.in);
System.out.println("\t\tWELLCOME TO STUDENT MANAGEMENT SYSTEM!");
System.out.println("\t\t\tPrees 1 for Add Record.");
System.out.println("\t\t\tPrees 2 for Serach.");
System.out.println("\t\t\tPrees 3 for UpDate.");
System.out.println("\t\t\tPrees 4 for Delete.");
System.out.println("\t\t\tPrees 5 for Quit.");
int getneed;
getneed = input.nextInt();
switch(getneed){
case 1 :
{
String more="y";
do{
newstudent.add();
 System.out.println("Do You Want To More Pess \'y\' : ");
 more = input.nextLine();
}
while(more == "y");
}
break;
case 2 :
{
System.out.println("Search");
}
break;
case 3 :
{
System.out.println("Update");
}
break;
case 4 :
{
System.out.println("Delete");
}
break;
case 5 :
{
System.out.println("quit");
}
break;
default:
{
System.out.println("default");

}
}




}
}