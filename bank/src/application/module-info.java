module application {
	requires javafx.controls;
	requires javafx.fxml;
	requires de.jensd.fx-glyphs.fontawesome;
	requires java.sql;
	requires org.xerial.sqlitejdbc;
	
	opens application to javafx.fxml;
	exports application;
	exports application.Controllers;
	exports application.Controllers.Admin;
	exports application.Controllers.Client;
	exports application.Models;
	exports application.Views;
}