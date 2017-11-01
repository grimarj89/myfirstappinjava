import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

/*
 * Created by grim on 21/10/2017.
 */
public class Ventana extends JFrame implements ActionListener {

    private JLabel label;


    public Ventana(int width, int height){
        setBounds(50,50, width, height);

        setResizable(false);


        JButton button = new JButton("Iniciar");
        button.setBounds(20,20, 50, 20);

        JList list = new JList();
        list.setVisible(true);
        label = new JLabel("Timer");
        label.setVisible(true);



        JPanel panel = new JPanel();


        button.addActionListener(this);


        panel.add(button);
        panel.add(label);

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


        showTimer(10);
    }
}
