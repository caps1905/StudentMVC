
public class StudentMVCDemo {

	public static void main(String[] args) {
		Student model = retrieveStudentFromDB();
		StudentView view = new StudentView();
		
		StudentController controller = new StudentController(model, view);
		
		controller.updateView();
		
		controller.setStudentName("Robert II");
		controller.updateView();
	}
	
	public static Student retrieveStudentFromDB(){
		      Student student = new Student();
		      student.setName("Robert");
		      student.setID(10);
		      return student;
	}

}
