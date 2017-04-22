import javafx.scene.control.CheckBox;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by vaibhav on 23/4/17.
 */
public class MainGame extends Frame{

    CheckboxGroup options;
    Checkbox option_5;
    Checkbox option_10;
    Checkbox option_20;

    public MainGame(){
        options=new CheckboxGroup();

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
    }

    public static void main(String args[])
    {
        MainGame mg=new MainGame();
    }
}
