package com.vitkus.biudzetoprojektas;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CsvFileWriter {

    //Delimiter used in CSV file
    private static final String COMMA_DELIMITER = ",";
    private static final String NEW_LINE_SEPARATOR = "\n";
     
    //CSV file header
   // private static final String FILE_HEADER = "id,firstName,lastName,gender,age";
 
    public static void writeCsvFile(String fileName, ArrayList<Irasas> irasai) {
         
        
         
        FileWriter fileWriter = null;
                 
        try {
            fileWriter = new FileWriter(fileName+".csv");
             
            //Write a new student object list to the CSV file
            for (Irasas irasas : irasai) {
                fileWriter.append(String.valueOf(irasas.getId()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(irasas.getSuma()));
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(irasas.getPapildomaInfo());
                fileWriter.append(COMMA_DELIMITER);
                fileWriter.append(String.valueOf(irasas.getData()));
                fileWriter.append(COMMA_DELIMITER);
                
               
        			if(irasas instanceof PajamuIrasas) {
        			    fileWriter.append(String.valueOf(((PajamuIrasas)irasas).getKategorija()));
                        fileWriter.append(COMMA_DELIMITER);
                        fileWriter.append(String.valueOf(((PajamuIrasas)irasas).isPozymisArIBanka())+"\n");
                        
        			}else if(irasas instanceof IslaiduIrasas) {
        				 fileWriter.append(String.valueOf(((IslaiduIrasas)irasas).getKategorija()));
                         fileWriter.append(COMMA_DELIMITER);
                         fileWriter.append(String.valueOf(((IslaiduIrasas)irasas).isArBankinisPavedimas())+"\n");
                         
        			}
        			
      
               
            }
 
             
             
            System.out.println("CSV failas sukurtas sekmingai! Failo pavadinimas: " + fileName);
             
        } catch (Exception e) {
            System.out.println("Error in CsvFileWriter !!!");
            e.printStackTrace();
        } finally {
             
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                System.out.println("Error while flushing/closing fileWriter !!!");
                e.printStackTrace();
            }
             
        }
    }
	
}
