package embedded.cse.cau.ac.kr.teambccard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ModifyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modify);
    }

    public void onBackButtonClicked(View view) {
        finish();
    }

    public void onModifyClicked(View view) {
        Toast.makeText(getApplicationContext(), "데이터 수정", Toast.LENGTH_LONG).show();
    }
}