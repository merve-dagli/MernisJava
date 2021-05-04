package interfaceAbstractDemo;

import java.util.GregorianCalendar;

import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Concrete.CustomerCheckManager;
import interfaceAbstractDemo.Concrete.NeroCustomerManager;
import interfaceAbstractDemo.Concrete.StarbucksCustomerManager;
import interfaceAbstractDemo.Entities.Customer;
import interfaceAbstractDemo.adapters.MernisServiceAdaptor;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer(1,"Merve","Dagli",new GregorianCalendar(1997,1,15),"111111");
		Customer customer2 = new Customer(2,"Engin","Demiroð",new GregorianCalendar(1989,2,11),"123456");
				
		BaseCustomerManager neroCustomerManager = new NeroCustomerManager(new CustomerCheckManager());
		neroCustomerManager.save(customer1);
		
		BaseCustomerManager starbucksCustomerManager = new StarbucksCustomerManager(new MernisServiceAdaptor());
		starbucksCustomerManager.save( customer1);
		starbucksCustomerManager.save(customer2);

	}

}

