module com.ma1y0.calculatorfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.ma1y0.calculatorfx to javafx.fxml;
    exports com.ma1y0.calculatorfx;
}