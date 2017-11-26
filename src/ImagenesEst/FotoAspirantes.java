
package ImagenesEst;

import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;

public class FotoAspirantes extends ImageIcon {
    
 	public FotoAspirantes(String filename) { 
 	    super(filename); 
 	}; 

    public FotoAspirantes(Image image) {
        super(image);
    }

    public FotoAspirantes(URL location) {
        super(location);
    }
       
    @Override
 	public synchronized void paintIcon(Component c, Graphics g, int x, int y) { 
 	    g.setColor(Color.white); 
 	    g.fillRect(0,0, c.getWidth(), c.getHeight()); 
 	    if(getImageObserver() == null) {                   
 		g.drawImage( 
 		    getImage(), 
 		    0, 
 		    0, 
                    c.getWidth(),
                    c.getHeight(),
 		    c 
 		); 
 	    } else { 
 		g.drawImage( 
 		    getImage(), 
 		    0, 
 		    0, 
                    c.getWidth(),
                    c.getHeight(),
 		    getImageObserver() 
 		); 
 	    } 
 	} 
}
