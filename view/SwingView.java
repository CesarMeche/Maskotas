package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import presenter.SwingPresenter;

public class SwingView implements ComportamientoView {

	private JFrame frame;
	private JButton boton;
	private JTextField n1;
	private JTextField n2;
	private JLabel res;
	private JLabel ln1;
	private JLabel ln2;
	private JLabel lop;
	private JTextField op;
	
	private SwingPresenter sp;
		
	public SwingView() {
		super();
		
		sp = new SwingPresenter(this);
		
		frame = new JFrame("Calculadora");
		boton = new JButton("Operar");
		n1 = new JTextField();
		n2 = new JTextField();
		op = new JTextField();
		res = new JLabel("El resultado de la operación es:");
		ln1 = new JLabel("Número 1");
		ln2 = new JLabel("Número 2");
		lop = new JLabel("Operación (+,-,/,*,^)");
		
		frame.setSize(500, 250); 
		
		pedirDatos();
	}
	
	@Override
	public void mostrarResultado(Object T) {
		getRes().setText("El resultado de la operación es: "+String.valueOf(T));
		getFrame().repaint();
	}

	@Override
	public void pedirDatos() {
		 frame.setVisible(true);
		 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 frame.setLayout(new GridLayout(4,2)); 
		 
		 frame.add(ln1);
		frame.add(n1);
		frame.add(lop);
		frame.add(op);
		frame.add(ln2);
		frame.add(n2);
		frame.add(boton);
		frame.add(res);
		 
		 boton.addActionListener(sp);
	}

	public JFrame getFrame() {
		return frame;
	}



	public void setFrame(JFrame frame) {
		this.frame = frame;
	}



	public JButton getBoton() {
		return boton;
	}



	public void setBoton(JButton boton) {
		this.boton = boton;
	}



	public JTextField getN1() {
		return n1;
	}



	public void setN1(JTextField n1) {
		this.n1 = n1;
	}



	public JTextField getN2() {
		return n2;
	}



	public void setN2(JTextField n2) {
		this.n2 = n2;
	}



	public JLabel getRes() {
		return res;
	}



	public void setRes(JLabel res) {
		this.res = res;
	}



	public JTextField getOp() {
		return op;
	}



	public void setOp(JTextField op) {
		this.op = op;
	}



	public SwingPresenter getSp() {
		return sp;
	}



	public void setSp(SwingPresenter sp) {
		this.sp = sp;
	}



	

}
