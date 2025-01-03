/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package LoginForms.Admin;

import LoginForms.*;
import java.awt.*;
import javax.swing.*;
import LoginForms.Admin.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author sanir
 */
public class AdminViewExam extends javax.swing.JFrame {

    private final String adminID;

    /**
     * Creates new form AdminViewExam
     */
    public AdminViewExam(String adminID) {
        initComponents();
        this.adminID = adminID;
        lbl_index.setText(adminID);
        pnl_viewResult.setVisible(false);
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
        btn_logout = new javax.swing.JButton();
        btn_dashboard = new javax.swing.JButton();
        btn_student = new javax.swing.JButton();
        btn_lecturer = new javax.swing.JButton();
        btn_course = new javax.swing.JButton();
        btn_exam = new javax.swing.JButton();
        lbl_user = new javax.swing.JLabel();
        lbl_index = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        pnl_viewResult = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_studentName = new javax.swing.JLabel();
        lbl_studentId = new javax.swing.JLabel();
        lbl_course = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_result = new javax.swing.JTable();
        btn_cancel = new javax.swing.JButton();
        txt_searchStudent = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(225, 550));

        btn_logout.setBackground(new java.awt.Color(102, 102, 102));
        btn_logout.setIcon(new javax.swing.ImageIcon("C:\\Users\\sanir\\Desktop\\NetBeans\\LearningManagementSystem\\FormImages\\hugeicons--logout-04 (1).png")); // NOI18N
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });

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

        btn_student.setBackground(new java.awt.Color(153, 153, 153));
        btn_student.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_student.setForeground(new java.awt.Color(255, 255, 255));
        btn_student.setIcon(new javax.swing.ImageIcon("C:\\Users\\sanir\\Desktop\\NetBeans\\LearningManagementSystem\\FormImages\\mdi--account-student.png")); // NOI18N
        btn_student.setText("Student");
        btn_student.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_student.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_studentActionPerformed(evt);
            }
        });

        btn_lecturer.setBackground(new java.awt.Color(153, 153, 153));
        btn_lecturer.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_lecturer.setForeground(new java.awt.Color(255, 255, 255));
        btn_lecturer.setIcon(new javax.swing.ImageIcon("C:\\Users\\sanir\\Desktop\\NetBeans\\LearningManagementSystem\\FormImages\\fa-solid--chalkboard-teacher.png")); // NOI18N
        btn_lecturer.setText("Lecturer");
        btn_lecturer.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_lecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lecturerActionPerformed(evt);
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

        btn_exam.setBackground(new java.awt.Color(255, 255, 255));
        btn_exam.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_exam.setForeground(new java.awt.Color(0, 0, 0));
        btn_exam.setIcon(new javax.swing.ImageIcon("C:\\Users\\sanir\\Desktop\\NetBeans\\LearningManagementSystem\\Images\\healthicons--i-exam-qualification B.png")); // NOI18N
        btn_exam.setText("Examination");
        btn_exam.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_exam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_examActionPerformed(evt);
            }
        });

        lbl_user.setIcon(new javax.swing.ImageIcon("C:\\Users\\sanir\\Desktop\\NetBeans\\LearningManagementSystem\\FormImages\\qlementine-icons--user-16.png")); // NOI18N

        lbl_index.setBackground(new java.awt.Color(0, 51, 255));
        lbl_index.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_index.setForeground(new java.awt.Color(255, 255, 255));
        lbl_index.setText("Index");

        lbl_name.setBackground(new java.awt.Color(0, 51, 255));
        lbl_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbl_name.setForeground(new java.awt.Color(255, 255, 255));
        lbl_name.setText("name");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_dashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btn_student, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
            .addComponent(btn_lecturer, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
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
                .addComponent(btn_student)
                .addGap(18, 18, 18)
                .addComponent(btn_lecturer)
                .addGap(18, 18, 18)
                .addComponent(btn_course)
                .addGap(18, 18, 18)
                .addComponent(btn_exam)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(btn_logout)
                .addContainerGap())
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setText(":");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Student ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Name");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setText(":");

        lbl_studentName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_studentName.setText("Data ghjjjjjkjhfj uhgjg");

        lbl_studentId.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_studentId.setText("Data");

        lbl_course.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_course.setText("Data");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setText(":");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Course");

        tbl_result.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, "", null},
                {null, null, null}
            },
            new String [] {
                "Subject", "Marks", "Grade"
            }
        ));
        jScrollPane1.setViewportView(tbl_result);

        btn_cancel.setBackground(new java.awt.Color(0, 0, 0));
        btn_cancel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_viewResultLayout = new javax.swing.GroupLayout(pnl_viewResult);
        pnl_viewResult.setLayout(pnl_viewResultLayout);
        pnl_viewResultLayout.setHorizontalGroup(
            pnl_viewResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_viewResultLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnl_viewResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_viewResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_viewResultLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_studentId, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_viewResultLayout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_studentName, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_viewResultLayout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_course, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64))
            .addGroup(pnl_viewResultLayout.createSequentialGroup()
                .addGroup(pnl_viewResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_viewResultLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_viewResultLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(52, Short.MAX_VALUE))
        );
        pnl_viewResultLayout.setVerticalGroup(
            pnl_viewResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_viewResultLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnl_viewResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(lbl_studentId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_viewResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(lbl_studentName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_viewResultLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(lbl_course))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_cancel)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        txt_searchStudent.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_searchStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchStudentActionPerformed(evt);
            }
        });

        btn_search.setBackground(new java.awt.Color(0, 0, 0));
        btn_search.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_search.setForeground(new java.awt.Color(255, 255, 255));
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("View Exam Results");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txt_searchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_search)
                        .addGap(101, 101, 101))
                    .addComponent(pnl_viewResult, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_searchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnl_viewResult, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        Home home = new Home();
        home.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_dashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_dashboardActionPerformed
        // TODO add your handling code here:
        AdminDashboard adminDashboard = new AdminDashboard(lbl_index.getText());
        adminDashboard.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_dashboardActionPerformed

    private void btn_studentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_studentActionPerformed
        // TODO add your handling code here:
        AdminViewStudent adminViewStudent = new AdminViewStudent(lbl_index.getText());
        adminViewStudent.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_studentActionPerformed

    private void btn_lecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lecturerActionPerformed
        // TODO add your handling code here:
        AdminViewLecturer adminViewLecturer = new AdminViewLecturer(lbl_index.getText());
        adminViewLecturer.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_lecturerActionPerformed

    private void btn_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_courseActionPerformed
        // TODO add your handling code here:
        AdminViewCourse adminViewCourse = new AdminViewCourse(lbl_index.getText());
        adminViewCourse.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_courseActionPerformed

    private void btn_examActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_examActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_examActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        lbl_studentId.setText("");
        lbl_studentName.setText("");
        lbl_course.setText("");
        pnl_viewResult.setVisible(false);
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void txt_searchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchStudentActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:// Assuming txt_searchStudent, lbl_studentId, lbl_studentName, lbl_course, and tbl_result are already defined in your GUI

        // Get the student ID from the search field
        String studentID = txt_searchStudent.getText().trim(); // Get the student ID from the search field
        pnl_viewResult.setVisible(true);
        // Validate that studentID is not empty
        if (studentID.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a valid Student ID.");
            return;
        }

        String url = "jdbc:mysql://localhost:3306/LMS";  // Replace with your database URL
        String user = "root";  // Your MySQL username
        String password = "";  // Your MySQL password

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        PreparedStatement stmtStudent = null;
        ResultSet rsStudent = null;

        try {
            // Establish connection to the database
            conn = DriverManager.getConnection(url, user, password);

            // Query to retrieve student name and courseID from the Student table based on studentID
            String queryStudent = "SELECT studentName, courseID FROM Student WHERE studentID = ?";
            stmtStudent = conn.prepareStatement(queryStudent);
            stmtStudent.setString(1, studentID);  // Set student ID as a parameter

            // Execute the query for student name and courseID
            rsStudent = stmtStudent.executeQuery();

            if (rsStudent.next()) {
                // Set student name in the label
                String studentName = rsStudent.getString("studentName");
                lbl_studentName.setText(studentName);  // Display student name in the label

                // Set courseID in the label
                String courseID = rsStudent.getString("courseID");
                lbl_course.setText(courseID);  // Display course ID in the label
            } else {
                // If no student found, show a message
                JOptionPane.showMessageDialog(this, "No student found with Student ID: " + studentID);
                return; // Exit the method if no student is found
            }

            // SQL query to fetch the student's results from the Result table
            String queryResult = "SELECT subjectName, studentMarks, Grade FROM Result WHERE studentID = ?";
            stmt = conn.prepareStatement(queryResult);
            stmt.setString(1, studentID);  // Set student ID as a parameter

            // Execute the query for results
            rs = stmt.executeQuery();

            // If a result is found, display the student ID in the label and populate the table
            if (rs.next()) {
                // Set student ID in the label
                lbl_studentId.setText(studentID);  // Display student ID in the label

                // Create a model for the JTable (assuming the table already exists)
                DefaultTableModel tableModel = (DefaultTableModel) tbl_result.getModel();

                // Clear the table before adding new rows (optional, if you want to reset the table)
                tableModel.setRowCount(0);

                // Populate the table with data from the result set
                do {
                    String subjectName = rs.getString("subjectName");
                    int studentMarks = rs.getInt("studentMarks");
                    String grade = rs.getString("Grade");

                    // Add each row to the table model
                    tableModel.addRow(new Object[] { subjectName, studentMarks, grade });
                } while (rs.next());

            } else {
                // Display a message if no results are found for the student ID
                JOptionPane.showMessageDialog(this, "No results found for Student ID: " + studentID);
                pnl_viewResult.setVisible(false);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error retrieving student results: " + ex.getMessage());
        } finally {
            // Ensure resources are closed
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (rsStudent != null) {
                    rsStudent.close();
                }
                if (stmtStudent != null) {
                    stmtStudent.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }

        //pnl_viewResult.setVisible(true);
    }//GEN-LAST:event_btn_searchActionPerformed

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
            java.util.logging.Logger.getLogger(AdminViewExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminViewExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminViewExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminViewExam.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminViewExam("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_course;
    private javax.swing.JButton btn_dashboard;
    private javax.swing.JButton btn_exam;
    private javax.swing.JButton btn_lecturer;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_student;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_course;
    private javax.swing.JLabel lbl_index;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_studentId;
    private javax.swing.JLabel lbl_studentName;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JPanel pnl_viewResult;
    private javax.swing.JTable tbl_result;
    private javax.swing.JTextField txt_searchStudent;
    // End of variables declaration//GEN-END:variables
}
