import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;

public class HelloAction extends AnAction {
    public HelloAction() {
        super("Resolve conflicts");
    }

    public void actionPerformed(AnActionEvent event) {
        Project project = event.getProject();
        Messages.showMessageDialog(project, "The system will resolve conflicts for the file.", "Gordian Knot", Messages.getErrorIcon());
    }
}