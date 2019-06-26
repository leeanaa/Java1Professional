import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MineSweeper extends JFrame{
    
    private JPanel optionsPanel;
    private JPanel gamePanel;
    private JButton resetButton;
    
    private JButton[][] matrix;
    
    private JMenuBar mb;
    private JMenu m1;
    
    private JMenuItem mi1;
    private JMenuItem mi2;
    private JMenuItem mi3;
    private JMenuItem mi4;
    
    private ImageIcon smileyIcon = 
        new ImageIcon(
            new ImageIcon("smiley.jpg").getImage()
                .getScaledInstance(20, 20, Image.SCALE_SMOOTH)
        );
        
    private ImageIcon deadIcon = 
       new ImageIcon(
            new ImageIcon("dead.png").getImage()
                .getScaledInstance(20, 20, Image.SCALE_SMOOTH)
        );
    
    private boolean[][] mines;
    
    private final static int[] I_COEF = {-1, -1, 0, 1, 1,  1,  0, -1};
    private final static int[] J_COEF = { 0,  1, 1, 1, 0, -1, -1, -1};
    
    public MineSweeper() {
        super("Mine Sweeper");
        initComponents();
        initMenu();
        
        
        setSize(700, 700);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    
    private void initComponents() {
        optionsPanel = new JPanel();
        resetButton = new JButton(smileyIcon);
        
        resetButton.addActionListener(ev -> initGame(matrix.length, matrix.length));
        
        optionsPanel.add(resetButton);
        add(optionsPanel, BorderLayout.NORTH);
        
        gamePanel = new JPanel();
        
        initGame(7, 7);
        add(gamePanel); 
    }
    
    private void initGame(int n, int m) {
        matrix = new JButton[n][m];
        
        gamePanel.setLayout(new GridLayout(n, m));
        gamePanel.removeAll();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                JButton b = new JButton();
                final int I = i;
                final int J = j;
                b.addActionListener(ev -> clickEvent(I, J));
                matrix[i][j] = b;
                
                gamePanel.add(b);
            }
        }
        
        resetButton.setIcon(smileyIcon);
        gamePanel.revalidate();
        
        
        mines = new boolean[n][m];
        generateMines(n, m);
        
        //showMines();
    }
    
    private void gameOver() {
        resetButton.setIcon(deadIcon);
        showMines();
        
        JOptionPane.showMessageDialog(
            null, 
            "Game over", 
            "Game over message", 
            JOptionPane.OK_OPTION
        );
        
        initGame(matrix.length, matrix.length);
    }
    
    private void clickEvent(int i, int j) {
        if (mines[i][j]) {
            gameOver();
            return;
        }
        
        recursiveClick(i, j);
    }
    
    private void recursiveClick(int i, int j) {
        if (!matrix[i][j].isEnabled()) {
            return;
        }
        
        int aroundMines = getMines(i, j);
        
        if (aroundMines != 0) {
            matrix[i][j].setText(String.valueOf(aroundMines));
            matrix[i][j].setEnabled(false);
            return;
        }
        
        matrix[i][j].setEnabled(false);
        
        for (int k = 0; k < I_COEF.length; k++) {
            int newI = i + I_COEF[k];
            int newJ = j + J_COEF[k];
            
            if (newI < 0 || newI >= matrix.length) {
                continue;
            }
            
            if (newJ < 0 || newJ >= matrix.length) {
                continue;
            }
            
            recursiveClick(newI, newJ);
        }
        
    }
    
    private int getMines(int i, int j) {
        int counter = 0;
        
        for (int k = 0; k < I_COEF.length; k++) {
            int newI = i + I_COEF[k];
            int newJ = j + J_COEF[k];
            
            if (newI < 0 || newI >= matrix.length) {
                continue;
            }
            
            if (newJ < 0 || newJ >= matrix.length) {
                continue;
            }
            
            if (mines[newI][newJ]) {
                counter++;
            }
        }
        return counter;
    }
    
    
    private void showMines() {
        for (int i = 0; i < mines.length; i++) {
            for (int j = 0; j < mines[i].length; j++) {
                if (mines[i][j]) {
                    matrix[i][j].setBackground(Color.RED);
                }
            }
        }
    }
    
    private void generateMines(int n, int m) {
        int i;
        int j;
        java.util.Random r = new java.util.Random();
        int toGenerate = n * m / 7;
        int counter = 0;
        
        while (counter < toGenerate) {
            i = r.nextInt(n);
            j = r.nextInt(m);
            
            if (!mines[i][j]) {
                mines[i][j] = true;
                counter++;
            }
        }
        
        
    }
    
    private void initMenu() {
        mb = new JMenuBar();
        m1 = new JMenu("Optiuni");
        
        mi1 = new JMenuItem("7 x 7");
        mi2 = new JMenuItem("10 x 10");
        mi3 = new JMenuItem("13 x 13");
        mi4 = new JMenuItem("Iesire");
        
        m1.add(mi1);
        m1.add(mi2);
        m1.add(mi3);
        m1.add(mi4);
        
        mb.add(m1);
        
        setJMenuBar(mb);
        
        mi1.addActionListener(ev -> initGame(7, 7));
        mi2.addActionListener(ev -> initGame(10, 10));
        mi3.addActionListener(ev -> initGame(13, 13));
        mi4.addActionListener(ev -> dispose());
    }
    
    
    
    
    
}