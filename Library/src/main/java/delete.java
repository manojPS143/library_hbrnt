import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class delete {

	public static void main(String[] args) {
		EntityManagerFactory EMF=Persistence.createEntityManagerFactory("MPS");
		EntityManager EM=EMF.createEntityManager();
		EntityTransaction ET=EM.getTransaction();
		
		Book b=EM.find(Book.class,1);
		if(b!=null) {
			ET.begin();
			EM.remove(b);
			ET.commit();
		}else {
			System.out.println("Data not");
		}
	

	}

}
