package interfaceAbstractDemo.adapters;

import java.rmi.RemoteException;

import interfaceAbstractDemo.Abstract.CustomerCheckService;
import interfaceAbstractDemo.Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdaptor implements CustomerCheckService{

	@Override
	public boolean CheckPerson(Customer customer) {
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result= false;
		try {
			  result = soapClient.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirth().getWeekYear());
		  } catch (NumberFormatException e) {
			   e.printStackTrace();
		  } catch (RemoteException e) {
		       e.printStackTrace();
		  }
		 return result;
	}

}
