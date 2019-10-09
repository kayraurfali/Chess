/* 
 * Copyright (c) 2018, Kayra Urfalı
 * 
 * 
 * 
 * 
 * 
 * 
 */
package yapi;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
/**
 *
 * @author kayra
 */
public class ResimYukleyici {
    
    private BufferedImage resim;
    
    public BufferedImage yukle(String konum){
        try {
            resim = ImageIO.read(getClass().getResource(konum));
        } catch (IOException ex) {
            Logger.getLogger(ResimYukleyici.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return resim;
    }
    
}
