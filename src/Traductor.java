import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Traductor extends JPanel{

    static JPanel panel= new JPanel();

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
            if (b==" "){
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
        }
    }


    public static void main(String[] args) {

            //Creamos un JFrame, es el espacio en el que vamos a colocar los demás componentes
        JFrame Fr = new JFrame("Traductor Dactilología");
        //Esto sirve para que al cerrar la ventana el programa deje de ejecutarse
        Fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Elegimos el LayOut que vamos a utilizar
        Fr.setLayout(new FlowLayout());

        //Creamos una etiqueta para que aparezca ese texto
        JLabel etiquetaEntrada = new JLabel("Texto a Traducir:");
        //Creamos un campo en el que el usuario pueda escribir
        JTextField entradaTexto= new JTextField(20);

        //Creamos un botón que al clickear traduzca el texto
       JButton botonTraducir = new JButton("Traducir");
        botonTraducir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e){
                //Aqui va lo que pasará cuando se clicke el botón
                //En este caso obtiene el texto del Textfield que creamos (entradatexto),
                String a= entradaTexto.getText();
                //crea un nuevo Bastian que recibe como argumento el texto obtenido de entradatexto,
                Traductor bastian= new Traductor(a);
                //y añade el Jpanel ya creado al JFrame que creamos en el main
                //Este panel ya contiene las imágenes.
                Fr.add(panel);
            }
        });
        //Crea un nueva etiqueta para que se muestre el "Texto Traducido"
        JLabel etiquetaTraduccion = new JLabel("Texto Traducido:");

        //Añadimos todos los componentes al JFrame
        Fr.add(etiquetaEntrada);
        Fr.add(entradaTexto);
        Fr.add(botonTraducir);
        Fr.add(etiquetaTraduccion);

        //Ajusta el JFrame al tamaño de los componentes
        Fr.pack();
        //Hace visible el Jframe
        Fr.setVisible(true);

    }
    }




