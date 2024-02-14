import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class DisplayImages extends Application {

    @Override
    public void start(Stage primaryStage) {

        Image flag1 = new Image("flag1.gif");
        Image flag2 = new Image("flag2.gif");
        Image flag6 = new Image("flag6.gif");
        Image flag7 = new Image("flag7.gif");


        ImageView flag1View = new ImageView(flag1);
        ImageView flag2View = new ImageView(flag2);
        ImageView flag6View = new ImageView(flag6);
        ImageView flag7View = new ImageView(flag7);


        GridPane gridPane = new GridPane();

        gridPane.add(flag1View, 0, 0);
        gridPane.add(flag2View, 1, 0);
        gridPane.add(flag6View, 0, 1);
        gridPane.add(flag7View, 1, 1);

        gridPane.setHgap(10);
        gridPane.setVgap(10);

        Scene scene = new Scene(gridPane, 600, 400);
        primaryStage.setTitle("Display Images");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
