/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LoginForms.Student;

import LoginForms.*;
import java.awt.*;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sanir
 */
public class StudentViewTimetable extends javax.swing.JFrame {

    private final String studentId;

    /**
     * Creates new form StudentViewTimetable
     */
    public StudentViewTimetable(String studentId) {
        initComponents();
        this.studentId = studentId;
        lbl_index.setText(studentId);
        // Database connection details
               String connectionString = "jdbc:mysql://localhost:3306/LMS"; // Update with your DB details
        String dbUsername = "root"; // Your MySQL username
        String dbPassword = "";     // Your MySQL password

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // Get the studentID from lbl_index
            String studentID = lbl_index.getText().trim();

            // Ensure studentID is not empty
            if (studentID.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Student ID is missing in lbl_index.");
                return;
            }

            // Establish database connection
            conn = DriverManager.getConnection(connectionString, dbUsername, dbPassword);

            // Step 1: Retrieve student name and courseID
            String studentQuery = "SELECT studentName, courseID FROM Student WHERE studentID = ?";
            stmt = conn.prepareStatement(studentQuery);
            stmt.setString(1, studentID); // Set the studentID as a parameter

            // Execute the query to fetch studentName and courseID
            rs = stmt.executeQuery();

            String studentName = null;
            String courseId = null;
            if (rs.next()) {
                studentName = rs.getString("studentName");
                courseId = rs.getString("courseID");

                // Set the student's name in lbl_name
                lbl_name.setText(studentName);
            } else {
                // Display message if student ID does not exist in the database
                JOptionPane.showMessageDialog(null, "No student found with ID: " + studentID);
                lbl_name.setText(""); // Clear lbl_name
                return; // Exit since no valid student was found
            }

            // Close previous resources for re-use
            rs.close();
            stmt.close();

            // Step 2: Retrieve Timetable Details for the Course with Lecturer Name
            String timetableQuery = "SELECT t.scheduleDate, t.scheduleTime, t.subjectName, l.lecturerName " +
                                    "FROM Timetable t " +
                                    "JOIN Lecturer l ON t.lecturerID = l.lecturerID " +
                                    "WHERE t.courseID = ?";
            stmt = conn.prepareStatement(timetableQuery);
            stmt.setString(1, courseId); // Set the courseID as a parameter

            // Execute the query for timetable details
            rs = stmt.executeQuery();

            // Get the table model of tbl_timetable
            DefaultTableModel model = (DefaultTableModel) tbl_timetable.getModel();

            // Clear existing rows in the table
            model.setRowCount(0);

            // Add columns to the table model (if not already added)
            model.setColumnIdentifiers(new Object[]{"Schedule Date", "Schedule Time", "Subject Name", "Lecturer Name"});

            // Iterate through the result set and populate the table
            while (rs.next()) {
                String scheduleDate = rs.getDate("scheduleDate").toString();
                String scheduleTime = rs.getTime("scheduleTime").toString();
                String subjectName = rs.getString("subjectName");
                String lecturerName = rs.getString("lecturerName");

                // Add a row to the table
                model.addRow(new Object[]{scheduleDate, scheduleTime, subjectName, lecturerName});
            }

        } catch (SQLException ex) {
            // Handle SQL exceptions
            JOptionPane.showMessageDialog(null, "Error retrieving student details or timetable: " + ex.getMessage());
            ex.printStackTrace(); // For debugging purposes
        } finally {
            // Close database resources
            try {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (conn != null) conn.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error closing database resources: " + ex.getMessage());
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_index = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        lbl_user = new javax.swing.JLabel();
        btn_dashboard = new javax.swing.JButton();
        btn_timetable = new javax.swing.JButton();
        btn_course = new javax.swing.JButton();
        btn_exam = new javax.swing.JButton();
        btn_logout = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_timetable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(225, 550));

        lbl_index.setBackground(new java.awt.Color(0, 51, 255));
        lbl_index.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_index.setForeground(new java.awt.Color(255, 255, 255));
        lbl_index.setText("Index");

        lbl_name.setBackground(new java.awt.Color(0, 51, 255));
        lbl_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(255, 255, 255));
        lbl_name.setText("name");

        lbl_user.setIcon(new javax.swing.ImageIcon("C:\\Users\\sanir\\Desktop\\NetBeans\\LearningManagementSystem\\FormImages\\qlementine-icons--user-16.png")); // NOI18N

        btn_dashboard.setBackground(new java.awt.Color(153, 153, 153));
        btn_dashboard.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_dashboard.setForeground(new java.awt.Color(255, 255, 255));
        btn_dashboard.setIcon(new javax.swing.ImageIcon("C:\\Users\\sanir\\Desktop\\NetBeans\\LearningManagementSystem\\Images\\ic--baseline-dashboard.png")); // NOI18N
        btn_dashboard.setText("Dashboard");
        btn_dashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_dashboardActionPerformed(evt);
            }
        });

        btn_timetable.setBackground(new java.awt.Color(255, 255, 255));
        btn_timetable.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_timetable.setForeground(new java.awt.Color(0, 0, 0));
        btn_timetable.setIcon(new javax.swing.ImageIcon("C:\\Users\\sanir\\Desktop\\NetBeans\\LearningManagementSystem\\Images\\uis--schedule B.png")); // NOI18N
        btn_timetable.setText("Timetable");
        btn_timetable.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_timetable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_timetableActionPerformed(evt);
            }
        });

        btn_course.setBackground(new java.awt.Color(153, 153, 153));
        btn_course.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_course.setForeground(new java.awt.Color(255, 255, 255));
        btn_course.setIcon(new javax.swing.ImageIcon("C:\\Users\\sanir\\Desktop\\NetBeans\\LearningManagementSystem\\FormImages\\ic--baseline-class.png")); // NOI18N
        btn_course.setText("Course");
        btn_course.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_courseActionPerformed(evt);
            }
        });

        btn_exam.setBackground(new java.awt.Color(153, 153, 153));
        btn_exam.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_exam.setForeground(new java.awt.Color(255, 255, 255));
        btn_exam.setIcon(new javax.swing.ImageIcon("C:\\Users\\sanir\\Desktop\\NetBeans\\LearningManagementSystem\\FormImages\\healthicons--i-exam-qualification.png")); // NOI18N
        btn_exam.setText("Examination");
        btn_exam.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_exam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_examActionPerformed(evt);
            }
        });

        btn_logout.setBackground(new java.awt.Color(102, 102, 102));
        btn_logout.setIcon(new javax.swing.ImageIcon("C:\\Users\\sanir\\Desktop\\NetBeans\\LearningManagementSystem\\FormImages\\hugeicons--logout-04 (1).png")); // NOI18N
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_timetable, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
            .addComponent(btn_course, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
            .addComponent(btn_exam, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(148, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_logout, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_user, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl_index, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_user)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_index)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_name)
                .addGap(34, 34, 34)
                .addComponent(btn_dashboard)
                .addGap(18, 18, 18)
                .addComponent(btn_timetable)
                .addGap(18, 18, 18)
                .addComponent(btn_course)
                .addGap(18, 18, 18)
                .addComponent(btn_exam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                .addComponent(btn_logout)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Schedule");

        tbl_timetable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Date", "Time", "Subject", "Lecurer"
            }
        ));
        jScrollPane1.setViewportView(tbl_timetable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 284, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(264, 264, 264))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dashboardActionPerformed
        // TODO add your handling code here:
        StudentDashboard studentDashboard = new StudentDashboard(lbl_index.getText());
        studentDashboard.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_dashboardActionPerformed

    private void btn_timetableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_timetableActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_timetableActionPerformed

    private void btn_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_courseActionPerformed
        // TODO add your handling code here:
        StudentViewCourse studentViewCourse = new StudentViewCourse(lbl_index.getText());
        studentViewCourse.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_courseActionPerformed

    private void btn_examActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_examActionPerformed
        // TODO add your handling code here:
        StudentViewExam studentViewExam = new StudentViewExam(lbl_index.getText());
        studentViewExam.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_examActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        Home home = new Home();
        home.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_logoutActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentViewTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentViewTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentViewTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentViewTimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentViewTimetable("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_course;
    private javax.swing.JButton btn_dashboard;
    private javax.swing.JButton btn_exam;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_timetable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_index;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JTable tbl_timetable;
    // End of variables declaration//GEN-END:variables
}
