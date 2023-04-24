module com.example.tienda_classe {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.tienda_classe to javafx.fxml;
    exports com.example.tienda_classe;
}