import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.GregorianCalendar;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

import javax.swing.JTable;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.Dimension;


public class CalendarApplication {

	private JFrame frame;
	private JTable table;
	private DefaultTableModel m_defTblModel = new DefaultTableModel();
	private int m_realMonth = -1;
	private int m_realYear = -1;
	private int m_realDay = -1;
	private int m_currentMonth = -1;
	private int m_currentYear = -1;
	
	private JButton buttonPrevious=null;
	private JButton buttonNext=null;
	private JLabel lblMonth; 
	private JLabel lblChangeYear;
	private JComboBox comboBox;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalendarApplication window = new CalendarApplication();
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
	public CalendarApplication() {
		m_defTblModel = new DefaultTableModel();
		GregorianCalendar cal = new GregorianCalendar();
		m_realDay = cal.get(GregorianCalendar.DAY_OF_MONTH);
		m_realMonth = cal.get(GregorianCalendar.MONTH);
		m_realYear = cal.get(GregorianCalendar.YEAR);
		m_currentMonth = m_realMonth; 
		m_currentYear = m_realYear;
		
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 792, 516);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 0, 776, 467);
		frame.getContentPane().add(panel);
		
		buttonPrevious = new JButton("<<Previous");
		buttonPrevious.setBounds(10, 15, 100, 23);
		buttonPrevious.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (m_currentMonth == 0)
				{ //Back one year
					m_currentMonth = 11;
					m_currentYear -= 1;
				}
				else
				{ //Back one month
					m_currentMonth -= 1;
				}

				refreshCalendar(m_currentMonth, m_currentYear);

			}
		});
		panel.setLayout(null);
		buttonPrevious.setHorizontalAlignment(SwingConstants.LEFT);
		panel.add(buttonPrevious);
		
		lblMonth = new JLabel("Month");
		lblMonth.setHorizontalAlignment(SwingConstants.CENTER);
		lblMonth.setBounds(109, 15, 73, 23);
		panel.add(lblMonth);
		
		buttonNext = new JButton("Next>>");
		buttonNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) 
			{
				if (m_currentMonth == 11)
				{ //Back one year
					m_currentMonth = 0;
					m_currentYear += 1;
				}
				else
				{ //Back one month
					m_currentMonth += 1;
				}

				refreshCalendar(m_currentMonth, m_currentYear);

			}
		});
		buttonNext.setBounds(181, 15, 100, 23);
		panel.add(buttonNext);
		
		lblChangeYear = new JLabel("Change Year:");
		lblChangeYear.setHorizontalAlignment(SwingConstants.CENTER);
		lblChangeYear.setBounds(271, 15, 100, 23);
		panel.add(lblChangeYear);
		
		comboBox = new JComboBox();
		
		for (int i=m_realYear-100; i<=m_realYear+100; i++)
		{
			   comboBox.addItem(String.valueOf(i));
		}

		comboBox.addActionListener(new ActionListener() 
		{
			public void actionPerformed(ActionEvent arg0)
			{
				if (comboBox.getSelectedItem() != null)
				{
					String b = comboBox.getSelectedItem().toString();
					m_currentYear = Integer.parseInt(b); //Get the numeric value
					refreshCalendar(m_currentMonth, m_currentYear); //Refresh
				}
			}
		});
		comboBox.setBounds(355, 22, 69, 20);
		panel.add(comboBox);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 49, 726, 407);
		panel.add(scrollPane);
		
		table = new JTable(m_defTblModel );
		scrollPane.setViewportView(table);
		
		String[] headers = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"}; //All headers
		
		for (int i=0; i<7/*or headers.length*/; i++)
		{
		   m_defTblModel.addColumn(headers[i]);
		}
		
		table.setColumnSelectionAllowed(true);
		table.setRowSelectionAllowed(true);
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		//Set row/column count 
		table.setRowHeight(38);
		m_defTblModel.setColumnCount(7);
		m_defTblModel.setRowCount(6);

		table.getParent().setBackground(table.getBackground());
		refreshCalendar(m_realMonth,m_realYear);
		refreshCalendar(m_currentMonth, m_currentYear);
	}
	public void refreshCalendar(int monthIndex, int year)
	{
		String[] monthsList = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

		int numberOfDays= -1;  //Number Of Days
		int startOfMonth = -1; //Start Of Month
		
		buttonPrevious.setEnabled(true); //Enable buttons at first
		buttonNext.setEnabled(true);

	
		if ((monthIndex == 0) && (year <= m_realYear - 100))
		{
			//A month before January 100 years ago cannot be reached
			buttonPrevious.setEnabled(false);
		}

		if ((monthIndex == 11) && (year >= m_realYear + 100))
		{
			//A month after December 100 years later cannot be reached
			buttonNext.setEnabled(false);
		}

		lblMonth.setText(monthsList[monthIndex]); //Refresh the month label (at the top)
		comboBox.setSelectedItem(String.valueOf(year)); //Select the correct year in the 
		

		GregorianCalendar cal = new GregorianCalendar(year, monthIndex, 1);
		numberOfDays = cal.getActualMaximum(GregorianCalendar.DAY_OF_MONTH);
		startOfMonth = cal.get(GregorianCalendar.DAY_OF_WEEK);

		//Clear table
		for (int i=0; i<6; i++)
		{
			for (int j=0; j<7; j++)
			{
				m_defTblModel.setValueAt(null, i, j);
			}
		}

		for (int i=1; i<=numberOfDays; i++)
		{
			int row = new Integer((i+startOfMonth-2)/7);
			int column  =  (i+startOfMonth-2)%7;
			m_defTblModel.setValueAt(i, row, column);
		}
	


	}

}

