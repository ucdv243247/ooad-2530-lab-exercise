import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import javax.swing.table.*;
import java.awt.event.*;       



public class EvaluatorPage extends JPanel {
    public EvaluatorPage(EvaluationModulePanel evaluationModulePanel, EvaluatorSessionPanel evaluatorSessionPanel) {
        setLayout(new BorderLayout());
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("Evaluator", new evalSessionsPanel(evaluationModulePanel, evaluatorSessionPanel));
        add(tabbedPane, BorderLayout.CENTER);
    }
}


class evalSessionsPanel extends JPanel {
    private EvaluationModulePanel evaluationModulePanel;
    private EvaluatorSessionPanel evaluatorSessionPanel;
    //private DefaultListModel<String> sessionListModel;
    //private JList<String> sessionList;

    public evalSessionsPanel(EvaluationModulePanel evaluationModulePanel, EvaluatorSessionPanel evaluatorSessionPanel) {
        this.evaluationModulePanel = evaluationModulePanel;
        this.evaluatorSessionPanel = evaluatorSessionPanel;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

}   }