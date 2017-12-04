package cat.socmobilitat.alteraciones.frontend.repository.search;

import cat.socmobilitat.alteraciones.frontend.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, Long> {
}
