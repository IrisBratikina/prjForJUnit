package org.itstep;

import java.util.ArrayList;

public class MakeTasksFromBoard {

	public static void main(String[] args) {
		FileManager fm = new FileManager();
		ArrayList<ConnectToServer> connections = fm.getAllConnections();
		long startTime = connections.get(3).getSesTimeConnection();
		long endTime = startTime + (3*60*60*1000);
		ArrayList<ConnectToServer> connectionsInPeriod = getConnInPeriod(connections, startTime, endTime);
		ArrayList<ConnectToServer> connectionsBeforeST = getConnInPeriod(connections, startTime);
		ArrayList<String> allIP = getAllIP(connections);
	}

	public static ArrayList<String> getAllIP(ArrayList<ConnectToServer> connections) {
		ArrayList<String> allIP = new ArrayList<>();
		for (ConnectToServer conn : connections) {
			allIP.add(conn.getSesIP());
		}
		return allIP;
	}

	public static ArrayList<ConnectToServer> getConnInPeriod(ArrayList<ConnectToServer> connections, long startTime) {
		ArrayList<ConnectToServer> connectionsInPeriod = new ArrayList<>();
		for (ConnectToServer conn : connections) {
			if(conn.getSesTimeConnection()<startTime){
				connectionsInPeriod.add(conn);
			}
		}
		return connectionsInPeriod;
	}

	public static ArrayList<ConnectToServer> getConnInPeriod(ArrayList<ConnectToServer> connections, long startTime, long endTime) {
		ArrayList<ConnectToServer> connectionsInPeriod = new ArrayList<>();
		for (ConnectToServer conn : connections) {
			if(conn.getSesTimeConnection()>startTime && conn.getSesTimeConnection()<endTime ){
				connectionsInPeriod.add(conn);
			}
		}
		return connectionsInPeriod;
	}

}
