import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // Crea un HashMap para almacenar fotos
        Map<String, File> ABC = new HashMap<>();


        File letA = new File("images/A.png");
        ABC.put("A", letA);

        File letB = new File("images/B.png");
        ABC.put("B", letB);

        File letC = new File("images/C.png");
        ABC.put("C", letC);

        File letD = new File("images/D.png");
        ABC.put("D", letD);

        File letE = new File("images/E.png");
        ABC.put("E", letE);

        File letF = new File("images/F.png");
        ABC.put("F", letF);

        File letG = new File("images/G.png");
        ABC.put("G", letG);

        File letH = new File("images/H.png");
        ABC.put("H", letH);

        File letI = new File("images/I.png");
        ABC.put("I", letI);

        File letJ = new File("images/J.png");
        ABC.put("J", letJ);

        File letK = new File("images/K.png");
        ABC.put("K", letK);

        File letL = new File("images/L.png");
        ABC.put("L", letL);

        File letM = new File("images/M.png");
        ABC.put("M", letM);

        File letN = new File("images/N.png");
        ABC.put("N", letN);

        File letO = new File("images/O.png");
        ABC.put("O", letO);

        File letP = new File("images/P.png");
        ABC.put("P", letP);

        File letQ = new File("images/Q.png");
        ABC.put("Q", letQ);

        File letR = new File("images/R.png");
        ABC.put("R", letR);

        File letS = new File("images/S.png");
        ABC.put("S", letS);

        File letT = new File("images/T.png");
        ABC.put("T", letT);

        File letU = new File("images/U.png");
        ABC.put("U", letU);

        File letV = new File("images/V.png");
        ABC.put("V", letV);

        File letW = new File("images/W.png");
        ABC.put("W", letW);

        File letX = new File("images/X.png");
        ABC.put("X", letX);

        File letY = new File("images/Y.png");
        ABC.put("Y", letY);

        File letZ = new File("images/Z.png");
        ABC.put("Z", letZ);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);

        JButton button1 = new JButton();
        frame.add(new JButton("sisisi"));
    }
}