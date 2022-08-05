import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class update {

	public static void main(String[] args) {
		EntityManagerFactory EMF=Persistence.createEntityManagerFactory("MPS");
		EntityManager EM=EMF.createEntityManager();
		EntityTransaction ET=EM.getTransaction();
		
		Book b=new Book();
		b.setId(1);
		b.setName("mps");
		b.setPrice(12000000.00);
		
		ET.begin();
		EM.merge(b);
		ET.commit();	
	}

}
