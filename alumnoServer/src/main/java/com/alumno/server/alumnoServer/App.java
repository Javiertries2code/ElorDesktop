package com.alumno.server.alumnoServer;

import java.net.InetAddress;
import java.net.UnknownHostException;

import com.alumno.server.alumnoServer.socketIO.SocketIOModule;
import com.corundumstudio.socketio.Configuration;
import com.corundumstudio.socketio.SocketIOServer;

public class App {
	
	private static  String HOST_NAME = "192.168.1.40";
	private static final int PORT = 4000;
	
	public static void main(String[] args) {
		//find my connection
//	     try {
//	            // Obtener la dirección IP de la máquina local
//	            InetAddress localHost = InetAddress.getLocalHost();
//	           // HOST_NAME = localHost.getHostAddress();
//	            System.out.println("Nombre del host: " + localHost.getHostName());
//	            System.out.println("Dirección IP: " + localHost.getHostAddress());
//	        } catch (UnknownHostException e) {
//	            System.err.println("Error al obtener la dirección IP: " + e.getMessage());
//	        }
		
		
		// Server configuration 
		Configuration config = new Configuration ();
		config.setHostname(HOST_NAME);
		config.setPort(PORT);
		
		// We start the server
		SocketIOServer server = new SocketIOServer(config);
		SocketIOModule module = new SocketIOModule(server);
		module.start();
	}
}
