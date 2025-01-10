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

/**
 *
 * @author sanir
 */
public class AdminAddCourse extends javax.swing.JFrame {

    private final String adminID;

    /**
     * Creates new form AdminAddCourse
     */
    public AdminAddCourse(String adminID) {
        initComponents();
        this.adminID = adminID;
        lbl_index.setText(adminID);

        String connectionString = "jdbc:mysql://localhost:3306/LMS";
        String dbUsername = "root";
        String dbPassword = "";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            String adminId = lbl_index.getText().trim();

            if (adminId.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Admin ID is missing in lbl_index.");
                return;
            }

            conn = DriverManager.getConnection(connectionString, dbUsername, dbPassword);

            String sql = "SELECT adminName FROM Admin WHERE adminID = ?";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, adminId);

            rs = stmt.executeQuery();

            if (rs.next()) {
                String adminName = rs.getString("adminName");
                lbl_name.setText(adminName);
            } else {
                JOptionPane.showMessageDialog(this, "No admin found with ID: " + adminId);
                lbl_name.setText("");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Error retrieving admin name: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Error closing database resources: " + ex.getMessage());
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
        btn_logout = new javax.swing.JButton();
        btn_dashboard = new javax.swing.JButton();
        btn_student = new javax.swing.JButton();
        btn_lecturer = new javax.swing.JButton();
        btn_course = new javax.swing.JButton();
        btn_exam = new javax.swing.JButton();
        lbl_user = new javax.swing.JLabel();
        lbl_index = new javax.swing.JLabel();
        lbl_name = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txt_courseStudentNo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txt_courseStart = new javax.swing.JTextField();
        txt_courseEnd = new javax.swing.JTextField();
        txt_courseId = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_courseName = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_add = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

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

        btn_course.setBackground(new java.awt.Color(255, 255, 255));
        btn_course.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_course.setForeground(new java.awt.Color(0, 0, 0));
        btn_course.setIcon(new javax.swing.ImageIcon("C:\\Users\\sanir\\Desktop\\NetBeans\\LearningManagementSystem\\Images\\ic--baseline-class B.png")); // NOI18N
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
                .addContainerGap(155, Short.MAX_VALUE)
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

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Name");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("No of Students");

        txt_courseStudentNo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_courseStudentNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_courseStudentNoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("Start Date");

        txt_courseStart.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_courseStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_courseStartActionPerformed(evt);
            }
        });

        txt_courseEnd.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_courseEnd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_courseEndActionPerformed(evt);
            }
        });

        txt_courseId.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_courseId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_courseIdActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setText(":");

        txt_courseName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        txt_courseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_courseNameActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setText(":");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Course ID");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setText(":");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Add Course");

        btn_add.setBackground(new java.awt.Color(0, 0, 0));
        btn_add.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_cancel.setBackground(new java.awt.Color(0, 0, 0));
        btn_cancel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setText("Start End");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel15.setText(":");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel13.setText(":");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel2))
                                    .addGap(51, 51, 51))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel14))
                                .addGap(48, 48, 48)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txt_courseId, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                                    .addComponent(txt_courseName)
                                    .addComponent(txt_courseStudentNo)
                                    .addComponent(txt_courseStart)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_add)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_cancel))
                                    .addComponent(txt_courseEnd, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(130, 130, 130))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel1)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(txt_courseId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(txt_courseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_courseStudentNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel13)
                    .addComponent(txt_courseStart, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(txt_courseEnd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancel)
                    .addComponent(btn_add))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    }//GEN-LAST:event_btn_courseActionPerformed

    private void btn_examActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_examActionPerformed
        // TODO add your handling code here:
        AdminViewExam adminViewExam = new AdminViewExam(lbl_index.getText());
        adminViewExam.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_examActionPerformed

    private void txt_courseStudentNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_courseStudentNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_courseStudentNoActionPerformed

    private void txt_courseStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_courseStartActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_courseStartActionPerformed

    private void txt_courseEndActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_courseEndActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_courseEndActionPerformed

    private void txt_courseIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_courseIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_courseIdActionPerformed

    private void txt_courseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_courseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_courseNameActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        // TODO add your handling code here:
        String url = "jdbc:mysql://localhost:3306/LMS";
        String user = "root";
        String password = "";

        String courseId = txt_courseId.getText().trim();
        String courseName = txt_courseName.getText().trim();
        String numberOfStudentsStr = txt_courseStudentNo.getText().trim();
        String startDate = txt_courseStart.getText().trim();
        String endDate = txt_courseEnd.getText().trim();

        if (courseId.isEmpty() || courseName.isEmpty() || numberOfStudentsStr.isEmpty()
                || startDate.isEmpty() || endDate.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required.");
            return;
        }

        int numberOfStudents;
        try {
            numberOfStudents = Integer.parseInt(numberOfStudentsStr);
            if (numberOfStudents > 300 || numberOfStudents < 1) {
                JOptionPane.showMessageDialog(this, "Number of students must be between 1 and 300.");
                return;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid number format for Number of Students.");
            return;
        }

        try {
            Connection conn = DriverManager.getConnection(url, user, password);

            String query = "INSERT INTO Course (courseID, courseName, numberOfStudents, startDate, endDate) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(query);

            stmt.setString(1, courseId);
            stmt.setString(2, courseName);
            stmt.setInt(3, numberOfStudents);
            stmt.setString(4, startDate);
            stmt.setString(5, endDate);

            int rowsInserted = stmt.executeUpdate();

            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Course added successfully.");
                txt_courseId.setText("");
                txt_courseName.setText("");
                txt_courseStudentNo.setText("");
                txt_courseStart.setText("");
                txt_courseEnd.setText("");
            }

            // Close resources
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error adding course.");
        }


    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        //        txt_studentId.setText("");
        //        txt_studentName.setText("");
        //        txt_studentNic.setText("");
        //        txt_studentDob.setText("");
        //        txt_studentAddress.setText("");
        //        txt_studentContactNo.setText("");
        //        txt_studentEmail.setText("");
        AdminViewCourse adminViewCourse = new AdminViewCourse(lbl_index.getText());
        adminViewCourse.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_cancelActionPerformed

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
            java.util.logging.Logger.getLogger(AdminAddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminAddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminAddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminAddCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminAddCourse("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_course;
    private javax.swing.JButton btn_dashboard;
    private javax.swing.JButton btn_exam;
    private javax.swing.JButton btn_lecturer;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_student;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_index;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JTextField txt_courseEnd;
    private javax.swing.JTextField txt_courseId;
    private javax.swing.JTextField txt_courseName;
    private javax.swing.JTextField txt_courseStart;
    private javax.swing.JTextField txt_courseStudentNo;
    // End of variables declaration//GEN-END:variables
}
