package org.democms.query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
public class ProductClient {
	/**
	 * @param args
	 */
	public ProductClient(){
		
	}
	public  void productContentSave(Product product) {
		Session session = null;
		 ServiceRegistry serviceRegistry;
		 SessionFactory sessionFactory;
		try{
			    //SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
			Configuration configuration = new Configuration();
			configuration.configure();
			serviceRegistry = new ServiceRegistryBuilder().applySettings(configuration.getProperties()).buildServiceRegistry(); 
			sessionFactory = configuration.buildSessionFactory(serviceRegistry);    
			session =sessionFactory.openSession();
			    Transaction	    tx = session.beginTransaction();
			    		    
			    session.save(product);
			    tx.commit();
			     			     
				System.out.println("Done");
		}
		
		catch(Exception e){
			e.printStackTrace();
			System.out.println("Error Occured");
			System.out.println(e.getMessage());
		}finally{
			// Actual contact insertion
			session.flush();
			session.close();

			}
	}
}
