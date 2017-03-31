package com.bwssystems.HABridge;

import java.util.Map;

public class BridgeSecurityDescriptor {
	private Map<String, User> users;
	private boolean useLinkButton;
	private String execGarden;
	private boolean secureHueApi;

	public BridgeSecurityDescriptor() {
		super();
		this.setUseLinkButton(false);
	}

	public Map<String, User> getUsers() {
		return users;
	}

	public void setUsers(Map<String, User> users) {
		this.users = users;
	}

	public boolean isUseLinkButton() {
		return useLinkButton;
	}

	public void setUseLinkButton(boolean useLinkButton) {
		this.useLinkButton = useLinkButton;
	}

	public String getExecGarden() {
		return execGarden;
	}

	public void setExecGarden(String execGarden) {
		this.execGarden = execGarden;
	}

	public boolean isSecureHueApi() {
		return secureHueApi;
	}

	public void setSecureHueApi(boolean secureHueApi) {
		this.secureHueApi = secureHueApi;
	}

	public boolean isSecure() {
		boolean secureFlag = false;
		if(users != null && !users.isEmpty()) {
			for (Map.Entry<String, User> entry : users.entrySet())
			{
				if(entry.getValue().getPassword() != null && !entry.getValue().getPassword().isEmpty()) {
					secureFlag = true;
					break;
				}
			}
		}
		return secureFlag;
		
	}
}