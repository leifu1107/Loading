package leifu.loading.view;


import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import leifu.loading.R;


public class CircularProgressDialog extends Dialog {

	private CircularProgressView progress;
	private TextView text;

	public CircularProgressDialog(Context context) {
		super(context, R.style.LoadingDialog);
	}

	public CircularProgressDialog(Context context, int theme) {
		super(context, R.style.LoadingDialog);
	}

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.circular_process_dialog);
		setCanceledOnTouchOutside(false);
		initView();
	}

	private void initView() {
		progress = findViewById(R.id.progress);
		text = findViewById(R.id.text);
	}

	public void setColor(String color) {
		progress.setColor(Color.parseColor(color));
		text.setTextColor(Color.parseColor(color));
	}
}
