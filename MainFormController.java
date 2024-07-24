import javafx.event.ActionEvent;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.RadioButton;

public class MainFormController {


    public RadioButton rBtnFemale;
    public RadioButton rBtnmale;


    public void printDataOnAction(ActionEvent actionEvent) {
//        if(rBtnFemale.isSelected()){
//            System.out.println("Female");
//        }
//        if(rBtnmale.isSelected()) {
//            System.out.println("Male");
//        }

//        if(rBtnFemale.isSelected()){
//            System.out.println("Female");
//        }
//        else  {
//            System.out.println("Male");
//        }

//        String gender = rBtnFemale.isSelected()?"Female":"Male";
//        System.out.println(gender);


     //   String gender = rBtnFemale.isSelected()?"Female":"Male";
        System.out.println(rBtnFemale.isSelected()?"Female":"Male");
    }
}
