package controller;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileManager {
	private File file;
	private FileReader fr;
	private BufferedReader br;
	private String FileName;
        
    /**
     * Default constructor
     */
    public FileManager(String pFileName) {
        this.FileName = pFileName;
    }
    
    public BufferedReader openFile(){
    	try {
        	file = new File(this.FileName);
        	fr = new FileReader(FileName);
        	br = new BufferedReader(fr);
        	
        	return br;
        }catch (IOException e){
        	System.err.println(e.getMessage());
        }
    	return null;
    }
    
    public void closeFile(){
    	try {
			fr.close();
			br.close();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		}
    }

	public FileReader getFr() {
		return fr;
	}

	public void setFr(FileReader fr) {
		this.fr = fr;
	}
}
