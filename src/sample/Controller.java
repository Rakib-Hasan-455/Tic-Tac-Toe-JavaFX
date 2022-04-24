package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.Arrays;
import java.util.ResourceBundle;

public class Controller {
    public Button zeroZeroBtnID;
    public Button zeroOneBtnID;
    public Button oneOneID;
    public Button twoOneID;
    public Button zeroTwoBtnID;
    public Button oneTwoID;
    public Button twoZeroID;
    public Button oneZeroID;
    public Button twoTwoID;

    public static int personPressed = -1;
    public static int[][] gridRooms = new int[3][3];
    public static int[][] gridRoomsCol = new int[3][3];
    public Label winnerLabel;

    int btnPressCnt = 0;

    public void twoTwoBtn(ActionEvent event) {
        btnPressCnt++;
        personPressed = personPressed * -1;
        if (personPressed == 1) {
            twoTwoID.setText("X");
            twoTwoID.setDisable(true);
            gridRooms[2][2] = 1;
            gridRoomsCol[2][2] = 1;
            winnerCheck();

        } else {
            twoTwoID.setText("O");
            twoTwoID.setDisable(true);
            gridRooms[2][2] = 2;
            gridRoomsCol[2][2] = 2;
            winnerCheck();

        }
    }

    public void oneZeroBtn(ActionEvent event) {
        btnPressCnt++;
        personPressed = personPressed * -1;
        if (personPressed == 1) {
            oneZeroID.setText("X");
            oneZeroID.setDisable(true);
            gridRooms[1][0] = 1;
            gridRoomsCol[0][1] = 1;
            winnerCheck();

        } else {
            oneZeroID.setText("O");
            oneZeroID.setDisable(true);
            gridRooms[1][0] = 2;
            gridRoomsCol[0][1] = 2;
            winnerCheck();

        }
    }

    public void twoZeroBtn(ActionEvent event) {
        btnPressCnt++;
        personPressed = personPressed * -1;
        if (personPressed == 1) {
            twoZeroID.setText("X");
            twoZeroID.setDisable(true);
            gridRooms[2][0] = 1;
            gridRoomsCol[0][2] = 1;
            winnerCheck();

        } else {
            twoZeroID.setText("O");
            twoZeroID.setDisable(true);
            gridRooms[2][0] = 2;
            gridRoomsCol[0][2] = 2;
            winnerCheck();

        }
    }

    public void oneTwoBtn(ActionEvent event) {
        btnPressCnt++;
        personPressed = personPressed * -1;
        if (personPressed == 1) {
            oneTwoID.setText("X");
            oneTwoID.setDisable(true);
            gridRooms[1][2] = 1;
            gridRoomsCol[2][1] = 1;
            winnerCheck();

        } else {
            oneTwoID.setText("O");
            oneTwoID.setDisable(true);
            gridRooms[1][2] = 2;
            gridRoomsCol[2][1] = 2;
            winnerCheck();

        }
    }

    public void zeroTwoBtn(ActionEvent event) {
        btnPressCnt++;
        personPressed = personPressed * -1;
        if (personPressed == 1) {
            zeroTwoBtnID.setText("X");
            zeroTwoBtnID.setDisable(true);
            gridRooms[0][2] = 1;
            gridRoomsCol[2][0] = 1;
            winnerCheck();

        } else {
            zeroTwoBtnID.setText("O");
            zeroTwoBtnID.setDisable(true);
            gridRooms[0][2] = 2;
            gridRoomsCol[2][0] = 2;
            winnerCheck();

        }
    }

    public void twoOneBtn(ActionEvent event) {
        btnPressCnt++;
        personPressed = personPressed * -1;
        if (personPressed == 1) {
            twoOneID.setText("X");
            twoOneID.setDisable(true);
            gridRooms[2][1] = 1;
            gridRoomsCol[1][2] = 1;
            winnerCheck();

        } else {
            twoOneID.setText("O");
            twoOneID.setDisable(true);
            gridRooms[2][1] = 2;
            gridRoomsCol[1][2] = 2;
            winnerCheck();

        }
    }

    public void oneOneBtn(ActionEvent event) {
        btnPressCnt++;
        personPressed = personPressed * -1;
        if (personPressed == 1) {
            oneOneID.setText("X");
            oneOneID.setDisable(true);
            gridRooms[1][1] = 1;
            gridRoomsCol[1][1] = 1;
            winnerCheck();
        } else {
            oneOneID.setText("O");
            oneOneID.setDisable(true);
            gridRooms[1][1] = 2;
            gridRoomsCol[1][1] = 2;
            winnerCheck();

        }
    }

    public void zeroOneBtn(ActionEvent event) {
        btnPressCnt++;
        personPressed = personPressed * -1;
        if (personPressed == 1) {
            zeroOneBtnID.setText("X");
            zeroOneBtnID.setDisable(true);
            gridRooms[0][1] = 1;
            gridRoomsCol[1][0] = 1;
            winnerCheck();

        } else {
            zeroOneBtnID.setText("O");
            zeroOneBtnID.setDisable(true);
            gridRooms[0][1] = 2;
            gridRoomsCol[1][0] = 2;
            winnerCheck();

        }
    }

    public void zeroZeroBtn(ActionEvent event) {
        btnPressCnt++;
        personPressed = personPressed * -1;
        if (personPressed == 1) {
            zeroZeroBtnID.setText("X");
            zeroZeroBtnID.setDisable(true);
            gridRooms[0][0] = 1;
            gridRoomsCol[0][0] = 1;
            winnerCheck();
        } else {
            zeroZeroBtnID.setText("O");
            zeroZeroBtnID.setDisable(true);
            gridRooms[0][0] = 2;
            gridRoomsCol[0][0] = 2;
            winnerCheck();

        }
    }

    public void disableAllBtn() {
        twoTwoID.setDisable(true);
        oneZeroID.setDisable(true);
        twoZeroID.setDisable(true);
        oneTwoID.setDisable(true);
        zeroTwoBtnID.setDisable(true);
        twoOneID.setDisable(true);
        oneOneID.setDisable(true);
        zeroOneBtnID.setDisable(true);
        zeroZeroBtnID.setDisable(true);
    }

    public void winnerCheck() {
        int player1RightCrossChk = 0;
        int player2RightCrossChk = 0;
        int player1LeftCrossChk = 0;
        int player2LeftCrossChk = 0;
        for (int i = 0, k = 2; i < gridRooms.length; i++, k--) {
            System.out.println(Arrays.toString(gridRoomsCol[i]));
            int player1RowCheck = 0;
            int player2RowCheck = 0;
            int player1ColCheck = 0;
            int player2ColCheck = 0;

            if (gridRooms[i][i] == 1) {
                player1RightCrossChk++;
            }
            if (gridRooms[i][i] == 2) {
                player2RightCrossChk++;
            }

            if (gridRooms[i][k] == 1) {
                player1LeftCrossChk++;
            }
            if (gridRooms[i][k] == 2) {
                player2LeftCrossChk++;
            }

            for (int j = 0; j < gridRooms.length; j++) {
                if (gridRooms[i][j] == 1) {
                    player1RowCheck++;
                }
                if (gridRoomsCol[i][j] == 1) {
                    player1ColCheck++;
                }
                if (gridRooms[i][j] == 2) {
                    player2RowCheck++;
                }
                if (gridRoomsCol[i][j] == 2) {
                    player2ColCheck++;
                }
            }

            if (player1RowCheck == 3) {
                winnerLabel.setText("Winner is Player 1 (X)");
                disableAllBtn();
            }


            if (player1ColCheck == 3) {
                winnerLabel.setText("Winner is Player 1 (X)");
                disableAllBtn();

            }

            if (player2RowCheck == 3) {
                winnerLabel.setText("Winner is Player 2 (O)");
                disableAllBtn();
            }

            if (player2ColCheck == 3) {
                winnerLabel.setText("Winner is Player 2 (O)");
                disableAllBtn();

            }

            if (player1RightCrossChk == 3) {
                winnerLabel.setText("Winner is Player 1 (X)");
                disableAllBtn();

            }

            if (player2RightCrossChk == 3) {
                winnerLabel.setText("Winner is Player 2 (O)");
                disableAllBtn();

            }
            if (player1LeftCrossChk == 3) {
                winnerLabel.setText("Winner is Player 1 (X)");
                disableAllBtn();

            }

            if (player2LeftCrossChk == 3) {
                winnerLabel.setText("Winner is Player 2 (O)");
                disableAllBtn();
            }

            if (btnPressCnt == 9) {
                winnerLabel.setText("It's a draw.");
            }
        }
        System.out.println();
    }

    public void replayGameBtn(ActionEvent event) {

        personPressed = -1;
        btnPressCnt = 0;

        for (int i = 0; i < gridRooms.length; i++) {
            Arrays.fill(gridRooms[i], 0);
            System.out.println(Arrays.toString(gridRooms[i]));
            Arrays.fill(gridRoomsCol[i], 0);
        }

        twoTwoID.setDisable(false);
        oneZeroID.setDisable(false);
        twoZeroID.setDisable(false);
        oneTwoID.setDisable(false);
        zeroTwoBtnID.setDisable(false);
        twoOneID.setDisable(false);
        oneOneID.setDisable(false);
        zeroOneBtnID.setDisable(false);
        zeroZeroBtnID.setDisable(false);

        twoTwoID.setText(" ");
        oneZeroID.setText(" ");
        twoZeroID.setText(" ");
        oneTwoID.setText(" ");
        zeroTwoBtnID.setText(" ");
        twoOneID.setText(" ");
        oneOneID.setText(" ");
        zeroOneBtnID.setText(" ");
        zeroZeroBtnID.setText(" ");

        winnerLabel.setText(" ");
    }
}
