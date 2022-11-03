package in.rcard.swe.imdb.social.layered;

import java.util.Optional;

public class CreateNewCommentService implements CreateNewCommentUseCase {
  
  private final CommentDao dao;
  
  public CreateNewCommentService(CommentDao dao) {
    this.dao = dao;
  }
  
  @Override
  public Optional<Comment> createComment(Comment comment) {
    final long commentId = dao.createComment(comment.toPersistentComment());
    return dao.findById(commentId).map(Comment::valueOf);
  }
}
