import java.awt.*;
import java.awt.event.*;
public class Login extends Frame implements ActionListener{
    Button button;
    Label label1,label2,label3,label4;
    TextField tf1=new TextField(20);
    TextField tf2=new TextField(20);
    TextField tf3=new TextField(20);
    TextField tf4=new TextField(20);
    Login(){
        button=new Button("SUBMIT");
        setTitle("Data Form");
        setSize(200,400);
        setVisible(true);
        setLayout(new FlowLayout());
        label1=new Label("Name:");
        add(label1);
        add(tf1);
        label2=new Label("Age:");
        add(label2);
        add(tf2);
        label3=new Label("Mob Number:");
        add(label3);
        add(tf3);
        label4=new Label("Place:");
        add(label4);
        add(tf4);
        add(button);
        button.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        System.out.println("Name-"+tf1.getText());
        System.out.println("Age-"+tf2.getText());
        System.out.println("MOb Number-"+tf3.getText());
        System.out.println("Place-"+tf4.getText());
    }
    public static void main(String[]args){
        new Login();
    }
}
