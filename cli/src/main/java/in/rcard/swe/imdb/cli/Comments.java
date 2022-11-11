package in.rcard.swe.imdb.cli;

import java.util.ArrayList;
import java.util.List;

public class Comments extends Subject {
  
  private final CommentsRestClient commentsRestClient;
  private List<Comment> comments;
  
  public Comments(CommentsRestClient commentsRestClient) {
    this.commentsRestClient = commentsRestClient;
    this.comments = new ArrayList<>();
  }
  
  public void addComment(Comment comment) {
    commentsRestClient.addComment(comment);
    this.comments = commentsRestClient.findAll();
    notifyObservers();
  }
  
  public List<Comment> getListOfComments() {
    return this.comments;
  }
}
