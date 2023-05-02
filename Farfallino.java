
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author simone
 */
public class Farfallino {
    public static void main(String[] args){
        Path io = Paths.get(".","testi","DivinaCommedia.txt");
        Path dest = Paths.get(".","risultati","prova.txt");
        char [] vocali={'a','e','i','o','u'};
        String [] farf={"fa","fe","fi","fo","fu"};
        String ris="";
        long startTime = System.currentTimeMillis();
        
        try {
            byte [] testo = Files.readAllBytes(io);
            
            
            for (int i = 0; i < testo.length; i++) {
                ris+=(char)testo[i];
                for (int j = 0; j < vocali.length; j++) {
                    
                    
                    if (testo[i]==vocali[j]) {
                        ris+=farf[j];
                    }
                }
            }
            Files.write(dest, ris.getBytes());
            long endTime = System.currentTimeMillis();
            long timeElapsed = endTime - startTime;
            System.out.println("Time taken: " + timeElapsed + " milliseconds");
        }catch (IOException ex){ 
            System.out.println("Impossibile leggere il file " + ex.getMessage());
        }
    }
}
