import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.stage.Stage;
// these imports are used for the First JavaFX Activity
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;


public class testing extends Application {
    @Override
    public void start(final Stage stage) {
    	//Call the setTitle method on the stage parameter within start method
    	stage.setTitle("CS400: The Key");
    	
    	//create a Label object
//    	Label newLab = new Label("    The key to making programs fast\n" + "    is to make them do practically nothing.\n" + "    -- Mike Haertel");
//    	
//    	//Create a new circle object by passing the arguments: 160, 120, 30 into the Circle constructor.
//    	Circle newCir = new Circle(160, 120, 30);
//    	
//    	//Create a new Polygon object.
//    	Polygon newTri = new Polygon(160, 120, 200, 220, 120, 220);
//    	
        // update this method definition to complete the First JavaFX Activity
   //     Group group = new Group(newLab, newCir, newTri);
    	Group root = new Group();
    	 Scene scene = new Scene(root);
      //  Scene scene = new Scene(group,320,240);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        Application.launch();
    }
}