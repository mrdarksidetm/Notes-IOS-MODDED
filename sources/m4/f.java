package m4;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.util.Log;
import com.revenuecat.purchases.common.Constants;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float[] f15405h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float[] f15406i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f15407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f15408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f15409c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f15410d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f15411e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f15412f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f15413g;

    static {
        float[] fArr = new float[16];
        f15405h = fArr;
        Matrix.setIdentityM(fArr, 0);
        float[] fArr2 = new float[16];
        f15406i = fArr2;
        Matrix.setIdentityM(fArr2, 0);
        Matrix.translateM(fArr2, 0, 0.0f, 1.0f, 0.0f);
        Matrix.scaleM(fArr2, 0, 1.0f, -1.0f, 1.0f);
    }

    public f(int i10) {
        String str;
        this.f15407a = i10;
        if (i10 == 0) {
            this.f15413g = 3553;
            str = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
        } else {
            if (i10 != 1) {
                throw new RuntimeException("Unhandled type " + i10);
            }
            this.f15413g = 36197;
            str = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n";
        }
        this.f15408b = c("uniform mat4 uMVPMatrix;\nuniform mat4 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = (uTexMatrix * aTextureCoord).xy;\n}\n", str);
        int i11 = this.f15408b;
        if (i11 == 0) {
            throw new RuntimeException("Unable to create program");
        }
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(i11, "aPosition");
        this.f15411e = iGlGetAttribLocation;
        b(iGlGetAttribLocation, "aPosition");
        int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(this.f15408b, "aTextureCoord");
        this.f15412f = iGlGetAttribLocation2;
        b(iGlGetAttribLocation2, "aTextureCoord");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f15408b, "uMVPMatrix");
        this.f15409c = iGlGetUniformLocation;
        b(iGlGetUniformLocation, "uMVPMatrix");
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f15408b, "uTexMatrix");
        this.f15410d = iGlGetUniformLocation2;
        b(iGlGetUniformLocation2, "uTexMatrix");
    }

    public static void a(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        String str2 = str + ": glError 0x" + Integer.toHexString(iGlGetError);
        Log.e("Texture2dProgram", str2);
        throw new RuntimeException(str2);
    }

    public static void b(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        throw new RuntimeException("Unable to locate '" + str + "' in program");
    }

    public static int c(String str, String str2) {
        int iF;
        int iF2 = f(35633, str);
        if (iF2 == 0 || (iF = f(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        a("glCreateProgram");
        if (iGlCreateProgram == 0) {
            Log.e("Texture2dProgram", "Could not create program");
        }
        GLES20.glAttachShader(iGlCreateProgram, iF2);
        a("glAttachShader");
        GLES20.glAttachShader(iGlCreateProgram, iF);
        a("glAttachShader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        Log.e("Texture2dProgram", "Could not link program: ");
        Log.e("Texture2dProgram", GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }

    public static int f(int i10, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        a("glCreateShader type=" + i10);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        Log.e("Texture2dProgram", "Could not compile shader " + i10 + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" ");
        sb2.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        Log.e("Texture2dProgram", sb2.toString());
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    public int d() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        a("glGenTextures");
        int i10 = iArr[0];
        GLES20.glBindTexture(this.f15413g, i10);
        a("glBindTexture " + i10);
        GLES20.glTexParameterf(this.f15413g, 10241, 9728.0f);
        int i11 = this.f15413g;
        GLES20.glTexParameterf(i11, 10240, i11 != 3553 ? 9729.0f : 9728.0f);
        GLES20.glTexParameteri(this.f15413g, 10242, 33071);
        GLES20.glTexParameteri(this.f15413g, 10243, 33071);
        a("glTexParameter");
        return i10;
    }

    public void e(float[] fArr, FloatBuffer floatBuffer, int i10, int i11, int i12, int i13, float[] fArr2, FloatBuffer floatBuffer2, int i14, int i15) {
        a("draw start");
        GLES20.glUseProgram(this.f15408b);
        a("glUseProgram");
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(this.f15413g, i14);
        GLES20.glUniformMatrix4fv(this.f15409c, 1, false, fArr, 0);
        a("glUniformMatrix4fv");
        GLES20.glUniformMatrix4fv(this.f15410d, 1, false, fArr2, 0);
        a("glUniformMatrix4fv");
        GLES20.glEnableVertexAttribArray(this.f15411e);
        a("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f15411e, i12, 5126, false, i13, (Buffer) floatBuffer);
        a("glVertexAttribPointer");
        GLES20.glEnableVertexAttribArray(this.f15412f);
        a("glEnableVertexAttribArray");
        GLES20.glVertexAttribPointer(this.f15412f, 2, 5126, false, i15, (Buffer) floatBuffer2);
        a("glVertexAttribPointer");
        GLES20.glDrawArrays(5, i10, i11);
        a("glDrawArrays");
        GLES20.glDisableVertexAttribArray(this.f15411e);
        GLES20.glDisableVertexAttribArray(this.f15412f);
        GLES20.glBindTexture(this.f15413g, 0);
        GLES20.glUseProgram(0);
    }

    public void g(int i10, Bitmap bitmap) {
        GLES20.glBindTexture(this.f15413g, i10);
        GLUtils.texImage2D(this.f15413g, 0, bitmap, 0);
    }

    public void h() {
        Log.d("Texture2dProgram", "deleting program " + this.f15408b);
        GLES20.glDeleteProgram(this.f15408b);
        this.f15408b = -1;
    }
}
