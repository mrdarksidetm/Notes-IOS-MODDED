package androidx.core.view;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f3345a = new float[20];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f3346b = new long[20];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f3347c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f3348d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f3349e = 0;

    g() {
    }

    private void b() {
        this.f3348d = 0;
        this.f3347c = 0.0f;
    }

    private float e() {
        long[] jArr;
        long j10;
        int i10 = this.f3348d;
        float fAbs = 0.0f;
        if (i10 < 2) {
            return 0.0f;
        }
        int i11 = this.f3349e;
        int i12 = ((i11 + 20) - (i10 - 1)) % 20;
        long j11 = this.f3346b[i11];
        while (true) {
            jArr = this.f3346b;
            j10 = jArr[i12];
            if (j11 - j10 <= 100) {
                break;
            }
            this.f3348d--;
            i12 = (i12 + 1) % 20;
        }
        int i13 = this.f3348d;
        if (i13 < 2) {
            return 0.0f;
        }
        if (i13 == 2) {
            int i14 = (i12 + 1) % 20;
            if (j10 == jArr[i14]) {
                return 0.0f;
            }
            return this.f3345a[i14] / (r5 - j10);
        }
        int i15 = 0;
        for (int i16 = 0; i16 < this.f3348d - 1; i16++) {
            int i17 = i16 + i12;
            long[] jArr2 = this.f3346b;
            long j12 = jArr2[i17 % 20];
            int i18 = (i17 + 1) % 20;
            if (jArr2[i18] != j12) {
                i15++;
                float f10 = f(fAbs);
                float f11 = this.f3345a[i18] / (this.f3346b[i18] - j12);
                fAbs += (f11 - f10) * Math.abs(f11);
                if (i15 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return f(fAbs);
    }

    private static float f(float f10) {
        return (f10 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f10) * 2.0f));
    }

    void a(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f3348d != 0 && eventTime - this.f3346b[this.f3349e] > 40) {
            b();
        }
        int i10 = (this.f3349e + 1) % 20;
        this.f3349e = i10;
        int i11 = this.f3348d;
        if (i11 != 20) {
            this.f3348d = i11 + 1;
        }
        this.f3345a[i10] = motionEvent.getAxisValue(26);
        this.f3346b[this.f3349e] = eventTime;
    }

    void c(int i10, float f10) {
        float fAbs;
        float fE = e() * i10;
        this.f3347c = fE;
        if (fE < (-Math.abs(f10))) {
            fAbs = -Math.abs(f10);
        } else if (this.f3347c <= Math.abs(f10)) {
            return;
        } else {
            fAbs = Math.abs(f10);
        }
        this.f3347c = fAbs;
    }

    float d(int i10) {
        if (i10 != 26) {
            return 0.0f;
        }
        return this.f3347c;
    }
}
