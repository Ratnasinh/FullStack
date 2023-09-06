package com.fullstack.newemployee.credentialService;

import com.fullstack.newemployee.details.Employee;

public interface ICredentialService {
	public void generateEmail(Employee employee);
	public void generatePassword(Employee employee);
	public void showCredentials(Employee employee);
}
