import java.io.File;

import org.apache.tools.ant.BuildException;
import org.apache.tools.ant.Task;

public class FolderSize extends Task {
	private String folder;

	public String getFolder() {
		return folder;
	}

	public void setFolder(String folder) {
		this.folder = folder;
	}
	
	public void execute() throws BuildException {
		File f = new File(folder);
		if(f.exists()) {
			if(f.isDirectory()) System.out.println("la taille du dossier "+ folder + " est de "+ f.getTotalSpace() + " Octet");
			else System.out.println("la taille du fichier "+ folder + " est de "+ f.getTotalSpace() + " Octet");
		}else System.out.println("le chemin "+ " pas accessible.");
	}
}
