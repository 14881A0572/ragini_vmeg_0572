import java.util.Date;
public class Student implements Comparable {
private int id;
private String fullName;
private Date birthDate;
private double avgMark;
public Student(int id, String fullName, Date birthDate, double avgMark) {
this.id = id;
this.fullName = fullName;
this.birthDate = birthDate;
this.avgMark = avgMark;
}
System.out.println("Enter no.of students");

for(i=0;i<n;i++)
{
System.out.println("Enter the id of student");
System.out.println("Enter the full name of student");
System.out.println("Enter the date of birth of student");
System.out.println("Enter the average marks of student");
}
public int getId() {
return id;
}
public void setId(int id) {
this.id = id;
}
public String getFullName() {
return fullName;
}
public void setFullName(String fullName) {
this.fullName = fullName;
	}
  public Date getBirthDate() {
		return birthDate;
	}
public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
  public double getAvgMark() {
		return avgMark;
	}
public void setAvgMark(double avgMark) {
		this.avgMark = avgMark;
	}
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
		@Override
	public int compareTo(Object o) {
		Student other = (Student) o;
		return (this.fullName.compareTo(other.fullName));
	}
}
