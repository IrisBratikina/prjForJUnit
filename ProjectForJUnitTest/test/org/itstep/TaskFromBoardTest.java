package org.itstep;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class TaskFromBoardTest {

	@Test
	public void testGetAllIP() {
		
	}

	@Test
	public void testGetConnInPeriodBeforeStartTime() {
		
	}

	@Test
	public void testGetConnInPeriod() {
		
	}
	
	@Test
	public void testGetConnInPeriodAfterStartTime() {
		MakeTasksFromBoard tfb = new MakeTasksFromBoard();
		FileManager fm = new FileManager();
		ArrayList<ConnectToServer> allConns = fm.getAllConnections();
		long startTime = allConns.get(3).getSesTimeConnection();
		
		ArrayList<ConnectToServer> conns = tfb.getConnectionsAfterStartTime(allConns, startTime);
		assertEquals(10, conns.size());
	}
	

}
