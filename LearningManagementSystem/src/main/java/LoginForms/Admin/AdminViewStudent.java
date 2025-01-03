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
public class AdminViewStudent extends javax.swing.JFrame {

    private final String adminID;

    /**
     * Creates new form AdminViewStudent
     */
    public AdminViewStudent(String adminID) {
        initComponents();
        this.adminID = adminID;
        lbl_index.setText(adminID);
        pnl_studentData.setVisible(false);
        
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
        jLabel1 = new javax.swing.JLabel();
        txt_searchStudent = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        pnl_studentData = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbl_studentId = new javax.swing.JLabel();
        lbl_studentName = new javax.swing.JLabel();
        lbl_studentNic = new javax.swing.JLabel();
        lbl_studentDob = new javax.swing.JLabel();
        lbl_studentContactNo = new javax.swing.JLabel();
        lbl_studentAddress = new javax.swing.JLabel();
        btn_cancel = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        lbl_studentEmail = new javax.swing.JLabel();
        lbl_add = new javax.swing.JLabel();
        btn_delet = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(875, 550));

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

        btn_student.setBackground(new java.awt.Color(255, 255, 255));
        btn_student.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_student.setForeground(new java.awt.Color(0, 0, 0));
        btn_student.setIcon(new javax.swing.ImageIcon("C:\\Users\\sanir\\Desktop\\NetBeans\\LearningManagementSystem\\Images\\mdi--account-student B.png")); // NOI18N
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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Search Student");

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel2.setText("Student ID");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel3.setText("Name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("NIC");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("DOB");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Address");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("Contact No");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel8.setText(":");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel9.setText(":");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel10.setText(":");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel11.setText(":");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel12.setText(":");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel13.setText(":");

        lbl_studentId.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_studentId.setText("Data");

        lbl_studentName.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_studentName.setText("Data ghjjjjjkjhfj uhgjg");

        lbl_studentNic.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_studentNic.setText("Data");

        lbl_studentDob.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_studentDob.setText("Data");

        lbl_studentContactNo.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_studentContactNo.setText("Data");

        lbl_studentAddress.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_studentAddress.setText("Data");

        btn_cancel.setBackground(new java.awt.Color(0, 0, 0));
        btn_cancel.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancel.setText("Cancel");
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });

        btn_edit.setBackground(new java.awt.Color(0, 0, 0));
        btn_edit.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        btn_edit.setForeground(new java.awt.Color(255, 255, 255));
        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel15.setText(":");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel14.setText("Email");

        lbl_studentEmail.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lbl_studentEmail.setText("Data");

        javax.swing.GroupLayout pnl_studentDataLayout = new javax.swing.GroupLayout(pnl_studentData);
        pnl_studentData.setLayout(pnl_studentDataLayout);
        pnl_studentDataLayout.setHorizontalGroup(
            pnl_studentDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_studentDataLayout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(pnl_studentDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnl_studentDataLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_studentEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnl_studentDataLayout.createSequentialGroup()
                        .addGroup(pnl_studentDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_studentDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_studentDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_studentDataLayout.createSequentialGroup()
                                .addComponent(btn_edit)
                                .addGap(18, 18, 18)
                                .addComponent(btn_cancel))
                            .addGroup(pnl_studentDataLayout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_studentId, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_studentDataLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_studentName, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_studentDataLayout.createSequentialGroup()
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_studentNic, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_studentDataLayout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_studentDob, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_studentDataLayout.createSequentialGroup()
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_studentAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnl_studentDataLayout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_studentContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 289, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        pnl_studentDataLayout.setVerticalGroup(
            pnl_studentDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_studentDataLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pnl_studentDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(lbl_studentId))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_studentDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(lbl_studentName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_studentDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel10)
                    .addComponent(lbl_studentNic))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_studentDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11)
                    .addComponent(lbl_studentDob))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_studentDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12)
                    .addComponent(lbl_studentAddress))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_studentDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel13)
                    .addComponent(lbl_studentContactNo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_studentDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15)
                    .addComponent(lbl_studentEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(pnl_studentDataLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancel)
                    .addComponent(btn_edit))
                .addGap(25, 25, 25))
        );

        lbl_add.setBackground(new java.awt.Color(0, 0, 0));
        lbl_add.setForeground(new java.awt.Color(0, 0, 0));
        lbl_add.setIcon(new javax.swing.ImageIcon("C:\\Users\\sanir\\Desktop\\NetBeans\\LearningManagementSystem\\Images\\icon-park-outline--add (2).png")); // NOI18N
        lbl_add.setText("jLabel16");
        lbl_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_addMouseClicked(evt);
            }
        });

        btn_delet.setBackground(new java.awt.Color(0, 0, 0));
        btn_delet.setForeground(new java.awt.Color(0, 0, 0));
        btn_delet.setIcon(new javax.swing.ImageIcon("C:\\Users\\sanir\\Desktop\\NetBeans\\LearningManagementSystem\\Images\\material-symbols--delete-forever (1).png")); // NOI18N
        btn_delet.setText("jLabel17");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_delet, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txt_searchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_search)
                                .addGap(24, 24, 24)
                                .addComponent(lbl_add, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnl_studentData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_searchStudent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search)
                    .addComponent(lbl_add))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_delet)
                .addGap(18, 18, 18)
                .addComponent(pnl_studentData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
        AdminViewExam adminViewExam = new AdminViewExam(lbl_index.getText());
        adminViewExam.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_examActionPerformed

    private void txt_searchStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchStudentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchStudentActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        AdminEditStudent adminEditStudent = new AdminEditStudent(lbl_index.getText());
        adminEditStudent.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btn_editActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        // TODO add your handling code here:
        String url = "jdbc:mysql://localhost:3306/LMS";
        String user = "root";
        String password = "";

        String studentId = txt_searchStudent.getText().trim();

        // Validate if the student ID field is empty
        if (studentId.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a Student ID.");
            return;
        }

        // Validate if the student ID contains only alphanumeric characters
        if (!studentId.matches("[a-zA-Z0-9]+")) {
            JOptionPane.showMessageDialog(this, "Invalid characters in Student ID. Please enter a valid Student ID.");
            return;
        }

        try {
            // Establish connection to the database
            Connection conn = DriverManager.getConnection(url, user, password);

            // Prepare SQL query to fetch student data based on studentID
            String query = "SELECT * FROM Student WHERE studentID = ?";
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setString(1, studentId);

            // Execute the query and process the result
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                lbl_studentId.setText(rs.getString("studentID"));
                lbl_studentName.setText(rs.getString("studentName"));
                lbl_studentNic.setText(rs.getString("studentNIC"));
                lbl_studentDob.setText(rs.getString("studentDOB"));
                lbl_studentAddress.setText(rs.getString("studentAddress"));
                lbl_studentContactNo.setText(rs.getString("studentContactNo"));
                lbl_studentEmail.setText(rs.getString("studentEmail"));
            } else {
                JOptionPane.showMessageDialog(this, "No student found with ID: " + studentId);
            }

            // Close resources
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error retrieving student data.");
        }



        pnl_studentData.setVisible(true);
        
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        // TODO add your handling code here:
        lbl_studentId.setText("");
        lbl_studentName.setText("");
        lbl_studentNic.setText("");
        lbl_studentDob.setText("");
        lbl_studentAddress.setText("");
        lbl_studentContactNo.setText("");
        lbl_studentEmail.setText("");
        pnl_studentData.setVisible(false);
        txt_searchStudent.setText("");
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void lbl_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_addMouseClicked
        // TODO add your handling code here:
        AdminAddStudent adminAddStudent = new AdminAddStudent(lbl_index.getText());
        adminAddStudent.setVisible(true);
        this.hide();
    }//GEN-LAST:event_lbl_addMouseClicked

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
            java.util.logging.Logger.getLogger(AdminViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminViewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminViewStudent("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_course;
    private javax.swing.JButton btn_dashboard;
    private javax.swing.JLabel btn_delet;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_exam;
    private javax.swing.JButton btn_lecturer;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btn_student;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_add;
    private javax.swing.JLabel lbl_index;
    private javax.swing.JLabel lbl_name;
    private javax.swing.JLabel lbl_studentAddress;
    private javax.swing.JLabel lbl_studentContactNo;
    private javax.swing.JLabel lbl_studentDob;
    private javax.swing.JLabel lbl_studentEmail;
    private javax.swing.JLabel lbl_studentId;
    private javax.swing.JLabel lbl_studentName;
    private javax.swing.JLabel lbl_studentNic;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JPanel pnl_studentData;
    private javax.swing.JTextField txt_searchStudent;
    // End of variables declaration//GEN-END:variables
}
