import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class insert {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("MPS");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Book b1=new Book();
		b1.setId(102);
		b1.setName("IDK");
		b1.setPrice(2.99);
		
		et.begin();
		em.persist(b1);
		et.commit();
	}

}
