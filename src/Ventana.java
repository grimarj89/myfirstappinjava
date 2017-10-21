import javax.swing.*;
import java.util.Vector;

/*
 * Created by grim on 21/10/2017.
 */
public class Ventana extends JFrame{


    public Ventana(int width, int height){
        setBounds(50,50, width, height);

        setResizable(false);


        JButton button = new JButton("Button");
        button.setBounds(20,20, 50, 20);

        JList list = new JList();
        list.setVisible(true);
        JLabel label = new JLabel();
        label.setVisible(true);






        JPanel panel = new JPanel();

        Vector<Integer> vector = new Vector(4);

        vector.add(2);
        vector.add(3);


        for (Integer valor: vector){

            System.out.println(valor);


        }

        label.setText("La suma es: " + Operaciones.resta(vector.get(0), vector.get(1)));



        list.setListData(vector);


        panel.add(button);
        panel.add(list);
        panel.add(label);

        this.add(panel);




    }
}
