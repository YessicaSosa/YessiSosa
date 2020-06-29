module com.mycompany.holagithubjava {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.holagithubjava to javafx.fxml;
    exports com.mycompany.holagithubjava;
}
