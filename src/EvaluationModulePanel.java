import java.util.List;
import javax.swing.table.*;
import javax.swing.*;
import java.awt.*;

public class EvaluationModulePanel {
    public EvaluationModulePanel() {
        /*setLayout(new GridBagLayout());
        setBackground(Color.WHITE); 
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Scoring Rubrics [cite: 38, 39]
        String[] labels = {"Problem Clarity", "Methodology", "Results", "Presentation"};
        JSlider[] sliders = new JSlider[4];

        for (int i = 0; i < labels.size(); i++) {
            gbc.gridy = i; gbc.gridx = 0;
            add(new JLabel(labels[i] + " (1-5):"), gbc);
            
            sliders[i] = new JSlider(1, 5, 3);
            sliders[i].setPaintLabels(true);
            sliders[i].setPaintTicks(true);
            sliders[i].setMajorTickSpacing(1);
            gbc.gridx = 1;
            add(sliders[i], gbc);
        }

        // Save and Submit buttons [cite: 40]
        JButton btnSubmit = new JButton("Submit Evaluation");
        gbc.gridy = 5; gbc.gridx = 0; gbc.gridwidth = 2;
        add(btnSubmit, gbc);
        
        btnSubmit.addActionListener(e -> JOptionPane.showMessageDialog(this, "Evaluation Saved!")); */ 
    }
}