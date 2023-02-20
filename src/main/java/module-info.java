module com.example.javapractice {
  requires javafx.controls;
  requires javafx.fxml;


  opens com.example.javapractice to javafx.fxml;
  exports com.example.javapractice;
}