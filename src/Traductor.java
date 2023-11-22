import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.awt.Color;
import java.awt.Font;

import java.awt.Graphics;
import java.awt.GradientPaint;
import java.awt.Graphics2D;


public class Traductor extends JPanel{
    static JPanel panel= new JPanel();


    public static class Fondo extends JPanel{
    private Color color1 = Color.BLACK;
    private Color color2 = Color.BLUE;
    public void paint(Graphics g) {
        super.paint(g);

        Graphics2D g2d = (Graphics2D) g;
        int w = getWidth();
        int h = getHeight();

        GradientPaint degradado1 = new GradientPaint(0, 0, color1, 0, h, color2);
        g2d.setPaint(degradado1);
        g2d.fillRect(0, 0, w, h);
    }
    }


    public Traductor(String texto) {

        //Hash map
        //Se crea un hash map que recibe variables tipo String como Keys
        //y devuelve variables tipo File
        Map<String, File> ABC = new HashMap<>();

        //Se agregan uno a uno todos los valores del Hash Map
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

        File letempty = new File("images/empty.jpeg");
        ABC.put(" ", letempty);




        //for
        //Analiza caracter por caracter, agarra el valor del HashMap y pone la imagen en un JLabel
        for (int i=0;i<texto.length();i++){
            //El Hash Map no recibe variables tipo char, p lo mismo se usa el String.valueOf
            //para transformarlos a un String
            String b= String.valueOf(texto.charAt(i)).toUpperCase();
                String c;
                //En caso de que se ingrese un espacio
            if (b.equals(" ")) {
                c="images/empty.jpeg";
                //Cualquier otro caracter
                //Se obtiene el valor almacenado para b (El caracter que se está analizando)
            }   else{
                 c= String.valueOf(ABC.get(b));
            }


            //Imagen
            //Carga la imagen
            BufferedImage image = null;
            //
            try{
                //En el espacio donde dice c debe ir el pathname del File
                //P eso c debe ser un String
                image = ImageIO.read(new File(c));
            } catch (IOException e) {
                e.printStackTrace();
            }


            //Se crea el JLabel que pueda contener la imagen que cargamos
             JLabel label = new JLabel(new ImageIcon(image));

            //Se añade el label al JPanel, que declaramos fuera del constructor

                panel.add(label);
                panel.setVisible(true);
                panel.setBounds(220, 350, 1000, 900);
            panel.setOpaque(false);


        }
    }

    public static void main(String[] args) {



        Fondo fondo = new Fondo();


        //Creamos un JFrame, es el espacio en el que vamos a colocar los demás componentes
        JFrame Fr = new JFrame("Traductor Dactilología");
        //Esto sirve para que al cerrar la ventana el programa deje de ejecutarse
        Fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Elegimos el LayOut que vamos a utilizar
        Fr.setLayout(new FlowLayout());

        //Creamos una etiqueta para que aparezca ese texto
        JLabel etiquetaEntrada = new JLabel("Texto a Traducir:");
        Font etiquetaEntrad = new Font("Arial", Font.PLAIN, 30);
        etiquetaEntrada.setForeground(Color.white);
        etiquetaEntrada.setFont(etiquetaEntrad);

        //Creamos un botón que al clickear traduzca el texto
        JButton botonTraducir = new JButton("Traducir");
        Font botonTraducir1 = new Font("Arial", Font.PLAIN, 30);
        botonTraducir.setForeground(Color.gray);
        botonTraducir.setFont(botonTraducir1);


        //Creamos un campo en el que el usuario pueda escribir
        JTextField entradaTexto= new JTextField(20);
        Font entradaText = new Font("Arial", Font.PLAIN, 30);
        entradaTexto.setForeground(Color.black);
        entradaTexto.setFont(entradaText);

        //Creamos un boton para borrar el texto
        JButton botonBorrar = new JButton("Borrar Texto");
        Font botonBorrar1 = new Font("Arial", Font.PLAIN, 30);
        botonBorrar.setForeground(Color.red);
        botonBorrar.setFont(botonBorrar1);

        //Crea un nueva etiqueta para que se muestre el "Texto Traducido"
        JLabel etiquetaTraduccion = new JLabel("Texto Traducido:");
        Font etiquetaTraduccion1 = new Font("Arial", Font.PLAIN, 30);
        etiquetaTraduccion.setForeground(Color.WHITE);
        etiquetaTraduccion.setFont(etiquetaTraduccion1);


        //Boton para borrar texto
        botonTraducir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                //Aqui va lo que pasará cuando se clicke el botón
                //En este caso obtiene el texto del Textfield que creamos (entradatexto),
                panel.removeAll();
                String a= entradaTexto.getText();
                //crea un nuevo Bastian que recibe como argumento el texto obtenido de entradatexto,
                Traductor bastian= new Traductor(a);
                Fr.add(panel);
                //y añade el Jpanel ya creado al JFrame que creamos en el main
                //Este panel ya contiene las imágenes.
                Fr.revalidate();
                Fr.add(panel);
                Fr.repaint();
                Fr.add(bastian);
                Fr.add(fondo);
            }
        });
        botonBorrar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Borrar el texto del campo de entrada
                entradaTexto.setText("");
            }
        });

        //Funcion del enter del teclado
        entradaTexto.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyChar() == KeyEvent.VK_ENTER) {
                    // Clear the panel before adding new components
                    panel.removeAll();

                    // Get the text from the input field
                    String a = entradaTexto.getText();

                    // Create a new Traductor instance and add its panel to the frame
                    Traductor bastian = new Traductor(a);
                    Fr.add(panel);
                    Fr.add(bastian);

                    // Repaint the frame to reflect the changes
                    Fr.revalidate();
                    Fr.repaint();
                    Fr.add(fondo);
                }
            }
        });


        ImageIcon logoIcon = new ImageIcon("images/Logo Ing.png");

        Image image = logoIcon.getImage();
        Image newImage = image.getScaledInstance(226, 325, Image.SCALE_SMOOTH);

        ImageIcon scaledLogoIcon = new ImageIcon(newImage);

        // Crea un JLabel para mostrar el logo
        JLabel logoLabel = new JLabel(scaledLogoIcon);



        etiquetaEntrada.setBounds(600, 50, 300, 30);

        // Configurar la posición y tamaño del campo de entradaTexto
        entradaTexto.setBounds(570, 100, 300, 50);

        // Configurar la posición y tamaño del botónTraducir
        botonTraducir.setBounds(640, 150, 150, 50);

        // Configurar la posición y tamaño de la etiquetaTraduccion
        etiquetaTraduccion.setBounds(600, 270, 250, 50);

        // Configurar la posición y tamaño del botónBorrar
        botonBorrar.setBounds(590, 200, 270, 50);


        //Añadimos todos los componentes al JFrame

        logoLabel.setBounds(825, 250, 1000, 1000); // Modifica las coordenadas y el tamaño según tu preferencia

        // Agrega el JLabel del logo al JFrame

        Fr.add(logoLabel);

        logoLabel.setVisible(true);

        Fr.add(etiquetaEntrada);
        Fr.add(entradaTexto);
        Fr.add(botonTraducir);
        Fr.add(etiquetaTraduccion);
        Fr.add(botonBorrar);
        Fr.setLayout(null);


        fondo.setVisible(true);
        Fr.add(fondo, BorderLayout.CENTER);
        fondo.setSize(2560, 1600);
        //Ajusta el JFrame al tamaño de los componentes
        Fr.add(fondo);
        Fr.pack();
        Fr.setSize(500, 800);
        //Fr.setComponentZOrder(panel, 0);
        Fr.setComponentZOrder(Fr.getContentPane(), 0);
        Fr.setVisible(true);

    }

}


