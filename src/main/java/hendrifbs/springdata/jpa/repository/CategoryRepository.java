package hendrifbs.springdata.jpa.repository;

import hendrifbs.springdata.jpa.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    // where name = ?
    Optional<Category> findFirstByNameEquals(String name);

    // where name like ?
    List<Category> findAllByNameLike(String name);

}