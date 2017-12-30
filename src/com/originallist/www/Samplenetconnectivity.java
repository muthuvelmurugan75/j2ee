package com.originallist.www;

import java.io.IOException;

public class Samplenetconnectivity{
	
	public  static String l(String url) throws IOException {
		
		java.awt.Desktop.getDesktop().browse(java.net.URI.create(url));
		return url;
	}
}
