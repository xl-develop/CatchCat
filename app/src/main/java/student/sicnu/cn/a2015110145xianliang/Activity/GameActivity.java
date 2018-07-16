package student.sicnu.cn.a2015110145xianliang.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import student.sicnu.cn.a2015110145xianliang.R;
import student.sicnu.cn.a2015110145xianliang.View.GameView;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        GameView gameView = new GameView(this);
        setContentView(gameView);
        getSupportActionBar().hide();

    }
}
