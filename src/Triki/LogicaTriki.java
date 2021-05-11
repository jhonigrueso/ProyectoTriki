package Triki;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class LogicaTriki {

    /*INICIO DE DECLARACION DE VARIABLES*/
    int turno = 0;
    boolean estado = true;

    /*FIN DE DECLARACION DE VARIABLES*/
    public void asignarJugada(JButton boton, JLabel jb_turno) {
        if (boton.getText().equals("") && estado == true) {
            if (turno % 2 == 0) {
                boton.setForeground(Color.ORANGE);
                boton.setText("X");
                jb_turno.setText("Turno de O");
            } else {
                boton.setForeground(Color.red);
                boton.setText("O");
                jb_turno.setText("Turno de X");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Ya hay una ficha en esta casilla.", "Jugada no válida", JOptionPane.WARNING_MESSAGE);
        }
        turno += 1;
    }

    /* INICIO COMPROBAR EL ESTADO DE LA POSICION QUE ESTA TOMANDO EL BOTON SI ESTA VACIO O OCUPADO");*/
    public void comprobarEstado(JButton cas1, JButton cas2, JButton cas3, JButton cas4, JButton cas5, JButton cas6, JButton cas7, JButton cas8, JButton cas9, JLabel jb_turno, JLabel puntajeX, JLabel puntajeO) {
        if (cas1.getText().equals("X") && cas2.getText().equals("X") && cas3.getText().equals("X")
                || cas4.getText().equals("X") && cas5.getText().equals("X") && cas6.getText().equals("X")
                || cas7.getText().equals("X") && cas8.getText().equals("X") && cas9.getText().equals("X")
                || cas1.getText().equals("X") && cas4.getText().equals("X") && cas7.getText().equals("X")
                || cas2.getText().equals("X") && cas5.getText().equals("X") && cas8.getText().equals("X")
                || cas3.getText().equals("X") && cas6.getText().equals("X") && cas9.getText().equals("X")
                || cas1.getText().equals("X") && cas5.getText().equals("X") && cas9.getText().equals("X")
                || cas3.getText().equals("X") && cas5.getText().equals("X") && cas7.getText().equals("X")) {
            JOptionPane.showMessageDialog(null,"FELICITACIONES, HA GANADO LA X");
            puntajeX.setText(Integer.toString(Integer.parseInt(puntajeX.getText()) + 1));
            estado = false;
            ganador(cas1, cas2, cas3, cas4, cas5, cas6, cas7, cas8, cas9, jb_turno, puntajeX, puntajeO);
            
        }
        if (cas1.getText().equals("O") && cas2.getText().equals("O") && cas3.getText().equals("O")
                || cas4.getText().equals("O") && cas5.getText().equals("O") && cas6.getText().equals("O")
                || cas7.getText().equals("O") && cas8.getText().equals("O") && cas9.getText().equals("O")
                || cas1.getText().equals("O") && cas4.getText().equals("O") && cas7.getText().equals("O")
                || cas2.getText().equals("O") && cas5.getText().equals("O") && cas8.getText().equals("O")
                || cas3.getText().equals("O") && cas6.getText().equals("O") && cas9.getText().equals("O")
                || cas1.getText().equals("O") && cas5.getText().equals("O") && cas9.getText().equals("O")
                || cas3.getText().equals("O") && cas5.getText().equals("O") && cas7.getText().equals("O")) {
           JOptionPane.showMessageDialog(null,"FELICITACIONES, HA GANADO LA O");
            puntajeO.setText(Integer.toString(Integer.parseInt(puntajeO.getText()) + 1));
            estado = false;
            ganador(cas1, cas2, cas3, cas4, cas5, cas6, cas7, cas8, cas9, jb_turno, puntajeX, puntajeO);
        }
    }

    /*REINICIO COMPLETO DE LA TABLA*/
    public void reiniciar(JButton cas1, JButton cas2, JButton cas3, JButton cas4, JButton cas5, JButton cas6, JButton cas7, JButton cas8, JButton cas9, JLabel jb_turno) {
        cas1.setText("");
        cas2.setText("");
        cas3.setText("");
        cas4.setText("");
        cas5.setText("");
        cas6.setText("");
        cas7.setText("");
        cas8.setText("");
        cas9.setText("");
        cas1.setBackground(Color.DARK_GRAY);
        cas2.setBackground(Color.DARK_GRAY);
        cas3.setBackground(Color.DARK_GRAY);
        cas4.setBackground(Color.DARK_GRAY);
        cas5.setBackground(Color.DARK_GRAY);
        cas6.setBackground(Color.DARK_GRAY);
        cas7.setBackground(Color.DARK_GRAY);
        cas8.setBackground(Color.DARK_GRAY);
        cas9.setBackground(Color.DARK_GRAY);
        jb_turno.setText("Turno de X");
        estado = true;
    }
    

    public void ganador(JButton cas1, JButton cas2, JButton cas3, JButton cas4, JButton cas5, JButton cas6, JButton cas7, JButton cas8, JButton cas9, JLabel jb_turno, JLabel puntajeX, JLabel puntajeO) {
        if ((cas1.getText().equals("X") && cas2.getText().equals("X") && cas3.getText().equals("X") || cas1.getText().equals("O") && cas2.getText().equals("O") && cas3.getText().equals("O"))) {
            cas1.setBackground(Color.GREEN);
            cas2.setBackground(Color.GREEN);
            cas3.setBackground(Color.GREEN);
        } else if ((cas4.getText().equals("X") && cas5.getText().equals("X") && cas6.getText().equals("X") || cas4.getText().equals("O") && cas5.getText().equals("O") && cas6.getText().equals("O"))) {
            cas4.setBackground(Color.GREEN);
            cas5.setBackground(Color.GREEN);
            cas6.setBackground(Color.GREEN);
        }else if ((cas7.getText().equals("X") && cas8.getText().equals("X") && cas9.getText().equals("X") || cas7.getText().equals("O") && cas8.getText().equals("O") && cas9.getText().equals("O"))) {
            cas7.setBackground(Color.GREEN);
            cas8.setBackground(Color.GREEN);
            cas9.setBackground(Color.GREEN);
        }else if ((cas1.getText().equals("X") && cas5.getText().equals("X") && cas9.getText().equals("X") || cas1.getText().equals("O") && cas5.getText().equals("O") && cas9.getText().equals("O"))) {
            cas1.setBackground(Color.GREEN);
            cas5.setBackground(Color.GREEN);
            cas9.setBackground(Color.GREEN);
        }else if ((cas3.getText().equals("X") && cas5.getText().equals("X") && cas7.getText().equals("X") || cas3.getText().equals("O") && cas5.getText().equals("O") && cas7.getText().equals("O"))) {
            cas3.setBackground(Color.GREEN);
            cas5.setBackground(Color.GREEN);
            cas7.setBackground(Color.GREEN);
        }else if ((cas3.getText().equals("X") && cas6.getText().equals("X") && cas9.getText().equals("X") || cas3.getText().equals("O") && cas6.getText().equals("O") && cas9.getText().equals("O"))) {
            cas3.setBackground(Color.GREEN);
            cas6.setBackground(Color.GREEN);
            cas9.setBackground(Color.GREEN);
        }else if ((cas2.getText().equals("X") && cas5.getText().equals("X") && cas8.getText().equals("X") || cas2.getText().equals("O") && cas5.getText().equals("O") && cas8.getText().equals("O"))) {
            cas2.setBackground(Color.GREEN);
            cas5.setBackground(Color.GREEN);
            cas8.setBackground(Color.GREEN);
        }else if ((cas1.getText().equals("X") && cas4.getText().equals("X") && cas7.getText().equals("X") || cas1.getText().equals("O") && cas4.getText().equals("O") && cas7.getText().equals("O"))) {
            cas1.setBackground(Color.GREEN);
            cas4.setBackground(Color.GREEN);
            cas7.setBackground(Color.GREEN);
        }

    }
    
    
    /*private void empatejuego(JButton cas1, JButton cas2, JButton cas3, JButton cas4, JButton cas5, JButton cas6, JButton cas7, JButton cas8, JButton cas9) {
        int acu = 0;

        for (int j = 0; j <= 2; j++) {
            for (int k = 0; k <= 2; k++) {
                acu = acu + matriz[j][k];

            }
        }
        if (acu == 1380 || acu == 1536) {

            JOptionPane.showMessageDialog(rootPane, "empate ole!");
            conempate = conempate + 1;
            contjuegos = contjuegos + 1;
            String e = Integer.toString(conempate);
            empate.setText(e);
            borra();
        }*/
}
