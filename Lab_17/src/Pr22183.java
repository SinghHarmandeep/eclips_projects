

import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tooltip;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;


public class Pr22183 extends Application {
	
	
	int moveCount =0; //counting moves
    String current = ""; //default value at the buttonse
    Button[][] buttons = new Button[3][3]; //buttons for the grid
    GridPane gp = new GridPane(); //layout for the buttons
    Button restart = new Button("Restart"); //to reset the game
    Button back = new Button("Back");//to go back to the main menu
    Text info = new Text(); //Information about the game
    final Text o = new Text("O");//"X"
    final Text x = new Text("X");//"O"
    HBox options = new HBox(145);//horizontal view with space between objects pram
    VBox vBoxMain = new VBox(25); // vertical view for the main menu options and info
    final Text newInfo = new Text("Hello World TTT by\nHARMANDEEP SINGH"); // main menu text
    Button pvpBtn = new Button("P VS P");//player vs player mode
    Button pvcBtn = new Button("P VS C");//player vs computer mode
    Random random = new Random();
    
	    /**
	     * Start is mostly the gui content
	     */
	    @Override
	    public void start(Stage stage) {
	        options.getChildren().addAll(back,restart);//ingame options
	        newInfo.setTextAlignment(TextAlignment.CENTER);//where to display the main info exactely
	        
	        pvpBtn.setPrefSize(100, 50);//prefferd mode button size
	        pvpBtn.setTooltip(new Tooltip("Player VS Player"));
	        pvcBtn.setPrefSize(100, 50);//preffered mode button size
	        pvcBtn.setTooltip(new Tooltip("Player VS Computer"));
	        
	        vBoxMain.getChildren().addAll(newInfo, pvpBtn, pvcBtn);//all main menu info added into a Vbox
	        vBoxMain.setAlignment(Pos.CENTER);//vBox located in the center
	        vBoxMain.setPrefSize(350, 500);//vBox set proffered size
	        vBoxMain.setStyle("-fx-background-color: grey");

	        for (int i = 0; i < buttons.length; i++) {
	        	for(int j = 0; j<3;j++) {
	        		Button name = new Button();
	        		buttons[i][j] = name;
	        		buttons[i][j].setPrefSize(100, 100);
	        		buttons[i][j].setText(null);	
	        		buttons[i][j].setFont(Font.font(40));
	        		buttons[i][j].setStyle("-fx-border-color: black;");
	        	}
			}
	       
	        info.setFont(Font.font(20)); //text font
	        info.setTextAlignment(TextAlignment.CENTER); // centered the text
	        x.setFont(Font.font(40)); // x size
	        x.setFill(Color.BLUE);
	        o.setFont(Font.font(40)); //y size
	        restart.setAlignment(Pos.CENTER); //Text location inside the button
	 		restart.setPrefSize(100, 50); // restart button size
	 		restart.setFont(Font.font(18));
	 		back.setAlignment(Pos.CENTER);
	 		back.setPrefSize(100, 50);
	 		back.setFont(Font.font(18));
	 		gp.setAlignment(Pos.CENTER);

	        
	 		for (int i = 0; i < 3; i++) //adding buttons to gridpane
	 			for (int j = 0; j < 3; j++) 
					gp.add(buttons[i][j], i, j);
	 		
	 		
	 		
	 		restart.setOnAction(e-> reset()); //resets the grid
	 		
	 		BorderPane.setAlignment(info, Pos.CENTER); // location of the info text
	 		BorderPane.setAlignment(restart, Pos.CENTER_RIGHT); // location of the restart button
	 		BorderPane.setAlignment(back, Pos.CENTER_LEFT); // location of the back button
	 		
	 		BorderPane root = new BorderPane(gp, options, null, info, null); //Instantiating border pane
	 		
	 		root.setPrefSize(350, 500); // Proffered size
	 	    root.setStyle("-fx-padding: 1;"+"-fx-border-style: solid centered;"+"-fx-border-insets: 1;"+"-fx-border-radius: 10;"+
	 	    		"-fx-border-width: 5;"+"-fx-border-color: blue;"+"-fx-background-color: grey");
	        
	 	    Scene main = new Scene(vBoxMain); // main is the main menu
	        Scene grid = new Scene(root); //grid is the main root view
	        
	        stage.sizeToScene(); //size of the windo is set to scene's size
	        stage.setTitle("Tic Tac Toe – Harmandeep Singh"); // Title of the windo
	        stage.setScene(main); //scene is set to main screen
	        
	        back.setOnAction(e -> {stage.setScene(main); reset();}); // back button
	        
	        pvpBtn.setOnAction(e -> {stage.setScene(grid); playerMode();}); //PVP button
	        pvcBtn.setOnAction(e -> {stage.setScene(grid); computerMode();}); // PVC button
	        
	        stage.show();
	    }
	    
	    /**
	     * @param x is the buttons 2d array
	     * @param cur is the current player
	     * @return boolean, return true if their is a winner
	     * @ else false
	     */
	    public boolean checkWinner() {
	    	Button[][] x = buttons;
	    	String cur = current;
	    	for(int i = 0; i<3; i++) {
 			   if(x[i][0].getText() == cur && x[i][1].getText() == cur && x[i][2].getText() == cur ||
 					   x[0][i].getText() == cur && x[1][i].getText() == cur && x[2][i].getText() == cur)
 				return true;
 			   }
	    	if ((x[0][0].getText() == cur && x[1][1].getText() == cur && x[2][2].getText() == cur))
	    		return true;
	    	else if (x[0][2].getText() == cur && x[1][1].getText() == cur && x[2][0].getText() == cur)
	    		return true;
	    	else 
	    		return false;
	    }
	    /**
	     * Disables all the buttons
	     */
	    public void disable() {
	    	for (int x = 0; x < 3; x++) 
	    		for (int y = 0; y < 3; y++) 
	    			buttons[x][y].setDisable(true);
	    }
	    /**
	     * resets the grid
	     */
	    public void reset() {
	    	for(int i = 0; i<3; i++) {
				for(int j = 0; j<3; j++) {
					buttons[i][j].setText(null);
					buttons[i][j].setDisable(false);
				}
			}
	    	info.setText("Game has been reset"); //Information about the game
			moveCount = 0;
	    }
	    /**
	     * Main method
	     * @param args
	     * Launches the application
	     */
	    public static void main(String[] args) {
	        Application.launch(args);
	    }
	    
	    
	    public void computerMode() { //for player vs computer mocde
	    	
	    	info.setText("Player VS Computer\nYou are X, go first!");
	 		
	 		for (int i = 0; i < 3; i++) { //player vs player heart
	 			int k = i;
	 			for (int j = 0; j < 3; j++) {
	 				int l= j;
 					buttons[i][j].setOnAction(new EventHandler<ActionEvent>() {
 						@Override
 						public void handle(ActionEvent event) {
 							//code for move
 							if(moveCount == 8) { //Check if it's a draw
 								if(checkWinner()) { //final check before a draw
 									info.setText("Player "+ current + " has won");
 								}
 								else
 									info.setText("DRAW!\nRestart to Play again");
 								
 								for (int x = 0; x < 3; x++) 
 									for (int y = 0; y < 3; y++) 
 										buttons[x][y].setDisable(true);
 							}
 							
 							
 							if(buttons[k][l].getText() == null) {
 								if(moveCount%2 == 0) {
 									current = x.getText();
 									buttons[k][l].setText(current);
 									moveCount++;
 									if(checkWinner()) {
 										info.setText("You won");
 										disable();
 										return;
 									}

 									int ranx, rany;
 									do {
 										ranx = random.nextInt(3);
 	 									rany = random.nextInt(3);
									} while (buttons[ranx][rany].getText() != null && moveCount < 8);
 									current = o.getText();
 									if(buttons[ranx][rany].getText() == null) { //final check to see if the computer could make a move or not
 									buttons[ranx][rany].setText(current);
 									moveCount++;}
 									if (checkWinner()) {
										info.setText("Computer Wins");
										disable();
										return;
									}
 								}
 							}
 							else {
 								info.setText("Choose another box");
 							}
 						}

 					});
 				}
	 		}
	 	}

	    public void playerMode() { //for player to player
	    	
	    	info.setText("Player VS Player\nFirst player is X");
	 		
	 		for (int i = 0; i < 3; i++) { //player vs player heart
	 			int k = i;
	 			for (int j = 0; j < 3; j++) {
	 				int l= j;
 					buttons[i][j].setOnAction(new EventHandler<ActionEvent>() {
 						@Override
 						public void handle(ActionEvent event) {
 							if(buttons[k][l].getText() == null ) {
 								//setting turns
 								if(moveCount%2 == 0) {
 									current = x.getText();
 									info.setText(o.getText()+"'s turn!");
 									
 								}
 								else {
 									current = o.getText();
 									info.setText(x.getText()+"'s turn!");
 								}
 								moveCount++;
 								buttons[k][l].setText(current);
 								if(checkWinner()) { // check if someone has won
 									info.setText("Player " + current + " has won");
 									disable();
 								}
 							}
 							else 
 								info.setText("Choose another box");	
							
 							if(moveCount == 9) { //Check if it's a draw
 								if(checkWinner()) { //final check before a draw
 									info.setText("Player "+ current + " has won");
 								}
 								else
 									info.setText("DRAW!\nRestart to Play again");
 								
 								for (int x = 0; x < 3; x++) 
 									for (int y = 0; y < 3; y++) 
 										buttons[x][y].setDisable(true);
 							}
 						}
 					});
	 			}
	 		}
	    }
}