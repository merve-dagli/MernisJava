package interfaceAbstractDemo.Concrete;

import interfaceAbstractDemo.Abstract.CustomerCheckService;
import interfaceAbstractDemo.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
	}

}
