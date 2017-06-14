package org.itstep;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class FileManager {

	static String filePath = "D:\\test\\sessions_log.txt";
		
	public ArrayList<ConnectToServer> getAllConnections(){
		ArrayList<ConnectToServer> connections = new ArrayList<>();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filePath));
			String line;
			while ((line = reader.readLine()) != null) {
				ConnectToServer oneConnect = new ConnectToServer();
				oneConnect = getConnectFromString(line);
				connections.add(oneConnect);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return connections;
	}

	public ConnectToServer getConnectFromString(String line) {
		String[] wordsInLine = line.split(" ");
		String portAndIP = wordsInLine[0];
		String[] portAndIPAsArr = portAndIP.split(":");
		
		String connIP = portAndIPAsArr[0];
		String connPortAsString = portAndIPAsArr[1];
		int connPort = Integer.parseInt(connPortAsString);
		long connTime = Long.parseLong(wordsInLine[2]);
		ConnectToServer oneConnect = new ConnectToServer(connIP, connPort, connTime);
		return oneConnect;
	}
	
	
}
