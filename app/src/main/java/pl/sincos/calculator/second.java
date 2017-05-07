package pl.sincos.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.VideoView;

public class second extends AppCompatActivity
{
    private Button play;
    private VideoView video;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        videofun();
    }
    private void videofun()
    {
        play = (Button) findViewById(R.id.play);
        video = (VideoView) findViewById(R.id.video);
    }
}
