module com.example.coursjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.coursjavafx to javafx.fxml;
    exports com.example.coursjavafx;
}