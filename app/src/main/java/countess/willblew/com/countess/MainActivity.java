package countess.willblew.com.countess;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    public int playerOneLife = 20;
    public int playerTwoLife = 20;

    //text views
    public static TextView p1Text;
    public static TextView p2Text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Typeface cFont = Typeface.createFromAsset(getAssets(), "fonts/trans.ttf");
        p1Text = (TextView) findViewById(R.id.p1);
        p2Text = (TextView) findViewById(R.id.p2);
        TextView ng = (TextView) findViewById(R.id.textView6);

        //set font
        ng.setTypeface(cFont);

    }

    public void startGame(View v) {
        playerOneLife = 20;
        playerTwoLife = 20;
        updateLife();
    }

    //update life
    public void updateLife() {

        p1Text.setText(String.valueOf(playerOneLife));
        p2Text.setText(String.valueOf(playerTwoLife));

    }

    public void p1sub(View v){
        playerOneLife --;
        updateLife();
    }

    public void p2sub(View v){
        playerTwoLife --;
        updateLife();
    }

    public void p1add(View v) {
        playerOneLife ++;
        updateLife();
    }

    public void p2add(View v) {
        playerTwoLife ++;
        updateLife();
    }
}
