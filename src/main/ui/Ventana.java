package main.ui;

import main.models.Proceso;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;


/*
 * Created by grim on 21/10/2017.
 */
public class Ventana extends JFrame implements ActionListener {

    private JLabel label;
    JList list;

    public Ventana(int width, int height){
        setBounds(50,50, width, height);

        setResizable(false);


        JButton button = new JButton("Iniciar");
        button.setBounds(20,20, 50, 20);

        list = new JList();

        list.setListData((Vector) getListProcess(5));
        list.setCellRenderer(getCellRender());


        list.setVisible(true);
        label = new JLabel("Timer");
        label.setVisible(true);



        JPanel panel = new JPanel();


        button.addActionListener(this);


        panel.add(button);
        panel.add(label);
        panel.add(list);

        this.add(panel);




    }

    private void showTimer(int numero){

        Thread thread = new Thread(() -> {


            label.setText("Inicio");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (int i = numero; i >= 0 ; i--){

                label.setText("" + i);


                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }


            }

            label.setText("Finish");



        });

        thread.start();


    }

    @Override
    public void actionPerformed(ActionEvent e) {


        //showTimer(10);

        Proceso pSelected = (Proceso) list.getSelectedValue();


        label.setText(" "+ pSelected.getNombre());







    }




    private List<Proceso> getListProcess(int cantidad){

        /// lista para poblar
        List<Proceso> list = new Vector<>();

        for (int i = 0; i <= cantidad ; i++ ){


            final Proceso proceso =
                    new Proceso("nombre " + i, 4, i, i );

            list.add(proceso);


        }



        return list;

    }


    private ListCellRenderer<? super Proceso> getCellRender(){

        return new DefaultListCellRenderer(){

            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value,
                                                          int index, boolean isSelected,
                                                          boolean cellHasFocus) {

                Proceso proceso = (Proceso) value;
                return super.getListCellRendererComponent(list,
                        proceso.getNombre()+ "/n Quantum:"+proceso.getQuantum(),
                        index, isSelected, cellHasFocus);


            }
        };



    }





}
