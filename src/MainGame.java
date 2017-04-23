import javafx.scene.control.CheckBox;

import java.awt.*;
import java.awt.event.*;

/**
 * Created by vaibhav on 23/4/17.
 */
public class MainGame extends Frame implements ItemListener{

    CheckboxGroup options;
    Checkbox option_5;
    Checkbox option_10;



    Checkbox option_20;

    public MainGame(){


        this.setSize(900,900);
        this.setVisible(true);
        this.setTitle("Epidemic Dots");
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent windowEvent) {
                super.windowClosing(windowEvent);
                System.exit(0);
            }
        });

        //setting layout to null
        this.setLayout(null);

        options=new CheckboxGroup();
        option_5=new Checkbox("5",options,false);
        option_10=new Checkbox("10",options,false);
        option_20=new Checkbox("20",options,false);

        option_5.setBounds(440,350,50,50);
        option_10.setBounds(440,390,50,50);
        option_20.setBounds(440,440,50,50);

        this.add(option_5);
        this.add(option_10);
        this.add(option_20);

        option_5.addItemListener(this);
        option_10.addItemListener(this);
        option_20.addItemListener(this);

    }
    @Override
    public void itemStateChanged(ItemEvent itemEvent) {

        Checkbox x=(Checkbox) itemEvent.getSource();
        String size=x.getLabel();
        new GameScreen(size);

    }
    public static void main(String args[])
    {
        MainGame mainGame=new MainGame();
        int i,j;
        for(i=1;i<6;i++) {
            for (j = 1; j < 6; j++) {
                System.out.println("this.add(b"+i+"_"+j+");");
            }
        }
    }
}
