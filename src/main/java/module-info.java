module org.example.githubactspackage {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.githubactspackage to javafx.fxml;
    exports org.example.githubactspackage;
}