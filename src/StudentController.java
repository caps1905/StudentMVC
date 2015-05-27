
public class StudentController {

	private Student model;
	private StudentView view;
	
	//constructor
	public StudentController(Student model, StudentView view) {
		super();
		this.model = model;
		this.view = view;
	}
	
	public void setStudentName (String name) {
		model.setName(name);
	}
	
	public void setStudentID (int ID) {
		model.setID(ID);
	}
	
	public String getStudentName () {
		return model.getName();
	}
	
	public int getStudentID () {
		return model.getID();
	}
	
	public void updateView(){
		view.printStudentDetails(model.getName(), model.getID());
	}
}
