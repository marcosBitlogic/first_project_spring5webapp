package guru.springcourse.springwebapp.repositories;

import guru.springcourse.springwebapp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
