package frank.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreA;
    int scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int scoreA) {
        TextView scoreViewA = findViewById(R.id.team_a_score);
        scoreViewA.setText(String.valueOf(scoreA));
    }

    public void displayForTeamB(int scoreB) {
        TextView scoreViewB = findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(scoreB));
    }

    public void threeA(View view) {
        scoreA = scoreA + 3;
        displayForTeamA(scoreA);
    }

    public void twoA(View view) {
        scoreA = scoreA + 2;
        displayForTeamA(scoreA);
    }

    public void freeThrowA(View view) {
        scoreA = scoreA + 1;
        displayForTeamA(scoreA);
    }

    public void threeB(View view) {
        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }

    public void twoB(View view) {
        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    public void freeThrowB(View view) {
        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }

    public void resetAllScores(View view) {
        scoreB = 0;
        displayForTeamB(scoreB);
        scoreA = 0;
        displayForTeamA(scoreA);
    }

}
