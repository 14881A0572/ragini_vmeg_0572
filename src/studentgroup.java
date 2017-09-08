import java.util.Date;
public class StudentGroup implements StudentArrayOperation {
private Student[] students;
int length;
public StudentGroup(int length) {
		this.students = new Student[length];
	}
@Override
	public Student[] getStudents() {
		// Add your implementation here
		return null;
	}
@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
	}
@Override
	public Student getStudent(int index) {
		// Add your implementation here
		return null;
	}
	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
	}
@Override
	public void addFirst(Student student) {
		// Add your implementation here
	}
@Override
	public void addLast(Student student) {
		// Add your implementation here
	}
	@Override
	public void add(Student student, int index) {
		// Add your implementation here
	}
	@Override
	public void remove(int index) {
		// Add your implementation here
	}
	@Override
	public void remove(Student student) {
		// Add your implementation here
	}
	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
	}
	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}
@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}
@Override
  public void removeToElement(Student student) {
		// Add your implementation here
	}
 @Override
	public void bubbleSort() {
		// Add your implementation here
	}
@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}
	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}
@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}
	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}
	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}
	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}
	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
