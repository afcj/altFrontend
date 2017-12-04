package cat.socmobilitat.alteraciones.frontend.repository;

import cat.socmobilitat.alteraciones.frontend.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
