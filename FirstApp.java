package com.example;

import java.awt.*;

import javax.swing.*;

public class FirstApp extends JFrame {
        JPanel flowLayoutPanel, gridLayoutPanel, absoluteLayoutPanel, borderLayoutPanel;

        FirstApp() {
                setTitle("My First App");
                setSize(500, 500);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setLayout(new GridLayout(2, 2, 10, 10));
                intilizePanels();
                setLayoutesForPanels();

                add(flowLayoutPanel);
                add(gridLayoutPanel);
                add(absoluteLayoutPanel);
                add(borderLayoutPanel);

                createComponentsForFlowLayoutPanel();
                createComponentsForGridLayoutPanel();
                createComponentsForAbsoluteLayoutPanel();
                createComponentsForBorderLayoutPanel();
        }

        void createComponentsForBorderLayoutPanel() {
                JLabel label1 = new JLabel("North", JLabel.CENTER);
                JLabel label2 = new JLabel("South", JLabel.CENTER);
                JLabel label3 = new JLabel("East", JLabel.CENTER);
                JLabel label4 = new JLabel("West", JLabel.CENTER);
                JLabel label5 = new JLabel("Center", JLabel.CENTER);

                borderLayoutPanel.add(label1, BorderLayout.NORTH);
                borderLayoutPanel.add(label2, BorderLayout.SOUTH);
                borderLayoutPanel.add(label3, BorderLayout.EAST);
                borderLayoutPanel.add(label4, BorderLayout.WEST);
                borderLayoutPanel.add(label5, BorderLayout.CENTER);
                borderLayoutPanel.setBackground(Color.ORANGE);
                borderLayoutPanel.setBorder(BorderFactory.createTitledBorder("Border Layout Panel"));
        }

        void createComponentsForAbsoluteLayoutPanel() {
                JLabel label1 = new JLabel("Top Aligned");
                JLabel label2 = new JLabel("Center Aligned");
                JLabel label3 = new JLabel("Bottom Aligned");
                absoluteLayoutPanel.add(label1);
                absoluteLayoutPanel.add(label2);
                absoluteLayoutPanel.add(label3);
                label1.setBounds(30, 30, 100, 100);
                label2.setBounds(30, 60, 100, 100);
                label3.setBounds(30, 90, 100, 100);
                absoluteLayoutPanel.setBackground(Color.LIGHT_GRAY);
                absoluteLayoutPanel.setBorder(BorderFactory.createTitledBorder("Absolute Layout Panel"));
        }

        void createComponentsForGridLayoutPanel() {
                JLabel label1 = new JLabel("Label 1", JLabel.CENTER);
                JLabel label2 = new JLabel("Label 2", JLabel.CENTER);
                JLabel label3 = new JLabel("Label 3", JLabel.CENTER);
                JLabel label4 = new JLabel("Label 4", JLabel.CENTER);
                gridLayoutPanel.add(label1);
                gridLayoutPanel.add(label2);
                gridLayoutPanel.add(label3);
                gridLayoutPanel.add(label4);
                gridLayoutPanel.setBackground(Color.YELLOW);
                gridLayoutPanel.setBorder(BorderFactory.createTitledBorder("Grid Layout Panel"));

        }

        void createComponentsForFlowLayoutPanel() {
                JLabel label = new JLabel("Label A Label B Label C");
                flowLayoutPanel.add(label);
                flowLayoutPanel.setBackground(Color.CYAN);
                flowLayoutPanel.setBorder(BorderFactory.createTitledBorder("Flow Layout Panel"));
        }

        void setLayoutesForPanels() {
                flowLayoutPanel.setLayout(new FlowLayout());
                gridLayoutPanel.setLayout(new GridLayout(2, 2));
                absoluteLayoutPanel.setLayout(null);
                borderLayoutPanel.setLayout(new BorderLayout());
        }

        void intilizePanels() {
                flowLayoutPanel = new JPanel();
                gridLayoutPanel = new JPanel();
                absoluteLayoutPanel = new JPanel();
                borderLayoutPanel = new JPanel();
        }

        public static void main(String[] args) {
                FirstApp app = new FirstApp();
                app.setLocationRelativeTo(null);// ? Center the window
                app.setVisible(true);
        }

}