package com.geecat.image;

import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.imageio.ImageIO;

public class ImageReaderAscii {

	public static void main(String[] args) throws IOException {
		BufferedImage img = null;
		File file = new File("C:\\Users\\Geecat\\Desktop\\images.txt");
		 FileWriter fw;
		 BufferedWriter bw = null;
		try {
		    img = ImageIO.read(new File("C:\\Users\\Geecat\\Desktop\\rsz_apple.jpg"));
		     fw = new FileWriter(file.getAbsoluteFile());
			 bw = new BufferedWriter(fw);
		    //img = ImageIO.read(new File("C:\\Users\\Geecat\\Desktop\\images.jpg"));
		    
		} catch (IOException e) {
		}
		int width = img.getWidth(null);
        int height = img.getHeight(null);
        int i = 0;
        int j = 0;
			for (j =0; j< width; j++) {
				for (i = 0; i <height; i++) {
				//System.out.print(img.getRGB(i, j));
				if(img.getRGB(i, j)==-1){
					bw.write("  ");
					System.out.print("  ");
				}else{
					bw.write("..");
					System.out.print("##");
				}
				
			}
			bw.newLine();
			System.out.println();
		}
        
        System.out.println(i+" "+j);
       System.out.println(width+" "+height);
	}

}
