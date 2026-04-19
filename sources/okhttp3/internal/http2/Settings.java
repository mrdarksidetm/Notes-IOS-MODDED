package okhttp3.internal.http2;

import ae.j;
import ae.r;
import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes2.dex */
public final class Settings {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Companion f17532c = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f17533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f17534b = new int[10];

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }
    }

    public final int a(int i10) {
        return this.f17534b[i10];
    }

    public final int b() {
        if ((this.f17533a & 2) != 0) {
            return this.f17534b[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.f17533a & 128) != 0) {
            return this.f17534b[7];
        }
        return 65535;
    }

    public final int d() {
        return (this.f17533a & 16) != 0 ? this.f17534b[4] : a.e.API_PRIORITY_OTHER;
    }

    public final int e(int i10) {
        return (this.f17533a & 32) != 0 ? this.f17534b[5] : i10;
    }

    public final boolean f(int i10) {
        return ((1 << i10) & this.f17533a) != 0;
    }

    public final void g(Settings settings) {
        r.f(settings, "other");
        int i10 = 0;
        while (i10 < 10) {
            int i11 = i10 + 1;
            if (settings.f(i10)) {
                h(i10, settings.a(i10));
            }
            i10 = i11;
        }
    }

    public final Settings h(int i10, int i11) {
        if (i10 >= 0) {
            int[] iArr = this.f17534b;
            if (i10 < iArr.length) {
                this.f17533a = (1 << i10) | this.f17533a;
                iArr[i10] = i11;
            }
        }
        return this;
    }

    public final int i() {
        return Integer.bitCount(this.f17533a);
    }
}
