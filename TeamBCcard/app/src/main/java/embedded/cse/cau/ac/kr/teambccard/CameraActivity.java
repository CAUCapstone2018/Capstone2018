package embedded.cse.cau.ac.kr.teambccard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class CameraActivity extends AppCompatActivity {

    //Bitmap image;
    //private TessBaseAPI api = new TessBaseAPI();
    //String dataPath = Environment.getExternalStorageDirectory().toString()+"/raw/";
    //String lang = "eng+kor";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);

        final CameraSurfaceView cameraView = new CameraSurfaceView(getApplicationContext());
        //api.init(dataPath, lang);
        //api.end();
    }

    public void onBackButtonClicked(View v)
    {
        //Toast.makeText(getApplicationContext(), "돌아가기", Toast.LENGTH_LONG).show();
        finish();
    }
    public void onCaptureClicked(View v)
    {
        Toast.makeText(getApplicationContext(), "찰칵!", Toast.LENGTH_LONG).show();
    }

}
