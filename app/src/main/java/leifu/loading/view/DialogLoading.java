package leifu.loading.view;


import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import leifu.loading.R;


public class DialogLoading extends Dialog {

	public DialogLoading(Context context) {
		super(context, R.style.style_dialog_loading);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dialog_loading);
		ImageView img = (ImageView) findViewById(R.id.iv_loading);
		AnimationDrawable anim = (AnimationDrawable) img.getDrawable();
		anim.start();
		setCanceledOnTouchOutside(false);
	}

	
	
	
	
}
