package leifu.loading;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import leifu.loadinglibrary.dialog.ProgressDialogUtil;
import leifu.loadinglibrary.progressdialog.CircularProgressDialog;


public class MainActivity extends AppCompatActivity {

    private CircularProgressDialog circularProgressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //第一种加载
//       circularProgressDialog = new CircularProgressDialog(this);
//      circularProgressDialog.show();
        //第2种加载
//        DialogLoading dialogLoading = new DialogLoading(this);
//        dialogLoading.show();
        //第3种加载
        ProgressDialogUtil.showWaitDialog(this, "等等...");
    }
}
