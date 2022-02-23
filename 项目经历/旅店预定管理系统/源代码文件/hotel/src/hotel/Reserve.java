package hotel;
import Tools.SimpleTools;
import Tools.hotelsql;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Reserve  {

    @FXML
    private TextField name;
    @FXML
    private Text tip;
    @FXML
    private TextField phone;
    @FXML
    private TextField usernum;
    @FXML
    private Text roomnum;
    @FXML
    private Text livetime;
    @FXML
    private Text money;

    @FXML
    private Button submitButton;

    @FXML
    private Button closeButton;
    String roomid=EnReserve.roomid;;
    String date=EnReserve.date;
    String username=EnHotelMain.userid;
    String opertator=EnHotelMain.operation;
    SimpleTools simpleTools = new SimpleTools();
    public  void initialize() throws SQLException {
        roomnum.setText(roomid);
        livetime.setText(date);
        tip.setText("你好"+username+",请填写真实的个人信息");
        String sql="SELECT price FROM roomtype,roominfo WHERE roominfo.type_id=roomtype.type_id AND roominfo.id='"+roomid+"'";
        ResultSet rs=hotelsql.executeQuery(sql);
        rs.next();
        if (opertator.equals("OrdinaryUser")){
            money.setText(rs.getString(1));
        }else {
            double m= Double.parseDouble(rs.getString(1));
            double m1=(m*0.7);
            money.setText(String.valueOf(m1));
        }
    }

    @FXML
    void exit(MouseEvent event) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
        stage.close();
    }

    @FXML
    void submit(MouseEvent event) {
        String turename=name.getText();
        String tel=phone.getText();
        String num=usernum.getText();
        Random random = new Random();
        // 随机数的量 自由定制，这是9位随机数
        Integer r = random.nextInt(90000000) + 10000000;
        // 返回  13位时间
        Long timeMillis = System.currentTimeMillis();
        // 返回  17位时间
        DateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String timeStr = sdf.format(new Date());
        String No= timeStr + r;
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        String opertate_time=df.format(new Date());
        String state="预定成功";
        String regex="^[1][3,4,5,7,8,9][0-9]{9}$";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(tel);

        boolean isMatch = m.matches();
        if (isMatch) {
            String sql = "INSERT INTO `order`(id,username,user_type,operate_time,truename,phone,room_id,live_time,user_num,state)VALUES" +
                    "('" + No + "','" + username + "','" + opertator + "','" + opertate_time + "','" + turename + "','" + tel + "','" + roomid + "','" + date + "','" + num + "','" + state + "')";
            int row = hotelsql.executeUpdate(sql);
            if (row == 0) {
                simpleTools.informationDialog(Alert.AlertType.INFORMATION, "提示", "信息", "交易失败");
            } else {
                simpleTools.informationDialog(Alert.AlertType.INFORMATION, "提示", "信息", "交易成功");
                Stage stage = (Stage) submitButton.getScene().getWindow();
                stage.close();
            }
        }else {
            simpleTools.informationDialog(Alert.AlertType.INFORMATION, "提示", "信息", "手机号格式错误");
        }
    }

}
