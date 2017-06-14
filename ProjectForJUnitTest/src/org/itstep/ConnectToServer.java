package org.itstep;

public class ConnectToServer {

	private String sesIP;
	private int sesPort;
	private long sesTimeConnection;
	
	public String getSesIP() {
		return sesIP;
	}
	public void setSesIP(String sesIP) {
		this.sesIP = sesIP;
	}
	public int getSesPort() {
		return sesPort;
	}
	public void setSesPort(int sesPort) {
		this.sesPort = sesPort;
	}
	public long getSesTimeConnection() {
		return sesTimeConnection;
	}
	public void setSesTimeConnection(long sesTimeConnection) {
		this.sesTimeConnection = sesTimeConnection;
	}
	
	public ConnectToServer(String sesIP, int sesPort, long sesTimeConnection) {
		super();
		this.sesIP = sesIP;
		this.sesPort = sesPort;
		this.sesTimeConnection = sesTimeConnection;
	}
	
	public ConnectToServer() {
		super();
	}
}
