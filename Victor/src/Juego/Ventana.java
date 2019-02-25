package Juego;


import javax.swing.JFrame;


public class Ventana extends JFrame {
    
    private static JFrame ventana;
    
    public void ventana(){ 
        ventana.add(new pantalla());
	ventana.setSize(1300,650);
	ventana.setLocationRelativeTo(null);
        ventana.setResizable(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
 }
       
    

