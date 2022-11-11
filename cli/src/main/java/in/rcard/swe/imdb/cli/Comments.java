package in.rcard.swe.imdb.cli;

import in.rcard.swe.imdb.social.Comment;
import java.util.List;

public class Comments extends Subject {
  
  private final List<Comment> comments;
  
  public Comments(List<Comment> comments) {
    this.comments = comments;
  }
}
