import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Mancala extends Application {
 
	int s1=4,s2=4,s3=4,s4=4,s5=4,s6=4,s7=0,s8=4,s9=4,s10=4,s11=4,s12=4,s13=4,s14=0;
	int score1 = s7;
	int score2 = s14;
	boolean player1=true;
	Text p1 = new Text();
	Text p2 = new Text();
	
	public static void main(String[] args) {
		launch();
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane p = new Pane();
		ImageView board = new ImageView(new Image("http://ba.net/juegos/mancala/images/MANCALA-game_bg_combined.jpg"));
		Label [] slot= new Label[14];
		Text title = new Text("MANCALA");
		Text stitle = new Text("Kym Haywood II");
		stitle.setX(490);
		stitle.setY(400);
		stitle.setFont(Font.font(30));
		stitle.setFill(Color.SADDLEBROWN);
		title.setX(420);
		title.setY(350);
		title.setFont(Font.font(70));
		title.setFill(Color.SADDLEBROWN);
		
		Circle t1 = new Circle(30);
		t1.setCenterX(1132);
		t1.setCenterY(85);
		
		Circle t2 = new Circle (30);
		t2.setCenterX(1135);
		t2.setCenterY(155);
		if(player1==true){
			t1.setFill(Color.YELLOW);
			t2.setFill(Color.TRANSPARENT);
			}
		else{
			t1.setFill(Color.TRANSPARENT);
			t2.setFill(Color.LIGHTBLUE);
		}
			
		Text P1 = new Text("P1");
		P1.setFont(Font.font(40));
		P1.setX(1110);
		P1.setY(100);
		Text P2 = new Text("P2");
		P2.setFont(Font.font(40));
		P2.setX(1110);
		P2.setY(170);
		
		slot[0] = new Label(String.valueOf(s1));
		slot[1] = new Label(String.valueOf(s2));
		slot[2] = new Label(String.valueOf(s3));
		slot[3] = new Label(String.valueOf(s4));
		slot[4] = new Label(String.valueOf(s5));
		slot[5] = new Label(String.valueOf(s6));
		slot[6] = new Label(String.valueOf(s7));
		slot[7] = new Label(String.valueOf(s8));
		slot[8] = new Label(String.valueOf(s9));
		slot[9] = new Label(String.valueOf(s10));
		slot[10] = new Label(String.valueOf(s11));
		slot[11] = new Label(String.valueOf(s12));
		slot[12] = new Label(String.valueOf(s13));
		slot[13] = new Label(String.valueOf(s14));
		//Player1 Goal
		slot[13].setLayoutX(970);
		slot[13].setLayoutY(315);
		slot[13].setFont( new Font("Arial",55));
		slot[13].setScaleX(1.5);
		slot[13].setScaleY(1.5);
		slot[13].setTextFill(Color.BLACK);
		//Player2 Goal
		slot[6].setLayoutX(145);
		slot[6].setLayoutY(315);
		slot[6].setFont( new Font("Arial",55));
		slot[6].setScaleX(1.5);
		slot[6].setScaleY(1.5);
		slot[6].setTextFill(Color.BLACK);
		
		//Player2 Slots
		slot[5].setLayoutX(270);
		slot[5].setLayoutY(130);
		slot[5].setFont( new Font("Arial",30));
		slot[5].setScaleX(1.5);
		slot[5].setScaleY(1.5);
		
		slot[4].setLayoutX(388);
		slot[4].setLayoutY(130);
		slot[4].setFont( new Font("Arial",30));
		slot[4].setScaleX(1.5);
		slot[4].setScaleY(1.5);
		
		slot[3].setLayoutX(506);
		slot[3].setLayoutY(130);
		slot[3].setFont( new Font("Arial",30));
		slot[3].setScaleX(1.5);
		slot[3].setScaleY(1.5);
		
		slot[2].setLayoutX(624);
		slot[2].setLayoutY(130);
		slot[2].setFont( new Font("Arial",30));
		slot[2].setScaleX(1.5);
		slot[2].setScaleY(1.5);
		
		slot[1].setLayoutX(742);
		slot[1].setLayoutY(130);
		slot[1].setFont( new Font("Arial",30));
		slot[1].setScaleX(1.5);
		slot[1].setScaleY(1.5);
		
		slot[0].setLayoutX(860);
		slot[0].setLayoutY(130);
		slot[0].setFont( new Font("Arial",30));
		slot[0].setScaleX(1.5);
		slot[0].setScaleY(1.5);
		
		//Player1 Slots
		slot[7].setLayoutX(270);
		slot[7].setLayoutY(510);
		slot[7].setFont( new Font("Arial",30));
		slot[7].setScaleX(1.5);
		slot[7].setScaleY(1.5);
		
		slot[8].setLayoutX(388);
		slot[8].setLayoutY(510);
		slot[8].setFont( new Font("Arial",30));
		slot[8].setScaleX(1.5);
		slot[8].setScaleY(1.5);
		
		slot[9].setLayoutX(506);
		slot[9].setLayoutY(510);
		slot[9].setFont( new Font("Arial",30));
		slot[9].setScaleX(1.5);
		slot[9].setScaleY(1.5);
		
		slot[10].setLayoutX(624);
		slot[10].setLayoutY(510);
		slot[10].setFont( new Font("Arial",30));
		slot[10].setScaleX(1.5);
		slot[10].setScaleY(1.5);
		
		slot[11].setLayoutX(742);
		slot[11].setLayoutY(510);
		slot[11].setFont( new Font("Arial",30));
		slot[11].setScaleX(1.5);
		slot[11].setScaleY(1.5);
		
		slot[12].setLayoutX(860);
		slot[12].setLayoutY(510);
		slot[12].setFont( new Font("Arial",30));
		slot[12].setScaleX(1.5);
		slot[12].setScaleY(1.5);
		
		Button exit = new Button("Exit");
		Button reset = new Button("Reset");
		Button rules = new Button("Rules");
		rules.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				Stage rules = new Stage();
				rules.initModality(Modality.APPLICATION_MODAL);
				rules.initOwner(primaryStage);
				Pane r = new Pane();
				r.getChildren().add(new Text("\n\n The Mancala board is made up of two rows of six holes, or pits, each. \n\n\n"+
						" Four pieces—marbles, chips, or stones—are placed in each of the 12 holes. The color of the pieces is irrelevant.\n"+
						" Each player has a store (called a Mancala) to the right side of the Mancala board. \n"+
						" The game begins with one player picking up all of the pieces in any one of the holes on his side.\n"+

						" Moving counter-clockwise, the player deposits one of the stones in each hole until the stones run out.\n"+
						" If you run into your own store, deposit one piece in it. If you run into your opponent's store, skip it.\n"+
						" If the last piece you drop is in your own store, you get a free turn."+
						" If the last piece you drop is in an empty hole on your side,\n you capture that piece and any pieces in the hole directly opposite.\n"+
						" Always place all captured pieces in your store.\n"+
						" The game ends when all six spaces on one side of the Mancala board are empty.\n"+
						" The player who still has pieces on his side of the board when the game ends capture all of those pieces.\n"+
						" Count all the pieces in each store.\n\n THE WINNER IS THE PLAYER WITH THE MOST PIECES!\n"+"\n"+
						" Tips: \n"+
						" Planning ahead is essential to victory in board games like Mancala. \n Try to plan two or three moves into the future."));
				Scene q = new Scene(r,740,350);
				rules.setScene(q);
				rules.show();
				
				
			}
			
		});
		p1 = new Text("Player 1 : "+Integer.valueOf(slot[6].getText()));
		p2 = new Text("Player 2 : "+Integer.valueOf(slot[13].getText()));
		
		Rectangle r1 = new Rectangle(85,425);
		r1.setX(130);
		r1.setY(120);
		Rectangle r2 = new Rectangle(85,425);
		r2.setX(957);
		r2.setY(120);
		
		Circle c1= new Circle(50);
		c1.setCenterX(290);
		c1.setCenterY(150);
		
		Circle c2= new Circle(50);
		c2.setCenterX(408);
		c2.setCenterY(150);
		
		Circle c3= new Circle(50);
		c3.setCenterX(526);
		c3.setCenterY(150);
		
		Circle c4= new Circle(50);
		c4.setCenterX(644);
		c4.setCenterY(150);
		
		Circle c5= new Circle(50);
		c5.setCenterX(762);
		c5.setCenterY(150);
		
		Circle c6= new Circle(50);
		c6.setCenterX(880);
		c6.setCenterY(150);
	
		Circle c7= new Circle(50);
		c7.setCenterX(290);
		c7.setCenterY(525);
		
		Circle c8= new Circle(50);
		c8.setCenterX(408);
		c8.setCenterY(525);
		
		Circle c9= new Circle(50);
		c9.setCenterX(526);
		c9.setCenterY(525);
		
		Circle c10= new Circle(50);
		c10.setCenterX(644);
		c10.setCenterY(525);
		
		Circle c11= new Circle(50);
		c11.setCenterX(762);
		c11.setCenterY(525);
		
		Circle c12= new Circle(50);
		c12.setCenterX(880);
		c12.setCenterY(525);
		
		//Player2
		c1.setFill(Color.TRANSPARENT);
		c2.setFill(Color.TRANSPARENT);
		c3.setFill(Color.TRANSPARENT);
		c4.setFill(Color.TRANSPARENT);
		c5.setFill(Color.TRANSPARENT);
		c6.setFill(Color.TRANSPARENT);
		r1.setFill(Color.TRANSPARENT);
		//Player1	
		c7.setFill(Color.TRANSPARENT);
		c8.setFill(Color.TRANSPARENT);
		c9.setFill(Color.TRANSPARENT);
		c10.setFill(Color.TRANSPARENT);
		c11.setFill(Color.TRANSPARENT);
		c12.setFill(Color.TRANSPARENT);
		r2.setFill(Color.TRANSPARENT);
			
		//Player 2 Side	
		c1.setOnMouseClicked(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent event) {
				if(player1==false&&slot[5].getText()!="0"){
				int limit =Integer.valueOf(slot[5].getText());
				slot[5].setText("0");
				int temp=5;
				for(int i = 0;i<limit;i++ ){
					temp++;
					if(!player1&&temp==13){
						temp=0;
						slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
						continue;
						}
					if(player1&&temp==6){
						temp=7;
						slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
						continue;
					}
					if(temp>13)temp=0;
					
					slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
					
					}
				
				int cap=0;
				
				if(temp==0&&Integer.valueOf(slot[0].getText())==1&&Integer.valueOf(slot[12].getText())>0){
					cap+=(Integer.valueOf(slot[0].getText())+Integer.valueOf(slot[12].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[0].setText("0");
					slot[12].setText("0");
					cap=0;
				}
				
				if(temp==1&&Integer.valueOf(slot[1].getText())==1&&Integer.valueOf(slot[11].getText())>0){
					cap+=(Integer.valueOf(slot[1].getText())+Integer.valueOf(slot[11].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[1].setText("0");
					slot[11].setText("0");
					cap=0;
				}
				
				if(temp==2&&Integer.valueOf(slot[2].getText())==1&&Integer.valueOf(slot[10].getText())>0){
					cap+=(Integer.valueOf(slot[2].getText())+Integer.valueOf(slot[10].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[2].setText("0");
					slot[10].setText("0");
					cap=0;
				}
				if(temp==3&&Integer.valueOf(slot[3].getText())==1&&Integer.valueOf(slot[9].getText())>0){
					cap+=(Integer.valueOf(slot[3].getText())+Integer.valueOf(slot[9].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[3].setText("0");
					slot[9].setText("0");
					cap=0;
				}
			
				if(temp==4&&Integer.valueOf(slot[4].getText())==1&&Integer.valueOf(slot[8].getText())>0){
					cap+=(Integer.valueOf(slot[4].getText())+Integer.valueOf(slot[8].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[4].setText("0");
					slot[8].setText("0");
					cap=0;
				}
				if(temp==5&&Integer.valueOf(slot[5].getText())==1&&Integer.valueOf(slot[7].getText())>0){
					cap+=(Integer.valueOf(slot[5].getText())+Integer.valueOf(slot[7].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[5].setText("0");
					slot[7].setText("0");
					cap=0;
				}
				int totalP2=0;
				for(int i =0;i<6;i++){
					totalP2+=Integer.valueOf(slot[i].getText());				
				
				}
				System.out.println(totalP2);
				int sumr2=0;
				if(totalP2==0){
					for(int i = 7; i<13;i++){
						sumr2+=Integer.valueOf(slot[i].getText());
						slot[i].setText("0");
						slot[i].setText(String.valueOf(Integer.valueOf(0)));
					}
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+sumr2));
					if(Integer.valueOf(slot[13].getText())>Integer.valueOf(slot[6].getText())){
					title.setText("Player 1 Wins!");
					}
					else if(Integer.valueOf(slot[13].getText())<Integer.valueOf(slot[6].getText())){
						title.setText("Player 2 Wins!");
					}
					else
						title.setText("Draw");
				}
			//	System.out.println(Integer.valueOf(slot[5].getText()));
				if(temp==6){
					player1=false;
				}
				else{ player1=true;
				t1.setFill(Color.YELLOW);
				t2.setFill(Color.TRANSPARENT);}
			//	System.out.println(temp);
				p1.setText("Player 1 : "+Integer.valueOf(slot[13].getText()));
				p2.setText("Player 2 : "+Integer.valueOf(slot[6].getText()));}
			}
			
		});
		c2.setOnMouseClicked(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent event) {
				if(player1==false&&slot[4].getText()!="0"){
				int limit =Integer.valueOf(slot[4].getText());
				slot[4].setText("0");
				int temp=4;
				for(int i = 0;i<limit;i++ ){
					temp++;
					if(!player1&&temp==13){
						temp=0;
						slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
						continue;
						}
					if(player1&&temp==6){
						temp=7;
						slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
						continue;
					}
					if(temp>13)temp=0;
					slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
					
					}
				
				int cap=0;
				
				if(temp==0&&Integer.valueOf(slot[0].getText())==1&&Integer.valueOf(slot[12].getText())>0){
					cap+=(Integer.valueOf(slot[0].getText())+Integer.valueOf(slot[12].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[0].setText("0");
					slot[12].setText("0");
					cap=0;
				}
				
				if(temp==1&&Integer.valueOf(slot[1].getText())==1&&Integer.valueOf(slot[11].getText())>0){
					cap+=(Integer.valueOf(slot[1].getText())+Integer.valueOf(slot[11].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[1].setText("0");
					slot[11].setText("0");
					cap=0;
				}
				
				if(temp==2&&Integer.valueOf(slot[2].getText())==1&&Integer.valueOf(slot[10].getText())>0){
					cap+=(Integer.valueOf(slot[2].getText())+Integer.valueOf(slot[10].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[2].setText("0");
					slot[10].setText("0");
					cap=0;
				}
				if(temp==3&&Integer.valueOf(slot[3].getText())==1&&Integer.valueOf(slot[9].getText())>0){
					cap+=(Integer.valueOf(slot[3].getText())+Integer.valueOf(slot[9].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[3].setText("0");
					slot[9].setText("0");
					cap=0;
				}
			
				if(temp==4&&Integer.valueOf(slot[4].getText())==1&&Integer.valueOf(slot[8].getText())>0){
					cap+=(Integer.valueOf(slot[4].getText())+Integer.valueOf(slot[8].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[4].setText("0");
					slot[8].setText("0");
					cap=0;
				}
				if(temp==5&&Integer.valueOf(slot[5].getText())==1&&Integer.valueOf(slot[7].getText())>0){
					cap+=(Integer.valueOf(slot[5].getText())+Integer.valueOf(slot[7].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[5].setText("0");
					slot[7].setText("0");
					cap=0;
				}
				int totalP2=0;
				for(int i =0;i<6;i++){
					totalP2+=Integer.valueOf(slot[i].getText());					
				
				}
				System.out.println(totalP2);
				int sumr2=0;
				if(totalP2==0){
					for(int i = 7; i<13;i++){
						sumr2+=Integer.valueOf(slot[i].getText());
						slot[i].setText("0");
						slot[i].setText(String.valueOf(Integer.valueOf(0)));
					}
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+sumr2));
					if(Integer.valueOf(slot[13].getText())>Integer.valueOf(slot[6].getText())){
						title.setText("Player 1 Wins!");
						}
						else if(Integer.valueOf(slot[13].getText())<Integer.valueOf(slot[6].getText())){
							title.setText("Player 2 Wins!");
						}
						else{
							title.setText("Draw");
							title.setX(515);
						}
				}
			//	System.out.println(Integer.valueOf(slot[4].getText()));
				if(temp==6){
					player1=false;
				}
				else{ player1=true;
				t1.setFill(Color.YELLOW);
				t2.setFill(Color.TRANSPARENT);}
			//	System.out.println(temp);
				p1.setText("Player 1 : "+Integer.valueOf(slot[13].getText()));
				p2.setText("Player 2 : "+Integer.valueOf(slot[6].getText()));}
			}
			
		});
		c3.setOnMouseClicked(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent event) {
				if(player1==false&&slot[3].getText()!="0"){
				int limit =Integer.valueOf(slot[3].getText());
				slot[3].setText("0");
				int temp=3;
				
				for(int i = 0;i<limit;i++ ){
					temp++;
					if(!player1&&temp==13){
						temp=0;
						slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
						continue;
						}
					if(player1&&temp==6){
						temp=7;
						slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
						continue;
					}
					if(temp>13)temp=0;
					slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
					
					}
				
				int cap=0;
				
				if(temp==0&&Integer.valueOf(slot[0].getText())==1&&Integer.valueOf(slot[12].getText())>0){
					cap+=(Integer.valueOf(slot[0].getText())+Integer.valueOf(slot[12].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[0].setText("0");
					slot[12].setText("0");
					cap=0;
				}
				
				if(temp==1&&Integer.valueOf(slot[1].getText())==1&&Integer.valueOf(slot[11].getText())>0){
					cap+=(Integer.valueOf(slot[1].getText())+Integer.valueOf(slot[11].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[1].setText("0");
					slot[11].setText("0");
					cap=0;
				}
				
				if(temp==2&&Integer.valueOf(slot[2].getText())==1&&Integer.valueOf(slot[10].getText())>0){
					cap+=(Integer.valueOf(slot[2].getText())+Integer.valueOf(slot[10].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[2].setText("0");
					slot[10].setText("0");
					cap=0;
				}
				if(temp==3&&Integer.valueOf(slot[3].getText())==1&&Integer.valueOf(slot[9].getText())>0){
					cap+=(Integer.valueOf(slot[3].getText())+Integer.valueOf(slot[9].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[3].setText("0");
					slot[9].setText("0");
					cap=0;
				}
			
				if(temp==4&&Integer.valueOf(slot[4].getText())==1&&Integer.valueOf(slot[8].getText())>0){
					cap+=(Integer.valueOf(slot[4].getText())+Integer.valueOf(slot[8].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[4].setText("0");
					slot[8].setText("0");
					cap=0;
				}
				if(temp==5&&Integer.valueOf(slot[5].getText())==1&&Integer.valueOf(slot[7].getText())>0){
					cap+=(Integer.valueOf(slot[5].getText())+Integer.valueOf(slot[7].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[5].setText("0");
					slot[7].setText("0");
					cap=0;
				}
				int totalP2=0;
				for(int i =0;i<6;i++){
					totalP2+=Integer.valueOf(slot[i].getText());					
				
				}
				System.out.println(totalP2);
				int sumr2=0;
				if(totalP2==0){
					for(int i = 7; i<13;i++){
						sumr2+=Integer.valueOf(slot[i].getText());
						slot[i].setText("0");
						slot[i].setText(String.valueOf(Integer.valueOf(0)));
					}
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+sumr2));
					if(Integer.valueOf(slot[13].getText())>Integer.valueOf(slot[6].getText())){
						title.setText("Player 1 Wins!");
						}
						else if(Integer.valueOf(slot[13].getText())<Integer.valueOf(slot[6].getText())){
							title.setText("Player 2 Wins!");
						}
						else{
							title.setText("Draw");
							title.setX(515);
						}
				}
		//		System.out.println(Integer.valueOf(slot[3].getText()));
				if(temp==6){
					player1=false;
				}
				else{ player1=true;
				t1.setFill(Color.YELLOW);
				t2.setFill(Color.TRANSPARENT);}
		//		System.out.println(temp);
				p1.setText("Player 1 : "+Integer.valueOf(slot[13].getText()));
				p2.setText("Player 2 : "+Integer.valueOf(slot[6].getText()));}
				}
			
		});
		c4.setOnMouseClicked(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent event) {
				if(player1==false&&slot[2].getText()!="0"){
				int limit =Integer.valueOf(slot[2].getText());
				slot[2].setText("0");
				int temp=2;
				
				for(int i = 0;i<limit;i++ ){
					temp++;
					if(!player1&&temp==13){
						temp=0;
						slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
						continue;
						}
					if(player1&&temp==6){
						temp=7;
						slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
						continue;
					}
					if(temp>13)temp=0;
					slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
					
					}
				
				int cap=0;
				
				if(temp==0&&Integer.valueOf(slot[0].getText())==1&&Integer.valueOf(slot[12].getText())>0){
					cap+=(Integer.valueOf(slot[0].getText())+Integer.valueOf(slot[12].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[0].setText("0");
					slot[12].setText("0");
					cap=0;
				}
				
				if(temp==1&&Integer.valueOf(slot[1].getText())==1&&Integer.valueOf(slot[11].getText())>0){
					cap+=(Integer.valueOf(slot[1].getText())+Integer.valueOf(slot[11].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[1].setText("0");
					slot[11].setText("0");
					cap=0;
				}
				
				if(temp==2&&Integer.valueOf(slot[2].getText())==1&&Integer.valueOf(slot[10].getText())>0){
					cap+=(Integer.valueOf(slot[2].getText())+Integer.valueOf(slot[10].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[2].setText("0");
					slot[10].setText("0");
					cap=0;
				}
				if(temp==3&&Integer.valueOf(slot[3].getText())==1&&Integer.valueOf(slot[9].getText())>0){
					cap+=(Integer.valueOf(slot[3].getText())+Integer.valueOf(slot[9].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[3].setText("0");
					slot[9].setText("0");
					cap=0;
				}
			
				if(temp==4&&Integer.valueOf(slot[4].getText())==1&&Integer.valueOf(slot[8].getText())>0){
					cap+=(Integer.valueOf(slot[4].getText())+Integer.valueOf(slot[8].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[4].setText("0");
					slot[8].setText("0");
					cap=0;
				}
				if(temp==5&&Integer.valueOf(slot[5].getText())==1&&Integer.valueOf(slot[7].getText())>0){
					cap+=(Integer.valueOf(slot[5].getText())+Integer.valueOf(slot[7].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[5].setText("0");
					slot[7].setText("0");
					cap=0;
				}
				int totalP2=0;
				for(int i =0;i<6;i++){
					totalP2+=Integer.valueOf(slot[i].getText());
				
				}
				System.out.println("P2:"+totalP2);
				int sumr2=0;
				if(totalP2==0){
					for(int i = 7; i<13;i++){
						sumr2+=Integer.valueOf(slot[i].getText());
						slot[i].setText("0");
						slot[i].setText(String.valueOf(Integer.valueOf(0)));
					}
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+sumr2));
					if(Integer.valueOf(slot[13].getText())>Integer.valueOf(slot[6].getText())){
						title.setText("Player 1 Wins!");
						}
						else if(Integer.valueOf(slot[13].getText())<Integer.valueOf(slot[6].getText())){
							title.setText("Player 2 Wins!");
						}
						else{
							title.setText("Draw");
							title.setX(515);
						}
				}
		//		System.out.println(Integer.valueOf(slot[2].getText()));
				if(temp==6){
					player1=false;
				}
				else{ player1=true;
				t1.setFill(Color.YELLOW);
				t2.setFill(Color.TRANSPARENT);}
			//	System.out.println(temp);
				p1.setText("Player 1 : "+Integer.valueOf(slot[13].getText()));
				p2.setText("Player 2 : "+Integer.valueOf(slot[6].getText()));}
			}
			
		});
		c5.setOnMouseClicked(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent event) {
				if(player1==false&&slot[1].getText()!="0"){
				int limit =Integer.valueOf(slot[1].getText());
				slot[1].setText("0");
				int temp=1;
				
				for(int i = 0;i<limit;i++ ){
					temp++;
					if(!player1&&temp==13){
					temp=0;
					slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
					continue;
					}
					if(player1&&temp==6){
						temp=7;
						slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
						continue;
					}
					if(temp>13)temp=0;
					slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
				}
				
				int cap=0;
				
				if(temp==0&&Integer.valueOf(slot[0].getText())==1&&Integer.valueOf(slot[12].getText())>0){
					cap+=(Integer.valueOf(slot[0].getText())+Integer.valueOf(slot[12].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[0].setText("0");
					slot[12].setText("0");
					cap=0;
				}
				
				if(temp==1&&Integer.valueOf(slot[1].getText())==1&&Integer.valueOf(slot[11].getText())>0){
					cap+=(Integer.valueOf(slot[1].getText())+Integer.valueOf(slot[11].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[1].setText("0");
					slot[11].setText("0");
					cap=0;
				}
				
				if(temp==2&&Integer.valueOf(slot[2].getText())==1&&Integer.valueOf(slot[10].getText())>0){
					cap+=(Integer.valueOf(slot[2].getText())+Integer.valueOf(slot[10].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[2].setText("0");
					slot[10].setText("0");
					cap=0;
				}
				if(temp==3&&Integer.valueOf(slot[3].getText())==1&&Integer.valueOf(slot[9].getText())>0){
					cap+=(Integer.valueOf(slot[3].getText())+Integer.valueOf(slot[9].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[3].setText("0");
					slot[9].setText("0");
					cap=0;
				}
			
				if(temp==4&&Integer.valueOf(slot[4].getText())==1&&Integer.valueOf(slot[8].getText())>0){
					cap+=(Integer.valueOf(slot[4].getText())+Integer.valueOf(slot[8].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[4].setText("0");
					slot[8].setText("0");
					cap=0;
				}
				if(temp==5&&Integer.valueOf(slot[5].getText())==1&&Integer.valueOf(slot[7].getText())>0){
					cap+=(Integer.valueOf(slot[5].getText())+Integer.valueOf(slot[7].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[5].setText("0");
					slot[7].setText("0");
					cap=0;
				}
				int totalP2=0;
				for(int i =0;i<6;i++){
					totalP2+=Integer.valueOf(slot[i].getText());	
				
				}
				System.out.println(totalP2);
				int sumr2=0;
				if(totalP2==0){
					for(int i = 7; i<13;i++){
						sumr2+=Integer.valueOf(slot[i].getText());
						slot[i].setText("0");
						slot[i].setText(String.valueOf(Integer.valueOf(0)));
					}
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+sumr2));
					if(Integer.valueOf(slot[13].getText())>Integer.valueOf(slot[6].getText())){
						title.setText("Player 1 Wins!");
						}
						else if(Integer.valueOf(slot[13].getText())<Integer.valueOf(slot[6].getText())){
							title.setText("Player 2 Wins!");
						}
						else{
							title.setText("Draw");
							title.setX(515);
						}
				}
		//		System.out.println(Integer.valueOf(slot[1].getText()));
				if(temp==6){
					player1=false;
				}
				else{ player1=true;
				t1.setFill(Color.YELLOW);
				t2.setFill(Color.TRANSPARENT);}
			//	System.out.println(temp);
				p1.setText("Player 1 : "+Integer.valueOf(slot[13].getText()));
				p2.setText("Player 2 : "+Integer.valueOf(slot[6].getText()));}
			}
			
		});
		c6.setOnMouseClicked(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent event) {
				
				if(player1==false&&slot[0].getText()!="0"){
				int limit =Integer.valueOf(slot[0].getText());
				slot[0].setText("0");
				int temp=0;
				
				for(int i = 0;i<limit;i++ ){
					temp++;
					if(!player1&&temp==13){
						temp=0;
						slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
						continue;
					}
					if(player1&&temp==6){
						temp=7;
						slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
						continue;
					}
					if(temp>13)temp=0;
					slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
				}
				
				int cap=0;
				
				if(temp==0&&Integer.valueOf(slot[0].getText())==1&&Integer.valueOf(slot[12].getText())>0){
					cap+=(Integer.valueOf(slot[0].getText())+Integer.valueOf(slot[12].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[0].setText("0");
					slot[12].setText("0");
					cap=0;
				}
				
				if(temp==1&&Integer.valueOf(slot[1].getText())==1&&Integer.valueOf(slot[11].getText())>0){
					cap+=(Integer.valueOf(slot[1].getText())+Integer.valueOf(slot[11].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[1].setText("0");
					slot[11].setText("0");
					cap=0;
				}
				
				if(temp==2&&Integer.valueOf(slot[2].getText())==1&&Integer.valueOf(slot[10].getText())>0){
					cap+=(Integer.valueOf(slot[2].getText())+Integer.valueOf(slot[10].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[2].setText("0");
					slot[10].setText("0");
					cap=0;
				}
				if(temp==3&&Integer.valueOf(slot[3].getText())==1&&Integer.valueOf(slot[9].getText())>0){
					cap+=(Integer.valueOf(slot[3].getText())+Integer.valueOf(slot[9].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[3].setText("0");
					slot[9].setText("0");
					cap=0;
				}
			
				if(temp==4&&Integer.valueOf(slot[4].getText())==1&&Integer.valueOf(slot[8].getText())>0){
					cap+=(Integer.valueOf(slot[4].getText())+Integer.valueOf(slot[8].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[4].setText("0");
					slot[8].setText("0");
					cap=0;
				}
				if(temp==5&&Integer.valueOf(slot[5].getText())==1&&Integer.valueOf(slot[7].getText())>0){
					cap+=(Integer.valueOf(slot[5].getText())+Integer.valueOf(slot[7].getText()));
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+cap));
					slot[5].setText("0");
					slot[7].setText("0");
					cap=0;
				}
			
				int totalP2=0;
				for(int i =0;i<6;i++){
					totalP2+=Integer.valueOf(slot[i].getText());
					
				
				}
				System.out.println(totalP2);
				int sumr2=0;
				if(totalP2==0){
					for(int i = 7; i<13;i++){
						sumr2+=Integer.valueOf(slot[i].getText());
						slot[i].setText("0");
						slot[i].setText(String.valueOf(Integer.valueOf(0)));
					}
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+sumr2));
					if(Integer.valueOf(slot[13].getText())>Integer.valueOf(slot[6].getText())){
						title.setText("Player 1 Wins!");
						}
						else if(Integer.valueOf(slot[13].getText())<Integer.valueOf(slot[6].getText())){
							title.setText("Player 2 Wins!");
						}
						else{
							title.setText("Draw");
							title.setX(515);
						}
				}
		//		System.out.println(Integer.valueOf(slot[0].getText()));
				if(temp==6){
					player1=false;
				}
				else{ player1=true;
				t1.setFill(Color.YELLOW);
				t2.setFill(Color.TRANSPARENT);}
		//		System.out.println(temp);
				p1.setText("Player 1 : "+Integer.valueOf(slot[13].getText()));
				p2.setText("Player 2 : "+Integer.valueOf(slot[6].getText()));}
			}
			
		});
		
		//Player 1 Side	
		c7.setOnMouseClicked(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent event) {
				if(player1==true&&slot[7].getText()!="0"){
				int limit =Integer.valueOf(slot[7].getText());
				slot[7].setText("0");
				int temp=7;
				for(int i = 0;i<limit;i++ ){
					temp++;
					if(!player1&&temp==13){
						temp=0;
						slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
						continue;
						}
					if(player1&&temp==6){
						temp=7;
						slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
						continue;
					}
					if(temp>13)temp=0;
					slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
					
					}
				
				int cap=0;
				
				if(temp==7&&Integer.valueOf(slot[7].getText())==1&&Integer.valueOf(slot[5].getText())>0){
					cap+=(Integer.valueOf(slot[7].getText())+Integer.valueOf(slot[5].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[7].setText("0");
					slot[5].setText("0");
					cap=0;
				}
				
				if(temp==8&&Integer.valueOf(slot[8].getText())==1&&Integer.valueOf(slot[4].getText())>0){
					cap+=(Integer.valueOf(slot[8].getText())+Integer.valueOf(slot[4].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[8].setText("0");
					slot[4].setText("0");
					cap=0;
				}
				
				if(temp==9&&Integer.valueOf(slot[9].getText())==1&&Integer.valueOf(slot[3].getText())>0){
					cap+=(Integer.valueOf(slot[9].getText())+Integer.valueOf(slot[3].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[9].setText("0");
					slot[3].setText("0");
					cap=0;
				}
				if(temp==10&&Integer.valueOf(slot[10].getText())==1&&Integer.valueOf(slot[2].getText())>0){
					cap+=(Integer.valueOf(slot[10].getText())+Integer.valueOf(slot[2].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[10].setText("0");
					slot[2].setText("0");
					cap=0;
				}
			
				if(temp==11&&Integer.valueOf(slot[11].getText())==1&&Integer.valueOf(slot[1].getText())>0){
					cap+=(Integer.valueOf(slot[11].getText())+Integer.valueOf(slot[1].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[11].setText("0");
					slot[1].setText("0");
					cap=0;
				}
				if(temp==12&&Integer.valueOf(slot[12].getText())==1&&Integer.valueOf(slot[0].getText())>0){
					cap+=(Integer.valueOf(slot[12].getText())+Integer.valueOf(slot[0].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[12].setText("0");
					slot[0].setText("0");
					cap=0;
				}
				
				int totalP1=0;
				for(int i =7;i<13;i++){
					totalP1+=Integer.valueOf(slot[i].getText());
					
				}
				System.out.println(totalP1);
				int sumr1=0;
				if(totalP1==0){
					for(int i = 0; i<6;i++){
						sumr1+=Integer.valueOf(slot[i].getText());
						slot[i].setText("0");
						slot[i].setText(String.valueOf(Integer.valueOf(0)));
						
					}
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+sumr1));
					if(Integer.valueOf(slot[6].getText())>Integer.valueOf(slot[13].getText())){
						title.setText("Player 2 Wins!");
						}
						else if(Integer.valueOf(slot[6].getText())<Integer.valueOf(slot[13].getText())){
							title.setText("Player 1 Wins!");
						}
						else{
							title.setText("Draw");
							title.setX(515);
						}
				}
				//System.out.println(Integer.valueOf(slot[7].getText()));
				if(temp==13){
					player1=true;
				}
				else{ player1=false;
				t1.setFill(Color.TRANSPARENT);
				t2.setFill(Color.YELLOW);
				}
				//System.out.println(temp);
				p1.setText("Player 1 : "+Integer.valueOf(slot[13].getText()));
				p2.setText("Player 2 : "+Integer.valueOf(slot[6].getText()));}
			}
			
		});
		c8.setOnMouseClicked(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent event) {
				if(player1==true&&slot[8].getText()!="0"){
				int limit =Integer.valueOf(slot[8].getText());
				slot[8].setText("0");
				int temp=8;
				for(int i = 0;i<limit;i++ ){
					temp++;
					if(!player1&&temp==13){
						temp=0;
						slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
						continue;
						}
					if(player1&&temp==6){
						temp=7;
						slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
						continue;
					}
					if(temp>13)temp=0;
					slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
					
					}
				
				
				int cap=0;
				
				if(temp==7&&Integer.valueOf(slot[7].getText())==1&&Integer.valueOf(slot[5].getText())>0){
					cap+=(Integer.valueOf(slot[7].getText())+Integer.valueOf(slot[5].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[7].setText("0");
					slot[5].setText("0");
					cap=0;
				}
				
				if(temp==8&&Integer.valueOf(slot[8].getText())==1&&Integer.valueOf(slot[4].getText())>0){
					cap+=(Integer.valueOf(slot[8].getText())+Integer.valueOf(slot[4].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[8].setText("0");
					slot[4].setText("0");
					cap=0;
				}
				
				if(temp==9&&Integer.valueOf(slot[9].getText())==1&&Integer.valueOf(slot[3].getText())>0){
					cap+=(Integer.valueOf(slot[9].getText())+Integer.valueOf(slot[3].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[9].setText("0");
					slot[3].setText("0");
					cap=0;
				}
				if(temp==10&&Integer.valueOf(slot[10].getText())==1&&Integer.valueOf(slot[2].getText())>0){
					cap+=(Integer.valueOf(slot[10].getText())+Integer.valueOf(slot[2].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[10].setText("0");
					slot[2].setText("0");
					cap=0;
				}
			
				if(temp==11&&Integer.valueOf(slot[11].getText())==1&&Integer.valueOf(slot[1].getText())>0){
					cap+=(Integer.valueOf(slot[11].getText())+Integer.valueOf(slot[1].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[11].setText("0");
					slot[1].setText("0");
					cap=0;
				}
				if(temp==12&&Integer.valueOf(slot[12].getText())==1&&Integer.valueOf(slot[0].getText())>0){
					cap+=(Integer.valueOf(slot[12].getText())+Integer.valueOf(slot[0].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[12].setText("0");
					slot[0].setText("0");
					cap=0;
				}
				int totalP1=0;
				for(int i =7;i<13;i++){
					totalP1+=Integer.valueOf(slot[i].getText());	
				
				}
				System.out.println(totalP1);
				int sumr1=0;
				if(totalP1==0){
					for(int i = 0; i<6;i++){
						sumr1+=Integer.valueOf(slot[i].getText());
						slot[i].setText("0");
						slot[i].setText(String.valueOf(Integer.valueOf(0)));
					}
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+sumr1));
					if(Integer.valueOf(slot[6].getText())>Integer.valueOf(slot[13].getText())){
						title.setText("Player 2 Wins!");
						}
						else if(Integer.valueOf(slot[6].getText())<Integer.valueOf(slot[13].getText())){
							title.setText("Player 1 Wins!");
						}
						else{
							title.setText("Draw");
							title.setX(515);
						}
				}
			//	System.out.println(Integer.valueOf(slot[8].getText()));
				if(temp==13){
					player1=true;
				}
				else{ player1=false;
				t1.setFill(Color.TRANSPARENT);
				t2.setFill(Color.YELLOW);
				}
			//	System.out.println(temp);
				p1.setText("Player 1 : "+Integer.valueOf(slot[13].getText()));
				p2.setText("Player 2 : "+Integer.valueOf(slot[6].getText()));}
			}
			
		});
		c9.setOnMouseClicked(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent event) {
				if(player1==true&&slot[9].getText()!="0"){
				int limit =Integer.valueOf(slot[9].getText());
				slot[9].setText("0");
				int temp=9;
				for(int i = 0;i<limit;i++ ){
					temp++;
					if(!player1&&temp==13){
						temp=0;
						slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
						continue;
						}
					if(player1&&temp==6){
						temp=7;
						slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
						continue;
					}
					if(temp>13)temp=0;
					slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
					
					}
				
				
				int cap=0;
				
				if(temp==7&&Integer.valueOf(slot[7].getText())==1&&Integer.valueOf(slot[5].getText())>0){
					cap+=(Integer.valueOf(slot[7].getText())+Integer.valueOf(slot[5].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[7].setText("0");
					slot[5].setText("0");
					cap=0;
				}
				
				if(temp==8&&Integer.valueOf(slot[8].getText())==1&&Integer.valueOf(slot[4].getText())>0){
					cap+=(Integer.valueOf(slot[8].getText())+Integer.valueOf(slot[4].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[8].setText("0");
					slot[4].setText("0");
					cap=0;
				}
				
				if(temp==9&&Integer.valueOf(slot[9].getText())==1&&Integer.valueOf(slot[3].getText())>0){
					cap+=(Integer.valueOf(slot[9].getText())+Integer.valueOf(slot[3].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[9].setText("0");
					slot[3].setText("0");
					cap=0;
				}
				if(temp==10&&Integer.valueOf(slot[10].getText())==1&&Integer.valueOf(slot[2].getText())>0){
					cap+=(Integer.valueOf(slot[10].getText())+Integer.valueOf(slot[2].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[10].setText("0");
					slot[2].setText("0");
					cap=0;
				}
			
				if(temp==11&&Integer.valueOf(slot[11].getText())==1&&Integer.valueOf(slot[1].getText())>0){
					cap+=(Integer.valueOf(slot[11].getText())+Integer.valueOf(slot[1].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[11].setText("0");
					slot[1].setText("0");
					cap=0;
				}
				if(temp==12&&Integer.valueOf(slot[12].getText())==1&&Integer.valueOf(slot[0].getText())>0){
					cap+=(Integer.valueOf(slot[12].getText())+Integer.valueOf(slot[0].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[12].setText("0");
					slot[0].setText("0");
					cap=0;
				}
				int totalP1=0;
				for(int i =7;i<13;i++){
					totalP1+=Integer.valueOf(slot[i].getText());
					
				
				}
				System.out.println(totalP1);
				int sumr1=0;
				if(totalP1==0){
					for(int i = 0; i<6;i++){
						sumr1+=Integer.valueOf(slot[i].getText());
						slot[i].setText("0");
						slot[i].setText(String.valueOf(Integer.valueOf(0)));
					}
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+sumr1));
					if(Integer.valueOf(slot[6].getText())>Integer.valueOf(slot[13].getText())){
						title.setText("Player 2 Wins!");
						}
						else if(Integer.valueOf(slot[6].getText())<Integer.valueOf(slot[13].getText())){
							title.setText("Player 1 Wins!");
						}
						else{
							title.setText("Draw");
							title.setX(515);
						}
				}
			//	System.out.println(Integer.valueOf(slot[9].getText()));
				if(temp==13){
					player1=true;
				}
				else{ player1=false;
				t1.setFill(Color.TRANSPARENT);
				t2.setFill(Color.YELLOW);
				}
				p1.setText("Player 1 : "+Integer.valueOf(slot[13].getText()));
				p2.setText("Player 2 : "+Integer.valueOf(slot[6].getText()));}
			}
			
		});
		c10.setOnMouseClicked(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent event) {
				if(player1==true&&slot[10].getText()!="0"){
				int limit =Integer.valueOf(slot[10].getText());
				slot[10].setText("0");
				int temp=10;
				for(int i = 0;i<limit;i++ ){
					temp++;
					if(!player1&&temp==13){
						temp=0;
						slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
						continue;
						}
					if(player1&&temp==6){
						temp=7;
						slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
						continue;
					}
					if(temp>13)temp=0;
					slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
					
					}
				
				
				int cap=0;
				
				if(temp==7&&Integer.valueOf(slot[7].getText())==1&&Integer.valueOf(slot[5].getText())>0){
					cap+=(Integer.valueOf(slot[7].getText())+Integer.valueOf(slot[5].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[7].setText("0");
					slot[5].setText("0");
					cap=0;
				}
				
				if(temp==8&&Integer.valueOf(slot[8].getText())==1&&Integer.valueOf(slot[4].getText())>0){
					cap+=(Integer.valueOf(slot[8].getText())+Integer.valueOf(slot[4].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[8].setText("0");
					slot[4].setText("0");
					cap=0;
				}
				
				if(temp==9&&Integer.valueOf(slot[9].getText())==1&&Integer.valueOf(slot[3].getText())>0){
					cap+=(Integer.valueOf(slot[9].getText())+Integer.valueOf(slot[3].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[9].setText("0");
					slot[3].setText("0");
					cap=0;
				}
				if(temp==10&&Integer.valueOf(slot[10].getText())==1&&Integer.valueOf(slot[2].getText())>0){
					cap+=(Integer.valueOf(slot[10].getText())+Integer.valueOf(slot[2].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[10].setText("0");
					slot[2].setText("0");
					cap=0;
				}
			
				if(temp==11&&Integer.valueOf(slot[11].getText())==1&&Integer.valueOf(slot[1].getText())>0){
					cap+=(Integer.valueOf(slot[11].getText())+Integer.valueOf(slot[1].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[11].setText("0");
					slot[1].setText("0");
					cap=0;
				}
				if(temp==12&&Integer.valueOf(slot[12].getText())==1&&Integer.valueOf(slot[0].getText())>0){
					cap+=(Integer.valueOf(slot[12].getText())+Integer.valueOf(slot[0].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[12].setText("0");
					slot[0].setText("0");
					cap=0;
				}
				
				int totalP1=0;
				for(int i =7;i<13;i++){
					totalP1+=Integer.valueOf(slot[i].getText());
					
				
				}
				System.out.println(totalP1);
				int sumr1=0;
				if(totalP1==0){
					for(int i = 0; i<6;i++){
						sumr1+=Integer.valueOf(slot[i].getText());
						slot[i].setText("0");
						slot[i].setText(String.valueOf(Integer.valueOf(0)));
					}
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+sumr1));
					if(Integer.valueOf(slot[6].getText())>Integer.valueOf(slot[13].getText())){
						title.setText("Player 2 Wins!");
						}
						else if(Integer.valueOf(slot[6].getText())<Integer.valueOf(slot[13].getText())){
							title.setText("Player 1 Wins!");
						}
						else{
							title.setText("Draw");
							title.setX(515);
						}
				}
			//	System.out.println(Integer.valueOf(slot[10].getText()));
				if(temp==13){
					player1=true;
				}
				else{ player1=false;
				t1.setFill(Color.TRANSPARENT);
				t2.setFill(Color.YELLOW);
				}
				p1.setText("Player 1 : "+Integer.valueOf(slot[13].getText()));
				p2.setText("Player 2 : "+Integer.valueOf(slot[6].getText()));}
			}
			
		});
		c11.setOnMouseClicked(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent event) {
				if(player1==true&&slot[11].getText()!="0"){
				int limit =Integer.valueOf(slot[11].getText());
				slot[11].setText("0");
				int temp=11;
				for(int i = 0;i<limit;i++ ){
					temp++;
					if(!player1&&temp==13){
						temp=0;
						slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
						continue;
						}
					if(player1&&temp==6){
						temp=7;
						slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
						continue;
					}
					if(temp>13)temp=0;
					slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
					
					}
				
				
				int cap=0;
				
				if(temp==7&&Integer.valueOf(slot[7].getText())==1&&Integer.valueOf(slot[5].getText())>0){
					cap+=(Integer.valueOf(slot[7].getText())+Integer.valueOf(slot[5].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[7].setText("0");
					slot[5].setText("0");
					cap=0;
				}
				
				if(temp==8&&Integer.valueOf(slot[8].getText())==1&&Integer.valueOf(slot[4].getText())>0){
					cap+=(Integer.valueOf(slot[8].getText())+Integer.valueOf(slot[4].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[8].setText("0");
					slot[4].setText("0");
					cap=0;
				}
				
				if(temp==9&&Integer.valueOf(slot[9].getText())==1&&Integer.valueOf(slot[3].getText())>0){
					cap+=(Integer.valueOf(slot[9].getText())+Integer.valueOf(slot[3].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[9].setText("0");
					slot[3].setText("0");
					cap=0;
				}
				if(temp==10&&Integer.valueOf(slot[10].getText())==1&&Integer.valueOf(slot[2].getText())>0){
					cap+=(Integer.valueOf(slot[10].getText())+Integer.valueOf(slot[2].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[10].setText("0");
					slot[2].setText("0");
					cap=0;
				}
			
				if(temp==11&&Integer.valueOf(slot[11].getText())==1&&Integer.valueOf(slot[1].getText())>0){
					cap+=(Integer.valueOf(slot[11].getText())+Integer.valueOf(slot[1].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[11].setText("0");
					slot[1].setText("0");
					cap=0;
				}
				if(temp==12&&Integer.valueOf(slot[12].getText())==1&&Integer.valueOf(slot[0].getText())>0){
					cap+=(Integer.valueOf(slot[12].getText())+Integer.valueOf(slot[0].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[12].setText("0");
					slot[0].setText("0");
					cap=0;
				}
				int totalP1=0;
				for(int i =7;i<13;i++){
					totalP1+=Integer.valueOf(slot[i].getText());
					
				
				}
				System.out.println(totalP1);
				int sumr1=0;
				if(totalP1==0){
					for(int i = 0; i<6;i++){
						sumr1+=Integer.valueOf(slot[i].getText());
						slot[i].setText("0");
						slot[i].setText(String.valueOf(Integer.valueOf(0)));
					}
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+sumr1));
					if(Integer.valueOf(slot[6].getText())>Integer.valueOf(slot[13].getText())){
						title.setText("Player 2 Wins!");
						}
						else if(Integer.valueOf(slot[6].getText())<Integer.valueOf(slot[13].getText())){
							title.setText("Player 1 Wins!");
						}
						else{
							title.setText("Draw");
							title.setX(515);
						}
				}
			//	System.out.println(Integer.valueOf(slot[11].getText()));
				if(temp==13){
					player1=true;
				}
				else{ player1=false;
				t1.setFill(Color.TRANSPARENT);
				t2.setFill(Color.YELLOW);
				}
			//	System.out.println(temp);
				p1.setText("Player 1 : "+Integer.valueOf(slot[13].getText()));
				p2.setText("Player 2 : "+Integer.valueOf(slot[6].getText()));}
			}
			
		});
		c12.setOnMouseClicked(new EventHandler<MouseEvent>(){

			@Override
			public void handle(MouseEvent event) {
				if(player1==true&&slot[12].getText()!="0"){
				int limit =Integer.valueOf(slot[12].getText());
				slot[12].setText("0");
				int temp=12;
				for(int i = 0;i<limit;i++ ){
					temp++;
					if(!player1&&temp==13){
						temp=0;
						slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
						continue;
						}
					if(player1&&temp==6){
						temp=7;
						slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
						continue;
					}
					if(temp>13)temp=0;
					slot[temp].setText(String.valueOf(Integer.valueOf(slot[temp].getText())+1));
					
					}
				
				int cap=0;
				
				if(temp==7&&Integer.valueOf(slot[7].getText())==1&&Integer.valueOf(slot[5].getText())>0){
					cap+=(Integer.valueOf(slot[7].getText())+Integer.valueOf(slot[5].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[7].setText("0");
					slot[5].setText("0");
					cap=0;
				}
				
				if(temp==8&&Integer.valueOf(slot[8].getText())==1&&Integer.valueOf(slot[4].getText())>0){
					cap+=(Integer.valueOf(slot[8].getText())+Integer.valueOf(slot[4].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[8].setText("0");
					slot[4].setText("0");
					cap=0;
				}
				
				if(temp==9&&Integer.valueOf(slot[9].getText())==1&&Integer.valueOf(slot[3].getText())>0){
					cap+=(Integer.valueOf(slot[9].getText())+Integer.valueOf(slot[3].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[9].setText("0");
					slot[3].setText("0");
					cap=0;
				}
				if(temp==10&&Integer.valueOf(slot[10].getText())==1&&Integer.valueOf(slot[2].getText())>0){
					cap+=(Integer.valueOf(slot[10].getText())+Integer.valueOf(slot[2].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[10].setText("0");
					slot[2].setText("0");
					cap=0;
				}
			
				if(temp==11&&Integer.valueOf(slot[11].getText())==1&&Integer.valueOf(slot[1].getText())>0){
					cap+=(Integer.valueOf(slot[11].getText())+Integer.valueOf(slot[1].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[11].setText("0");
					slot[1].setText("0");
					cap=0;
				}
				if(temp==12&&Integer.valueOf(slot[12].getText())==1&&Integer.valueOf(slot[0].getText())>0){
					cap+=(Integer.valueOf(slot[12].getText())+Integer.valueOf(slot[0].getText()));
					slot[13].setText(String.valueOf(Integer.valueOf(slot[13].getText())+cap));
					slot[12].setText("0");
					slot[0].setText("0");
					cap=0;
				}
				int totalP1=0;
				for(int i =7;i<13;i++){
					totalP1+=Integer.valueOf(slot[i].getText());
					
				
				}
				System.out.println(totalP1);
				int sumr1=0;
				if(totalP1==0){
					for(int i = 0; i<6;i++){
						sumr1+=Integer.valueOf(slot[i].getText());
						slot[i].setText("0");
						slot[i].setText(String.valueOf(Integer.valueOf(0)));
					}
					slot[6].setText(String.valueOf(Integer.valueOf(slot[6].getText())+sumr1));
					if(Integer.valueOf(slot[6].getText())>Integer.valueOf(slot[13].getText())){
						title.setText("Player 2 Wins!");
						}
						else if(Integer.valueOf(slot[6].getText())<Integer.valueOf(slot[13].getText())){
							title.setText("Player 1 Wins!");
						}
						else{
							title.setText("Draw");
							title.setX(515);
						}
				}
			//	System.out.println(Integer.valueOf(slot[12].getText()));
				if(temp==13){
					player1=true;
				}
				else{ player1=false;
				t1.setFill(Color.TRANSPARENT);
				t2.setFill(Color.YELLOW);
				}
			//	System.out.println(temp);
				p1.setText("Player 1 : "+Integer.valueOf(slot[13].getText()));
				p2.setText("Player 2 : "+Integer.valueOf(slot[6].getText()));}
				}
			
		});
		
		board.setX(75);
		board.setY(40);
		exit.setLayoutX(20);
		exit.setLayoutY(590);
		reset.setLayoutX(13);
		reset.setLayoutY(555);
		rules.setLayoutX(13);
		rules.setLayoutY(520);
		
		p1.setX(970);
		p1.setY(675);
		p2.setX(135);
		p2.setY(25);
		p1.setFill(Color.SADDLEBROWN);
		p2.setFill(Color.DEEPSKYBLUE);
		p1.setFont(Font.font(20));
		p2.setFont(Font.font(20));
		
		reset.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				s1=4;s2=4;s3=4;s4=4;s5=4;s6=4;s7=0;s8=4;s9=4;s10=4;s11=4;s12=4;s13=4;s14=0;
				score1 = s7;
				score2 = s14;
				player1=true;
				try {
					start(primaryStage);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
				
			}
			
		});
		
		exit.setOnAction(new EventHandler<ActionEvent>(){

			@Override
			public void handle(ActionEvent event) {
				System.exit(0);
				
			}
			
		});
		
		p.getChildren().addAll(board,stitle,title,exit,reset,rules,p1,p2,c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,r1,r2,t1,t2,P1,P2);
		p.getChildren().addAll(slot);
		Scene s = new Scene(p,1175,700);
		primaryStage.setScene(s);
		primaryStage.show();
		
	}

}