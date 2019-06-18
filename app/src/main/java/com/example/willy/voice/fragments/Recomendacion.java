package com.example.willy.voice.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.willy.voice.R;
import com.example.willy.voice.adapters.VideoAdapter;
import com.example.willy.voice.youtube.YouTubeVideos;

import java.util.Vector;
//Con Youtube Player No soporta version
/*
class extender extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener{
    private static final int RECOVERY_REQUEST = 1;
    YouTubePlayerView youTubeView;
    View vista;

    public extender(View view){
        init();
    }
    public void init(){

        youTubeView = (YouTubePlayerView) vista.findViewById(R.id.youtube_view);
        youTubeView.initialize(config.YOUTUBE_API_KEY, this);
    }


    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer player, boolean wasRestored) {
        if (!wasRestored) {
            player.loadVideo("fhWaJi1Hsfo"); // Plays https://www.youtube.com/watch?v=fhWaJi1Hsfo
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult errorReason) {
        if (errorReason.isUserRecoverableError()) {
            errorReason.getErrorDialog(this, RECOVERY_REQUEST).show();
        } else {
            String error = String.format(getString(R.string.player_error), errorReason.toString());
            Toast.makeText(this, error, Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == RECOVERY_REQUEST) {
            // Retry initialization if user performed a recovery action
            init();
        }
        super.onActivityResult(requestCode, resultCode, data);
    }
}*/
public class Recomendacion extends Fragment {
    RecyclerView recyclerView;
    Vector<YouTubeVideos> youtubeVideos = new Vector<YouTubeVideos>();
    public Recomendacion(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_recomendacion, container, false);
        //extender clase= new extender(view);
        // Inflate the layout for this fragment
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager( new LinearLayoutManager(getContext()));
        youtubeVideos.add( new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/eWEF1Zrmdow\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/KyJ71G2UxTQ\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/y8Rr39jKFKU\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/8Hg1tqIwIfI\" frameborder=\"0\" allowfullscreen></iframe>") );
        youtubeVideos.add( new YouTubeVideos("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/uhQ7mh_o_cM\" frameborder=\"0\" allowfullscreen></iframe>") );

        VideoAdapter videoAdapter = new VideoAdapter(youtubeVideos);

        recyclerView.setAdapter(videoAdapter);

        return view;

    }





}

