package org.itstep;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class FileManagerTest {

	@Test
	public void testGetAllConnectionsForAllElements() {
		FileManager fm = new FileManager();
		ArrayList<ConnectToServer> connections = fm.getAllConnections();
		assertEquals(15, connections.size());
	}

	@Test
	public void testGetAllConnectionsLastElement() {
		FileManager fm = new FileManager();
		ArrayList<ConnectToServer> connections = fm.getAllConnections();
		assertEquals("123.45.67.115", connections.get(14).getSesIP());
	}
	
	@Test
	public void testGetConnectFromStringIp() {
		FileManager fm = new FileManager();
		ConnectToServer oneConn = fm.getConnectFromString("123.45.67.113:12345 123457088 1495224032462 258151308");
		assertEquals("123.45.67.113", oneConn.getSesIP());
	}
	
	@Test
	public void testGetConnectFromStringPort() {
		FileManager fm = new FileManager();
		ConnectToServer oneConn = fm.getConnectFromString("123.45.67.113:12345 123457088 1495224032462 258151308");
		assertEquals(12345, oneConn.getSesPort());
	}
	
	@Test
	public void testGetConnectFromStringTime() {
		FileManager fm = new FileManager();
		ConnectToServer oneConn = fm.getConnectFromString("123.45.67.113:12345 123457088 1495224032462 258151308");
		assertEquals(1495224032462L, oneConn.getSesTimeConnection());
	}

}
