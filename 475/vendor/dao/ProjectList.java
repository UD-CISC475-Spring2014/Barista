import java.util.list;
import java.util.ArrayList;

public class ProjectList{
	private List<Project> projects;

	public ProjectList(Project... projects){
		projects = new ArrayList<Projects>();
		for(Project p : projects){
			this.projects.add(p);
		}
	}

	public List<Project> getProjects(){
		return projects;
	}

	public setProjects(List<Project> ps){
		System.out.println("No.");
	}

}
