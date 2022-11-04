package in.rcard.swe.imdb.social;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreateNewCommentConfiguration {
  
  /**
   * We don't want to use framework-specific annotations in the domain layer,
   * so we configure how to resolve business objects outside the domain layer.
   */
  @Bean
  public CreateNewCommentUseCase createNewCommentUseCase(
      CreateNewCommentOutboundPort outboundPort) {
    return new CreateNewCommentService(outboundPort);
  }
}
