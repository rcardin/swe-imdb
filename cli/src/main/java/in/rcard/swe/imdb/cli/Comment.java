package in.rcard.swe.imdb.cli;

import in.rcard.swe.imdb.social.CommentResponse;
import java.util.List;

/**
 *
 *
 * <pre>
 *   {
 *     "id": 1,
 *     "text": "This is my first comment"
 *     "author": "aUser",
 *     "responses": [
 *       {
 *         "id": 2,
 *         "text": "This is my first response",
 *         "author": "anotherUser"
 *       }
 *     ]
 *   }
 * </pre>
 */
public record Comment(Long id, String text, String author, List<CommentResponse> responses) {
  
  @Override
  public String toString() {
    return "Comment{" +
               "id=" + id +
               ", text='" + text + '\'' +
               ", author='" + author + '\'' +
               ", responses=" + responses +
               '}';
  }
}
