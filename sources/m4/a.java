package m4;

import android.graphics.Bitmap;
import android.graphics.Rect;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float[] f15321f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final FloatBuffer f15322g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f15323a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FloatBuffer f15324b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f15325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f15326d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private f f15327e;

    static {
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f15321f = fArr;
        f15322g = b(fArr);
    }

    public a(f fVar, int i10, int i11) {
        float[] fArr = new float[8];
        this.f15323a = fArr;
        this.f15324b = b(fArr);
        this.f15327e = fVar;
        this.f15325c = i10;
        this.f15326d = i11;
    }

    public static FloatBuffer b(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    public void a(int i10, float[] fArr, Rect rect) {
        f(rect);
        this.f15327e.e(f.f15405h, f15322g, 0, 4, 2, 8, fArr, this.f15324b, i10, 8);
    }

    public int c() {
        return this.f15327e.d();
    }

    public void d(int i10, Bitmap bitmap) {
        this.f15327e.g(i10, bitmap);
    }

    public void e(boolean z10) {
        f fVar = this.f15327e;
        if (fVar != null) {
            if (z10) {
                fVar.h();
            }
            this.f15327e = null;
        }
    }

    void f(Rect rect) {
        float[] fArr = this.f15323a;
        int i10 = rect.left;
        int i11 = this.f15325c;
        fArr[0] = i10 / i11;
        int i12 = rect.bottom;
        int i13 = this.f15326d;
        fArr[1] = 1.0f - (i12 / i13);
        int i14 = rect.right;
        fArr[2] = i14 / i11;
        fArr[3] = 1.0f - (i12 / i13);
        fArr[4] = i10 / i11;
        int i15 = rect.top;
        fArr[5] = 1.0f - (i15 / i13);
        fArr[6] = i14 / i11;
        fArr[7] = 1.0f - (i15 / i13);
        this.f15324b.put(fArr);
        this.f15324b.position(0);
    }
}
