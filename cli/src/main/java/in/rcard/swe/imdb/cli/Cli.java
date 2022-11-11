package in.rcard.swe.imdb.cli;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Cli extends Subject implements Observer {
  
  private String commentAsJson;
  
  public static void main(String[] args) throws IOException {
    // Model
    final CommentsRestClient restClient = new CommentsRestClient();
    final Comments comments = new Comments(restClient);
    // View
    final Cli cli = new Cli(comments);
    comments.attach(cli);
    // Controller
    final CliController controller = new CliController(cli, comments, new ObjectMapper());
    cli.attach(controller);
  
    cli.run();
  }
  
  private final Comments comments;
  
  final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

  public Cli(Comments comments) {
    this.comments = comments;
  }
  
  private void run() throws IOException {
    while (true) {
      final String nextOperation = br.readLine();
      switch (nextOperation) {
        case "-c" -> {
          commentAsJson = br.readLine();
          notifyObservers();
        }
      }
    }
  }
  
  @Override
  public void update() {
    final List<Comment> commentList = comments.getListOfComments();
    commentList.forEach(System.out::println);
  }
  
  public String getCommentAsJson() {
    return commentAsJson;
  }
}
