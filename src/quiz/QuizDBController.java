package quiz;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class QuizDBController {
    @FXML Label sp;
    @FXML RadioButton sv1;
    @FXML RadioButton sv2;
    @FXML RadioButton sv3;
    @FXML RadioButton sv4;
    @FXML Label svr;
    @FXML ImageView billede;

    public void initialize() throws SQLException, FileNotFoundException {
        // Load billede med denne vha. denne klasse.
        SporgsmaalMedBillede sporgsmaal = new SporgsmaalMedBillede();
        Image image = new Image(new FileInputStream(sporgsmaal.sti));
        billede.setImage(image);

        // Spørgsmålet fås fra databasen.
        sporgsmaal.setSporgsmaalTekst(getSporgsmaal1OrSvar1("sporgsmaal"));

        // Det rigtige svar fås fra databasen.
        Svar[] svar = {
                new Svar(getSporgsmaal1OrSvar1("svar")),
                new Svar("Anders"),
                new Svar("Karsten"),
                new Svar("Tommy")};
        sporgsmaal.setSvar(svar);

        sp.setText(sporgsmaal.getSporgsmaalTekst());
        sv1.setText(svar[0].getSvarTekst());
        sv2.setText(svar[1].getSvarTekst());
        sv3.setText(svar[2].getSvarTekst());
        sv4.setText(svar[3].getSvarTekst());
        svr.setVisible(false);

        ToggleGroup toggleGroup = new ToggleGroup();
        sv1.setToggleGroup(toggleGroup);
        sv2.setToggleGroup(toggleGroup);
        sv3.setToggleGroup(toggleGroup);
        sv4.setToggleGroup(toggleGroup);
    }

    private static String getSporgsmaal1OrSvar1(String text) throws SQLException {
        Statement statement;
        String stringQuery = "SELECT * FROM quiztable where id = 1";

        Connection conn = DBCon.connect();
        statement = conn.createStatement();



        ResultSet resultSet = statement.executeQuery(stringQuery);

        String tekst = "";
        while (resultSet.next()) {
            tekst = resultSet.getString(text);
        }
        return tekst;
    }

    @FXML
    private void answer() {
        svr.setVisible(true);
        if (sv1.isSelected()) {
            svr.setText("Korrekt!");
        }
        else {
            svr.setText("Forkert.");
        }
    }
}
