package connectors;

import java.util.*;
import library.Cuerpo;
import library.IConstants;

/**
 * 
 */
public class MSCClient implements IConstants{

	private ArrayList<Cuerpo> cuerpos;
	private String key;
    private String Attribute1;

    /**
     * Default constructor
     */
    public MSCClient() {
    	cuerpos = new ArrayList<>();
    }
    
    public void procesarVideo(String PUrlVideo) {
    	String payLoad = POST_BODY.replace("@@URL@@", PUrlVideo);
        String jSonResult = HttpRequestor.post(MCS_URL, payLoad);
        cargarCuerpos(jSonResult);
    }
    
    private void cargarCuerpos(String pJsonResult){
    	
    }

    /**
     * @param String 
     * @param Response
     */
    private void analizar(String Response) {
        // TODO implement here
    }

}