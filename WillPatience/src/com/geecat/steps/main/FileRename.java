package com.geecat.steps.main;

import java.io.File;

public class FileRename {
	public static void main(String args[]) {
		File folder = new File("D:\\Personal\\Body\\New folder\\Kris Gethin 12 Week Trainer-original");
        File[] listOfFiles = folder.listFiles();
        for (int i = 0; i < listOfFiles.length; i++) {

            if (listOfFiles[i].isFile()) {

                File f = new File(listOfFiles[i].getAbsolutePath()); 
                System.out.println(f.getName());
             
                String name = f.getName();
                int j =  name.lastIndexOf(" ");
                int k = name.lastIndexOf(".");
                String firstName = name.substring(0,k).trim();
                System.out.println(firstName);
               // String lastName = name.substring(j, k).replace("-", "");
                String finalName = name;
               if(name.endsWith(".mp4")){
            	   finalName  = firstName+".mp4";
               }else{
            	   finalName  = firstName+".smi";
               }
                
                //String name = f.getName().replace("Kris Gethin 12 Week Trainer - ", "").replace(" - Bodybuildingcom_HD", "");
                //name.replace(" - Bodybuildingcom_HD", "");
              //  System.out.println(name);
                System.out.println(finalName);
                File n = new File("D:\\Personal\\Body\\New folder",finalName);
                //System.out.println(n);
                System.out.println(f.renameTo(n));
            
            }
            
        }

	}
}
