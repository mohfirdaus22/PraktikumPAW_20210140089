module com.pertemuan_3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.pertemuan_3 to javafx.fxml;
    exports com.pertemuan_3;
}
