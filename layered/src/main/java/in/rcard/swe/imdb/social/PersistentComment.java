package in.rcard.swe.imdb.social;

import java.util.List;

public class PersistentComment {
  private final long id;
  private final String comment;
  private final List<Long> responses;
  
  public PersistentComment(long id, String comment, List<Long> responses) {
    this.id = id;
    this.comment = comment;
    this.responses = responses;
  }
  
  public long getId() {
    return id;
  }
  
  public String getComment() {
    return comment;
  }
  
  public List<Long> getResponses() {
    return responses;
  }
}
