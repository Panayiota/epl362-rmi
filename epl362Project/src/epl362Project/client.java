package epl362Project;

import javax.swing.*;

import java.awt.Button;
import java.awt.Dimension;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class client {
	static Communication comm;
	public static void main(String[] args)throws Exception {
		//create a url to locate the RMI server
		String url=new String("rmi://localhost:2020/RMI");
		//locate the rmi server
		comm=(Communication)Naming.lookup(url);
		
		//start creating a gui
		JFrame frame=new JFrame("");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Dimension d=new Dimension(100, 100);
		frame.setSize(new Dimension(323, 326));
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JButton btnConnectionTest = new JButton("Connection Test");
		btnConnectionTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					System.out.println(comm.Communicate());
				} catch (RemoteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
		GridBagConstraints gbc_btnConnectionTest = new GridBagConstraints();
		gbc_btnConnectionTest.gridx = 0;
		gbc_btnConnectionTest.gridy = 0;
		frame.getContentPane().add(btnConnectionTest, gbc_btnConnectionTest);
		frame.setVisible(true);
	}


}
