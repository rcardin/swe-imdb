package in.rcard.swe.imdb.social;

import java.util.List;

public record PersistentComment(Long id, String comment, String author, List<Long> responses) {
  
  public static PersistentComment valueOf(Comment comment) {
    return null;
  }
}
