package com.ub.tfg.kukuicup.vista;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayer.PlayerStyle;
import com.google.android.youtube.player.YouTubePlayer.Provider;
import com.google.android.youtube.player.YouTubePlayerView;
import com.ub.tfg.kukuicup.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toast;

//public class VideoActivity extends YouTubeBaseActivity implements
//		YouTubePlayer.OnInitializedListener {

public class VideoActivity extends YouTubeBaseActivity {
//public class VideoActivity extends Activity {

	private static final int RECOVERY_DIALOG_REQUEST = 1;

	// YouTube player view
	private YouTubePlayerView youTubeView;
	
	private YouTubePlayer.OnInitializedListener onInitializedListener;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
//		requestWindowFeature(Window.FEATURE_NO_TITLE);
//		getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
//				WindowManager.LayoutParams.FLAG_FULLSCREEN);

		setContentView(R.layout.video);

		youTubeView = (YouTubePlayerView) findViewById(R.id.youtube_view);

		// Initializing video player with developer key
		//youTubeView.initialize(Config.DEVELOPER_KEY, this);
		onInitializedListener = new YouTubePlayer.OnInitializedListener() {
			
			public void onInitializationSuccess(Provider arg0, YouTubePlayer arg1,
					boolean arg2) {
				// TODO Auto-generated method stub
				arg1.loadVideo("a4NT5iBFuZs");
			}
			
			public void onInitializationFailure(Provider arg0,
					YouTubeInitializationResult arg1) {
				// TODO Auto-generated method stub
				
			}
		};

	}

//	public void onInitializationFailure(YouTubePlayer.Provider provider,
//			YouTubeInitializationResult errorReason) {
//		if (errorReason.isUserRecoverableError()) {
//			errorReason.getErrorDialog(this, RECOVERY_DIALOG_REQUEST).show();
//		} else {
//			String errorMessage = String.format(
//					getString(R.string.error_player), errorReason.toString());
//			Toast.makeText(this, errorMessage, Toast.LENGTH_LONG).show();
//		}
//	}
//
//	public void onInitializationSuccess(YouTubePlayer.Provider provider,
//			YouTubePlayer player, boolean wasRestored) {
//		if (!wasRestored) {
//
//			// loadVideo() will auto play video
//			// Use cueVideo() method, if you don't want to play it automatically
//			player.loadVideo(Config.YOUTUBE_VIDEO_CODE);
//
//			// Hiding player controls
//			player.setPlayerStyle(PlayerStyle.CHROMELESS);
//		}
//	}
//
//	@Override
//	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//		if (requestCode == RECOVERY_DIALOG_REQUEST) {
//			//Retry initialization if user performed a recovery action
//			getYouTubePlayerProvider().initialize(Config.DEVELOPER_KEY, this);
//		}
//	}
//
//	private YouTubePlayer.Provider getYouTubePlayerProvider() {
//		return (YouTubePlayerView) findViewById(R.id.youtube_view);
//	}

}