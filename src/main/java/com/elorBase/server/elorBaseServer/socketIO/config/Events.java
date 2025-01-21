package com.elorBase.server.elorBaseServer.socketIO.config;

public enum Events {
	ON_GET_ALL ("onGetAll");
	
	public final String value;

	private Events(String value) {
		this.value = value;
	}
}
