package ya;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b f23554l = new a().a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f23558d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f23559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f23560f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f23562h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f23563i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f23564j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f23565k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f23555a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f23556b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f23557c = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final n f23561g = null;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f23566a = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f23567b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int[] f23568c = {101};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f23569d = true;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f23570e = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f23571f = true;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f23572g = true;

        public b a() {
            return new b(this, null);
        }

        public a b(boolean z10) {
            this.f23566a = z10;
            return this;
        }

        public a c(int i10) {
            w8.m.b(i10 > 0, "pageLimit should be be greater than or equal to 1");
            this.f23567b = i10;
            return this;
        }

        public a d(int i10, int... iArr) {
            w8.m.b(iArr != null, "moreFormats cannot be null");
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
            this.f23568c = iArrCopyOf;
            iArrCopyOf[length] = i10;
            return this;
        }

        public a e(int i10) {
            if (i10 == 1) {
                this.f23569d = true;
                this.f23570e = true;
                this.f23571f = true;
                this.f23572g = true;
            } else {
                if (i10 == 2) {
                    this.f23569d = false;
                    this.f23570e = true;
                    this.f23571f = true;
                } else {
                    if (i10 != 3) {
                        throw new IllegalArgumentException("Invalid scanner mode: " + i10);
                    }
                    this.f23569d = false;
                    this.f23570e = false;
                    this.f23571f = false;
                }
                this.f23572g = false;
            }
            return this;
        }
    }

    /* synthetic */ b(a aVar, o oVar) {
        this.f23558d = aVar.f23566a;
        this.f23559e = aVar.f23567b;
        this.f23560f = aVar.f23568c;
        this.f23562h = aVar.f23569d;
        this.f23563i = aVar.f23570e;
        this.f23564j = aVar.f23571f;
        this.f23565k = aVar.f23572g;
    }

    public final int a() {
        return this.f23559e;
    }

    public final boolean b() {
        return this.f23562h;
    }

    public final boolean c() {
        return this.f23563i;
    }

    public final boolean d() {
        return this.f23558d;
    }

    public final boolean e() {
        return this.f23564j;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        List list = bVar.f23555a;
        return w8.k.b(null, null) && this.f23558d == bVar.f23558d && this.f23559e == bVar.f23559e && Arrays.equals(this.f23560f, bVar.f23560f) && w8.k.b(null, null) && this.f23562h == bVar.f23562h && this.f23563i == bVar.f23563i && this.f23564j == bVar.f23564j && this.f23565k == bVar.f23565k;
    }

    public final boolean f() {
        return this.f23565k;
    }

    public final int[] g() {
        return this.f23560f;
    }

    public int hashCode() {
        return w8.k.c(null, 1, Boolean.TRUE, Boolean.valueOf(this.f23558d), Integer.valueOf(this.f23559e), Integer.valueOf(Arrays.hashCode(this.f23560f)), null, Boolean.valueOf(this.f23562h), Boolean.valueOf(this.f23563i), Boolean.valueOf(this.f23564j), Boolean.valueOf(this.f23565k));
    }
}
