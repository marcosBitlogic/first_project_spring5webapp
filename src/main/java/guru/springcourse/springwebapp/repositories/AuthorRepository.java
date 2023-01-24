package guru.springcourse.springwebapp.repositories;

import guru.springcourse.springwebapp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
