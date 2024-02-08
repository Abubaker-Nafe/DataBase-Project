package application;
import java.sql.*;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.MapValueFactory;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.BackgroundImage;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class Main extends Application {
	public int CustLoginflag = 0;
	public int EmpLoginflag = 0;
	public String CustomerName;
	public int CustomerID;

	@Override
	public void start(Stage PrimaryStage) {
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625"); 

			//------------------------------------------------------------------------------------------------------------------------------------------------------
			Pane h = new Pane();
			GridPane root = new GridPane();
			root.setPadding(new Insets(20));
			root.setAlignment(Pos.CENTER_LEFT);

			root.setBackground(new Background(new BackgroundImage(new Image("file:///C:/Users/DELL/Desktop/ferdous.webp"), null, null,null, null)));

			PrimaryStage.setTitle("online shopping");
			PrimaryStage.setMaximized(true);


			Image image1 = new Image("C:\\Users\\DELL\\Downloads\\WhatsApp Image 2023-02-09 at 11.53.12 AM (1).jpeg");
			ImageView imagevi401 = new ImageView();
			imagevi401.setImage(image1);
			imagevi401.setFitWidth(500);
			imagevi401.setFitHeight(850);
			root.add(imagevi401, 0, 0);

			Button l = new Button("Customer");
			Button S = new Button("Employee");
			S.setPrefSize(300, 100);
			l.setPrefSize(300, 100);
			S.setLayoutX(250);
			S.setLayoutY(220);
			l.setLayoutX(250);
			l.setLayoutY(350);
			l.setTextFill(Color.BLACK);
			l.setFont(new Font("Arabic Typesetting", 50));
			S.setFont(new Font("Arabic Typesetting", 50));
			S.setTextFill(Color.BLACK);
			l.setStyle("-fx-background-color:WHITE;-fx-background-radius:10px");
			S.setStyle("-fx-background-color:WHITE;-fx-background-radius:10px");
			h.getChildren().add(l);
			h.getChildren().add(S);
			l.setAlignment(Pos.CENTER);
			S.setAlignment(Pos.CENTER);
			root.add(h, 10, 0);
			root.setVgap(60);
			root.setHgap(15);
			
			Scene s = new Scene(root, Color.RED);

			PrimaryStage.setScene(s);
			PrimaryStage.show();
			/////////////////////////first
			l.setOnAction(l0 -> { //l = customer
				Pane h1 = new Pane();
				GridPane root1 = new GridPane();
				root1.setPadding(new Insets(20));
				root1.setAlignment(Pos.CENTER_LEFT);


				root1.setBackground(new Background(new BackgroundImage(
						new Image("file:///C:/Users/DELL/Desktop/ferdous.webp"), null, null,
						null, null)));

				PrimaryStage.setTitle("online shopping");
				PrimaryStage.setMaximized(true);


				Image image11 = new Image("C:\\Users\\DELL\\Desktop\\MArt.jpg");
				ImageView imagevi4011 = new ImageView();
				imagevi4011.setImage(image11);
				imagevi4011.setFitWidth(550);
				imagevi4011.setFitHeight(850);
				root1.add(imagevi4011, 0, 0);

				//root.add(WELCOUM, 1, 0);
				Label l1 = new Label("Username:");
				Label l12 = new Label("New Custemer?");
				Label S1 = new Label("Password:");
				TextArea l11=new TextArea();
				TextArea S11=new TextArea();
				Button log = new Button("Login");
				Button sig = new Button("Sign up!");
				sig.setPrefSize(100, 20);
				sig.setLayoutX(350);
				sig.setLayoutY(535);
				sig.setFont(new Font("Arabic Typesetting", 20));
				sig.setTextFill(Color.BLACK);
				l12.setPrefSize(220, 100);
				l12.setLayoutX(190);
				l12.setLayoutY(500);
				l12.setFont(new Font("Arabic Typesetting", 30));
				l12.setTextFill(Color.BLACK);

				log.setLayoutX(500);
				log.setLayoutY(250);
				S11.setPrefSize(400, 0);
				S11.setLayoutX(300);
				S11.setLayoutY(115);
				l11.setPrefSize(400, 0);
				l11.setLayoutX(300);
				l11.setLayoutY(180);
				l1.setPrefSize(230, 100);
				S1.setPrefSize(230, 100);
				l1.setLayoutX(100);
				l1.setLayoutY(100);
				S1.setLayoutX(100);
				S1.setLayoutY(168);
				l1.setTextFill(Color.BLACK);
				l1.setFont(new Font("Arabic Typesetting", 50));
				S1.setFont(new Font("Arabic Typesetting", 50));
				log.setFont(new Font("Arabic Typesetting", 30));
				S1.setTextFill(Color.BLACK);
				log.setStyle("-fx-background-color:WHITE;-fx-background-radius:10px");
				h1.getChildren().add(l1);
				h1.getChildren().add(S1);
				h1.getChildren().add(S11);
				h1.getChildren().add(l11);
				h1.getChildren().add(log);
				h1.getChildren().add(l12);
				h1.getChildren().add(sig);

				l1.setAlignment(Pos.TOP_LEFT);
				S1.setAlignment(Pos.TOP_LEFT);

				root1.add(h1, 10, 0);

				root1.setVgap(60);
				root1.setHgap(15);

				Scene s1 = new Scene(root1, Color.RED);
				Stage s11=new Stage();
				s11.setScene(s1);
				s11.show();

				sig.setOnAction(l222->{ //sign up for customer
					GridPane rootfer = new GridPane();
					rootfer.setPadding(new Insets(15, 15, 15, 15));
					Image image = new Image("C:\\Users\\DELL\\Desktop\\MArt.jpg");
					ImageView imageView = new ImageView(image);
					imageView.setFitHeight(50);
					imageView.setFitWidth(120);
					rootfer.getChildren().add(imageView);
					Label LnewCustomer = new Label("Sign up Customer"); 
					LnewCustomer.setTranslateX(290);
					LnewCustomer.setTranslateY(15);
					LnewCustomer.setTextFill(Color.WHITE);
					LnewCustomer.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
					LnewCustomer.setFont(new Font("Arial ", 25));

					rootfer.getChildren().add(LnewCustomer);

					Label LEmail = new Label("Customer Email"); 
					LEmail.setTranslateX(180);
					LEmail.setTranslateY(120);
					LEmail.setFont(new Font("Arial Black", 14));

					Label LPassword = new Label("Customer Password"); 
					LPassword.setTranslateX(180);
					LPassword.setTranslateY(165);
					LPassword.setFont(new Font("Arial Black", 14));

					Label LAge = new Label("Customer Age"); 
					LAge.setTranslateX(185);
					LAge.setTranslateY(210);
					LAge.setFont(new Font("Arial Black", 14));

					Label LPhoneNum = new Label("Phone Number"); 
					LPhoneNum.setTranslateX(185);
					LPhoneNum.setTranslateY(250);
					LPhoneNum.setFont(new Font("Arial Black", 14));

					Label LGender= new Label("Customer Gender"); 
					LGender.setTranslateX(185);
					LGender.setTranslateY(295);
					LGender.setFont(new Font("Arial Black", 14));

					Label LAddress= new Label("Customer Address"); 
					LAddress.setTranslateX(185);
					LAddress.setTranslateY(340);
					LAddress.setFont(new Font("Arial Black", 14));

					rootfer.getChildren().addAll(LEmail , LPassword , LAge , LPhoneNum , LGender , LAddress);

					TextField TxtEmail = new TextField("");
					TxtEmail.setTranslateX(330);
					TxtEmail.setTranslateY(120);
					TxtEmail.setMaxWidth(190);

					TextField Txtpassw = new TextField("");
					Txtpassw.setTranslateX(350);
					Txtpassw.setTranslateY(161);
					Txtpassw.setMaxWidth(190);

					TextField TxtAge = new TextField("");
					TxtAge.setTranslateX(330);
					TxtAge.setTranslateY(210);
					TxtAge.setMaxWidth(190);

					TextField TxtPhoneNum = new TextField("");
					TxtPhoneNum.setTranslateX(330);
					TxtPhoneNum.setTranslateY(250);
					TxtPhoneNum.setMaxWidth(190);

					TextField TxtGender = new TextField("");
					TxtGender.setTranslateX(330);
					TxtGender.setTranslateY(295);
					TxtGender.setMaxWidth(190);

					TextField TxtAddress = new TextField("");
					TxtAddress.setTranslateX(330);
					TxtAddress.setTranslateY(340);
					TxtAddress.setMaxWidth(190);
					rootfer.getChildren().addAll(TxtEmail , Txtpassw , TxtAge , TxtPhoneNum , TxtGender , TxtAddress);

					//Buttons 

					Button Login = new Button ("LOG IN"); 
					Login.setTranslateX(620);
					Login.setTranslateY(290);
					Login.setMaxWidth(100);
					Login.setMaxHeight(35);
					Login.setTextFill(Color.WHITE);
					Login.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
					Login.setFont(new Font("Arial", 16));

					DropShadow shadow = new DropShadow(20, Color.RED);

					Login.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
						Login.setEffect(shadow);
					});
					Login.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
						Login.setEffect(null);
					});
					Button Back = new Button ("BACK"); 
					Back.setTranslateX(620);
					Back.setTranslateY(335);
					Back.setMaxWidth(70);
					Back.setMaxHeight(20);
					Back.setTextFill(Color.WHITE);
					Stage fer=new Stage();
					Back.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
					Back.setFont(new Font("Arial", 16));
					Back.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
						Back.setEffect(shadow);
					});
					Back.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
						Back.setEffect(null);
					});

					Back.setOnAction(e ->{
						fer.close();
					});
					rootfer.getChildren().addAll(Login , Back);
					Scene scene = new Scene(rootfer, 800, 500);

					scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
					scene.setFill(Color.RED);
					fer.setScene(scene);
					fer.show();
					Login.setOnAction(l2232->{//sign in for customer

						//Getting Customer ID from his name
						CustomerName = TxtEmail.getText();
						try {
							Statement stat = con.createStatement();
							ResultSet GetID = stat.executeQuery("select Customer_ID from customer where Customer_Name ='"+ CustomerName + "';");
							while(GetID.next())  
							{
								CustomerID = GetID.getInt(1);
							}
						}catch(Exception e)
						{
							e.printStackTrace();
						}

						String insert = "INSERT INTO customer(Customer_Name, Customer_Password, Age , PhoneNumber,Email,Gender,Address)"+"VALUES "
								+"('"+ TxtEmail.getText() +"'," + "'" + Txtpassw.getText() + "','" + TxtAge.getText() + "'," +
								Integer.parseInt(TxtPhoneNum.getText()) + ",'" + TxtEmail.getText()  +"','" + TxtGender.getText() + "','" + TxtAddress.getText() + "')";

						Statement statement;
						try {
							Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625"); 
							statement = con1.createStatement();
							statement.executeUpdate(insert);
							con1.close();
						} catch (SQLException e1) {
							e1.printStackTrace();
						}

						GridPane root6=new GridPane();
						root6.setPadding(new Insets(15, 15, 15, 15));
						root6.setHgap(10);
						root6.setVgap(10);

						Image Photo = new Image("C:\\Users\\DELL\\Desktop\\MArt.jpg", 150, 150, true, true);
						ImageView image5 = new ImageView(Photo);
						image5.setTranslateY(-40);
						image5.setTranslateX(-10);
						image5.setFitHeight(50);
						image5.setFitWidth(100);
						root6.getChildren().addAll(image5);


						Image img = new Image("C:\\\\Users\\\\DELL\\\\Desktop\\\\Watch1.jpg", 100, 100, true, true);
						ImageView imgV = new ImageView(img);
						imgV.setTranslateY(150);
						imgV.setTranslateX(200);
						imgV.setFitHeight(200);
						imgV.setFitWidth(200);

						root6.getChildren().add(imgV);

						Button btn = new Button("Shop"); 
						btn.setPrefSize(130,30);
						btn.setTranslateY(280);
						btn.setTranslateX(220);
						btn.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(5), Insets.EMPTY)));
						btn.setTextFill(Color.BLACK);
						btn.setFont(new Font("Arial", 20));
						root6.getChildren().addAll(btn);

						btn.setOnAction(q->{ //watches screen
							FlowPane rootcq = new FlowPane();
							rootcq.setPadding(new Insets(15, 15, 15, 15));
							rootcq.setHgap(10);
							rootcq.setVgap(10);
							ObservableList fControlcq = rootcq.getChildren();
							Image Photocq = new Image("C:\\\\Users\\\\DELL\\\\Desktop\\\\MArt.jpg", 150, 150, true, true);
							ImageView imagecq = new ImageView(Photocq);
							imagecq.setTranslateY(-40);
							imagecq.setTranslateX(-10);
							rootcq.getChildren().addAll(imagecq);

							Button Backh = new Button("cart");
							Backh.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
							Backh.setFont(new Font("Arial", 20));

							Backh.setTextFill(Color.WHITE);
							Backh.setTranslateY(10);
							Backh.setTranslateX(-167);
							Backh.setPrefSize(80, 25);

							fControlcq.add(Backh);
							Backh.setOnAction(e->{ //login cart
								//Dealing with SQL | Inserting into cart 



								//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
								GridPane rooto = new GridPane();
								rooto.setPadding(new Insets(15, 15, 15, 15));
								TextArea areatxt = new TextArea(" ");
								areatxt.setTranslateX(35);
								areatxt.setTranslateY(110);
								areatxt.setPrefSize(800, 400);

								//Button 
								Button Order = new Button("Order");
								Order.setTranslateX(150);
								Order.setTranslateY(-180);

								Label label = new Label("Enter the product id to remove the product");
								label.setTranslateX(150);
								label.setTranslateY(500);

								TextField tx = new TextField("id");
								tx.setTranslateX(200);
								tx.setTranslateY(500);

								Button RemoveProduct = new Button("Remove Product");
								RemoveProduct.setTranslateX(350);
								RemoveProduct.setTranslateY(550);

								RemoveProduct.setBackground(
										new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
								RemoveProduct.setTextFill(Color.WHITE);

								Order.setBackground(
										new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
								Order.setTextFill(Color.WHITE);



								rooto.getChildren().addAll(label,tx,RemoveProduct);

								RemoveProduct.setOnAction(e2 ->{
									try {
										String DeleteProduct = "delete from TempProduct WHERE PRODUCT_ID="+ Integer.parseInt(tx.getText()) +";";
										Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625");
										Statement stmt10=con3.createStatement();

										stmt10.executeUpdate(DeleteProduct);

										int numofproducts = 0;
										int totalprice = 0;

										Statement stmt=con3.createStatement();
										Statement stmt1=con3.createStatement();
										ResultSet NumOfProductsResult=stmt.executeQuery("select count(product_ID) FROM TempProduct;"); 
										ResultSet TotalPriceResult=stmt1.executeQuery("select sum(Price) from TempProduct;");

										while(NumOfProductsResult.next())
										{
											numofproducts = NumOfProductsResult.getInt(1);
										}
										while(TotalPriceResult.next()) 
										{
											totalprice = TotalPriceResult.getInt(1);
										}
										Statement stm; 
										String InsertCart = "INSERT INTO cart(NumOfProducts,TotalPrice) VALUES ("+numofproducts+"," +totalprice+");";
										stm =con3.createStatement();
										stm.executeUpdate(InsertCart);

										//printing products selected by the customer

										Statement stmt2=con.createStatement();
										ResultSet rs=stmt.executeQuery("select * from Tempproduct;"); 

										areatxt.appendText("\n----------\nNew Order:");
										while(rs.next())
										{

											String productName = rs.getString("ProductName");
											int price = rs.getInt("Price");
											int productID = rs.getInt("Product_ID");
											areatxt.appendText("Product ID:"+ productID +" Product Name: " + productName + " Price: " + price + "\n");
										}
										areatxt.appendText("Number of products: " + numofproducts + "\nTotal Price: " + totalprice);
										con3.close();

									} catch (SQLException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}

								});

								rooto.getChildren().add(Order);
								Scene sceneo = new Scene(rooto, 900, 600);
								Stage o=new Stage();
								o.setMaximized(true);
								rooto.getChildren().add(areatxt);
								sceneo.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
								sceneo.setFill(Color.WHITE);
								o.setScene(sceneo);
								o.show();


								try {
									Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625");
									int numofproducts = 0;
									int totalprice = 0;

									Statement stmt=con3.createStatement();
									Statement stmt1=con3.createStatement();
									ResultSet NumOfProductsResult=stmt.executeQuery("select count(product_ID) FROM TempProduct;"); 
									ResultSet TotalPriceResult=stmt1.executeQuery("select sum(Price) from TempProduct;");

									while(NumOfProductsResult.next())
									{
										numofproducts = NumOfProductsResult.getInt(1);
									}
									while(TotalPriceResult.next()) 
									{
										totalprice = TotalPriceResult.getInt(1);
									}
									Statement stm; 
									String InsertCart = "INSERT INTO cart(NumOfProducts,TotalPrice) VALUES ("+numofproducts+"," +totalprice+");";
									stm =con3.createStatement();
									stm.executeUpdate(InsertCart);

									//printing products selected by the customer

									Statement stmt2=con.createStatement();
									ResultSet rs=stmt.executeQuery("select * from Tempproduct;"); 

									while(rs.next())
									{

										String productName = rs.getString("ProductName");
										int price = rs.getInt("Price");
										int productID = rs.getInt("Product_ID");
										areatxt.appendText("Product ID:"+ productID +" Product Name: " + productName + " Price: " + price + "\n");
									}
									areatxt.appendText("Number of products: " + numofproducts + "\nTotal Price: " + totalprice);
									con3.close();
								} catch (SQLException e1) {
									e1.printStackTrace();
								}

								Order.setOnAction(e122 -> {
									String deleteproducts = "delete from tempproduct;";
									try {
										Connection con4=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625");

										int numofproducts = 0;
										int totalprice = 0;

										Statement stmt=con4.createStatement();
										Statement stmt1=con4.createStatement();
										ResultSet NumOfProductsResult=stmt.executeQuery("select count(product_ID) FROM TempProduct;"); 
										ResultSet TotalPriceResult=stmt1.executeQuery("select sum(Price) from TempProduct;");

										while(NumOfProductsResult.next())
										{
											numofproducts = NumOfProductsResult.getInt(1);
										}
										while(TotalPriceResult.next())  
										{
											totalprice = TotalPriceResult.getInt(1);
										}


										//inserting into orders table
										String insertintoorder = "insert into Orders_sold(Customer_ID,TotalPrice,Num_OF_Products) "
												+ "values(" + CustomerID +"," + totalprice +","+ numofproducts +");";
										Statement st = con4.createStatement();
										st.executeUpdate(insertintoorder);


										//deleting everything from tempproduct table
										Statement stm = con4.createStatement();
										stm.executeUpdate(deleteproducts);

										con4.close();
									} catch (SQLException e2) {
										e2.printStackTrace();
									}
								});



							});

							Label newC = new Label("Department of watches");
							newC.setTranslateY(-10);
							newC.setTranslateX(65);
							newC.setFont(new Font("Arial", 18));
							fControlcq.add(newC);

							Image imgq = new Image("C:\\\\Users\\\\DELL\\\\Desktop\\\\Watch2.jpg", 100, 100, true, true);
							ImageView imgVq= new ImageView(imgq);
							imgVq.setTranslateY(100);
							imgVq.setTranslateX(-80);
							imgVq.setFitHeight(130);
							imgVq.setFitWidth(115);

							fControlcq.add(imgVq);

							Button btnq = new Button("Buy It");//womens watch $30 --> should be mens watch 30 
							btnq.setPrefSize(60,20);
							btnq.setTranslateY(210);
							btnq.setTranslateX(55);
							btnq.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
							btnq.setTextFill(Color.WHITE);
							fControlcq.add(btnq);


							btnq.setOnAction(e -> {//move product to cart
								String Quantity = "select Quantity FROM product where ProductName = 'womens watch $30';";
								String Insert = "Insert into TempProduct(ProductName,Price)" + "VALUES ('womens watch $30',30);";
								String Update = "UPDATE product SET Quantity = Quantity - 1 WHERE ProductName = 'womens watch $30';";
								Statement stm1;
								Statement stm;
								try {
									int quantity=0;
									Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625"); 
									Statement st = con3.createStatement();
									stm =con3.createStatement(); 
									ResultSet QuantityResult = st.executeQuery(Quantity);

									while(QuantityResult.next())
									{
										quantity = QuantityResult.getInt(1);
									}
									if(quantity > 0)
									{
										stm.executeUpdate(Insert);
										stm1 = con3.createStatement();
										stm1.executeUpdate(Update);
										con3.close();
									}
									else {
										btnq.setText("out of stock");
									}
								} catch (SQLException e1) {
									e1.printStackTrace();
								}
							});

							Image img1 = new Image("C:\\\\Users\\\\DELL\\\\Desktop\\\\watch3.jpg", 100, 100, true, true);
							ImageView imgV1 = new ImageView(img1);
							imgV1.setTranslateY(100);
							imgV1.setTranslateX(-50);
							imgV1.setFitHeight(130);
							imgV1.setFitWidth(125);

							fControlcq.add(imgV1);

							Button btn1 = new Button("Buy It"); //mens watch $35
							btn1.setPrefSize(60,20);
							btn1.setTranslateY(60);
							btn1.setTranslateX(395);
							btn1.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
							btn1.setTextFill(Color.WHITE);
							fControlcq.add(btn1);

							btn1.setOnAction(e -> {//move product to cart 
								String Quantity = "select Quantity FROM product where ProductName = 'mens watch $35';";
								String Insert = "Insert into TempProduct(ProductName,Price)" + "VALUES ('mens watch $35',35);";
								String Update = "UPDATE product SET Quantity = Quantity - 1 WHERE ProductName = 'mens watch $35';";
								Statement stm1;

								Statement stm;
								try {
									int quantity=0;
									Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625"); 
									Statement st = con3.createStatement();
									ResultSet QuantityResult = st.executeQuery(Quantity);
									stm =con3.createStatement();

									while(QuantityResult.next())
									{
										quantity = QuantityResult.getInt(1);
									}
									if(quantity > 0)
									{
										stm.executeUpdate(Insert);
										stm1 = con3.createStatement();
										stm1.executeUpdate(Update);
										con3.close();
									}
									else {
										btn1.setText("out of stock");
									}
								} catch (SQLException e1) {
									e1.printStackTrace();
								}
							});


							Image img2 = new Image("C:\\\\Users\\\\DELL\\\\Desktop\\\\watch4.jpg", 100, 100, true, true);
							ImageView imgV2 = new ImageView(img2);
							imgV2.setTranslateY(-50);
							imgV2.setTranslateX(70);
							imgV2.setFitHeight(130);
							imgV2.setFitWidth(130);
							fControlcq.add(imgV2);

							Button btn2 = new Button("Buy It");  //mens watch $50
							btn2.setPrefSize(60,20);
							btn2.setTranslateY(60);
							btn2.setTranslateX(-41);
							btn2.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
							btn2.setTextFill(Color.WHITE);
							fControlcq.add(btn2);
							Image img3 = new Image("C:\\\\Users\\\\DELL\\\\Desktop\\\\watch5.jpg", 100, 100, true, true);
							ImageView imgV3 = new ImageView(img3);
							imgV3.setTranslateY(170);
							imgV3.setTranslateX(300);
							imgV3.setFitHeight(140);
							imgV3.setFitWidth(130);

							btn2.setOnAction(e -> {//move product to cart 
								String Quantity = "select Quantity FROM product where ProductName = 'mens watch $50';";
								String Insert = "Insert into TempProduct(ProductName,Price)" + "VALUES ('mens watch $50',50);";
								String Update = "UPDATE product SET Quantity = Quantity - 1 WHERE ProductName = 'mens watch $50';";
								Statement stm1;
								Statement stm;
								try {
									int quantity=0;

									Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625"); 
									Statement st = con3.createStatement();
									ResultSet QuantityResult = st.executeQuery(Quantity);

									while(QuantityResult.next())
									{
										quantity = QuantityResult.getInt(1);
									}
									if(quantity > 0)
									{
										stm =con3.createStatement();
										stm.executeUpdate(Insert);
										stm1 = con3.createStatement();
										stm1.executeUpdate(Update);
										con3.close();
									}
									else
									{
										btn2.setText("out of stock");
									}
								} catch (SQLException e1) {
									e1.printStackTrace();
								}

							});


							fControlcq.add(imgV3);
							Image img4 = new Image("C:\\\\Users\\\\DELL\\\\Desktop\\\\watch6.jpg", 100, 100, true, true);
							ImageView imgV4 = new ImageView(img4);
							imgV4.setTranslateY(170);
							imgV4.setTranslateX(-70);
							imgV4.setFitHeight(140);
							imgV4.setFitWidth(130);

							fControlcq.add(imgV4);

							Image img5 = new Image("C:\\\\Users\\\\DELL\\\\Desktop\\\\watch1.jpg", 100, 100, true, true);
							ImageView imgV5 = new ImageView(img5);
							imgV5.setTranslateY(170);
							imgV5.setTranslateX(-420);
							imgV5.setFitHeight(120);
							imgV5.setFitWidth(155);

							fControlcq.add(imgV5);


							Label lbl = new Label("Men's watch $30");
							lbl.setTranslateY(-55);
							lbl.setTranslateX(620);
							lbl.setFont(new Font("Arial", 10));
							fControlcq.add(lbl);

							Button btn3= new Button("Buy It");  //mens watch $30
							btn3.setPrefSize(60,20);
							btn3.setTranslateY(195);
							btn3.setTranslateX(530);
							btn3.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
							btn3.setTextFill(Color.WHITE);
							fControlcq.add(btn3);

							btn3.setOnAction(e -> {//move product to cart 
								String Quantity = "select Quantity FROM product where ProductName = 'Mens watch $30';";
								String Insert = "Insert into TempProduct(ProductName,Price)" + "VALUES ('mens watch $30',30);";
								String Update = "UPDATE product SET Quantity = Quantity - 1 WHERE ProductName = 'mens watch $30';";
								Statement stm1;


								Statement stm;
								try {
									int quantity=0;

									Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625"); 
									Statement st = con3.createStatement();
									ResultSet QuantityResult = st.executeQuery(Quantity);

									while(QuantityResult.next())
									{
										quantity = QuantityResult.getInt(1);
									}
									if(quantity > 0)
									{
										stm =con3.createStatement();
										stm.executeUpdate(Insert);
										stm1 = con3.createStatement();
										stm1.executeUpdate(Update);
										con3.close();
									}else
									{
										btn3.setText("out of stock!");
									}
								} catch (SQLException e1) {
									e1.printStackTrace();
								}
							});

							Label lbl1 = new Label("Men's watch $35");
							lbl1.setTranslateY(-56);
							lbl1.setTranslateX(230);
							lbl1.setFont(new Font("Arial", 10));
							fControlcq.add(lbl1);

							Label lbl2 = new Label("Men's watch $50");
							lbl2.setTranslateY(-60);
							lbl2.setTranslateX(-75);
							lbl2.setFont(new Font("Arial", 10));
							fControlcq.add(lbl2);

							Label lbl3 = new Label("Men's watch 55$");
							lbl3.setTranslateY(170);
							lbl3.setTranslateX(50);
							lbl3.setFont(new Font("Arial", 10));
							fControlcq.add(lbl3);


							Button btn4= new Button("Buy It"); // //mens watch $70
							btn4.setPrefSize(60,20);
							btn4.setTranslateY(195);
							btn4.setTranslateX(-220);
							btn4.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
							btn4.setTextFill(Color.WHITE);
							fControlcq.add(btn4);

							btn4.setOnAction(e -> {//move product to cart 
								String Quantity = "select Quantity FROM product where ProductName = 'mens watch $70';";
								String Insert = "Insert into TempProduct(ProductName,Price)" + "VALUES ('mens watch $70',70);";
								String Update = "UPDATE product SET Quantity = Quantity - 1 WHERE ProductName = 'mens watch $70';";
								Statement stm1;
								Statement stm;

								try {
									int quantity=0;
									Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625"); 
									Statement st = con3.createStatement();
									ResultSet QuantityResult = st.executeQuery(Quantity);

									while(QuantityResult.next())
									{
										quantity = QuantityResult.getInt(1);
									}
									if(quantity > 0)
									{
										stm =con3.createStatement();
										stm.executeUpdate(Insert);
										stm1 = con3.createStatement();
										stm1.executeUpdate(Update);
										con3.close();

									}
									else {
										btn4.setText("out of stock");
									}
								} catch (SQLException e1) {
									e1.printStackTrace();
								}
							});

							Label lbl4 = new Label("Women's watch $30");
							lbl4.setTranslateY(170);
							lbl4.setTranslateX(115);
							lbl4.setFont(new Font("Arial", 10));
							fControlcq.add(lbl4);


							Label lbl5 = new Label("Men's watch 70$");
							lbl5.setTranslateY(165);
							lbl5.setTranslateX(-395);
							lbl5.setFont(new Font("Arial", 10));
							fControlcq.add(lbl5);

							Button btn5= new Button("Buy It");  //mens watch $55
							btn5.setPrefSize(60,20);
							btn5.setTranslateY(197);
							btn5.setTranslateX(-290);
							btn5.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
							btn5.setTextFill(Color.WHITE);
							fControlcq.add(btn5);

							btn5.setOnAction(e -> {//move product to cart 
								String Quantity = "select Quantity FROM product where ProductName = 'Mens watch 70$';";
								String Insert = "Insert into TempProduct(ProductName,Price)" + "VALUES ('Mens watch 70$',55);";
								String Update = "UPDATE product SET Quantity = Quantity - 1 WHERE ProductName = 'Mens watch 70$';";
								Statement stm1;
								Statement stm;
								try {
									int quantity=0;
									Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625"); 
									Statement st = con3.createStatement();
									ResultSet QuantityResult = st.executeQuery(Quantity);

									while(QuantityResult.next())
									{
										quantity = QuantityResult.getInt(1);
									}
									if(quantity > 0)
									{
										stm =con3.createStatement();
										stm.executeUpdate(Insert);
										stm1 = con3.createStatement();
										stm1.executeUpdate(Update);
										con3.close();
									}
									else {
										btn5.setText("out of stock");
									}
								} catch (SQLException e1) {
									e1.printStackTrace();
								}
							});


							Scene scenev = new Scene(rootcq, 800, 600 , Color.WHITE);
							scenev.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
							Stage cq=new Stage();

							cq.setScene(scenev);
							cq.show();


						});

						//--------------------------------------- Clothes SCREEN
						Image img1 = new Image("C:\\Users\\DELL\\Desktop\\Leather jacket.jpg", 100, 100, true, true);
						ImageView imgV1 = new ImageView(img1);
						imgV1.setTranslateY(150);
						imgV1.setTranslateX(460);
						imgV1.setFitHeight(200);
						imgV1.setFitWidth(200);

						root6.getChildren().addAll(imgV1);

						Button btn1 = new Button("Shop"); 
						btn1.setPrefSize(130,30);
						btn1.setTranslateY(280);
						btn1.setTranslateX(480);
						btn1.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(5), Insets.EMPTY)));
						btn1.setTextFill(Color.BLACK);
						btn1.setFont(new Font("Arial", 20));
						root6.getChildren().addAll(btn1);

						btn1.setOnAction(l223->{
							FlowPane root64 = new FlowPane();
							root64.setPadding(new Insets(15, 15, 15, 15));
							root64.setHgap(10);
							root64.setVgap(10);
							ObservableList fControl = root64.getChildren();
							Image Photo4 = new Image("C:\\Users\\DELL\\Desktop\\MArt.jpg", 150, 150, true, true);
							ImageView image4 = new ImageView(Photo);
							image4.setTranslateY(-40);
							image4.setTranslateX(-10);
							root64.getChildren().addAll(image4);


							Label newC7 = new Label("Clothes Product");
							newC7.setTranslateY(-10);
							newC7.setTranslateX(65);
							newC7.setFont(new Font("Arial", 25));
							fControl.add(newC7);

							Image img67 = new Image("C:\\Users\\DELL\\Desktop\\Leather jacket.jpg", 100, 100, true, true);
							ImageView imgV67 = new ImageView(img67);
							imgV67.setTranslateY(100);
							imgV67.setTranslateX(150);
							imgV67.setFitHeight(140);
							imgV67.setFitWidth(110);

							fControl.add(imgV67);

							Button btn5 = new Button("Buy It"); 
							btn5.setPrefSize(60,20);
							btn5.setTranslateY(210);
							btn5.setTranslateX(55);
							btn5.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
							btn5.setTextFill(Color.WHITE);
							fControl.add(btn5);

							btn5.setOnAction(e -> {
								String Insert = "Insert into TempProduct(ProductName,Price)" + "VALUES ('Black leather jacket 60$',60);";
								String Update = "UPDATE product SET Quantity = Quantity - 1 WHERE ProductName = 'Black leather jacket 60$';";
								String Quantity = "select Quantity FROM product where ProductName = 'Black leather jacket 60$';";
								Statement stm1;

								Statement stm;
								try {
									Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625"); 
									stm =con3.createStatement();
									int quantity=0;
									Statement st = con3.createStatement();
									ResultSet QuantityResult = st.executeQuery(Quantity);

									while(QuantityResult.next())
									{
										quantity = QuantityResult.getInt(1);
									}

									if(quantity > 0)
									{
										stm.executeUpdate(Insert);
										stm1 = con3.createStatement();
										stm1.executeUpdate(Update);
										con3.close();
									}
									else
									{
										btn5.setText("out of stock");
									}
								} catch (SQLException e1) {
									e1.printStackTrace();
								}
							});

							Image img11 = new Image("C:\\Users\\DELL\\Desktop\\Tring.jpg", 100, 100, true, true);
							ImageView imgV11 = new ImageView(img11);
							imgV11.setTranslateY(100);
							imgV11.setTranslateX(-260);
							imgV11.setFitHeight(130);
							imgV11.setFitWidth(110);

							fControl.add(imgV11);

							Button btn14 = new Button("Buy It"); 
							btn14.setPrefSize(60,20);
							btn14.setTranslateY(205);
							btn14.setTranslateX(-350);
							btn14.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
							btn14.setTextFill(Color.WHITE);
							fControl.add(btn14);

							btn14.setOnAction(e -> {
								String Insert = "Insert into TempProduct(ProductName,Price)" + "VALUES ('Training for girls 30$',30);";
								String Update = "UPDATE product SET Quantity = Quantity - 1 WHERE ProductName = 'Training for girls 30$';";
								String Quantity = "select Quantity FROM product where ProductName = 'Training for girls 30$';";

								Statement stm1;

								Statement stm;
								try {
									Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625"); 
									stm =con3.createStatement();
									int quantity=0;
									Statement st = con3.createStatement();
									ResultSet QuantityResult = st.executeQuery(Quantity);

									while(QuantityResult.next())
									{
										quantity = QuantityResult.getInt(1);
									}

									if(quantity > 0)
									{
										stm.executeUpdate(Insert);
										stm1 = con3.createStatement();
										stm1.executeUpdate(Update);
										con3.close();
									}
									else
									{
										btn14.setText("out of stock");
									}
								} catch (SQLException e1) {
									e1.printStackTrace();
								}
							});

							Image img2 = new Image("C:\\Users\\DELL\\Desktop\\White shirt.jpg", 100, 100, true, true);
							ImageView imgV2 = new ImageView(img2);
							imgV2.setTranslateY(-50);
							imgV2.setTranslateX(70);
							imgV2.setFitHeight(140);
							imgV2.setFitWidth(130);
							fControl.add(imgV2);

							Button btn2 = new Button("Buy It"); 
							btn2.setPrefSize(60,20);
							btn2.setTranslateY(55);
							btn2.setTranslateX(-52);
							btn2.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
							btn2.setTextFill(Color.WHITE);
							fControl.add(btn2);

							btn2.setOnAction(e -> {
								String Insert = "Insert into TempProduct(ProductName,Price)" + "VALUES ('White Reebok blouse 50$',50);";
								String Update = "UPDATE product SET Quantity = Quantity - 1 WHERE ProductName = 'White Reebok blouse 50$';";
								String Quantity = "select Quantity FROM product where ProductName = 'White Reebok blouse 50$';";

								Statement stm1;
								Statement stm;
								try {
									Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625"); 
									stm =con3.createStatement();
									int quantity=0;
									Statement st = con3.createStatement();
									ResultSet QuantityResult = st.executeQuery(Quantity);

									while(QuantityResult.next())
									{
										quantity = QuantityResult.getInt(1);
									}

									if(quantity > 0)
									{
										stm.executeUpdate(Insert);
										stm1 = con3.createStatement();
										stm1.executeUpdate(Update);
										con3.close();
									}
									else
									{
										btn2.setText("out of stock");
									}
								} catch (SQLException e1) {
									e1.printStackTrace();
								}
							});

							Image img3 = new Image("C:\\Users\\DELL\\Desktop\\pink jacket.jpg", 100, 100, true, true);
							ImageView imgV3 = new ImageView(img3);
							imgV3.setTranslateY(170);
							imgV3.setTranslateX(300);
							imgV3.setFitHeight(140);
							imgV3.setFitWidth(130);

							fControl.add(imgV3);

							Image img4 = new Image("C:\\Users\\DELL\\Desktop\\Jeans.jpg", 100, 100, true, true);
							ImageView imgV4 = new ImageView(img4);
							imgV4.setTranslateY(170);
							imgV4.setTranslateX(-70);
							imgV4.setFitHeight(140);
							imgV4.setFitWidth(130);

							fControl.add(imgV4);

							Image img5 = new Image("C:\\Users\\DELL\\Desktop\\brown jacket.jpg", 100, 100, true, true);
							ImageView imgV5 = new ImageView(img5);
							imgV5.setTranslateY(170);
							imgV5.setTranslateX(-420);
							imgV5.setFitHeight(140);
							imgV5.setFitWidth(130);

							fControl.add(imgV5);


							Label lbl = new Label("Black leather jacket 60$");
							lbl.setTranslateY(35);
							lbl.setTranslateX(-95);
							lbl.setFont(new Font("Arial", 10));
							fControl.add(lbl);

							Button btn3= new Button("Buy It"); 
							btn3.setPrefSize(60,20);
							btn3.setTranslateY(190);
							btn3.setTranslateX(520);
							btn3.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
							btn3.setTextFill(Color.WHITE);
							fControl.add(btn3);

							btn3.setOnAction(e -> {
								String Insert = "Insert into TempProduct(ProductName,Price)" + "VALUES ('Pink jacket for children 25$',25);";
								String Update = "UPDATE product SET Quantity = Quantity - 1 WHERE ProductName = 'Pink jacket for children 25$';";
								String Quantity = "select Quantity FROM product where ProductName = 'Pink jacket for children 25$';";

								Statement stm1;

								Statement stm;
								try {
									int quantity=0;
									Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625"); 
									stm =con3.createStatement();

									Statement st = con3.createStatement();
									ResultSet QuantityResult = st.executeQuery(Quantity);

									while(QuantityResult.next())
									{
										quantity = QuantityResult.getInt(1);
									}

									if(quantity > 0)
									{
										stm.executeUpdate(Insert);
										stm1 = con3.createStatement();
										stm1.executeUpdate(Update);
										con3.close();
									}
									else
									{
										btn3.setText("out of stock");
									}
								} catch (SQLException e1) {
									e1.printStackTrace();
								}
							});

							Label lbl1 = new Label("Traning for girls 30$");
							lbl1.setTranslateY(-60);
							lbl1.setTranslateX(200);
							lbl1.setFont(new Font("Arial", 10));
							fControl.add(lbl1);

							Label lbl2 = new Label("White Reebok blouse 50$");
							lbl2.setTranslateY(-60);
							lbl2.setTranslateX(-130);
							lbl2.setFont(new Font("Arial", 10));
							fControl.add(lbl2);

							Label lbl3 = new Label("Black jeans for girls 25$");
							lbl3.setTranslateY(170);
							lbl3.setTranslateX(-35);
							lbl3.setFont(new Font("Arial", 10));
							fControl.add(lbl3);


							Button btn4= new Button("Buy It"); 
							btn4.setPrefSize(60,20);
							btn4.setTranslateY(200);
							btn4.setTranslateX(-135);
							btn4.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
							btn4.setTextFill(Color.WHITE);
							fControl.add(btn4);

							btn4.setOnAction(e -> {
								String Insert = "Insert into TempProduct(ProductName,Price)" + "VALUES ('Black jeans for girls 25$',25);";
								String Update = "UPDATE product SET Quantity = Quantity - 1 WHERE ProductName = 'Black jeans for girls 25$';";
								String Quantity = "select Quantity FROM product where ProductName = 'Black jeans for girls 25$';";
								Statement stm1;
								Statement stm;
								try {
									int quantity =0;
									Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625"); 
									stm =con3.createStatement();
									Statement st = con3.createStatement();
									ResultSet QuantityResult = st.executeQuery(Quantity);

									while(QuantityResult.next())
									{
										quantity = QuantityResult.getInt(1);
									}

									if(quantity > 0)
									{
										stm.executeUpdate(Insert);
										stm1 = con3.createStatement();

										stm1.executeUpdate(Update);
										con3.close();
									}
									else {
										btn4.setText("out of stock");
									}
								} catch (SQLException e1) {
									e1.printStackTrace();
								}
							});

							Label lbl4 = new Label("Pink jacket for children 25$");
							lbl4.setTranslateY(170);
							lbl4.setTranslateX(5);
							lbl4.setFont(new Font("Arial", 10));
							fControl.add(lbl4);


							Label lbl5 = new Label("Brown leather jacket 50$");
							lbl5.setTranslateY(170);
							lbl5.setTranslateX(-540);
							lbl5.setFont(new Font("Arial", 10));
							fControl.add(lbl5);

							Button btn57= new Button("Buy It"); 
							btn57.setPrefSize(60,20);
							btn57.setTranslateY(160);
							btn57.setTranslateX(50);
							btn57.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
							btn57.setTextFill(Color.WHITE);
							fControl.add(btn57);
							Button cart = new Button("cart");
							cart.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
							cart.setFont(new Font("Arial", 20));



							btn57.setOnAction(e -> {//move product to cart 
								int quantity=0;
								String Quantity = "select Quantity FROM product where ProductName = 'Brown leather jacket 50';";
								String Insert = "Insert into TempProduct(ProductName,Price)" + "VALUES ('Brown leather jacket 50',50);";
								String Update = "UPDATE product SET Quantity = Quantity - 1 WHERE ProductName = 'Brown leather jacket 50';";
								Statement stm1;

								Statement stm;
								try {
									Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625"); 
									Statement st = con3.createStatement();
									ResultSet QuantityResult = st.executeQuery(Quantity);

									while(QuantityResult.next())
									{
										quantity = QuantityResult.getInt(1);
									}
									if(quantity > 0)
									{
										stm =con3.createStatement();
										stm.executeUpdate(Insert);
										stm1 = con3.createStatement();
										stm1.executeUpdate(Update);


										con3.close();
									}
									else
									{
										btn57.setText("out of stock");
									}
								} catch (SQLException e1) {
									e1.printStackTrace();
								}
							});

							cart.setTextFill(Color.WHITE);
							cart.setTranslateY(-300); //285
							cart.setTranslateX(500); //520
							cart.setPrefSize(80, 25);
							fControl.add(cart);

							String productsresult="";

							cart.setOnAction(e->{ //login cart
								//Dealing with SQL | Inserting into cart 



								//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
								GridPane rooto = new GridPane();
								rooto.setPadding(new Insets(15, 15, 15, 15));
								TextArea areatxt = new TextArea(" ");
								areatxt.setTranslateX(35);
								areatxt.setTranslateY(110);
								areatxt.setPrefSize(800, 400);

								//Button 
								Button Order = new Button("Order");
								Order.setTranslateX(150);
								Order.setTranslateY(-180);

								Label label = new Label("Enter the product id to remove the product");
								label.setTranslateX(150);
								label.setTranslateY(500);

								TextField tx = new TextField("id");
								tx.setTranslateX(200);
								tx.setTranslateY(500);

								Button RemoveProduct = new Button("Remove Product");
								RemoveProduct.setTranslateX(350);
								RemoveProduct.setTranslateY(550);

								RemoveProduct.setBackground(
										new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
								RemoveProduct.setTextFill(Color.WHITE);

								Order.setBackground(
										new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
								Order.setTextFill(Color.WHITE);



								rooto.getChildren().addAll(label,tx,RemoveProduct);

								RemoveProduct.setOnAction(e2 ->{
									try {
										String DeleteProduct = "delete from TempProduct WHERE PRODUCT_ID="+ Integer.parseInt(tx.getText()) +";";
										Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625");
										Statement stmt10=con3.createStatement();

										stmt10.executeUpdate(DeleteProduct);

										int numofproducts = 0;
										int totalprice = 0;

										Statement stmt=con3.createStatement();
										Statement stmt1=con3.createStatement();
										ResultSet NumOfProductsResult=stmt.executeQuery("select count(product_ID) FROM TempProduct;"); 
										ResultSet TotalPriceResult=stmt1.executeQuery("select sum(Price) from TempProduct;");

										while(NumOfProductsResult.next())
										{
											numofproducts = NumOfProductsResult.getInt(1);
										}
										while(TotalPriceResult.next()) 
										{
											totalprice = TotalPriceResult.getInt(1);
										}
										Statement stm; 
										String InsertCart = "INSERT INTO cart(NumOfProducts,TotalPrice) VALUES ("+numofproducts+"," +totalprice+");";
										stm =con3.createStatement();
										stm.executeUpdate(InsertCart);

										//printing products selected by the customer

										Statement stmt2=con.createStatement();
										ResultSet rs=stmt.executeQuery("select * from Tempproduct;"); 

										areatxt.appendText("\n----------\nNew Order:");
										while(rs.next())
										{

											String productName = rs.getString("ProductName");
											int price = rs.getInt("Price");
											int productID = rs.getInt("Product_ID");
											areatxt.appendText("Product ID:"+ productID +" Product Name: " + productName + " Price: " + price + "\n");
										}
										areatxt.appendText("Number of products: " + numofproducts + "\nTotal Price: " + totalprice);
										con3.close();

									} catch (SQLException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}

								});

								rooto.getChildren().add(Order);
								Scene sceneo = new Scene(rooto, 900, 600);
								Stage o=new Stage();
								o.setMaximized(true);
								rooto.getChildren().add(areatxt);
								sceneo.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
								sceneo.setFill(Color.WHITE);
								o.setScene(sceneo);
								o.show();


								try {
									Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625");
									int numofproducts = 0;
									int totalprice = 0;

									Statement stmt=con3.createStatement();
									Statement stmt1=con3.createStatement();
									ResultSet NumOfProductsResult=stmt.executeQuery("select count(product_ID) FROM TempProduct;"); 
									ResultSet TotalPriceResult=stmt1.executeQuery("select sum(Price) from TempProduct;");

									while(NumOfProductsResult.next())
									{
										numofproducts = NumOfProductsResult.getInt(1);
									}
									while(TotalPriceResult.next()) 
									{
										totalprice = TotalPriceResult.getInt(1);
									}
									Statement stm; 
									String InsertCart = "INSERT INTO cart(NumOfProducts,TotalPrice) VALUES ("+numofproducts+"," +totalprice+");";
									stm =con3.createStatement();
									stm.executeUpdate(InsertCart);

									//printing products selected by the customer

									Statement stmt2=con.createStatement();
									ResultSet rs=stmt.executeQuery("select * from Tempproduct;"); 

									while(rs.next())
									{

										String productName = rs.getString("ProductName");
										int price = rs.getInt("Price");
										int productID = rs.getInt("Product_ID");
										areatxt.appendText("Product ID:"+ productID +" Product Name: " + productName + " Price: " + price + "\n");
									}
									areatxt.appendText("Number of products: " + numofproducts + "\nTotal Price: " + totalprice);
									con3.close();
								} catch (SQLException e1) {
									e1.printStackTrace();
								}

								Order.setOnAction(e122 -> {
									String deleteproducts = "delete from tempproduct;";
									try {
										Connection con4=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625");

										int numofproducts = 0;
										int totalprice = 0;

										Statement stmt=con4.createStatement();
										Statement stmt1=con4.createStatement();
										ResultSet NumOfProductsResult=stmt.executeQuery("select count(product_ID) FROM TempProduct;"); 
										ResultSet TotalPriceResult=stmt1.executeQuery("select sum(Price) from TempProduct;");

										while(NumOfProductsResult.next())
										{
											numofproducts = NumOfProductsResult.getInt(1);
										}
										while(TotalPriceResult.next())  
										{
											totalprice = TotalPriceResult.getInt(1);
										}


										//inserting into orders table
										String insertintoorder = "insert into Orders_sold(Customer_ID,TotalPrice,Num_OF_Products) "
												+ "values(" + CustomerID +"," + totalprice +","+ numofproducts +");";
										Statement st = con4.createStatement();
										st.executeUpdate(insertintoorder);


										//deleting everything from tempproduct table
										Statement stm = con4.createStatement();
										stm.executeUpdate(deleteproducts);

										con4.close();
									} catch (SQLException e2) {
										e2.printStackTrace();
									}
								});



							});

							Stage s116=new Stage();
							Scene scene6 = new Scene(root64, 800, 600 , Color.WHITE);

							scene6.getStylesheets().add(getClass().getResource("application.css").toExternalForm());



							s116.setScene(scene6);
							s116.show();

						});

						Stage s116=new Stage();
						Scene scene6 = new Scene(root6, 800, 600 , Color.WHITE);

						scene6.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
						s116.setScene(scene6);
						s116.show();
					});
				});


				log.setOnAction(l111 -> { // Customer log in button start 

					//getting Customer Id from its name
					CustomerName = S11.getText();
					try {
						Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625"); 
						Statement stat = con2.createStatement();
						ResultSet GetID = stat.executeQuery("select Customer_ID from customer where Customer_Name ='"+ CustomerName + "';");
						while(GetID.next())  
						{
							CustomerID = GetID.getInt(1);
						}
					}catch(Exception e)
					{
						e.printStackTrace();
					}



					String verifylogin = "SELECT count(1) FROM customer WHERE Customer_Name = '" + S11.getText() + "' AND Customer_Password = '" + l11.getText() + "'"; //string to check valid login

					Statement statement;
					try {
						Connection con2=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625"); 
						statement = con2.createStatement();
						ResultSet result = statement.executeQuery(verifylogin);

						while(result.next())
						{
							if(result.getInt(1) >= 1)
							{
								CustLoginflag = 1;
							}
						}
						con2.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}

					if(CustLoginflag == 1)
					{
						GridPane root6=new GridPane();
						root6.setPadding(new Insets(15, 15, 15, 15));
						root6.setHgap(10);
						root6.setVgap(10);

						Image Photo = new Image("C:\\Users\\DELL\\Desktop\\MArt.jpg", 150, 150, true, true);
						ImageView image = new ImageView(Photo);
						image.setTranslateY(-40);
						image.setTranslateX(-10);
						image.setFitHeight(50);
						image.setFitWidth(100);
						root6.getChildren().addAll(image);


						Image img = new Image("C:\\Users\\DELL\\Desktop\\Watch1.jpg", 100, 100, true, true);
						ImageView imgV = new ImageView(img);
						imgV.setTranslateY(150);
						imgV.setTranslateX(200);
						imgV.setFitHeight(200);
						imgV.setFitWidth(200);

						root6.getChildren().add(imgV);

						Button btn = new Button("Shop"); 
						btn.setPrefSize(130,30);
						btn.setTranslateY(280);
						btn.setTranslateX(220);
						btn.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(5), Insets.EMPTY)));
						btn.setTextFill(Color.BLACK);
						btn.setFont(new Font("Arial", 20));
						root6.getChildren().addAll(btn);
						btn.setOnAction(c->{ //watches screen
							FlowPane rootcq = new FlowPane();
							rootcq.setPadding(new Insets(15, 15, 15, 15));
							rootcq.setHgap(10);
							rootcq.setVgap(10);
							ObservableList fControlcq = rootcq.getChildren();
							Image Photocq = new Image("C:\\\\Users\\\\DELL\\\\Desktop\\\\MArt.jpg", 150, 150, true, true);
							ImageView imagecq = new ImageView(Photocq);
							imagecq.setTranslateY(-40);
							imagecq.setTranslateX(-10);
							rootcq.getChildren().addAll(imagecq);

							Button Backh = new Button("cart");
							Backh.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
							Backh.setFont(new Font("Arial", 20));

							Backh.setTextFill(Color.WHITE);
							Backh.setTranslateY(10);
							Backh.setTranslateX(-167);
							Backh.setPrefSize(80, 25);

							fControlcq.add(Backh);
							Backh.setOnAction(e->{ //login cart
								//Dealing with SQL | Inserting into cart 



								//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
								GridPane rooto = new GridPane();
								rooto.setPadding(new Insets(15, 15, 15, 15));
								TextArea areatxt = new TextArea(" ");
								areatxt.setTranslateX(35);
								areatxt.setTranslateY(110);
								areatxt.setPrefSize(800, 400);

								//Button 
								Button Order = new Button("Order");
								Order.setTranslateX(150);
								Order.setTranslateY(-180);

								Label label = new Label("Enter the product id to remove the product");
								label.setTranslateX(150);
								label.setTranslateY(500);

								TextField tx = new TextField("id");
								tx.setTranslateX(200);
								tx.setTranslateY(500);

								Button RemoveProduct = new Button("Remove Product");
								RemoveProduct.setTranslateX(350);
								RemoveProduct.setTranslateY(550);

								RemoveProduct.setBackground(
										new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
								RemoveProduct.setTextFill(Color.WHITE);

								Order.setBackground(
										new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
								Order.setTextFill(Color.WHITE);



								rooto.getChildren().addAll(label,tx,RemoveProduct);

								RemoveProduct.setOnAction(e2 ->{
									try {
										String DeleteProduct = "delete from TempProduct WHERE PRODUCT_ID="+ Integer.parseInt(tx.getText()) +";";
										Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625");
										Statement stmt10=con3.createStatement();

										stmt10.executeUpdate(DeleteProduct);

										int numofproducts = 0;
										int totalprice = 0;

										Statement stmt=con3.createStatement();
										Statement stmt1=con3.createStatement();
										ResultSet NumOfProductsResult=stmt.executeQuery("select count(product_ID) FROM TempProduct;"); 
										ResultSet TotalPriceResult=stmt1.executeQuery("select sum(Price) from TempProduct;");

										while(NumOfProductsResult.next())
										{
											numofproducts = NumOfProductsResult.getInt(1);
										}
										while(TotalPriceResult.next()) 
										{
											totalprice = TotalPriceResult.getInt(1);
										}
										Statement stm; 
										String InsertCart = "INSERT INTO cart(NumOfProducts,TotalPrice) VALUES ("+numofproducts+"," +totalprice+");";
										stm =con3.createStatement();
										stm.executeUpdate(InsertCart);

										//printing products selected by the customer

										Statement stmt2=con.createStatement();
										ResultSet rs=stmt.executeQuery("select * from Tempproduct;"); 

										areatxt.appendText("\n----------\nNew Order:");
										while(rs.next())
										{

											String productName = rs.getString("ProductName");
											int price = rs.getInt("Price");
											int productID = rs.getInt("Product_ID");
											areatxt.appendText("Product ID:"+ productID +" Product Name: " + productName + " Price: " + price + "\n");
										}
										areatxt.appendText("Number of products: " + numofproducts + "\nTotal Price: " + totalprice);
										con3.close();

									} catch (SQLException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}

								});

								rooto.getChildren().add(Order);
								Scene sceneo = new Scene(rooto, 900, 600);
								Stage o=new Stage();
								o.setMaximized(true);
								rooto.getChildren().add(areatxt);
								sceneo.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
								sceneo.setFill(Color.WHITE);
								o.setScene(sceneo);
								o.show();


								try {
									Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625");
									int numofproducts = 0;
									int totalprice = 0;

									Statement stmt=con3.createStatement();
									Statement stmt1=con3.createStatement();
									ResultSet NumOfProductsResult=stmt.executeQuery("select count(product_ID) FROM TempProduct;"); 
									ResultSet TotalPriceResult=stmt1.executeQuery("select sum(Price) from TempProduct;");

									while(NumOfProductsResult.next())
									{
										numofproducts = NumOfProductsResult.getInt(1);
									}
									while(TotalPriceResult.next()) 
									{
										totalprice = TotalPriceResult.getInt(1);
									}
									Statement stm; 
									String InsertCart = "INSERT INTO cart(NumOfProducts,TotalPrice) VALUES ("+numofproducts+"," +totalprice+");";
									stm =con3.createStatement();
									stm.executeUpdate(InsertCart);

									//printing products selected by the customer

									Statement stmt2=con.createStatement();
									ResultSet rs=stmt.executeQuery("select * from Tempproduct;"); 

									while(rs.next())
									{

										String productName = rs.getString("ProductName");
										int price = rs.getInt("Price");
										int productID = rs.getInt("Product_ID");
										areatxt.appendText("Product ID:"+ productID +" Product Name: " + productName + " Price: " + price + "\n");
									}
									areatxt.appendText("Number of products: " + numofproducts + "\nTotal Price: " + totalprice);
									con3.close();
								} catch (SQLException e1) {
									e1.printStackTrace();
								}

								Order.setOnAction(e122 -> {
									String deleteproducts = "delete from tempproduct;";
									try {
										Connection con4=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625");

										int numofproducts = 0;
										int totalprice = 0;

										Statement stmt=con4.createStatement();
										Statement stmt1=con4.createStatement();
										ResultSet NumOfProductsResult=stmt.executeQuery("select count(product_ID) FROM TempProduct;"); 
										ResultSet TotalPriceResult=stmt1.executeQuery("select sum(Price) from TempProduct;");

										while(NumOfProductsResult.next())
										{
											numofproducts = NumOfProductsResult.getInt(1);
										}
										while(TotalPriceResult.next())  
										{
											totalprice = TotalPriceResult.getInt(1);
										}


										//inserting into orders table
										String insertintoorder = "insert into Orders_sold(Customer_ID,TotalPrice,Num_OF_Products) "
												+ "values(" + CustomerID +"," + totalprice +","+ numofproducts +");";
										Statement st = con4.createStatement();
										st.executeUpdate(insertintoorder);


										//deleting everything from tempproduct table
										Statement stm = con4.createStatement();
										stm.executeUpdate(deleteproducts);

										con4.close();
									} catch (SQLException e2) {
										e2.printStackTrace();
									}
								});



							});

							Label newC = new Label("Department of watches");
							newC.setTranslateY(-10);
							newC.setTranslateX(65);
							newC.setFont(new Font("Arial", 18));
							fControlcq.add(newC);

							Image imgq = new Image("C:\\\\Users\\\\DELL\\\\Desktop\\\\Watch2.jpg", 100, 100, true, true);
							ImageView imgVq= new ImageView(imgq);
							imgVq.setTranslateY(100);
							imgVq.setTranslateX(-80);
							imgVq.setFitHeight(130);
							imgVq.setFitWidth(115);

							fControlcq.add(imgVq);

							Button btnq = new Button("Buy It");//womens watch $30 --> should be mens watch 30 
							btnq.setPrefSize(60,20);
							btnq.setTranslateY(210);
							btnq.setTranslateX(55);
							btnq.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
							btnq.setTextFill(Color.WHITE);
							fControlcq.add(btnq);


							btnq.setOnAction(e -> {//move product to cart
								String Quantity = "select Quantity FROM product where ProductName = 'womens watch $30';";
								String Insert = "Insert into TempProduct(ProductName,Price)" + "VALUES ('womens watch $30',30);";
								String Update = "UPDATE product SET Quantity = Quantity - 1 WHERE ProductName = 'womens watch $30';";
								Statement stm1;
								Statement stm;
								try {
									int quantity=0;
									Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625"); 
									Statement st = con3.createStatement();
									stm =con3.createStatement(); 
									ResultSet QuantityResult = st.executeQuery(Quantity);

									while(QuantityResult.next())
									{
										quantity = QuantityResult.getInt(1);
									}
									if(quantity > 0)
									{
										stm.executeUpdate(Insert);
										stm1 = con3.createStatement();
										stm1.executeUpdate(Update);
										con3.close();
									}
									else {
										btnq.setText("out of stock");
									}
								} catch (SQLException e1) {
									e1.printStackTrace();
								}
							});

							Image img1 = new Image("C:\\\\Users\\\\DELL\\\\Desktop\\\\watch3.jpg", 100, 100, true, true);
							ImageView imgV1 = new ImageView(img1);
							imgV1.setTranslateY(100);
							imgV1.setTranslateX(-50);
							imgV1.setFitHeight(130);
							imgV1.setFitWidth(125);

							fControlcq.add(imgV1);

							Button btn1 = new Button("Buy It"); //mens watch $35
							btn1.setPrefSize(60,20);
							btn1.setTranslateY(60);
							btn1.setTranslateX(395);
							btn1.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
							btn1.setTextFill(Color.WHITE);
							fControlcq.add(btn1);

							btn1.setOnAction(e -> {//move product to cart 
								String Quantity = "select Quantity FROM product where ProductName = 'mens watch $35';";
								String Insert = "Insert into TempProduct(ProductName,Price)" + "VALUES ('mens watch $35',35);";
								String Update = "UPDATE product SET Quantity = Quantity - 1 WHERE ProductName = 'mens watch $35';";
								Statement stm1;

								Statement stm;
								try {
									int quantity=0;
									Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625"); 
									Statement st = con3.createStatement();
									ResultSet QuantityResult = st.executeQuery(Quantity);
									stm =con3.createStatement();

									while(QuantityResult.next())
									{
										quantity = QuantityResult.getInt(1);
									}
									if(quantity > 0)
									{
										stm.executeUpdate(Insert);
										stm1 = con3.createStatement();
										stm1.executeUpdate(Update);
										con3.close();
									}
									else {
										btn1.setText("out of stock");
									}
								} catch (SQLException e1) {
									e1.printStackTrace();
								}
							});


							Image img2 = new Image("C:\\\\Users\\\\DELL\\\\Desktop\\\\watch4.jpg", 100, 100, true, true);
							ImageView imgV2 = new ImageView(img2);
							imgV2.setTranslateY(-50);
							imgV2.setTranslateX(70);
							imgV2.setFitHeight(130);
							imgV2.setFitWidth(130);
							fControlcq.add(imgV2);

							Button btn2 = new Button("Buy It");  //mens watch $50
							btn2.setPrefSize(60,20);
							btn2.setTranslateY(60);
							btn2.setTranslateX(-41);
							btn2.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
							btn2.setTextFill(Color.WHITE);
							fControlcq.add(btn2);
							Image img3 = new Image("C:\\\\Users\\\\DELL\\\\Desktop\\\\watch5.jpg", 100, 100, true, true);
							ImageView imgV3 = new ImageView(img3);
							imgV3.setTranslateY(170);
							imgV3.setTranslateX(300);
							imgV3.setFitHeight(140);
							imgV3.setFitWidth(130);

							btn2.setOnAction(e -> {//move product to cart 
								String Quantity = "select Quantity FROM product where ProductName = 'mens watch $50';";
								String Insert = "Insert into TempProduct(ProductName,Price)" + "VALUES ('mens watch $50',50);";
								String Update = "UPDATE product SET Quantity = Quantity - 1 WHERE ProductName = 'mens watch $50';";
								Statement stm1;
								Statement stm;
								try {
									int quantity=0;

									Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625"); 
									Statement st = con3.createStatement();
									ResultSet QuantityResult = st.executeQuery(Quantity);

									while(QuantityResult.next())
									{
										quantity = QuantityResult.getInt(1);
									}
									if(quantity > 0)
									{
										stm =con3.createStatement();
										stm.executeUpdate(Insert);
										stm1 = con3.createStatement();
										stm1.executeUpdate(Update);
										con3.close();
									}
									else
									{
										btn2.setText("out of stock");
									}
								} catch (SQLException e1) {
									e1.printStackTrace();
								}

							});


							fControlcq.add(imgV3);
							Image img4 = new Image("C:\\\\Users\\\\DELL\\\\Desktop\\\\watch6.jpg", 100, 100, true, true);
							ImageView imgV4 = new ImageView(img4);
							imgV4.setTranslateY(170);
							imgV4.setTranslateX(-70);
							imgV4.setFitHeight(140);
							imgV4.setFitWidth(130);

							fControlcq.add(imgV4);

							Image img5 = new Image("C:\\\\Users\\\\DELL\\\\Desktop\\\\watch1.jpg", 100, 100, true, true);
							ImageView imgV5 = new ImageView(img5);
							imgV5.setTranslateY(170);
							imgV5.setTranslateX(-420);
							imgV5.setFitHeight(120);
							imgV5.setFitWidth(155);

							fControlcq.add(imgV5);


							Label lbl = new Label("Men's watch $30");
							lbl.setTranslateY(-55);
							lbl.setTranslateX(620);
							lbl.setFont(new Font("Arial", 10));
							fControlcq.add(lbl);

							Button btn3= new Button("Buy It");  //mens watch $30
							btn3.setPrefSize(60,20);
							btn3.setTranslateY(195);
							btn3.setTranslateX(530);
							btn3.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
							btn3.setTextFill(Color.WHITE);
							fControlcq.add(btn3);

							btn3.setOnAction(e -> {//move product to cart 
								String Quantity = "select Quantity FROM product where ProductName = 'Mens watch $30';";
								String Insert = "Insert into TempProduct(ProductName,Price)" + "VALUES ('mens watch $30',30);";
								String Update = "UPDATE product SET Quantity = Quantity - 1 WHERE ProductName = 'mens watch $30';";
								Statement stm1;


								Statement stm;
								try {
									int quantity=0;

									Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625"); 
									Statement st = con3.createStatement();
									ResultSet QuantityResult = st.executeQuery(Quantity);

									while(QuantityResult.next())
									{
										quantity = QuantityResult.getInt(1);
									}
									if(quantity > 0)
									{
										stm =con3.createStatement();
										stm.executeUpdate(Insert);
										stm1 = con3.createStatement();
										stm1.executeUpdate(Update);
										con3.close();
									}else
									{
										btn3.setText("out of stock!");
									}
								} catch (SQLException e1) {
									e1.printStackTrace();
								}
							});

							Label lbl1 = new Label("Men's watch $35");
							lbl1.setTranslateY(-56);
							lbl1.setTranslateX(230);
							lbl1.setFont(new Font("Arial", 10));
							fControlcq.add(lbl1);

							Label lbl2 = new Label("Men's watch $50");
							lbl2.setTranslateY(-60);
							lbl2.setTranslateX(-75);
							lbl2.setFont(new Font("Arial", 10));
							fControlcq.add(lbl2);

							Label lbl3 = new Label("Men's watch 55$");
							lbl3.setTranslateY(170);
							lbl3.setTranslateX(50);
							lbl3.setFont(new Font("Arial", 10));
							fControlcq.add(lbl3);


							Button btn4= new Button("Buy It"); // //mens watch $70
							btn4.setPrefSize(60,20);
							btn4.setTranslateY(195);
							btn4.setTranslateX(-220);
							btn4.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
							btn4.setTextFill(Color.WHITE);
							fControlcq.add(btn4);

							btn4.setOnAction(e -> {//move product to cart 
								String Quantity = "select Quantity FROM product where ProductName = 'mens watch $70';";
								String Insert = "Insert into TempProduct(ProductName,Price)" + "VALUES ('mens watch $70',70);";
								String Update = "UPDATE product SET Quantity = Quantity - 1 WHERE ProductName = 'mens watch $70';";
								Statement stm1;
								Statement stm;

								try {
									int quantity=0;
									Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625"); 
									Statement st = con3.createStatement();
									ResultSet QuantityResult = st.executeQuery(Quantity);

									while(QuantityResult.next())
									{
										quantity = QuantityResult.getInt(1);
									}
									if(quantity > 0)
									{
										stm =con3.createStatement();
										stm.executeUpdate(Insert);
										stm1 = con3.createStatement();
										stm1.executeUpdate(Update);
										con3.close();

									}
									else {
										btn4.setText("out of stock");
									}
								} catch (SQLException e1) {
									e1.printStackTrace();
								}
							});

							Label lbl4 = new Label("Women's watch $30");
							lbl4.setTranslateY(170);
							lbl4.setTranslateX(115);
							lbl4.setFont(new Font("Arial", 10));
							fControlcq.add(lbl4);


							Label lbl5 = new Label("Men's watch 70$");
							lbl5.setTranslateY(165);
							lbl5.setTranslateX(-395);
							lbl5.setFont(new Font("Arial", 10));
							fControlcq.add(lbl5);

							Button btn5= new Button("Buy It");  //mens watch $55
							btn5.setPrefSize(60,20);
							btn5.setTranslateY(197);
							btn5.setTranslateX(-290);
							btn5.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
							btn5.setTextFill(Color.WHITE);
							fControlcq.add(btn5);

							btn5.setOnAction(e -> {//move product to cart 
								String Quantity = "select Quantity FROM product where ProductName = 'Mens watch 70$';";
								String Insert = "Insert into TempProduct(ProductName,Price)" + "VALUES ('Mens watch 70$',55);";
								String Update = "UPDATE product SET Quantity = Quantity - 1 WHERE ProductName = 'Mens watch 70$';";
								Statement stm1;
								Statement stm;
								try {
									int quantity=0;
									Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625"); 
									Statement st = con3.createStatement();
									ResultSet QuantityResult = st.executeQuery(Quantity);

									while(QuantityResult.next())
									{
										quantity = QuantityResult.getInt(1);
									}
									if(quantity > 0)
									{
										stm =con3.createStatement();
										stm.executeUpdate(Insert);
										stm1 = con3.createStatement();
										stm1.executeUpdate(Update);
										con3.close();
									}
									else {
										btn5.setText("out of stock");
									}
								} catch (SQLException e1) {
									e1.printStackTrace();
								}
							});


							Scene scenev = new Scene(rootcq, 800, 600 , Color.WHITE);
							scenev.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
							Stage cq=new Stage();

							cq.setScene(scenev);
							cq.show();


						});
						Image img1 = new Image("C:\\Users\\DELL\\Desktop\\Leather jacket.jpg", 100, 100, true, true);//on top of the clothe shop button
						ImageView imgV1 = new ImageView(img1);
						imgV1.setTranslateY(150);
						imgV1.setTranslateX(460);
						imgV1.setFitHeight(200);
						imgV1.setFitWidth(200);

						root6.getChildren().addAll(imgV1);

						Button btn1 = new Button("shop"); 
						btn1.setPrefSize(130,30);
						btn1.setTranslateY(280);
						btn1.setTranslateX(480);
						btn1.setBackground(new Background(new BackgroundFill(Color.WHITE, new CornerRadii(5), Insets.EMPTY)));
						btn1.setTextFill(Color.BLACK);
						btn1.setFont(new Font("Arial", 20));
						root6.getChildren().addAll(btn1);

						btn1.setOnAction(l223->{
							FlowPane root64 = new FlowPane();
							root64.setPadding(new Insets(15, 15, 15, 15));
							root64.setHgap(10);
							root64.setVgap(10);
							ObservableList fControl = root64.getChildren();
							Image Photo4 = new Image("C:\\Users\\DELL\\Desktop\\MArt.jpg", 150, 150, true, true);
							ImageView image4 = new ImageView(Photo);
							image4.setTranslateY(-40);
							image4.setTranslateX(-10);
							root64.getChildren().addAll(image4);


							Label newC7 = new Label("Clothes Product");
							newC7.setTranslateY(-10);
							newC7.setTranslateX(65);
							newC7.setFont(new Font("Arial", 25));
							fControl.add(newC7);

							Image img67 = new Image("C:\\Users\\DELL\\Desktop\\Leather jacket.jpg", 100, 100, true, true);
							ImageView imgV67 = new ImageView(img67);
							imgV67.setTranslateY(100);
							imgV67.setTranslateX(150);
							imgV67.setFitHeight(140);
							imgV67.setFitWidth(110);

							fControl.add(imgV67);

							Button btn5 = new Button("Buy It"); 
							btn5.setPrefSize(60,20);
							btn5.setTranslateY(210);
							btn5.setTranslateX(55);
							btn5.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
							btn5.setTextFill(Color.WHITE);
							fControl.add(btn5);

							btn5.setOnAction(e -> {
								String Insert = "Insert into TempProduct(ProductName,Price)" + "VALUES ('Black leather jacket 60$',60);";
								String Update = "UPDATE product SET Quantity = Quantity - 1 WHERE ProductName = 'Black leather jacket 60$';";
								String Quantity = "select Quantity FROM product where ProductName = 'Black leather jacket 60$';";
								Statement stm1;

								Statement stm;
								try {
									Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625"); 
									stm =con3.createStatement();
									int quantity=0;
									Statement st = con3.createStatement();
									ResultSet QuantityResult = st.executeQuery(Quantity);

									while(QuantityResult.next())
									{
										quantity = QuantityResult.getInt(1);
									}

									if(quantity > 0)
									{
										stm.executeUpdate(Insert);
										stm1 = con3.createStatement();
										stm1.executeUpdate(Update);
										con3.close();
									}
									else
									{
										btn5.setText("out of stock");
									}
								} catch (SQLException e1) {
									e1.printStackTrace();
								}
							});

							Image img11 = new Image("C:\\Users\\DELL\\Desktop\\Tring.jpg", 100, 100, true, true);
							ImageView imgV11 = new ImageView(img11);
							imgV11.setTranslateY(100);
							imgV11.setTranslateX(-260);
							imgV11.setFitHeight(130);
							imgV11.setFitWidth(110);

							fControl.add(imgV11);

							Button btn14 = new Button("Buy It"); 
							btn14.setPrefSize(60,20);
							btn14.setTranslateY(205);
							btn14.setTranslateX(-350);
							btn14.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
							btn14.setTextFill(Color.WHITE);
							fControl.add(btn14);

							btn14.setOnAction(e -> {
								String Insert = "Insert into TempProduct(ProductName,Price)" + "VALUES ('Training for girls 30$',30);";
								String Update = "UPDATE product SET Quantity = Quantity - 1 WHERE ProductName = 'Training for girls 30$';";
								String Quantity = "select Quantity FROM product where ProductName = 'Training for girls 30$';";

								Statement stm1;

								Statement stm;
								try {
									Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625"); 
									stm =con3.createStatement();
									int quantity=0;
									Statement st = con3.createStatement();
									ResultSet QuantityResult = st.executeQuery(Quantity);

									while(QuantityResult.next())
									{
										quantity = QuantityResult.getInt(1);
									}

									if(quantity > 0)
									{
										stm.executeUpdate(Insert);
										stm1 = con3.createStatement();
										stm1.executeUpdate(Update);
										con3.close();
									}
									else
									{
										btn14.setText("out of stock");
									}
								} catch (SQLException e1) {
									e1.printStackTrace();
								}
							});

							Image img2 = new Image("C:\\Users\\DELL\\Desktop\\White shirt.jpg", 100, 100, true, true);
							ImageView imgV2 = new ImageView(img2);
							imgV2.setTranslateY(-50);
							imgV2.setTranslateX(70);
							imgV2.setFitHeight(140);
							imgV2.setFitWidth(130);
							fControl.add(imgV2);

							Button btn2 = new Button("Buy It"); 
							btn2.setPrefSize(60,20);
							btn2.setTranslateY(55);
							btn2.setTranslateX(-52);
							btn2.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
							btn2.setTextFill(Color.WHITE);
							fControl.add(btn2);

							btn2.setOnAction(e -> {
								String Insert = "Insert into TempProduct(ProductName,Price)" + "VALUES ('White Reebok blouse 50$',50);";
								String Update = "UPDATE product SET Quantity = Quantity - 1 WHERE ProductName = 'White Reebok blouse 50$';";
								String Quantity = "select Quantity FROM product where ProductName = 'White Reebok blouse 50$';";

								Statement stm1;
								Statement stm;
								try {
									Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625"); 
									stm =con3.createStatement();
									int quantity=0;
									Statement st = con3.createStatement();
									ResultSet QuantityResult = st.executeQuery(Quantity);

									while(QuantityResult.next())
									{
										quantity = QuantityResult.getInt(1);
									}

									if(quantity > 0)
									{
										stm.executeUpdate(Insert);
										stm1 = con3.createStatement();
										stm1.executeUpdate(Update);
										con3.close();
									}
									else
									{
										btn2.setText("out of stock");
									}
								} catch (SQLException e1) {
									e1.printStackTrace();
								}
							});

							Image img3 = new Image("C:\\Users\\DELL\\Desktop\\pink jacket.jpg", 100, 100, true, true);
							ImageView imgV3 = new ImageView(img3);
							imgV3.setTranslateY(170);
							imgV3.setTranslateX(300);
							imgV3.setFitHeight(140);
							imgV3.setFitWidth(130);

							fControl.add(imgV3);

							Image img4 = new Image("C:\\Users\\DELL\\Desktop\\Jeans.jpg", 100, 100, true, true);
							ImageView imgV4 = new ImageView(img4);
							imgV4.setTranslateY(170);
							imgV4.setTranslateX(-70);
							imgV4.setFitHeight(140);
							imgV4.setFitWidth(130);

							fControl.add(imgV4);

							Image img5 = new Image("C:\\Users\\DELL\\Desktop\\brown jacket.jpg", 100, 100, true, true);
							ImageView imgV5 = new ImageView(img5);
							imgV5.setTranslateY(170);
							imgV5.setTranslateX(-420);
							imgV5.setFitHeight(140);
							imgV5.setFitWidth(130);

							fControl.add(imgV5);


							Label lbl = new Label("Black leather jacket 60$");
							lbl.setTranslateY(35);
							lbl.setTranslateX(-95);
							lbl.setFont(new Font("Arial", 10));
							fControl.add(lbl);

							Button btn3= new Button("Buy It"); 
							btn3.setPrefSize(60,20);
							btn3.setTranslateY(190);
							btn3.setTranslateX(520);
							btn3.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
							btn3.setTextFill(Color.WHITE);
							fControl.add(btn3);

							btn3.setOnAction(e -> {
								String Insert = "Insert into TempProduct(ProductName,Price)" + "VALUES ('Pink jacket for children 25$',25);";
								String Update = "UPDATE product SET Quantity = Quantity - 1 WHERE ProductName = 'Pink jacket for children 25$';";
								String Quantity = "select Quantity FROM product where ProductName = 'Pink jacket for children 25$';";

								Statement stm1;

								Statement stm;
								try {
									int quantity=0;
									Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625"); 
									stm =con3.createStatement();

									Statement st = con3.createStatement();
									ResultSet QuantityResult = st.executeQuery(Quantity);

									while(QuantityResult.next())
									{
										quantity = QuantityResult.getInt(1);
									}

									if(quantity > 0)
									{
										stm.executeUpdate(Insert);
										stm1 = con3.createStatement();
										stm1.executeUpdate(Update);
										con3.close();
									}
									else
									{
										btn3.setText("out of stock");
									}
								} catch (SQLException e1) {
									e1.printStackTrace();
								}
							});

							Label lbl1 = new Label("Traning for girls 30$");
							lbl1.setTranslateY(-60);
							lbl1.setTranslateX(200);
							lbl1.setFont(new Font("Arial", 10));
							fControl.add(lbl1);

							Label lbl2 = new Label("White Reebok blouse 50$");
							lbl2.setTranslateY(-60);
							lbl2.setTranslateX(-130);
							lbl2.setFont(new Font("Arial", 10));
							fControl.add(lbl2);

							Label lbl3 = new Label("Black jeans for girls 25$");
							lbl3.setTranslateY(170);
							lbl3.setTranslateX(-35);
							lbl3.setFont(new Font("Arial", 10));
							fControl.add(lbl3);


							Button btn4= new Button("Buy It"); 
							btn4.setPrefSize(60,20);
							btn4.setTranslateY(200);
							btn4.setTranslateX(-135);
							btn4.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
							btn4.setTextFill(Color.WHITE);
							fControl.add(btn4);

							btn4.setOnAction(e -> {
								String Insert = "Insert into TempProduct(ProductName,Price)" + "VALUES ('Black jeans for girls 25$',25);";
								String Update = "UPDATE product SET Quantity = Quantity - 1 WHERE ProductName = 'Black jeans for girls 25$';";
								String Quantity = "select Quantity FROM product where ProductName = 'Black jeans for girls 25$';";
								Statement stm1;
								Statement stm;
								try {
									int quantity =0;
									Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625"); 
									stm =con3.createStatement();
									Statement st = con3.createStatement();
									ResultSet QuantityResult = st.executeQuery(Quantity);

									while(QuantityResult.next())
									{
										quantity = QuantityResult.getInt(1);
									}

									if(quantity > 0)
									{
										stm.executeUpdate(Insert);
										stm1 = con3.createStatement();

										stm1.executeUpdate(Update);
										con3.close();
									}
									else {
										btn4.setText("out of stock");
									}
								} catch (SQLException e1) {
									e1.printStackTrace();
								}
							});

							Label lbl4 = new Label("Pink jacket for children 25$");
							lbl4.setTranslateY(170);
							lbl4.setTranslateX(5);
							lbl4.setFont(new Font("Arial", 10));
							fControl.add(lbl4);


							Label lbl5 = new Label("Brown leather jacket 50$");
							lbl5.setTranslateY(170);
							lbl5.setTranslateX(-540);
							lbl5.setFont(new Font("Arial", 10));
							fControl.add(lbl5);

							Button btn57= new Button("Buy It"); 
							btn57.setPrefSize(60,20);
							btn57.setTranslateY(160);
							btn57.setTranslateX(50);
							btn57.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
							btn57.setTextFill(Color.WHITE);
							fControl.add(btn57);
							Button cart = new Button("cart");
							cart.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
							cart.setFont(new Font("Arial", 20));



							btn57.setOnAction(e -> {//move product to cart 
								int quantity=0;
								String Quantity = "select Quantity FROM product where ProductName = 'Brown leather jacket 50';";
								String Insert = "Insert into TempProduct(ProductName,Price)" + "VALUES ('Brown leather jacket 50',50);";
								String Update = "UPDATE product SET Quantity = Quantity - 1 WHERE ProductName = 'Brown leather jacket 50';";
								Statement stm1;

								Statement stm;
								try {
									Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625"); 
									Statement st = con3.createStatement();
									ResultSet QuantityResult = st.executeQuery(Quantity);

									while(QuantityResult.next())
									{
										quantity = QuantityResult.getInt(1);
									}
									if(quantity > 0)
									{
										stm =con3.createStatement();
										stm.executeUpdate(Insert);
										stm1 = con3.createStatement();
										stm1.executeUpdate(Update);


										con3.close();
									}
									else
									{
										btn57.setText("out of stock");
									}
								} catch (SQLException e1) {
									e1.printStackTrace();
								}
							});

							cart.setTextFill(Color.WHITE);
							cart.setTranslateY(-300); //285
							cart.setTranslateX(500); //520
							cart.setPrefSize(80, 25);
							fControl.add(cart);

							String productsresult="";

							cart.setOnAction(e->{ //login cart
								//Dealing with SQL | Inserting into cart 



								//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
								GridPane rooto = new GridPane();
								rooto.setPadding(new Insets(15, 15, 15, 15));
								TextArea areatxt = new TextArea(" ");
								areatxt.setTranslateX(35);
								areatxt.setTranslateY(110);
								areatxt.setPrefSize(800, 400);

								//Button 
								Button Order = new Button("Order");
								Order.setTranslateX(150);
								Order.setTranslateY(-180);

								Label label = new Label("Enter the product id to remove the product");
								label.setTranslateX(150);
								label.setTranslateY(500);

								TextField tx = new TextField("id");
								tx.setTranslateX(200);
								tx.setTranslateY(500);

								Button RemoveProduct = new Button("Remove Product");
								RemoveProduct.setTranslateX(350);
								RemoveProduct.setTranslateY(550);

								RemoveProduct.setBackground(
										new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
								RemoveProduct.setTextFill(Color.WHITE);

								Order.setBackground(
										new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
								Order.setTextFill(Color.WHITE);



								rooto.getChildren().addAll(label,tx,RemoveProduct);

								RemoveProduct.setOnAction(e2 ->{
									try {
										String DeleteProduct = "delete from TempProduct WHERE PRODUCT_ID="+ Integer.parseInt(tx.getText()) +";";
										Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625");
										Statement stmt10=con3.createStatement();

										stmt10.executeUpdate(DeleteProduct);

										int numofproducts = 0;
										int totalprice = 0;

										Statement stmt=con3.createStatement();
										Statement stmt1=con3.createStatement();
										ResultSet NumOfProductsResult=stmt.executeQuery("select count(product_ID) FROM TempProduct;"); 
										ResultSet TotalPriceResult=stmt1.executeQuery("select sum(Price) from TempProduct;");

										while(NumOfProductsResult.next())
										{
											numofproducts = NumOfProductsResult.getInt(1);
										}
										while(TotalPriceResult.next()) 
										{
											totalprice = TotalPriceResult.getInt(1);
										}
										Statement stm; 
										String InsertCart = "INSERT INTO cart(NumOfProducts,TotalPrice) VALUES ("+numofproducts+"," +totalprice+");";
										stm =con3.createStatement();
										stm.executeUpdate(InsertCart);

										//printing products selected by the customer

										Statement stmt2=con.createStatement();
										ResultSet rs=stmt.executeQuery("select * from Tempproduct;"); 

										areatxt.appendText("\n----------\nNew Order:");
										while(rs.next())
										{

											String productName = rs.getString("ProductName");
											int price = rs.getInt("Price");
											int productID = rs.getInt("Product_ID");
											areatxt.appendText("Product ID:"+ productID +" Product Name: " + productName + " Price: " + price + "\n");
										}
										areatxt.appendText("Number of products: " + numofproducts + "\nTotal Price: " + totalprice);
										con3.close();

									} catch (SQLException e1) {
										// TODO Auto-generated catch block
										e1.printStackTrace();
									}

								});

								rooto.getChildren().add(Order);
								Scene sceneo = new Scene(rooto, 900, 600);
								Stage o=new Stage();
								o.setMaximized(true);
								rooto.getChildren().add(areatxt);
								sceneo.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
								sceneo.setFill(Color.WHITE);
								o.setScene(sceneo);
								o.show();


								try {
									Connection con3=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625");
									int numofproducts = 0;
									int totalprice = 0;

									Statement stmt=con3.createStatement();
									Statement stmt1=con3.createStatement();
									ResultSet NumOfProductsResult=stmt.executeQuery("select count(product_ID) FROM TempProduct;"); 
									ResultSet TotalPriceResult=stmt1.executeQuery("select sum(Price) from TempProduct;");

									while(NumOfProductsResult.next())
									{
										numofproducts = NumOfProductsResult.getInt(1);
									}
									while(TotalPriceResult.next()) 
									{
										totalprice = TotalPriceResult.getInt(1);
									}
									Statement stm; 
									String InsertCart = "INSERT INTO cart(NumOfProducts,TotalPrice) VALUES ("+numofproducts+"," +totalprice+");";
									stm =con3.createStatement();
									stm.executeUpdate(InsertCart);

									//printing products selected by the customer

									Statement stmt2=con.createStatement();
									ResultSet rs=stmt.executeQuery("select * from Tempproduct;"); 

									while(rs.next())
									{

										String productName = rs.getString("ProductName");
										int price = rs.getInt("Price");
										int productID = rs.getInt("Product_ID");
										areatxt.appendText("Product ID:"+ productID +" Product Name: " + productName + " Price: " + price + "\n");
									}
									areatxt.appendText("Number of products: " + numofproducts + "\nTotal Price: " + totalprice);
									con3.close();
								} catch (SQLException e1) {
									e1.printStackTrace();
								}

								Order.setOnAction(e122 -> {
									String deleteproducts = "delete from tempproduct;";
									try {
										Connection con4=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625");

										int numofproducts = 0;
										int totalprice = 0;

										Statement stmt=con4.createStatement();
										Statement stmt1=con4.createStatement();
										ResultSet NumOfProductsResult=stmt.executeQuery("select count(product_ID) FROM TempProduct;"); 
										ResultSet TotalPriceResult=stmt1.executeQuery("select sum(Price) from TempProduct;");

										while(NumOfProductsResult.next())
										{
											numofproducts = NumOfProductsResult.getInt(1);
										}
										while(TotalPriceResult.next())  
										{
											totalprice = TotalPriceResult.getInt(1);
										}


										//inserting into orders table
										String insertintoorder = "insert into Orders_sold(Customer_ID,TotalPrice,Num_OF_Products) "
												+ "values(" + CustomerID +"," + totalprice +","+ numofproducts +");";
										Statement st = con4.createStatement();
										st.executeUpdate(insertintoorder);


										//deleting everything from tempproduct table
										Statement stm = con4.createStatement();
										stm.executeUpdate(deleteproducts);

										con4.close();
									} catch (SQLException e2) {
										e2.printStackTrace();
									}
								});



							});

							Stage s116=new Stage();
							Scene scene6 = new Scene(root64, 800, 600 , Color.WHITE);

							scene6.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
							s116.setScene(scene6);
							s116.show();

						});



						Stage s116=new Stage();
						Scene scene6 = new Scene(root6, 800, 600 , Color.WHITE);

						scene6.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
						s116.setScene(scene6);
						s116.show();


					}
					CustLoginflag=0;
				});


			}); // end of customer button click



			//employee button click start

			S.setOnAction(l61 -> {
				Pane h124 = new Pane();
				GridPane root124 = new GridPane();
				root124.setPadding(new Insets(20));
				root124.setAlignment(Pos.CENTER_LEFT);


				root124.setBackground(new Background(new BackgroundImage(new Image("C:\\Users\\DELL\\Desktop\\ferdous.webp"), null, null,null, null)));

				PrimaryStage.setTitle("online shopping");
				PrimaryStage.setMaximized(true);


				Image image112 = new Image("C:\\Users\\DELL\\Desktop\\MArt.jpg");
				ImageView imagevi40112 = new ImageView();
				imagevi40112.setImage(image112);
				imagevi40112.setFitWidth(500);
				imagevi40112.setFitHeight(800);
				root124.add(imagevi40112, 0, 0);

				Label l124 = new Label("Username:");
				Label l1224 = new Label("New Custemer?   ");
				Label S124 = new Label("Password:");
				TextArea l1124=new TextArea();
				TextArea S1124=new TextArea();
				Button log24 = new Button("Login");
				log24.setOnAction(l111 -> { //log in button clicked 


					String verifylogin1 = "SELECT count(1) FROM manager WHERE Manager_Name = '" + l1124.getText() + "' AND Manager_Password = '" + S1124.getText() + "'"; //string to check valid login

					Statement statement;
					try {
						Connection con4=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625"); 
						statement = con4.createStatement();
						ResultSet resultt = statement.executeQuery(verifylogin1);

						while(resultt.next())
						{
							if(resultt.getInt(1) == 1)
							{
								EmpLoginflag = 1;
							}
						}
						con.close();
					} catch (SQLException e1) {
						e1.printStackTrace();
					}				


					if (EmpLoginflag == 1)
					{

						GridPane rootf = new GridPane();
						rootf.setPadding(new Insets(15, 15, 15, 15));
						TextArea areatxt = new TextArea(" ");
						areatxt.setTranslateX(35);
						areatxt.setTranslateY(110);

						areatxt.setPrefSize(800, 400);
						//label title
						Label MCustomer = new Label("Manage Customer");
						MCustomer.setFont(new Font("Arial", 20));
						MCustomer.setTranslateX(350);
						MCustomer.setTranslateY(-180);
						//Operations label names

						Label LCustomerEmail = new Label("Customer Email");
						LCustomerEmail.setTranslateX(265);
						LCustomerEmail.setTranslateY(-170);
						LCustomerEmail.setFont(new Font("Arial Black", 12));

						Label LCustomerGender = new Label("Customer Gender");
						LCustomerGender.setTranslateX(530);
						LCustomerGender.setTranslateY(-170);
						LCustomerGender.setFont(new Font("Arial Black", 12));

						Label LCustomerAddress = new Label(" Address");
						LCustomerAddress.setTranslateX(650);
						LCustomerAddress.setTranslateY(-170);
						LCustomerAddress.setFont(new Font("Arial Black", 12));

						Label LCustomerDateOfBirth = new Label("Age");
						LCustomerDateOfBirth.setTranslateX(730);
						LCustomerDateOfBirth.setTranslateY(-170);
						LCustomerDateOfBirth.setFont(new Font("Arial Black", 12));

						rootf.getChildren().addAll(LCustomerEmail, LCustomerGender,LCustomerAddress, LCustomerDateOfBirth);
						// text fields


						TextField TxtCustomerEmail = new TextField();
						TxtCustomerEmail.setTranslateX(265);
						TxtCustomerEmail.setTranslateY(-145);
						TxtCustomerEmail.setMaxWidth(90);


						TextField TxtCustomerGender = new TextField();
						TxtCustomerGender.setTranslateX(540);
						TxtCustomerGender.setTranslateY(-145);
						TxtCustomerGender.setMaxWidth(90);

						TextField TxtCustomerAddress = new TextField();
						TxtCustomerAddress.setTranslateX(640);
						TxtCustomerAddress.setTranslateY(-145);
						TxtCustomerAddress.setMaxWidth(80);

						TextField TxtCustomerDOB = new TextField();
						TxtCustomerDOB.setTranslateX(730);
						TxtCustomerDOB.setTranslateY(-145);
						TxtCustomerDOB.setMaxWidth(90);

						rootf.getChildren().addAll(TxtCustomerEmail,TxtCustomerGender, TxtCustomerAddress, TxtCustomerDOB);

						DropShadow shadow = new DropShadow(20, Color.RED);

						Button BCustomerEmail = new Button("Click");
						BCustomerEmail.setTranslateX(290);
						BCustomerEmail.setTranslateY(-115);
						BCustomerEmail.setTextFill(Color.WHITE);
						BCustomerEmail
						.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
						BCustomerEmail.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
							BCustomerEmail.setEffect(shadow);
						});
						BCustomerEmail.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
							BCustomerEmail.setEffect(null);
						});

						Button BCustomerGender = new Button("Click");
						BCustomerGender.setTranslateX(560);
						BCustomerGender.setTranslateY(-115);
						BCustomerGender.setTextFill(Color.WHITE);
						BCustomerGender
						.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
						BCustomerGender.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
							BCustomerGender.setEffect(shadow);
						});
						BCustomerGender.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
							BCustomerGender.setEffect(null);
						});
						Button BCustomerAddress = new Button("Click");
						BCustomerAddress.setTranslateX(658);
						BCustomerAddress.setTranslateY(-115);
						BCustomerAddress.setTextFill(Color.WHITE);
						BCustomerAddress
						.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
						BCustomerAddress.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
							BCustomerAddress.setEffect(shadow);
						});
						BCustomerAddress.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
							BCustomerAddress.setEffect(null);
						});
						Button BCustomerDateOfBirth = new Button("Click");
						BCustomerDateOfBirth.setTranslateX(745);
						BCustomerDateOfBirth.setTranslateY(-115);
						BCustomerDateOfBirth.setTextFill(Color.WHITE);
						BCustomerDateOfBirth
						.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
						BCustomerDateOfBirth.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
							BCustomerDateOfBirth.setEffect(shadow);
						});
						BCustomerDateOfBirth.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
							BCustomerDateOfBirth.setEffect(null);
						});

						//-----------------------------------------------------------------------------------------------------------------------

						BCustomerEmail.setOnAction(e -> {
							try {
								int totalPaid = 0;
								int totalBought = 0;

								String Email = TxtCustomerEmail.getText();
								String EmailQuery = "select * from customer c,orders_sold o where  c.customer_ID = o.customer_ID AND c.Customer_Name = '"+ Email +"';";
								Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625");  
								Statement stmt=con1.createStatement();
								ResultSet EmailResult = stmt.executeQuery(EmailQuery);

								areatxt.appendText("\n");
								while (EmailResult.next()) {
									String Customer_Name = EmailResult.getString("Customer_Name");
									int Age = EmailResult.getInt("Age");
									int PhoneNumber = EmailResult.getInt("PhoneNumber");
									String Gender = EmailResult.getString("Gender");
									String Address = EmailResult.getString("Address");
									int TotalPrice = EmailResult.getInt("TotalPrice");
									int Num_OF_Products = EmailResult.getInt("Num_OF_Products");
									areatxt.appendText("Email: " + Customer_Name + "  Age: " + Age +"  PhoneNumber: " + PhoneNumber +
											"  Gender: " + Gender + "  Address: " + Address + "  TotalPrice: " + TotalPrice + "  Num_OF_Products: " + Num_OF_Products +"\n");

								}

								Statement stmt1 = con1.createStatement();
								Statement stmt2 = con1.createStatement();

								ResultSet TotalPaid = stmt1.executeQuery("select sum(TotalPrice) "
										+ "from customer c,orders_sold o where  c.customer_ID = o.customer_ID AND c.Customer_Name = '"+ Email +"';");

								ResultSet TotalBought = stmt2.executeQuery("select sum(Num_OF_Products) "
										+ "from customer c,orders_sold o where  c.customer_ID = o.customer_ID AND c.Customer_Name = '"+ Email +"';");

								while(TotalPaid.next())
								{
									totalPaid = TotalPaid.getInt(1);
								}

								while(TotalBought.next())
								{
									totalBought = TotalBought.getInt(1);
								}

								areatxt.appendText("Total paid: " + totalPaid + "\nNumber of items bought: " + totalBought);

							}catch(Exception e1) {
								e1.printStackTrace();
							}

						});
						//-----------------------------------------------------------------------------------------------------------------------

						BCustomerGender.setOnAction(e -> {

							try {
								int totalPaid = 0;
								int totalBought = 0;

								String Genderr = TxtCustomerGender.getText();
								String GenderQuery = "select * from customer c,orders_sold o where  c.customer_ID = o.customer_ID AND c.Gender = '"+ Genderr +"';";
								Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625");  
								Statement stmt=con1.createStatement();
								ResultSet GenderResult = stmt.executeQuery(GenderQuery);

								areatxt.appendText("\n");

								while (GenderResult.next()) {
									String Customer_Name = GenderResult.getString("Customer_Name");
									int Age = GenderResult.getInt("Age");
									int PhoneNumber = GenderResult.getInt("PhoneNumber");
									String Gender = GenderResult.getString("Gender");
									String Address = GenderResult.getString("Address");
									int TotalPrice = GenderResult.getInt("TotalPrice");
									int Num_OF_Products = GenderResult.getInt("Num_OF_Products");
									areatxt.appendText("Email: " + Customer_Name + "  Age: " + Age +"  PhoneNumber: " + PhoneNumber +
											"  Gender: " + Gender + "  Address: " + Address + "  TotalPrice: " + TotalPrice + "  Num_OF_Products: " + Num_OF_Products +"\n");

								}

								Statement stmt1 = con1.createStatement();
								Statement stmt2 = con1.createStatement();

								ResultSet TotalPaid = stmt1.executeQuery("select sum(TotalPrice) "
										+ "from customer c,orders_sold o where  c.customer_ID = o.customer_ID AND c.Gender = '"+ Genderr +"';");

								ResultSet TotalBought = stmt2.executeQuery("select sum(Num_OF_Products) "
										+ "from customer c,orders_sold o where  c.customer_ID = o.customer_ID AND c.Gender = '"+ Genderr +"';");

								while(TotalPaid.next())
								{
									totalPaid = TotalPaid.getInt(1);
								}

								while(TotalBought.next())
								{
									totalBought = TotalBought.getInt(1);
								}

								areatxt.appendText("Total paid: " + totalPaid + "\nNumber of items bought: " + totalBought);





							}catch(Exception e1) {
								e1.printStackTrace();
							}



						});
						//-----------------------------------------------------------------------------------------------------------------------

						BCustomerAddress.setOnAction(e -> {

							try {
								String Addresss = TxtCustomerAddress.getText();

								int totalPaid = 0;
								int totalBought = 0;

								String AddressQuery = "select * from customer c,orders_sold o where  c.customer_ID = o.customer_ID AND c.Address = '"+ Addresss +"';";
								Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625");  
								Statement stmt=con1.createStatement();
								ResultSet AddressResult = stmt.executeQuery(AddressQuery);

								areatxt.appendText("\n");

								while (AddressResult.next()) {
									String Customer_Name = AddressResult.getString("Customer_Name");
									int Age = AddressResult.getInt("Age");
									int PhoneNumber = AddressResult.getInt("PhoneNumber");
									String Gender = AddressResult.getString("Gender");
									String Address = AddressResult.getString("Address");
									int TotalPrice = AddressResult.getInt("TotalPrice");
									int Num_OF_Products = AddressResult.getInt("Num_OF_Products");
									areatxt.appendText("Email: " + Customer_Name + "  Age: " + Age +"  PhoneNumber: " + PhoneNumber +
											"  Gender: " + Gender + "  Address: " + Address + "  TotalPrice: " + TotalPrice + "  Num_OF_Products: " + Num_OF_Products +"\n");

								}

								Statement stmt1 = con1.createStatement();
								Statement stmt2 = con1.createStatement();

								ResultSet TotalPaid = stmt1.executeQuery("select sum(TotalPrice) "
										+ "from customer c,orders_sold o where  c.customer_ID = o.customer_ID AND c.Address = '"+ Addresss +"';");

								ResultSet TotalBought = stmt2.executeQuery("select sum(Num_OF_Products) "
										+ "from customer c,orders_sold o where  c.customer_ID = o.customer_ID AND c.Address = '"+ Addresss +"';");

								while(TotalPaid.next())
								{
									totalPaid = TotalPaid.getInt(1);
								}

								while(TotalBought.next())
								{
									totalBought = TotalBought.getInt(1);
								}

								areatxt.appendText("Total paid: " + totalPaid + "\nNumber of items bought: " + totalBought);




							}catch(Exception e1) {
								e1.printStackTrace();
							}

						});
						//-----------------------------------------------------------------------------------------------------------------------
						BCustomerDateOfBirth.setOnAction(e -> {

							try {
								String Agee = TxtCustomerDOB.getText();


								int totalPaid = 0;
								int totalBought = 0;

								String AgeQuery = "select * from customer c,orders_sold o where  c.customer_ID = o.customer_ID AND c.Age = '"+ Agee +"';";
								Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625");  
								Statement stmt=con1.createStatement();
								ResultSet AgeResult = stmt.executeQuery(AgeQuery);

								areatxt.appendText("\n");

								while (AgeResult.next()) {
									String Customer_Name = AgeResult.getString("Customer_Name");
									int Age = AgeResult.getInt("Age");
									int PhoneNumber = AgeResult.getInt("PhoneNumber");
									String Gender = AgeResult.getString("Gender");
									String Address = AgeResult.getString("Address");
									int TotalPrice = AgeResult.getInt("TotalPrice");
									int Num_OF_Products = AgeResult.getInt("Num_OF_Products");
									areatxt.appendText("Email: " + Customer_Name + "  Age: " + Age +"  PhoneNumber: " + PhoneNumber +
											"  Gender: " + Gender + "  Address: " + Address + "  TotalPrice: " + TotalPrice + "  Num_OF_Products: " + Num_OF_Products +"\n");

								}

								Statement stmt1 = con1.createStatement();
								Statement stmt2 = con1.createStatement();

								ResultSet TotalPaid = stmt1.executeQuery("select sum(TotalPrice) "
										+ "from customer c,orders_sold o where  c.customer_ID = o.customer_ID AND c.Age = '"+ Agee +"';");

								ResultSet TotalBought = stmt2.executeQuery("select sum(Num_OF_Products) "
										+ "from customer c,orders_sold o where  c.customer_ID = o.customer_ID AND c.Age = '"+ Agee +"';");

								while(TotalPaid.next())
								{
									totalPaid = TotalPaid.getInt(1);
								}

								while(TotalBought.next())
								{
									totalBought = TotalBought.getInt(1);
								}

								areatxt.appendText("Total paid: " + totalPaid + "\nNumber of items bought: " + totalBought);


							}catch(Exception e1) {
								e1.printStackTrace();
							}
						});

						//--------------------------------------------------------------------------------------------------------------------------------------

						rootf.getChildren().addAll(BCustomerEmail, BCustomerGender,BCustomerAddress, BCustomerDateOfBirth);

						Scene scenef = new Scene(rootf, 900, 600);
						Stage ab=new Stage();
						rootf.getChildren().add(areatxt);
						scenef.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
						scenef.setFill(Color.WHITE);
						ab.setScene(scenef);
						ab.show();

					}
					EmpLoginflag=0;
				});


				//---------------------------------------------------------------------------------------------------------------------------------------------
				Button sig2 = new Button("Sign up!");
				sig2.setOnAction(l222->{  // Sign up for employee


					GridPane rootfer = new GridPane();
					rootfer.setPadding(new Insets(15, 15, 15, 15));
					Image image = new Image("file:///C:/Users/EASY%20LIFE/Desktop/%D8%A7%D8%AD%D9%85%D8%B1.jfif");
					ImageView imageView = new ImageView(image);
					imageView.setFitHeight(50);
					imageView.setFitWidth(120);
					rootfer.getChildren().add(imageView);
					Label LnewCustomer = new Label("Sign up Employee"); 
					LnewCustomer.setTranslateX(290);
					LnewCustomer.setTranslateY(15);
					LnewCustomer.setTextFill(Color.WHITE);
					LnewCustomer.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
					LnewCustomer.setFont(new Font("Arial ", 25));

					rootfer.getChildren().add(LnewCustomer);

					Label LEmail = new Label("Employee Email"); 
					LEmail.setTranslateX(180);
					LEmail.setTranslateY(120);
					LEmail.setFont(new Font("Arial Black", 14));

					Label LPassword = new Label("Employee Password"); 
					LPassword.setTranslateX(180);
					LPassword.setTranslateY(165);
					LPassword.setFont(new Font("Arial Black", 14));



					rootfer.getChildren().addAll(LEmail , LPassword);

					TextField TxtEmail = new TextField("");
					TxtEmail.setTranslateX(330);
					TxtEmail.setTranslateY(120);
					TxtEmail.setMaxWidth(190);

					TextField Txtpassw = new TextField("");
					Txtpassw.setTranslateX(350);
					Txtpassw.setTranslateY(161);
					Txtpassw.setMaxWidth(190);


					rootfer.getChildren().addAll(TxtEmail , Txtpassw);

					//Buttons 

					Button Login = new Button ("LOG IN"); 
					Login.setTranslateX(620);
					Login.setTranslateY(290);
					Login.setMaxWidth(100);
					Login.setMaxHeight(35);
					Login.setTextFill(Color.WHITE);
					Login.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
					Login.setFont(new Font("Arial", 16));

					DropShadow shadow = new DropShadow(20, Color.RED);

					Login.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
						Login.setEffect(shadow);
					});
					Login.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
						Login.setEffect(null);
					});
					Button Back = new Button ("BACK"); 
					Back.setTranslateX(620);
					Back.setTranslateY(335);
					Back.setMaxWidth(70);
					Back.setMaxHeight(20);
					Back.setTextFill(Color.WHITE);
					Stage fer=new Stage();
					Back.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
					Back.setFont(new Font("Arial", 16));
					Back.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
						Back.setEffect(shadow);
					});
					Back.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
						Back.setEffect(null);
					});

					Back.setOnAction(e ->{
						fer.close();
					});
					rootfer.getChildren().addAll(Login , Back);
					Scene scene = new Scene(rootfer, 800, 500);

					scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
					scene.setFill(Color.RED);
					fer.setScene(scene);
					fer.show();

					Login.setOnAction(l2232->{

						String insert = "INSERT INTO manager(Manager_Name, Manager_Password)"+"VALUES "+"('"+ TxtEmail.getText() +"'," + "'" +Txtpassw.getText() + "')";

						Statement statement;
						try {
							Connection con5=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625"); 
							statement = con5.createStatement();
							statement.executeUpdate(insert);
							con5.close();
						} catch (SQLException e1) {
							e1.printStackTrace();
						}

						GridPane rootf = new GridPane();
						rootf.setPadding(new Insets(15, 15, 15, 15));
						TextArea areatxt = new TextArea(" ");
						areatxt.setTranslateX(35);
						areatxt.setTranslateY(110);

						areatxt.setPrefSize(800, 400);
						//label title
						Label MCustomer = new Label("Manage Customer");
						MCustomer.setFont(new Font("Arial", 20));
						MCustomer.setTranslateX(350);
						MCustomer.setTranslateY(-180);
						//Operations label names

						Label LCustomerEmail = new Label("Customer Email");
						LCustomerEmail.setTranslateX(265);
						LCustomerEmail.setTranslateY(-170);
						LCustomerEmail.setFont(new Font("Arial Black", 12));



						Label LCustomerGender = new Label("Customer Gender");
						LCustomerGender.setTranslateX(530);
						LCustomerGender.setTranslateY(-170);
						LCustomerGender.setFont(new Font("Arial Black", 12));

						Label LCustomerAddress = new Label(" Address");
						LCustomerAddress.setTranslateX(650);
						LCustomerAddress.setTranslateY(-170);
						LCustomerAddress.setFont(new Font("Arial Black", 12));

						Label LCustomerDateOfBirth = new Label("Age");
						LCustomerDateOfBirth.setTranslateX(730);
						LCustomerDateOfBirth.setTranslateY(-170);
						LCustomerDateOfBirth.setFont(new Font("Arial Black", 12));

						rootf.getChildren().addAll(LCustomerEmail, LCustomerGender,LCustomerAddress, LCustomerDateOfBirth);
						// text fields

						TextField TxtCustomerEmail = new TextField();
						TxtCustomerEmail.setTranslateX(265);
						TxtCustomerEmail.setTranslateY(-145);
						TxtCustomerEmail.setMaxWidth(90);



						TextField TxtCustomerGender = new TextField();
						TxtCustomerGender.setTranslateX(540);
						TxtCustomerGender.setTranslateY(-145);
						TxtCustomerGender.setMaxWidth(90);

						TextField TxtCustomerAddress = new TextField();
						TxtCustomerAddress.setTranslateX(640);
						TxtCustomerAddress.setTranslateY(-145);
						TxtCustomerAddress.setMaxWidth(80);

						TextField TxtCustomerDOB = new TextField();
						TxtCustomerDOB.setTranslateX(730);
						TxtCustomerDOB.setTranslateY(-145);
						TxtCustomerDOB.setMaxWidth(90);

						rootf.getChildren().addAll( TxtCustomerEmail,TxtCustomerGender, TxtCustomerAddress, TxtCustomerDOB);

						DropShadow shadoww = new DropShadow(20, Color.RED);


						Button BCustomerEmail = new Button("Click");
						BCustomerEmail.setTranslateX(290);
						BCustomerEmail.setTranslateY(-115);
						BCustomerEmail.setTextFill(Color.WHITE);
						BCustomerEmail
						.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
						BCustomerEmail.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
							BCustomerEmail.setEffect(shadow);
						});
						BCustomerEmail.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
							BCustomerEmail.setEffect(null);
						});
						Button BCustomerGender = new Button("Click");
						BCustomerGender.setTranslateX(560);
						BCustomerGender.setTranslateY(-115);
						BCustomerGender.setTextFill(Color.WHITE);
						BCustomerGender
						.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
						BCustomerGender.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
							BCustomerGender.setEffect(shadow);
						});
						BCustomerGender.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
							BCustomerGender.setEffect(null);
						});
						Button BCustomerAddress = new Button("Click");
						BCustomerAddress.setTranslateX(658);
						BCustomerAddress.setTranslateY(-115);
						BCustomerAddress.setTextFill(Color.WHITE);
						BCustomerAddress
						.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
						BCustomerAddress.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
							BCustomerAddress.setEffect(shadow);
						});
						BCustomerAddress.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
							BCustomerAddress.setEffect(null);
						});
						Button BCustomerDateOfBirth = new Button("Click");
						BCustomerDateOfBirth.setTranslateX(745);
						BCustomerDateOfBirth.setTranslateY(-115);
						BCustomerDateOfBirth.setTextFill(Color.WHITE);
						BCustomerDateOfBirth
						.setBackground(new Background(new BackgroundFill(Color.RED, new CornerRadii(5), Insets.EMPTY)));
						BCustomerDateOfBirth.addEventHandler(MouseEvent.MOUSE_ENTERED, (MouseEvent e) -> {
							BCustomerDateOfBirth.setEffect(shadow);
						});
						BCustomerDateOfBirth.addEventHandler(MouseEvent.MOUSE_EXITED, (MouseEvent e) -> {
							BCustomerDateOfBirth.setEffect(null);
						});

						//-----------------------------------------------------------------------------------------------------------------------

						BCustomerEmail.setOnAction(e -> {
							try {
								int totalPaid = 0;
								int totalBought = 0;

								String Email = TxtCustomerEmail.getText();
								String EmailQuery = "select * from customer c,orders_sold o where  c.customer_ID = o.customer_ID AND c.Customer_Name = '"+ Email +"';";
								Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625");  
								Statement stmt=con1.createStatement();
								ResultSet EmailResult = stmt.executeQuery(EmailQuery);


								areatxt.appendText("\n");
								while (EmailResult.next()) {
									String Customer_Name = EmailResult.getString("Customer_Name");
									int Age = EmailResult.getInt("Age");
									int PhoneNumber = EmailResult.getInt("PhoneNumber");
									String Gender = EmailResult.getString("Gender");
									String Address = EmailResult.getString("Address");
									int TotalPrice = EmailResult.getInt("TotalPrice");
									int Num_OF_Products = EmailResult.getInt("Num_OF_Products");
									areatxt.appendText("Email: " + Customer_Name + "  Age: " + Age +"  PhoneNumber: " + PhoneNumber +
											"  Gender: " + Gender + "  Address: " + Address + "  TotalPrice: " + TotalPrice + "  Num_OF_Products: " + Num_OF_Products +"\n");

								}

								Statement stmt1 = con1.createStatement();
								Statement stmt2 = con1.createStatement();

								ResultSet TotalPaid = stmt1.executeQuery("select sum(TotalPrice) "
										+ "from customer c,orders_sold o where  c.customer_ID = o.customer_ID AND c.Customer_Name = '"+ Email +"';");

								ResultSet TotalBought = stmt2.executeQuery("select sum(Num_OF_Products) "
										+ "from customer c,orders_sold o where  c.customer_ID = o.customer_ID AND c.Customer_Name = '"+ Email +"';");

								while(TotalPaid.next())
								{
									totalPaid = TotalPaid.getInt(1);
								}

								while(TotalBought.next())
								{
									totalBought = TotalBought.getInt(1);
								}

								areatxt.appendText("Total paid: " + totalPaid + "\nNumber of items bought: " + totalBought);

							}catch(Exception e1) {
								e1.printStackTrace();
							}

						});
						//-----------------------------------------------------------------------------------------------------------------------

						BCustomerGender.setOnAction(e -> {

							try {
								int totalPaid = 0;
								int totalBought = 0;

								String Genderr = TxtCustomerGender.getText();
								String GenderQuery = "select * from customer c,orders_sold o where  c.customer_ID = o.customer_ID AND c.Gender = '"+ Genderr +"';";
								Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625");  
								Statement stmt=con1.createStatement();
								ResultSet GenderResult = stmt.executeQuery(GenderQuery);

								areatxt.appendText("\n");
								while (GenderResult.next()) {
									String Customer_Name = GenderResult.getString("Customer_Name");
									int Age = GenderResult.getInt("Age");
									int PhoneNumber = GenderResult.getInt("PhoneNumber");
									String Gender = GenderResult.getString("Gender");
									String Address = GenderResult.getString("Address");
									int TotalPrice = GenderResult.getInt("TotalPrice");
									int Num_OF_Products = GenderResult.getInt("Num_OF_Products");
									areatxt.appendText("Email: " + Customer_Name + "  Age: " + Age +"  PhoneNumber: " + PhoneNumber +
											"  Gender: " + Gender + "  Address: " + Address + "  TotalPrice: " + TotalPrice + "  Num_OF_Products: " + Num_OF_Products +"\n");

								}

								Statement stmt1 = con1.createStatement();
								Statement stmt2 = con1.createStatement();

								ResultSet TotalPaid = stmt1.executeQuery("select sum(TotalPrice) "
										+ "from customer c,orders_sold o where  c.customer_ID = o.customer_ID AND c.Gender = '"+ Genderr +"';");

								ResultSet TotalBought = stmt2.executeQuery("select sum(Num_OF_Products) "
										+ "from customer c,orders_sold o where  c.customer_ID = o.customer_ID AND c.Gender = '"+ Genderr +"';");

								while(TotalPaid.next())
								{
									totalPaid = TotalPaid.getInt(1);
								}

								while(TotalBought.next())
								{
									totalBought = TotalBought.getInt(1);
								}

								areatxt.appendText("Total paid: " + totalPaid + "\nNumber of items bought: " + totalBought);





							}catch(Exception e1) {
								e1.printStackTrace();
							}



						});
						//-----------------------------------------------------------------------------------------------------------------------

						BCustomerAddress.setOnAction(e -> {

							try {
								String Addresss = TxtCustomerAddress.getText();

								int totalPaid = 0;
								int totalBought = 0;

								areatxt.appendText("\n");
								String AddressQuery = "select * from customer c,orders_sold o where  c.customer_ID = o.customer_ID AND c.Address = '"+ Addresss +"';";
								Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625");  
								Statement stmt=con1.createStatement();
								ResultSet AddressResult = stmt.executeQuery(AddressQuery);

								while (AddressResult.next()) {
									String Customer_Name = AddressResult.getString("Customer_Name");
									int Age = AddressResult.getInt("Age");
									int PhoneNumber = AddressResult.getInt("PhoneNumber");
									String Gender = AddressResult.getString("Gender");
									String Address = AddressResult.getString("Address");
									int TotalPrice = AddressResult.getInt("TotalPrice");
									int Num_OF_Products = AddressResult.getInt("Num_OF_Products");
									areatxt.appendText("Email: " + Customer_Name + "  Age: " + Age +"  PhoneNumber: " + PhoneNumber +
											"  Gender: " + Gender + "  Address: " + Address + "  TotalPrice: " + TotalPrice + "  Num_OF_Products: " + Num_OF_Products +"\n");

								}

								Statement stmt1 = con1.createStatement();
								Statement stmt2 = con1.createStatement();

								ResultSet TotalPaid = stmt1.executeQuery("select sum(TotalPrice) "
										+ "from customer c,orders_sold o where  c.customer_ID = o.customer_ID AND c.Address = '"+ Addresss +"';");

								ResultSet TotalBought = stmt2.executeQuery("select sum(Num_OF_Products) "
										+ "from customer c,orders_sold o where  c.customer_ID = o.customer_ID AND c.Address = '"+ Addresss +"';");

								while(TotalPaid.next())
								{
									totalPaid = TotalPaid.getInt(1);
								}

								while(TotalBought.next())
								{
									totalBought = TotalBought.getInt(1);
								}

								areatxt.appendText("Total paid: " + totalPaid + "\nNumber of items bought: " + totalBought);




							}catch(Exception e1) {
								e1.printStackTrace();
							}

						});
						//-----------------------------------------------------------------------------------------------------------------------
						BCustomerDateOfBirth.setOnAction(e -> {

							try {
								String Agee = TxtCustomerDOB.getText();


								int totalPaid = 0;
								int totalBought = 0;

								areatxt.appendText("\n");
								String AgeQuery = "select * from customer c,orders_sold o where  c.customer_ID = o.customer_ID AND c.Age = '"+ Agee +"';";
								Connection con1=DriverManager.getConnection("jdbc:mysql://localhost:3306/project2","root","0597785625");  
								Statement stmt=con1.createStatement();
								ResultSet AgeResult = stmt.executeQuery(AgeQuery);

								while (AgeResult.next()) {
									String Customer_Name = AgeResult.getString("Customer_Name");
									int Age = AgeResult.getInt("Age");
									int PhoneNumber = AgeResult.getInt("PhoneNumber");
									String Gender = AgeResult.getString("Gender");
									String Address = AgeResult.getString("Address");
									int TotalPrice = AgeResult.getInt("TotalPrice");
									int Num_OF_Products = AgeResult.getInt("Num_OF_Products");
									areatxt.appendText("Email: " + Customer_Name + "  Age: " + Age +"  PhoneNumber: " + PhoneNumber +
											"  Gender: " + Gender + "  Address: " + Address + "  TotalPrice: " + TotalPrice + "  Num_OF_Products: " + Num_OF_Products +"\n");

								}

								Statement stmt1 = con1.createStatement();
								Statement stmt2 = con1.createStatement();

								ResultSet TotalPaid = stmt1.executeQuery("select sum(TotalPrice) "
										+ "from customer c,orders_sold o where  c.customer_ID = o.customer_ID AND c.Age = '"+ Agee +"';");

								ResultSet TotalBought = stmt2.executeQuery("select sum(Num_OF_Products) "
										+ "from customer c,orders_sold o where  c.customer_ID = o.customer_ID AND c.Age = '"+ Agee +"';");

								while(TotalPaid.next())
								{
									totalPaid = TotalPaid.getInt(1);
								}

								while(TotalBought.next())
								{
									totalBought = TotalBought.getInt(1);
								}

								areatxt.appendText("Total paid: " + totalPaid + "\nNumber of items bought: " + totalBought);


							}catch(Exception e1) {
								e1.printStackTrace();
							}
						});

						//--------------------------------------------------------------------------------------------------------------------------------------



						rootf.getChildren().addAll(BCustomerEmail,BCustomerGender,BCustomerAddress, BCustomerDateOfBirth);

						Scene scenef = new Scene(rootf, 900, 600);
						Stage ab=new Stage();
						rootf.getChildren().add(areatxt);
						scenef.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
						scenef.setFill(Color.WHITE);
						ab.setScene(scenef);
						ab.show();
					});


				});
				sig2.setPrefSize(100, 20);
				sig2.setLayoutX(350);
				sig2.setLayoutY(535);
				sig2.setFont(new Font("Arabic Typesetting", 20));
				sig2.setTextFill(Color.BLACK);
				l1224.setPrefSize(220, 100);
				l1224.setLayoutX(190);
				l1224.setLayoutY(500);
				l1224.setFont(new Font("Arabic Typesetting", 30));
				l1224.setTextFill(Color.BLACK);
				log24.setLayoutX(500);
				log24.setLayoutY(250);
				S1124.setPrefSize(400, 0);
				S1124.setLayoutX(300);
				S1124.setLayoutY(115);
				l1124.setPrefSize(400, 0);
				l1124.setLayoutX(300);
				l1124.setLayoutY(180);
				l124.setPrefSize(230, 100);
				S124.setPrefSize(230, 100);
				l124.setLayoutX(100);
				l124.setLayoutY(100);
				S124.setLayoutX(100);
				S124.setLayoutY(168);
				l124.setTextFill(Color.BLACK);
				l124.setFont(new Font("Arabic Typesetting", 50));
				S124.setFont(new Font("Arabic Typesetting", 50));
				log24.setFont(new Font("Arabic Typesetting", 30));
				S124.setTextFill(Color.BLACK);
				log24.setStyle("-fx-background-color:WHITE;-fx-background-radius:10px");
				h124.getChildren().add(l124);
				h124.getChildren().add(S124);
				h124.getChildren().add(S1124);
				h124.getChildren().add(l1124);
				h124.getChildren().add(log24);
				h124.getChildren().add(l1224);
				h124.getChildren().add(sig2);

				l124.setAlignment(Pos.TOP_LEFT);
				S124.setAlignment(Pos.TOP_LEFT);

				root124.add(h124, 10, 0);

				root124.setVgap(60);
				root124.setHgap(15);

				Scene s12 = new Scene(root124, Color.RED);
				Stage s112=new Stage();
				s112.setScene(s12);
				s112.show();

			});

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		Application.launch(args); // Launching the application
	}

}