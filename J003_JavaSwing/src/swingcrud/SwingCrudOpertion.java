package swingcrud;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import conn.JavaConn;
import net.proteanit.sql.DbUtils;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class SwingCrudOpertion {

	private JFrame frame;
	private JTextField t1;
	private JTextField t2;
	private JTextField id;
	private JPasswordField passwordField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingCrudOpertion window = new SwingCrudOpertion();
					window.frame.setVisible(true);

				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SwingCrudOpertion() {
		initialize();
		Connection();
		loadData();

	}

	Connection con;

	private void Connection() {

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/kiran", "root", "kiran@1727");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void loadData() {

		try {
			PreparedStatement ps = con.prepareStatement("Select * from user");
			ResultSet rs = ps.executeQuery();

			table.setModel(DbUtils.resultSetToTableModel(rs));

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private void resetText() {
		id.setText("");
		t1.setText("");
		t2.setText("");
		passwordField.setText("");
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 826, 433);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(31, 58, 253, 302);
		frame.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel uname = new JLabel("Username ");
		uname.setFont(new Font("Times New Roman", Font.BOLD, 12));
		uname.setBounds(20, 76, 58, 14);
		panel.add(uname);

		t1 = new JTextField();
		t1.setBounds(98, 73, 120, 20);
		panel.add(t1);
		t1.setColumns(10);

		JLabel uemail = new JLabel("Email");
		uemail.setFont(new Font("Times New Roman", Font.BOLD, 12));
		uemail.setBounds(20, 102, 58, 14);
		panel.add(uemail);

		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(98, 99, 120, 20);
		panel.add(t2);

		JLabel Password = new JLabel("Password");
		Password.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Password.setBounds(20, 132, 58, 14);
		panel.add(Password);

		passwordField = new JPasswordField();
		passwordField.setBounds(98, 129, 120, 20);
		panel.add(passwordField);

		JButton btnSubmit = new JButton("Submit");
		btnSubmit.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name = t1.getText();
				String email = t2.getText();
				String pass = passwordField.getText();

				try {
					PreparedStatement ps = con.prepareStatement("insert into user values(?,?,?,?)");
					ps.setInt(1, 0);
					ps.setString(2, name);
					ps.setString(3, email);
					ps.setString(4, pass);
					int i = ps.executeUpdate();

					if (i > 0) {
						JOptionPane.showMessageDialog(frame, "Submit Record SuccessFully");
						resetText();
						loadData();

					} else {
						JOptionPane.showMessageDialog(frame, " Record Not Insert Please Check.....");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}

		});
		btnSubmit.setBounds(20, 160, 91, 23);
		panel.add(btnSubmit);

		JButton btnreset = new JButton("Reset");
		btnreset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				id.setText("");
				t1.setText("");
				t2.setText("");
				passwordField.setText("");
			}
		});
		btnreset.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnreset.setBounds(117, 160, 91, 23);
		panel.add(btnreset);

		JButton btnupdate = new JButton("Update");
		btnupdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				int uid = Integer.parseInt(id.getText().toString().trim());
				String name = t1.getText();
				String email = t2.getText();
				String pass = passwordField.getText();

				try {
					PreparedStatement ps = con
							.prepareStatement("update user set username=?,email=?,password=? where id=?");
					ps.setString(1, name);
					ps.setString(2, email);
					ps.setString(3, pass);
					ps.setInt(4, uid);

					int i = ps.executeUpdate();

					if (i > 0) {
						JOptionPane.showMessageDialog(frame, "Update Data Successfully");
						loadData();
						resetText();
					} else {
						JOptionPane.showMessageDialog(frame, "Not Update.....");
					}

				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnupdate.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btnupdate.setBounds(20, 194, 91, 23);
		panel.add(btnupdate);

		JButton btndelete = new JButton("Delete");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int uid = Integer.parseInt(id.getText().toString().trim());

				try {
					PreparedStatement ps = con.prepareStatement("delete from user where id=?");
					ps.setInt(1, uid);
					int i = ps.executeUpdate();
					if (i > 0) {
						JOptionPane.showMessageDialog(frame, "Delete Data Successfully");
						loadData();
					} else {
						JOptionPane.showMessageDialog(frame, "Error....");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			}
		});
		btndelete.setFont(new Font("Times New Roman", Font.BOLD, 12));
		btndelete.setBounds(117, 194, 91, 23);
		panel.add(btndelete);

		JLabel Uid = new JLabel("Id");
		Uid.setFont(new Font("Times New Roman", Font.BOLD, 12));
		Uid.setBounds(20, 45, 58, 14);
		panel.add(Uid);

		id = new JTextField();
		id.setColumns(10);
		id.setBounds(98, 42, 120, 20);
		panel.add(id);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(319, 58, 452, 302);
		frame.getContentPane().add(scrollPane);

		table = new JTable();
		scrollPane.setViewportView(table);
		
		JLabel lblStudentRegistration = new JLabel("Student Registration");
		lblStudentRegistration.setFont(new Font("Times New Roman", Font.BOLD, 19));
		lblStudentRegistration.setBounds(309, 11, 177, 36);
		frame.getContentPane().add(lblStudentRegistration);

		table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				int Selectedrow = table.getSelectedRow();
				if (Selectedrow != -1) {
					id.setText(table.getValueAt(Selectedrow, 0).toString());
					t1.setText(table.getValueAt(Selectedrow, 1).toString());
					t2.setText(table.getValueAt(Selectedrow, 2).toString());
					passwordField.setText(table.getValueAt(Selectedrow, 3).toString());
				}
			}
		});

	}
}
