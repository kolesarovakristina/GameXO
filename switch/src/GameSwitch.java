
        import javafx.application.Platform;
        import javafx.scene.control.Alert;

        import javax.imageio.ImageIO;
        import javax.swing.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.awt.image.BufferedImage;

public class GameSwitch {
    private JPanel GamePanel;
    private JButton newGameButton;
    private JButton exitGameButton;
    private JButton button2;
    private JButton button3;
    private JButton button1;
    private JButton button4;
    private JButton button5;
    private JButton button9;
    private JButton button13;
    private JButton button6;
    private JButton button7;
    private JButton button8;
    private JButton button12;
    private JButton button11;
    private JButton button10;
    private JButton button16;
    private JButton button15;
    private JButton button14;
    private State state = State.NEW;
    private boolean[][] field  = new boolean[4][4];

    public GameSwitch() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(1);
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(2);
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(3);
            }
        });
        button4.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(4);
            }
        });
        button5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(5);
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(6);
            }
        });
        button7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(7);
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(8);
            }
        });
        button9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(9);
            }
        });
        button10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(10);
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(11);
            }
        });
        button12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(12);
            }
        });
        button13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(13);
            }
        });
        button14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(14);
            }
        });
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(15);
            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                processClick(16);
            }
        });
        exitGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Platform.exit();
                System.exit(0);
            }
        });
        newGameButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                state = State.PLAYING;
                for (int i = 0; i<4;i++){
                    for (int j=0; j<3; j++){
                        field[i][j] = false;
                    }
                }
            }
        });
    }

    private void processClick(int i) {
        try {
            if (state == State.PLAYING) {
                System.out.println("You clicked on button " + i);
                switch (i){
                    case 1: toogle(2);toogle(5);toogle(6);
                        break;
                    case 2: toogle(1); toogle(3); toogle(5); toogle(6); toogle(7);
                        break;
                    case 3: toogle(2); toogle(4); toogle(6); toogle(7);
                        break;
                    case 4: toogle(3); toogle(7); toogle(5);
                        break;
                    case 5: toogle(1); toogle(2); toogle(6); toogle(9); toogle(10);
                        break;
                    case 6: toogle(1); toogle(2); toogle(3); toogle(3); toogle(5); toogle(7); toogle(9); toogle(10); toogle(11);
                        break;
                    case 7: toogle(2); toogle(3); toogle(4); toogle(6); toogle(8); toogle(10); toogle(11); toogle(12);
                        break;
                    case 8: toogle(3); toogle(4); toogle(7); toogle(11); toogle(12);
                        break;
                    case 9: toogle(5); toogle(6); toogle(10); toogle(13); toogle(14);
                        break;
                    case 10: toogle(5); toogle(6); toogle(7); toogle(9); toogle(11); toogle(13); toogle(14); toogle(15);
                        break;
                    case 11: toogle(6); toogle(7); toogle(8); toogle(10); toogle(12); toogle(14); toogle(15); toogle(16);
                        break;
                    case 12: toogle(7); toogle(8); toogle(11); toogle(15); toogle(16);
                        break;
                    case 13: toogle(9); toogle(10); toogle(14);
                        break;
                    case 14: toogle(9); toogle(10); toogle(11); toogle(13); toogle(15);
                        break;
                    case 15: toogle(10); toogle(11); toogle(12); toogle(14); toogle(16);
                        break;
                    case 16: toogle(11); toogle(12); toogle(15);
                        break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void toogle(int i) throws Exception {
        int col = (i-1)%4;
        int row = (i-1)/4;
        BufferedImage img;
        field[row][col]=!field[row][col];

        if(field[row][col] == false) {
            img=ImageIO.read
                    (getClass().getResource("o.png"));
        }
        else {
            img=ImageIO.read(getClass().getResource("x.png"));
        }

        switch (i){
            case 1: button1.setIcon(new ImageIcon(img));
                break;
            case 2: button2.setIcon(new ImageIcon(img));
                break;
            case 3: button3.setIcon(new ImageIcon(img));
                break;
            case 4: button4.setIcon(new ImageIcon(img));
                break;
            case 5: button5.setIcon(new ImageIcon(img));
                break;
            case 6: button6.setIcon(new ImageIcon(img));
                break;
            case 7: button7.setIcon(new ImageIcon(img));
                break;
            case  8: button8.setIcon(new ImageIcon(img));
                break;
            case 9: button9.setIcon(new ImageIcon(img));
                break;
            case 10: button10.setIcon(new ImageIcon(img));
                break;
            case 11: button11.setIcon(new ImageIcon(img));
                break;
            case 12: button12.setIcon(new ImageIcon(img));
                break;
            case 13: button13.setIcon(new ImageIcon(img));
                break;
            case 14: button14.setIcon(new ImageIcon(img));
                break;
            case 15: button15.setIcon(new ImageIcon(img));
                break;
            case 16: button16.setIcon(new ImageIcon(img));
                break;
        }
        if (GameWin() && state==State.PLAYING){
            state=State.END;
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Winner");
            alert.setContentText("You win !");
            alert.showAndWait();
        }
    }

    private boolean GameWin(){
        int i, j, k = 0;
        for (i=0;i<4;i++)
            for (j=0;j<4;j++)
                if (field[i][j])
                    k++;
        if (k==16 || k==0)
            return true;
        else
            return false;
    }

    public JPanel getGamePanel() {
        return GamePanel;
    }
}