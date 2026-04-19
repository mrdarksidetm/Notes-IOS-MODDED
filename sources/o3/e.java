package o3;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f16315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f f16316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f16317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f16318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private VelocityTracker f16319e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f16320f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f16321g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f16322h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f16323i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int[] f16324j;

    interface a {
        float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10);
    }

    interface b {
        void a(Context context, int[] iArr, MotionEvent motionEvent, int i10);
    }

    public e(Context context, f fVar) {
        this(context, fVar, new b() { // from class: o3.c
            @Override // o3.e.b
            public final void a(Context context2, int[] iArr, MotionEvent motionEvent, int i10) {
                e.c(context2, iArr, motionEvent, i10);
            }
        }, new a() { // from class: o3.d
            @Override // o3.e.a
            public final float a(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
                return e.f(velocityTracker, motionEvent, i10);
            }
        });
    }

    e(Context context, f fVar, b bVar, a aVar) {
        this.f16321g = -1;
        this.f16322h = -1;
        this.f16323i = -1;
        this.f16324j = new int[]{a.e.API_PRIORITY_OTHER, 0};
        this.f16315a = context;
        this.f16316b = fVar;
        this.f16317c = bVar;
        this.f16318d = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(Context context, int[] iArr, MotionEvent motionEvent, int i10) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        iArr[0] = androidx.core.view.i.i(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
        iArr[1] = androidx.core.view.i.h(context, viewConfiguration, motionEvent.getDeviceId(), i10, motionEvent.getSource());
    }

    private boolean d(MotionEvent motionEvent, int i10) {
        int source = motionEvent.getSource();
        int deviceId = motionEvent.getDeviceId();
        if (this.f16322h == source && this.f16323i == deviceId && this.f16321g == i10) {
            return false;
        }
        this.f16317c.a(this.f16315a, this.f16324j, motionEvent, i10);
        this.f16322h = source;
        this.f16323i = deviceId;
        this.f16321g = i10;
        return true;
    }

    private float e(MotionEvent motionEvent, int i10) {
        if (this.f16319e == null) {
            this.f16319e = VelocityTracker.obtain();
        }
        return this.f16318d.a(this.f16319e, motionEvent, i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static float f(VelocityTracker velocityTracker, MotionEvent motionEvent, int i10) {
        androidx.core.view.f.a(velocityTracker, motionEvent);
        androidx.core.view.f.b(velocityTracker, 1000);
        return androidx.core.view.f.d(velocityTracker, i10);
    }

    public void g(MotionEvent motionEvent, int i10) {
        boolean zD = d(motionEvent, i10);
        if (this.f16324j[0] == Integer.MAX_VALUE) {
            VelocityTracker velocityTracker = this.f16319e;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f16319e = null;
                return;
            }
            return;
        }
        float fE = e(motionEvent, i10) * this.f16316b.b();
        float fSignum = Math.signum(fE);
        if (zD || (fSignum != Math.signum(this.f16320f) && fSignum != 0.0f)) {
            this.f16316b.c();
        }
        float fAbs = Math.abs(fE);
        int[] iArr = this.f16324j;
        if (fAbs < iArr[0]) {
            return;
        }
        float fMax = Math.max(-r6, Math.min(fE, iArr[1]));
        this.f16320f = this.f16316b.a(fMax) ? fMax : 0.0f;
    }
}
