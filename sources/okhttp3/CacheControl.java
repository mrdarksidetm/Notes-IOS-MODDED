package okhttp3;

import ae.j;
import ae.r;
import com.google.android.gms.common.api.a;
import java.util.concurrent.TimeUnit;
import je.w;

/* JADX INFO: loaded from: classes2.dex */
public final class CacheControl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Companion f16659n = new Companion(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final CacheControl f16660o = new Builder().d().a();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final CacheControl f16661p = new Builder().f().c(a.e.API_PRIORITY_OTHER, TimeUnit.SECONDS).a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f16662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f16663b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f16664c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f16665d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f16666e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f16667f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f16668g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f16669h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f16670i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f16671j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f16672k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final boolean f16673l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f16674m;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f16675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f16676b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f16677c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f16678d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f16679e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f16680f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f16681g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f16682h;

        private final int b(long j10) {
            return j10 > 2147483647L ? a.e.API_PRIORITY_OTHER : (int) j10;
        }

        public final CacheControl a() {
            return new CacheControl(this.f16675a, this.f16676b, this.f16677c, -1, false, false, false, this.f16678d, this.f16679e, this.f16680f, this.f16681g, this.f16682h, null, null);
        }

        public final Builder c(int i10, TimeUnit timeUnit) {
            r.f(timeUnit, "timeUnit");
            if (!(i10 >= 0)) {
                throw new IllegalArgumentException(r.m("maxStale < 0: ", Integer.valueOf(i10)).toString());
            }
            this.f16678d = b(timeUnit.toSeconds(i10));
            return this;
        }

        public final Builder d() {
            this.f16675a = true;
            return this;
        }

        public final Builder e() {
            this.f16676b = true;
            return this;
        }

        public final Builder f() {
            this.f16680f = true;
            return this;
        }
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(j jVar) {
            this();
        }

        private final int a(String str, String str2, int i10) {
            int length = str.length();
            while (i10 < length) {
                int i11 = i10 + 1;
                if (w.K(str2, str.charAt(i10), false, 2, null)) {
                    return i10;
                }
                i10 = i11;
            }
            return str.length();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004c  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final okhttp3.CacheControl b(okhttp3.Headers r31) {
            /*
                Method dump skipped, instruction units count: 398
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.CacheControl.Companion.b(okhttp3.Headers):okhttp3.CacheControl");
        }
    }

    private CacheControl(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.f16662a = z10;
        this.f16663b = z11;
        this.f16664c = i10;
        this.f16665d = i11;
        this.f16666e = z12;
        this.f16667f = z13;
        this.f16668g = z14;
        this.f16669h = i12;
        this.f16670i = i13;
        this.f16671j = z15;
        this.f16672k = z16;
        this.f16673l = z17;
        this.f16674m = str;
    }

    public /* synthetic */ CacheControl(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str, j jVar) {
        this(z10, z11, i10, i11, z12, z13, z14, i12, i13, z15, z16, z17, str);
    }

    public final boolean a() {
        return this.f16673l;
    }

    public final boolean b() {
        return this.f16666e;
    }

    public final boolean c() {
        return this.f16667f;
    }

    public final int d() {
        return this.f16664c;
    }

    public final int e() {
        return this.f16669h;
    }

    public final int f() {
        return this.f16670i;
    }

    public final boolean g() {
        return this.f16668g;
    }

    public final boolean h() {
        return this.f16662a;
    }

    public final boolean i() {
        return this.f16663b;
    }

    public final boolean j() {
        return this.f16672k;
    }

    public final boolean k() {
        return this.f16671j;
    }

    public final int l() {
        return this.f16665d;
    }

    public String toString() {
        String str = this.f16674m;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (h()) {
            sb2.append("no-cache, ");
        }
        if (i()) {
            sb2.append("no-store, ");
        }
        if (d() != -1) {
            sb2.append("max-age=");
            sb2.append(d());
            sb2.append(", ");
        }
        if (l() != -1) {
            sb2.append("s-maxage=");
            sb2.append(l());
            sb2.append(", ");
        }
        if (b()) {
            sb2.append("private, ");
        }
        if (c()) {
            sb2.append("public, ");
        }
        if (g()) {
            sb2.append("must-revalidate, ");
        }
        if (e() != -1) {
            sb2.append("max-stale=");
            sb2.append(e());
            sb2.append(", ");
        }
        if (f() != -1) {
            sb2.append("min-fresh=");
            sb2.append(f());
            sb2.append(", ");
        }
        if (k()) {
            sb2.append("only-if-cached, ");
        }
        if (j()) {
            sb2.append("no-transform, ");
        }
        if (a()) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String string = sb2.toString();
        r.e(string, "StringBuilder().apply(builderAction).toString()");
        this.f16674m = string;
        return string;
    }
}
