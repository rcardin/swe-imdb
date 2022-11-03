package in.rcard.swe.imdb.social;

import java.util.Optional;

public class PersistentCommentAdapter implements CreateNewCommentOutboundPort {

  private final CommentDao dao;
  
  public PersistentCommentAdapter(CommentDao dao) {
    this.dao = dao;
  }
  
  @Override
  public Optional<Comment> createComment(Comment comment) {
    
    dao.createComment(PersistentComment.valueOf(comment));
    
    return Optional.empty();
  }
}
