import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Setting {
	private static final int colormd = 0b0000000000000001;
	private static final int notimd = 0b0000000000000001;
	
	private short setting = 0b0000000000000000;
	
	Setting(){
		String path = System.getProperty("user.dir");
		
    	try {
    		BufferedReader bufferreader = new BufferedReader(new FileReader(path + "\\metadata\\UserSet"));
		    
		    String line;
		    while ((line = bufferreader.readLine()) != null) {   
		    	
		    	String[] array = line.split(":");
		    	
		    	switch(array[0].trim()) {
			    	case "colormd" :
			    		if((Integer.parseInt(array[1].trim()) == 1)) { setting |= colormd; }
			    		System.out.println(setting);
			    		break;
			    	case "notimd":
			    		if((Integer.parseInt(array[1].trim()) == 1)) { setting |= notimd; }
			    		break;
		    	}
		    	
		    }
		    bufferreader.close();
	    } catch (FileNotFoundException ex) {
	        ex.printStackTrace();
	    } catch (IOException ex1) {
	        ex1.printStackTrace();
	    }
	}
	
	public boolean colormd() {
		return ((setting & colormd) != 0);
	}
	public boolean notimd() {
		return ((setting & colormd) != 0);
	}
}
