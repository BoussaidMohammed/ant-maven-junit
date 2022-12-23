import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

public class Calculate extends Task {
	private int a;
	private int b;
	
	public void setA(int a) {
		this.a = a;
	}

	public void setB(int b) {
		this.b = b;
	}



	@Override
	public void execute() throws BuildException {
		System.out.println(a + " + " + b + " = " + (a + b));
	}
}
