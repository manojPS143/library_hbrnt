import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class read_n {

	public static void main(String[] args) {
		EntityManagerFactory EMF = Persistence.createEntityManagerFactory("MPS");
		EntityManager EM = EMF.createEntityManager();
		EntityTransaction ET = EM.getTransaction();
		Book b = EM.find(Book.class, 2);

		System.out.println(b.getId());
		System.out.println(b.getName());
		System.out.println(b.getPrice());

	}

}
