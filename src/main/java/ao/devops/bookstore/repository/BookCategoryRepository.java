package ao.devops.bookstore.repository;

import ao.devops.bookstore.entity.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {

}
