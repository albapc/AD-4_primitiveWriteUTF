package primitivewriteutf;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 *
 * @author Alba
 */
public class Metodos {

    //escribir, cerrar, leerlo
    public static void gravarUTF() {
        try {
            FileOutputStream fos = new FileOutputStream("texto3.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            DataOutputStream dos = new DataOutputStream(bos);
            FileInputStream fis = new FileInputStream("texto3.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            DataInputStream dis = new DataInputStream(bis);

            dos.writeUTF("o tempo está xélido");
            dos.writeUTF("o tempo está xélido");
            dos.close();

            while ((dis.available()) != 0) { //mientras tenga contenido...

                String a = dis.readUTF();
                System.out.println(a);
            }

            System.out.println("Numero de bytes lidos: " + dos.size());

            dis.close();
//            bos.close(); //no son estrictamente necesarios
//            fos.close();
//            bis.close();
//            fis.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
