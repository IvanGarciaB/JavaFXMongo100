module com.empresa.javafxmongo100 {
    requires javafx.controls;
    requires javafx.fxml;
    requires mongo.java.driver;


    opens com.empresa.javafxmongo100 to javafx.fxml;
    exports com.empresa.javafxmongo100;
}