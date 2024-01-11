import java.util.Scanner;
class Person
{
String name;
int age;
static Scanner sc=new Scanner(System.in);
void setPerson()
{
System.out.println("Enter the name of the Person: ");
name=sc.next();
System.out.println("Enter the age of the person: ");
age=sc.nextInt();
}
void getPerson()
{
System.out.println("NAME= " + name);
System.out.println("AGE= " + age);
}
}
class Student extends Person
{
int id,sub1,sub2,sub3;
String branch;
void setStudent()
{
setPerson();
System.out.println("Enter the id of the Student: ");
id=sc.nextInt();
System.out.println("Enter the branch of the Student: ");
branch=sc.next();
System.out.println("Enter the marks of subject 1: ");
sub1=sc.nextInt();
System.out.println("Enter the marks of subject 2: ");
sub2=sc.nextInt();
System.out.println("Enter the marks of subject 3: ");
sub3=sc.nextInt();
}
void getStudent()
{
getPerson();
System.out.println("ID = " + id);
System.out.println("BRANCH = " + branch);
System.out.println("MARKS 1 = " + sub1);
System.out.println("MARKS 2 = " + sub2);
System.out.println("MARKS 3 = " + sub3);
}
int sum()
{
return(sub1+sub2+sub3);
}
}
class Faculty extends Person
{
int exp,no_of_hrs;
String dept;
void setFaculty()
{
setPerson();
System.out.println("Enter the experience years: ");
exp=sc.nextInt();
System.out.println("Enter the department name: ");
dept=sc.next();
System.out.println("Enter the no of hours: ");
no_of_hrs=sc.nextInt();
}
void getFaculty()
{
getPerson();
System.out.println("EXPERIENCE = " + exp);
System.out.println("DEPARTMENT = " + dept);
System.out.println("NO OF HOURS = " + no_of_hrs);
}
int salary()
{
return(no_of_hrs*300);
}
}
/*class Test
{
public static void main(String args[])
{
int n,i;
System.out.println("How many persons details you want to add ? ");
n=Student.sc.nextInt();
Student s[] = new Student[n];
System.out.println("You have entered the details of " + n + " no of persons ");
for(i=0;i<n;i++)
{
System.out.println("Enter the details of Person no: " + (i+1));
for(i=0;i<n;i++)
{
s[i]=new Student();
int total=s[i].sum();
System.out.println("The sum of marks = " + total);
}
Faculty f[]= new Faculty[n];
for(i=0;i<n;i++)
{
f[i]=new Faculty();
f[i].setFaculty();
f[i].getFaculty();
f[i].salary();
}
}
}
}*/

class Test
{
public static void main(String args[])
{
int n,i;
System.out.println("How many persons details you want to add ? ");
n=Student.sc.nextInt();
Student s[] = new Student[n];
System.out.println("You have entered the details of " + n + " no of persons ");
for(i=0;i<n;i++)
{
System.out.println("Enter the details of Person no: " + (i+1));

s[i]=new Student();
s[i].setStudent();
int total=s[i].sum();
System.out.println("The sum of marks = " + total);
}

Faculty f[]= new Faculty[n];
for(i=0;i<n;i++)
{
f[i]=new Faculty();
f[i].setFaculty();
f[i].salary();
}
for(i=0;i<n;i++)
{
s[i].getStudent();
}
for(i=0;i<n;i++)
{
f[i].getFaculty();
}
}
}