package in.rcard.swe.imdb.social;

import java.util.Optional;

public interface CreateNewCommentUseCase {
  Optional<Comment> createComment(Comment comment);
}
