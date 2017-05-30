package view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;

import model.JSONProcesor;
import model.VideoProcesor;

public class ContentWindow extends JPanel implements ActionListener{

	private JButton BtnLoadVideos;
	private JButton BtnSelectChart;
	private JComboBox<String> JCBTypeCharts;
	private JSONProcesor Procesor;

	public ContentWindow(){
		init();
	}

	private void init(){
		this.setLayout(null);
		this.setSize(800, 600);
		this.setBackground(Color.white);
		BtnLoadVideos = new JButton("Cargar videos");
		BtnLoadVideos.addActionListener(this);

		BtnSelectChart = new JButton("Seleccionar");
		BtnSelectChart.addActionListener(this);
		
		JCBTypeCharts = new JComboBox<>();
		JCBTypeCharts.addItem("Tipo de gráfico");
		JCBTypeCharts.addItem("Scatter chart");
		JCBTypeCharts.addItem("Line chart");
		JCBTypeCharts.addItem("Bar chart");
		
		Procesor = new JSONProcesor();
		
		this.add(BtnSelectChart).setBounds(600, 200, 130, 25);
		this.add(BtnLoadVideos).setBounds(600, 50, 130, 25);
		this.add(JCBTypeCharts).setBounds(600, 150, 150, 25);
		repaint();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == BtnLoadVideos){
			VideoProcesor proc = new VideoProcesor();
			proc.analizarVideos();
		}
		if(e.getSource() == BtnSelectChart){
			Procesor.extractInfo();
			if(JCBTypeCharts.getSelectedIndex() == 2){
				
			}
			if(JCBTypeCharts.getSelectedIndex() == 3){

			}
			if(JCBTypeCharts.getSelectedIndex() == 4){

			}
		}
	}
}
