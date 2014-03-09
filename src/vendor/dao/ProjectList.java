package vendor.dao;
import vendor.project.Project;
import java.util.ArrayList;
import java.util.List;

public class ProjectList{
	private List<Project> projects;

	public ProjectList(Project... projects){
		this.projects = new ArrayList<Project>();
		for(Project p : projects){
			this.projects.add(p);
		}
	}

	public List<Project> getProjects(){
		return projects;
	}

	public void setProjects(List<Project> ps){
		System.out.println("No.");
	}

}
