import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.ActiveEvent;
public class ButtonFrame extends  JFrame {
    private JButton botaotexto;
    private JButton botaoimagem;
    private JButton botaoimagem2;
    public  ButtonFrame() {
        super("testando botão");
        setLayout(new FlowLayout());
        botaotexto = new JButton("Mensagem de texto"); //adiciona novo botão//
        add(botaotexto); // adiciona o botão ao Jframe
        Icon ifmt = new ImageIcon(getClass().getResource("ifmt.png"));
        botaoimagem = new JButton("LogoIfmt", ifmt);
        Icon java = new ImageIcon(getClass().getResource("java.png"));
        botaoimagem2 = new JButton("Imagem Java",java);
        add(botaoimagem2);
        add(botaoimagem);
        ButtonHandler handler = new ButtonHandler();
        botaoimagem.addActionListener(handler);
        botaotexto.addActionListener(handler);
        botaoimagem2.addActionListener(handler);

    }






        private class ButtonHandler implements  ActionListener{
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog(ButtonFrame.this,String.format( "you pressed: %s", e.getActionCommand()));
            }
        }
    }