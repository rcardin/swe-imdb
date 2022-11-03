package in.rcard.swe.imdb.social.layered;

import java.util.List;

/**
 * <pre>
 *   {
 *     "responses": [
 *       {
 *
 *       },
 *       {
 *
 *       }
 *     ]
 *   }
 * </pre>
 */
public class Comment {
  
  private final String text;
  private final List<Comment> responses;
  
  public Comment(String text, List<Comment> responses) {
    this.text = text;
    this.responses = responses;
  }
  
  public List<Comment> getResponses() {
    return responses;
  }
  
  public String getText() {
    return text;
  }
  
  public static Comment valueOf(PersistentComment persistentComment) {
    return null;
  }
  
  public PersistentComment toPersistentComment() {
    return null;
  }
}
