import javafx.application.*;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.stage.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.collections.*;
import javafx.geometry.*;
import javafx.event.*;
import javafx.scene.input.*;
import javafx.scene.text.*;
import java.io.*;
import javafx.scene.image.*;
import java.lang.*;

public class TicTacToe extends Application
{

	public int turn =1;
	public int rturn=1;
	public int Point[][]=new int[3][3];
	public int Player1win() {
		if(Point[0][0]==1 && Point[0][1]==1 && Point[0][2]==1)
		{
			return 1;
		}
		else if(Point[1][0]==1 && Point[1][1]==1 && Point[1][2]==1)
		{
			return 1;
		}
		else if(Point[2][0]==1 && Point[2][1]==1 && Point[2][2]==1) {
			return 1;
		}
		else if(Point[0][0]==1 && Point[1][0]==1 && Point[2][0]==1) {
			return 1;
		}
		else if(Point[0][1]==1 && Point[1][1]==1 && Point[2][1]==1) {
			return 1;
		}
		else if(Point[0][2]==1 && Point[1][2]==1 && Point[2][2]==1) {
			return 1;
		}
		else if(Point[0][0]==1 && Point[1][1]==1 && Point[2][2]==1)
		{
			return 1;
		}
		else if(Point[0][2]==1 && Point[1][1]==1 && Point[2][0]==1) {
			return 1;
		}
		else {
			return -1;
		}
		
		
	}
	public int DrawMatch()
	{	int zero=0;
		int play1=Player1win();
		int play2=Player2win();
		if(play1!=1 && play2!=2)
		{
			for(int j=0;j<3;j++)
			{
			for(int k=0;k<3;k++)
			{
				if(Point[j][k]==0) {
					zero++;
				}
					
			}
			}
		}
		else
		{
			return 0;
		}
		if(zero==0)
		{
			return 1;
		}
		else
		{
				return 0;
		}
	}
	public int Player2win() {
		if(Point[0][0]==2 && Point[0][1]==2 && Point[0][2]==2)
		{
			return 2;
		}
		else if(Point[1][0]==2 && Point[1][1]==2 && Point[1][2]==2)
		{
			return 2;
		}
		else if(Point[2][0]==2 && Point[2][1]==2 && Point[2][2]==2) {
			return 2;
		}
		else if(Point[0][0]==2 && Point[1][0]==2 && Point[2][0]==2) {
			return 2;
		}
		else if(Point[0][1]==2 && Point[1][1]==2 && Point[2][1]==2) {
			return 2;
		}
		else if(Point[0][2]==2 && Point[1][2]==2 && Point[2][2]==2) {
			return 2;
		}
		else if(Point[0][0]==2 && Point[1][1]==2 && Point[2][2]==2)
		{
			return 2;
		}
		else if(Point[0][2]==2 && Point[1][1]==2 && Point[2][0]==2) {
			return 2;
		}
		else {
			return -1;
		}
		
		
	}
	private Label lblStatus = new Label("0's turn to play");
	private Label lbl2Status = new Label("X's turn to play");

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception
	{
		GridPane gp = new GridPane();

		gp.setVgap(25);
		gp.setHgap(25);
		gp.setPadding(new Insets(25,0,30,48));

		Text t1 = new Text();
		t1.setFont(Font.font(null, FontWeight.BOLD, 78));
		Text t2 = new Text();
		t2.setFont(Font.font(null, FontWeight.BOLD, 78));
		Text t3 = new Text();
		t3.setFont(Font.font(null, FontWeight.BOLD, 78));
		Text t4 = new Text();
		t4.setFont(Font.font(null, FontWeight.BOLD, 78));
		Text t5 = new Text();
		t5.setFont(Font.font(null, FontWeight.BOLD, 78));
		Text t6 = new Text();
		t6.setFont(Font.font(null, FontWeight.BOLD, 78));
		Text t7 = new Text();
		t7.setFont(Font.font(null, FontWeight.BOLD, 78));
		Text t8 = new Text();
		t8.setFont(Font.font(null, FontWeight.BOLD, 78));
		Text t9 = new Text();
		t9.setFont(Font.font(null, FontWeight.BOLD, 78));

		
		Button btn1 = new Button ("");
		Button btn2 = new Button ("");
		Button btn3 = new Button ("");
		Button btn4 = new Button ("");
		Button btn5 = new Button ("");
		Button btn6 = new Button ("");
		Button btn7 = new Button ("");
		Button btn8 = new Button ("");
		Button btn9 = new Button ("");

		Button welcome = new Button ("Welcome to Tic Tac Toe");
		welcome.setStyle("-fx-text-fill:BLUE");
		welcome.setStyle("-fx-border-color:ORANGE;-fx-border-width:2px;");
		//welcome.setAlignment(Pos.CENTER);
		welcome.setPrefHeight(100);

		Button reset = new Button("Reset");
		reset.setMaxSize(80,40);

		Text welcometxt =new Text(" \n\n\n\n\n\n\n\n\t\tDevelope  and  Design  by  	  ");
		Text welcometxt2 =new Text(" \n\n\n\n\n\n\n\n \t\t\t\t\t\t\t    PS Creation");
		welcometxt2.setFill(Color.BLUEVIOLET);
		welcometxt2.setFont(Font.font(null, FontWeight.BOLD, 15));
		welcometxt.setFont(Font.font(null, FontWeight.NORMAL, 15));
		
		Text pppppp =new Text("PS Creation");
		
		pppppp.setFill(Color.BLUEVIOLET);
		pppppp.setFont(Font.font(null, FontWeight.BOLD, 15));

		Pane root = new Pane();
		Pane roo1t = new Pane();
		welcome.setLayoutX(50);
		welcome.setLayoutY(115);
		roo1t.getChildren().add(welcometxt);
		roo1t.getChildren().add(welcometxt2);
		root.getChildren().add(welcome);

		gp.add(root,1,1);
		gp.add(roo1t,1,5);

		Text we1 = new Text("");
		Text we2 = new Text("Player 1 : 0");
		Text we3 = new Text("");
		Text we4 = new Text("");
		Text we5 = new Text("Player 2 : X");
		Text we6 = new Text("");
		Text we7 = new Text("");
		Text we9 = new Text("");

		we2.setFill(Color.BROWN);
		we2.setStroke(Color.BLUE);
		we2.setStrokeWidth(2);
		we2.setFont(Font.font("verdana", FontPosture.REGULAR, 50));

		we5.setFill(Color.BROWN);
		we5.setStroke(Color.LIGHTBLUE);
		we5.setStrokeWidth(2);
		we5.setFont(Font.font("verdana", FontPosture.REGULAR, 50)); 

        Button next = new Button("Click to Play");
        next.setPrefWidth(300);
        next.setPrefHeight(70);

        Text player = new Text("Player 1 Win");
        player.setFill(Color.BROWN);
		player.setStroke(Color.LIGHTBLUE);
		player.setFont(Font.font("verdana", FontPosture.REGULAR, 50)); 
		player.setStrokeWidth(2);
		
		Text playe2r = new Text("Player 2 Win");
        playe2r.setFill(Color.BROWN);
		playe2r.setStroke(Color.LIGHTBLUE);
		playe2r.setFont(Font.font("verdana", FontPosture.REGULAR, 50)); 
		playe2r.setStrokeWidth(2);

		Text dra1w = new Text("Draw Match");
        dra1w.setFill(Color.BROWN);
		dra1w.setStroke(Color.LIGHTBLUE);
		dra1w.setFont(Font.font("verdana", FontPosture.REGULAR, 50)); 
		dra1w.setStrokeWidth(2);

		btn1.setPrefWidth(100);
		btn1.setPrefHeight(100);
		btn2.setPrefWidth(100);
		btn2.setPrefHeight(100);
		btn3.setPrefWidth(100);
		btn3.setPrefHeight(100);
		btn4.setPrefWidth(100);
		btn4.setPrefHeight(100);
		btn5.setPrefWidth(100);
		btn5.setPrefHeight(100);
		btn6.setPrefWidth(100);
		btn6.setPrefHeight(100);
		btn7.setPrefWidth(100);
		btn7.setPrefHeight(100);
		btn8.setPrefWidth(100);
		btn8.setPrefHeight(100);
		btn9.setPrefWidth(100);
		btn9.setPrefHeight(100);

		welcome.setOnAction(new EventHandler<ActionEvent>()
			{
				@Override
				public void handle(ActionEvent ae)
				{
					gp.getChildren().remove(root);
					gp.add(we1,0,0);
					gp.add(we2,1,0);
					gp.add(we3,2,0);
					gp.add(we4,0,1);
					gp.add(we5,1,1);
					gp.add(we6,2,1);
					gp.add(we7,0,2);
					gp.add(we9,2,2);
					gp.add(next,1,2);
				}
			}
			);

			next.setOnAction(new EventHandler<ActionEvent>()
			{
				@Override
				public void handle(ActionEvent ae)
				{
					gp.getChildren().remove(next);
					gp.getChildren().remove(roo1t);
					gp.getChildren().remove(we2);
					gp.getChildren().remove(we5);
					gp.add(btn1,0,0);
					gp.add(btn2,1,0);
					gp.add(btn3,2,0);
					gp.add(btn4,0,1);
					gp.add(btn5,1,1);
					gp.add(btn6,2,1);
					gp.add(btn7,0,2);
					gp.add(btn8,1,2);
					gp.add(btn9,2,2);
					gp.add(lblStatus,0,3);
					gp.add(pppppp, 2, 4);
				}
			}
			);

			btn1.setOnAction( new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ke)
					{ if(Point[0][0]==0 && Point[0][0]==0)
					{
						if(turn==1) {
							Point[0][0]=1;
							gp.add(t1, 0, 0);
							t1.setText("0");
							gp.getChildren().remove(lblStatus);
						gp.add(lbl2Status,0,3);
						btn1.setStyle("-fx-background-color: LIGHTGREEN");
						t1.setFill(Color.DARKGREEN);
						btn1.setDisable(true);
							int player1=Player1win();
							if(player1==1)
							{
								gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,pppppp);	
								 rturn=0;
								gp.add(player,0,0);
								gp.add(reset,0,1);
							}
							int draw=DrawMatch();
							if (draw==1) {
								
								gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,player,playe2r,pppppp);	
								 rturn=0;
								gp.add(dra1w,0,0);							
								gp.add(reset,0,1);
							}
							int player2=Player2win();
							if(player2==1)
							{
								gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,pppppp);	
								 rturn=0;
								gp.add(playe2r,0,0);
								gp.add(reset,0,1);
							}
							turn=2;
						}
						else {
							gp.add(t1, 0, 0);
						t1.setText("X");
						btn1.setDisable(true);
						btn1.setStyle("-fx-background-color: #00fffc");
						t1.setFill(Color.GRAY);
						gp.getChildren().remove(lbl2Status);
						gp.add(lblStatus,0,3);
							Point[0][0]=2;
							int player2=Player2win();
							if(player2==2)
							{
								gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,pppppp);	
							gp.add(playe2r,0,0);
								 rturn=0;
								
								gp.add(reset,0,1);
							}
							int draw=DrawMatch();
							if (draw==1) {
								gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,player,playe2r,pppppp);
							gp.add(dra1w,0,0);
								rturn=0;
								
								gp.add(reset,0,1);
							}
							int player1=Player1win();
							if(player1==1)
							{
								
								gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,pppppp);	
							gp.add(player,0,0);
								 rturn=0;
								
								gp.add(reset,0,1);
							}
							turn=1;
						}
						
					}}
				});

			btn2.setOnAction( new EventHandler<ActionEvent>()
				{
					public void handle(ActionEvent ke)
					{	if(Point[0][1]==0 && Point[0][1]==0)
					{
						if(turn==1) {
							Point[0][1]=1;
							gp.add(t2, 1, 0);
							t2.setText("0");
							gp.getChildren().remove(lblStatus);
						gp.add(lbl2Status,0,3);
						btn2.setStyle("-fx-background-color: LIGHTGREEN");
						t2.setFill(Color.DARKGREEN);
						btn2.setDisable(true);
							int player1=Player1win();
							if(player1==1)
							{
								gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,pppppp);	
								 rturn=0;
								gp.add(player,0,0);
								gp.add(reset,0,1);
							}
							int draw=DrawMatch();
							if (draw==1) {
								
									gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,player,playe2r,pppppp);	
								 rturn=0;
								gp.add(dra1w,0,0);							
								gp.add(reset,0,1);
							}
							int player2=Player2win();
							if(player2==1)
							{
								gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,pppppp);	
								 rturn=0;
								gp.add(playe2r,0,0);
								gp.add(reset,0,1);
							}
							turn=2;
						}
						else {
							
							Point[0][1]=2;
							gp.add(t2, 1, 0);
						t2.setText("X");
						btn2.setDisable(true);
						btn2.setStyle("-fx-background-color: #00fffc");
						t2.setFill(Color.GRAY);
						gp.getChildren().remove(lbl2Status);
						gp.add(lblStatus,0,3);
							int player2=Player2win();
							if(player2==2)
							{
								gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,pppppp);	
							gp.add(playe2r,0,0);
								 rturn=0;
								
								gp.add(reset,0,1);
							}
							int draw=DrawMatch();
							if (draw==1) {
								gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,player,playe2r,pppppp);
							gp.add(dra1w,0,0);
								rturn=0;
								
								gp.add(reset,0,1);
							}
							int player1=Player1win();
							if(player1==1)
							{
								gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,pppppp);	
							gp.add(player,0,0);
								 rturn=0;
								
								gp.add(reset,0,1);
							}
							turn=1;
						}
						
					}}
				});

			btn3.setOnAction( new EventHandler<ActionEvent>()
			{
				public void handle(ActionEvent ke)
				{
					if(Point[0][2]==0 && Point[0][2]==0)
					{
					if(turn==1) {
						Point[0][2]=1;
						gp.add(t3, 2, 0);
							t3.setText("0");
							gp.getChildren().remove(lblStatus);
						gp.add(lbl2Status,0,3);
						btn3.setStyle("-fx-background-color: LIGHTGREEN");
						t3.setFill(Color.DARKGREEN);
						btn3.setDisable(true);
						int player1=Player1win();
						if(player1==1)
						{
							     gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,pppppp);	
								 rturn=0;
								gp.add(player,0,0);
								gp.add(reset,0,1);
						}
						int draw=DrawMatch();
						if (draw==1) {
							
								gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,player,playe2r,pppppp);	
								 rturn=0;
								gp.add(dra1w,0,0);							
								gp.add(reset,0,1);
						}
						int player2=Player2win();
						if(player2==1)
						{
							gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,pppppp);	
								 rturn=0;
								gp.add(playe2r,0,0);
								gp.add(reset,0,1);
						}
						turn=2;
					}
					else {
						
						Point[0][2]=2;
						gp.add(t3, 2, 0);
						t3.setText("X");
						btn3.setDisable(true);
						btn3.setStyle("-fx-background-color: #00fffc");
						t3.setFill(Color.GRAY);
						gp.getChildren().remove(lbl2Status);
						gp.add(lblStatus,0,3);
						int player2=Player2win();
						if(player2==2)
						{
							gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,pppppp);	
							gp.add(playe2r,0,0);
								 rturn=0;
								
								gp.add(reset,0,1);
						}
						int draw=DrawMatch();
						if (draw==1) {
							gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,player,playe2r,pppppp);	
								 rturn=0;
								gp.add(dra1w,0,0);							
								gp.add(reset,0,1);
						}
						int player1=Player1win();
						if(player1==1)
						{
							gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,pppppp);	
							gp.add(player,0,0);
								 rturn=0;
								
								gp.add(reset,0,1);	
						}
						turn=1;
					}
					
				}}
			});

			 btn4.setOnAction( new EventHandler<ActionEvent>()
			{
				public void handle(ActionEvent ke)
				{
					if(turn==1) { 
						gp.add(t4, 0, 1);
						t4.setText("0");
						gp.getChildren().remove(lblStatus);
						gp.add(lbl2Status,0,3);
						btn4.setStyle("-fx-background-color: LIGHTGREEN");
						t4.setFill(Color.DARKGREEN);
						btn4.setDisable(true);
						Point[1][0]=1;
						int player1=Player1win();
						if(player1==1)
						{
							gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,pppppp);
							gp.add(player,0,0); 
							rturn=0;
							gp.add(reset,0,1);
						}
						int draw=DrawMatch();
						if (draw==1) {
							gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,player,playe2r,pppppp);
							gp.add(dra1w,0,0);
							rturn=0;
							gp.add(reset,0,1);
						}
						turn=2;
						
					}
					else {
						gp.add(t4, 0, 1);
						t4.setText("X");
						btn4.setStyle("-fx-background-color: #00fffc");
						t4.setFill(Color.GRAY);
						gp.getChildren().remove(lbl2Status);
						gp.add(lblStatus,0,3);
						btn4.setDisable(true);
						Point[1][0]=2;
						int player2=Player2win();
						if(player2==2)
						{
							gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,pppppp);	
							gp.add(playe2r,0,0);
							rturn=0;
							gp.add(reset,0,1);
						}
						int draw=DrawMatch();
						if (draw==1) {
							gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,player,playe2r,pppppp);
							gp.add(dra1w,0,0);
							rturn=0;
							gp.add(reset,0,1);
						}
						turn=1;
					}
						
				}
			});

			 btn5.setOnAction( new EventHandler<ActionEvent>()
			{
				public void handle(ActionEvent ke)
				{
					if(turn==1) { 
						gp.add(t5, 1, 1);
						t5.setText("0");
						gp.getChildren().remove(lblStatus);
						gp.add(lbl2Status,0,3);
						btn5.setStyle("-fx-background-color: LIGHTGREEN");
						t5.setFill(Color.DARKGREEN);
						btn5.setDisable(true);
						Point[1][1]=1;
						int player1=Player1win();
						if(player1==1)
						{
							gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,pppppp);
							gp.add(player,0,0);
							rturn=0;
							gp.add(reset,0,1);
						}
						int draw=DrawMatch();
						if (draw==1) {
							gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,player,playe2r,pppppp);
							gp.add(dra1w,0,0);
							rturn=0;
							gp.add(reset,0,1);
						}
						turn=2;
						
					}
					else {
						gp.add(t5, 1, 1);
						t5.setText("X");
						btn5.setStyle("-fx-background-color: #00fffc");
						t5.setFill(Color.GRAY);
						gp.getChildren().remove(lbl2Status);
						gp.add(lblStatus,0,3);
						btn5.setDisable(true);
						Point[1][1]=2;
						int player2=Player2win();
						if(player2==2)
						{
							gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,pppppp);	
							gp.add(playe2r,0,0);
							rturn=0;
							gp.add(reset,0,1);
						}
						int draw=DrawMatch();
						if (draw==1) {
							gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,player,playe2r,pppppp);
							gp.add(dra1w,0,0); 
							rturn=0;
							gp.add(reset,0,1);
						}
						turn=1;
					}
						
				}
			});

			 btn6.setOnAction( new EventHandler<ActionEvent>()
			{
				public void handle(ActionEvent ke)
				{
					if(turn==1) { 
						gp.add(t6, 2, 1);
						t6.setText("0");
						gp.getChildren().remove(lblStatus);
						gp.add(lbl2Status,0,3);
						btn6.setStyle("-fx-background-color: LIGHTGREEN");
						t6.setFill(Color.DARKGREEN);
						btn6.setDisable(true);
						Point[1][2]=1;
						int player1=Player1win();
						if(player1==1)
						{
							gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,pppppp);
							gp.add(player,0,0);
							rturn=0;
							gp.add(reset,0,1);
						}
						int draw=DrawMatch();
						if (draw==1) {
							gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,player,playe2r,pppppp);
							gp.add(dra1w,0,0);
							rturn=0;
								gp.add(reset,0,1);
						}
						turn=2;
						
					}
					else {
						gp.add(t6, 2, 1);
						t6.setText("X");
						btn6.setStyle("-fx-background-color: #00fffc");
						t6.setFill(Color.GRAY);
						gp.getChildren().remove(lbl2Status);
						gp.add(lblStatus,0,3);
						btn6.setDisable(true);
						Point[1][2]=2;
						int player2=Player2win();
						if(player2==2)
						{
							gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,pppppp);	
							gp.add(playe2r,0,0);
							rturn=0;
							gp.add(reset,0,1);
						}
						int draw=DrawMatch();
						if (draw==1) {
							gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,player,playe2r,pppppp);
							gp.add(dra1w,0,0);
							rturn=0;
							gp.add(reset,0,1);
						}
						turn=1;
					}
						
				}
			});

			 btn7.setOnAction( new EventHandler<ActionEvent>()
			{
				public void handle(ActionEvent ke)
				{
					if(turn==1) {
						gp.add(t7, 0, 2);
						t7.setText("0");
						gp.getChildren().remove(lblStatus);
						gp.add(lbl2Status,0,3);
						btn7.setStyle("-fx-background-color: LIGHTGREEN");
						t7.setFill(Color.DARKGREEN);
						btn7.setDisable(true);
						Point[2][0]=1;
						int player1=Player1win();
						if(player1==1)
						{
							gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,pppppp);
							gp.add(player,0,0);
							rturn=0;
							gp.add(reset,0,1);
						}
						int draw=DrawMatch();
						if (draw==1) {
							gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,player,playe2r,pppppp);
							gp.add(dra1w,0,0); 
							rturn=0;
							gp.add(reset,0,1);
						}
						turn=2;
						
					}
					else {
						gp.add(t7, 0, 2);
						t7.setText("X");
						btn7.setStyle("-fx-background-color: #00fffc");
						t7.setFill(Color.GRAY);
						gp.getChildren().remove(lbl2Status);
						gp.add(lblStatus,0,3);
						btn7.setDisable(true);
						Point[2][0]=2;
						int player2=Player2win();
						if(player2==2)
						{
							gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,pppppp);	
							gp.add(playe2r,0,0);
							rturn=0;
							gp.add(reset,0,1);
						}
						int draw=DrawMatch();
						if (draw==1) {
							gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,player,playe2r,pppppp);
							gp.add(dra1w,0,0);
							rturn=0;
							gp.add(reset,0,1);
						}
						turn=1;
					}
						
				}
			});

			 btn8.setOnAction( new EventHandler<ActionEvent>()
			{
				public void handle(ActionEvent ke)
				{
					if(turn==1) { 
						gp.add(t8, 1, 2);
						t8.setText("0");
						gp.getChildren().remove(lblStatus);
						gp.add(lbl2Status,0,3);
						btn8.setStyle("-fx-background-color: LIGHTGREEN");
						t8.setFill(Color.DARKGREEN);
						btn8.setDisable(true);
						Point[2][1]=1;
						int player1=Player1win();
						if(player1==1)
						{
							gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,pppppp);
							gp.add(player,0,0);
							rturn=0;
							gp.add(reset,0,1);
						}
						int draw=DrawMatch();
						if (draw==1) {
							gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,player,playe2r,pppppp);
							gp.add(dra1w,0,0); 
							rturn=0;
							gp.add(reset,0,1);
						}
						turn=2;
						
					}
					else {
						//gp.getChildren().remove(btn8);
						gp.add(t8, 1, 2);
						t8.setText("X");
						btn8.setStyle("-fx-background-color: #00fffc");
						t8.setFill(Color.GRAY);
						gp.getChildren().remove(lbl2Status);
						gp.add(lblStatus,0,3);
						btn8.setDisable(true);
						Point[2][1]=2;
						int player2=Player2win();
						if(player2==2)
						{
							gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,pppppp);	
							gp.add(playe2r,0,0); 
							rturn=0;
							gp.add(reset,0,1);
						}
						int draw=DrawMatch();
						if (draw==1) {
							gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,player,playe2r,pppppp);
							gp.add(dra1w,0,0); 
							rturn=0;
							gp.add(reset,0,1);
						}
						turn=1;
					}
						
				}
			});

			 btn9.setOnAction( new EventHandler<ActionEvent>()
			{
				public void handle(ActionEvent ke)
				{
					if(turn==1) {
						gp.add(t9, 2, 2);
						t9.setText("0");
						gp.getChildren().remove(lblStatus);
						gp.add(lbl2Status,0,3);
						btn9.setStyle("-fx-background-color: LIGHTGREEN");
						t9.setFill(Color.DARKGREEN);
						btn9.setDisable(true);
						Point[2][2]=1;
						int player1=Player1win();
						if(player1==1)
						{
							gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,pppppp);
							gp.add(player,0,0); 
							rturn=0;
							gp.add(reset,0,1);
						}
						int draw=DrawMatch();
						if (draw==1) {
							gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,player,playe2r,pppppp);
							gp.add(dra1w,0,0);
							rturn=0;
								gp.add(reset,0,1);
						}
						turn=2;
						
					}
					else {
						gp.add(t9, 2, 2);
						t9.setText("X");
						btn9.setStyle("-fx-background-color: #00fffc");
						t9.setFill(Color.GRAY);
						gp.getChildren().remove(lbl2Status);
						gp.add(lblStatus,0,3);
						btn9.setDisable(true);
						Point[2][2]=2;
						int player2=Player2win();
						if(player2==2)
						{
							gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,pppppp);	
							gp.add(playe2r,0,0);
							rturn=0;
							gp.add(reset,0,1);
						}
						int draw=DrawMatch();
						if (draw==1) {
							gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,player,playe2r,pppppp);
							gp.add(dra1w,0,0);
							rturn=0;
							gp.add(reset,0,1);
						}
						turn=1;
					}
						
				}
			});

			 reset.setOnAction( new EventHandler<ActionEvent>()
			{
				public void handle(ActionEvent ke)
				{	if(rturn==0)
					{	
						gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,player,playe2r,dra1w);
						reset.setText("Reset");
						rturn=1;
						for(int j=0;j<3;j++)
						{
							for(int k=0;k<3;k++)
							{
								Point[j][k]=0;
							}
						}
					btn1.setStyle("-fx-focus-color: transparent;");
					btn2.setStyle("-fx-focus-color: transparent;");
					btn3.setStyle("-fx-focus-color: transparent;");
					btn4.setStyle("-fx-focus-color: transparent;");
					btn5.setStyle("-fx-focus-color: transparent;");
					btn6.setStyle("-fx-focus-color: transparent;");
					btn7.setStyle("-fx-focus-color: transparent;");
					btn8.setStyle("-fx-focus-color: transparent;");
					btn9.setStyle("-fx-focus-color: transparent;");		

					btn1.setDisable(false);
					btn2.setDisable(false);
					btn3.setDisable(false);
					btn4.setDisable(false);
					btn5.setDisable(false);
					btn6.setDisable(false);
					btn7.setDisable(false);
					btn8.setDisable(false);
					btn9.setDisable(false);

						gp.add(btn1, 0, 0);
						gp.add(btn2, 1, 0);
				      	gp.add(btn3, 2, 0);
				      	gp.add(btn4, 0, 1);
				      	gp.add(btn5, 1, 1);
				      	gp.add(btn6, 2, 1);
				      	gp.add(btn7, 0, 2);
				      	gp.add(btn8, 1, 2);
				      	gp.add(btn9, 2, 2);
				      	gp.add(pppppp, 2, 4);
				      	gp.getChildren().remove(reset);
					}
				else
				{ 	for(int j=0;j<3;j++)
					{
					for(int k=0;k<3;k++)
					{
						Point[j][k]=0;
					}
				}
						
				gp.getChildren().removeAll(btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,t1,t2,t3,t4,t5,t6,t7,t8,t9,player,playe2r,dra1w);
					btn1.setStyle("-fx-focus-color: transparent;");
					btn2.setStyle("-fx-focus-color: transparent;");
					btn3.setStyle("-fx-focus-color: transparent;");
					btn4.setStyle("-fx-focus-color: transparent;");
					btn5.setStyle("-fx-focus-color: transparent;");
					btn6.setStyle("-fx-focus-color: transparent;");
					btn7.setStyle("-fx-focus-color: transparent;");
					btn8.setStyle("-fx-focus-color: transparent;");
					btn9.setStyle("-fx-focus-color: transparent;");			

					btn1.setDisable(false);
					btn2.setDisable(false);
					btn3.setDisable(false);
					btn4.setDisable(false);
					btn5.setDisable(false);
					btn6.setDisable(false);
					btn7.setDisable(false);
					btn8.setDisable(false);
					btn9.setDisable(false);

					gp.add(btn1, 0, 0);
					gp.add(btn2, 1, 0);
			      	gp.add(btn3, 2, 0);
			      	gp.add(btn4, 0, 1);
			      	gp.add(btn5, 1, 1);
			      	gp.add(btn6, 2, 1);
			      	gp.add(btn7, 0, 2);
			      	gp.add(btn8, 1, 2);
			      	gp.add(btn9, 2, 2);
			      	gp.add(pppppp, 2, 4);
			      	gp.getChildren().remove(reset);
			      	rturn=1;
				}
				}		
				
			});
		Scene scene = new Scene (gp,450,540);
		stage.setScene(scene);
		stage.setTitle("Tic Tac Toe");
		stage.show();	

	}
}	