package in.rcard.swe.imdb.social;

import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public class CommentDao {
  
  public long createComment(PersistentComment comment) {
    return 42;
  }
  
  public Optional<PersistentComment> findById(long id) {
    return null;
  }
}
