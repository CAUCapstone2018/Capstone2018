package embedded.cse.cau.ac.kr.teambccard;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

public class CameraSurfaceView extends SurfaceView implements SurfaceHolder.Callback {
    private SurfaceHolder mHolder;
    private CameraManager cam;
    public CameraSurfaceView(Context context) {
        super(context);

        mHolder = getHolder();
        mHolder.addCallback(this);
        context.getSystemService(Context.CAMERA_SERVICE);
        context.getSystemService(CameraManager.class);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i1, int i2) {

    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {

    }
}
