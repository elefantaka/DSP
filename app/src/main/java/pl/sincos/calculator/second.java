package pl.sincos.calculator;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class second extends AppCompatActivity
{
    private Button play;
    private VideoView video;
    private MediaController media;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        videoview();
        videoplay();
        click();
    }

    private void videoview()
    {
        video = (VideoView) findViewById(R.id.video);
        media = new MediaController(this);
    }

    private void click()
    {
        play = (Button) findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                video.start();
            }
        });
    }

    private void videoplay()
    {
        String videopath = "android.resource://pl.sincos.calculator/" + R.raw.video;
        Uri uri = Uri.parse(videopath);
        video.setVideoURI(uri);
        video.setMediaController(media);
        media.setAnchorView(video);
        video.start();
    }
}
