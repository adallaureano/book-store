package ao.devops.bookstore.repository;

import ao.devops.bookstore.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("http://localhost:4200/")
public interface BookRepository extends JpaRepository<Book, Long>{

}
