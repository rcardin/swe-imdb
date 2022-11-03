package in.rcard.swe.imdb.social;

import java.util.Optional;

public interface CreateNewCommentOutboundPort {
  
  Optional<Comment> createComment(Comment comment);
}
