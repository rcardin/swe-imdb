package in.rcard.swe.imdb.social;

import java.util.Optional;

public class CreateNewCommentService implements CreateNewCommentUseCase {
  
  private final CreateNewCommentOutboundPort outboundPort;
  
  public CreateNewCommentService(CreateNewCommentOutboundPort outboundPort) {
    this.outboundPort = outboundPort;
  }
  
  @Override
  public Optional<Comment> createComment(Comment comment) {
    
    return outboundPort.createComment(comment);
  }
}
