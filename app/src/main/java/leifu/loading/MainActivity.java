package leifu.loading;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import leifu.loading.view.CircularProgressDialog;
import leifu.loading.view.DialogLoading;

public class MainActivity extends AppCompatActivity {

    private CircularProgressDialog circularProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        circularProgressDialog = new CircularProgressDialog(this);
//        circularProgressDialog.show();
        DialogLoading dialogLoading = new DialogLoading(this);
        dialogLoading.show();
    }
}
