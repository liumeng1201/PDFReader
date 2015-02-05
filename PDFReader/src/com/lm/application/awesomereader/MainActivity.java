package com.lm.application.awesomereader;

import com.artifex.mupdfdemo.ChoosePDFActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Intent intent = new Intent(this, ChoosePDFActivity.class);
		startActivity(intent);
		finish();
	}

}
