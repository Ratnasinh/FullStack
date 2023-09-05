package credentialService;

import Employee.Employee;

public interface ICredentialService {
	public void generateEmail(Employee employee);
	public void generatePassword(Employee employee);
	public void showCredentials(Employee employee);
}
