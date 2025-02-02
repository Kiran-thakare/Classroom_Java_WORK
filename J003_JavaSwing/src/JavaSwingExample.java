
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import dao.JavaDAO;
import model.user;
import net.proteanit.sql.DbUtils;

public class JavaSwingExample {

	public static JTable table;
	public static JLabel l1, l2, l3, l4, l5;
	public static JTextField t1, t2, t3, t4, t5;
	public static JButton b1, b2, b3, b4;
	public static JScrollPane scroll;

	public static void main(String[] args) {

		JavaDAO dao = new JavaDAO();

		JFrame frame = new JFrame();
		frame.setTitle("CRUD Operation");
		frame.setLayout(null);

		table = new JTable();
		scroll = new JScrollPane(table);
		scroll.setBounds(10, 280, 470, 350);

		l1 = new JLabel("Id ");
		l1.setBounds(80, 30, 70, 30);

		t1 = new JTextField();
		t1.setBounds(160, 40, 150, 20);

		l2 = new JLabel("First Name");
		l2.setBounds(80, 60, 70, 30);

		t2 = new JTextField();
		t2.setBounds(160, 70, 150, 20);

		l3 = new JLabel("Last Name");
		l3.setBounds(80, 90, 70, 30);

		t3 = new JTextField();
		t3.setBounds(160, 100, 150, 20);

		l4 = new JLabel("Email");
		l4.setBounds(80, 125, 70, 30);

		t4 = new JTextField();
		t4.setBounds(160, 130, 150, 20);

		l5 = new JLabel("Mobile No");
		l5.setBounds(80, 155, 70, 30);

		t5 = new JTextField();
		t5.setBounds(160, 160, 150, 20);

		b1 = new JButton();
		b1.setText("Insert");
		b1.setBounds(80, 190, 100, 30);

		b2 = new JButton();
		b2.setText("Search");
		b2.setBounds(200, 190, 100, 30);

		b3 = new JButton();
		b3.setText("Update");
		b3.setBounds(80, 230, 100, 30);

		b4 = new JButton();
		b4.setText("Delete");
		b4.setEnabled(false);
		b4.setBounds(200, 230, 100, 30);

		frame.add(l1);
		frame.add(t1);
		frame.add(l2);
		frame.add(t2);
		frame.add(l3);
		frame.add(t3);
		frame.add(l4);
		frame.add(t4);
		frame.add(l5);
		frame.add(t5);
		frame.add(b1);
		frame.add(b2);
		frame.add(b3);
		frame.add(b4);
		frame.add(scroll);

		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setSize(500, 600);
		frame.setLocationRelativeTo(null);

		b1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String firstname = t2.getText().toString().trim();
				String lastname = t3.getText().toString().trim();
				String email = t4.getText().toString().trim();
				String mobileno = t5.getText().toString().trim();

				user user = new user();
				user.setFirstName(firstname);
				user.setLastName(lastname);
				user.setEmail(email);
				user.setMobileNo(mobileno);

				try {
					int affectrow = dao.insertUser(user);
					if (affectrow > 0) {

						resetTable();
						showDialog("Insert Record Successfully");
						recordShow(user);
					} else {
						showDialog("Error... Please check Query");
					}
				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}

			private void recordShow(user user) {
				try {
					ResultSet rs = dao.alluser(user);
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

			private void showDialog(String message) {

				JOptionPane.showMessageDialog(frame, message);

			}
		});

		/* Search Button */
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// int id = Integer.parseInt(t1.getText().toString().trim());
				String firstname = t2.getText().toString().trim();
				String lastname = t3.getText().toString().trim();

				user user = new user();
				user.setFirstName(firstname);
				user.setLastName(lastname);

				try {
					ResultSet rs = dao.searchUser(user);

					if (rs.next()) {
						refreshtable(user);
						showDialog(frame, " Record found Successfully");
						refreshtable(user);
					}

				} catch (SQLException e1) {
					e1.printStackTrace();
				}
			}

			private void refreshtable(user user) {
				try {
					ResultSet rs = dao.searchUser(user);
					table.setModel(DbUtils.resultSetToTableModel(rs));
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}

		});

		/* Update Button */
		b3.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int id = Integer.parseInt(t1.getText().toString().trim());
				String firstname = t2.getText().toString().trim();
				String lastname = t3.getText().toString().trim();
				String mobileno = t5.getText().toString().trim();

				user user = new user();
				user.setId(id);
				user.setFirstName(firstname);
				user.setLastName(lastname);
				user.setMobileNo(mobileno);

				try {
					int affectrow = dao.updateUser(user);
					if (affectrow > 0) {

						showDialog(frame, "Update Record Successfully");
					} else {
						showDialog(frame, "Error... Please check Query");
					}

				} catch (SQLException e1) {

					e1.printStackTrace();
				}
			}

		});

		b4.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				int id = Integer.parseInt(t1.getText().toString().trim());

				user user = new user();
				user.setId(id);

				try {
					int affectRow = dao.deleteUser(user);
					if (affectRow > 0) {

						showDialog(frame, "Delete Record Successfully");
						resetTable();
					} else {
						showDialog(frame, "Not Found Id ....");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});

		table.getSelectionModel().addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				int selectedRow = table.getSelectedRow();

				if (selectedRow != -1) {
					t1.setText(table.getValueAt(selectedRow, 0).toString());
					t2.setText(table.getValueAt(selectedRow, 1).toString());
					t3.setText(table.getValueAt(selectedRow, 2).toString());
					t4.setText(table.getValueAt(selectedRow, 3).toString());
					t5.setText(table.getValueAt(selectedRow, 4).toString());

					b1.setEnabled(false);
					b4.setEnabled(true);

				}

			}
		});

	}

	protected static void showDialog(JFrame frame, String mess) {

		JOptionPane.showMessageDialog(frame, mess);

	}

	private static void resetTable() {
		t1.setText("");
		t2.setText("");
		t3.setText("");
		t4.setText("");
		t5.setText("");
		b1.setEnabled(true);
		b4.setEnabled(false);

	}

}
