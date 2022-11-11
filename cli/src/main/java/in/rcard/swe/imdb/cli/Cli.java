package in.rcard.swe.imdb.cli;

import java.util.List;

public class Cli extends Subject implements Observer {
  
  public static void main(String[] args) {
    // Model
    final Comments comments = new Comments(List.of());
    // View
    final Cli cli = new Cli(comments);
    comments.attach(cli);
    // Controller
    final CliController controller = new CliController(cli, comments);
    cli.attach(controller);
  
    cli.run();
  }
  
  private final Comments comments;

  public Cli(Comments comments) {
    this.comments = comments;
  }
  
  private void run() {
  
  }
  
  @Override
  public void update() {
  
  }
}
