package p1;

import java.util.ArrayList;
import java.util.List;
import l1.j0;
import l1.v;
import l1.z;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f17899k = new b(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static int f17900l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f17901a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f17902b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f17903c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f17904d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f17905e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final n f17906f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final long f17907g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f17908h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f17909i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f17910j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f17911a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f17912b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f17913c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f17914d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f17915e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final long f17916f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f17917g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final boolean f17918h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final ArrayList<C0380a> f17919i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private C0380a f17920j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f17921k;

        /* JADX INFO: renamed from: p1.d$a$a, reason: collision with other inner class name */
        private static final class C0380a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private String f17922a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private float f17923b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private float f17924c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private float f17925d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private float f17926e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private float f17927f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private float f17928g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            private float f17929h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            private List<? extends h> f17930i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            private List<p> f17931j;

            public C0380a() {
                this(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            }

            public C0380a(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List<? extends h> list, List<p> list2) {
                this.f17922a = str;
                this.f17923b = f10;
                this.f17924c = f11;
                this.f17925d = f12;
                this.f17926e = f13;
                this.f17927f = f14;
                this.f17928g = f15;
                this.f17929h = f16;
                this.f17930i = list;
                this.f17931j = list2;
            }

            public /* synthetic */ C0380a(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List list, List list2, int i10, ae.j jVar) {
                this((i10 & 1) != 0 ? "" : str, (i10 & 2) != 0 ? 0.0f : f10, (i10 & 4) != 0 ? 0.0f : f11, (i10 & 8) != 0 ? 0.0f : f12, (i10 & 16) != 0 ? 1.0f : f13, (i10 & 32) == 0 ? f14 : 1.0f, (i10 & 64) != 0 ? 0.0f : f15, (i10 & 128) == 0 ? f16 : 0.0f, (i10 & 256) != 0 ? o.e() : list, (i10 & 512) != 0 ? new ArrayList() : list2);
            }

            public final List<p> a() {
                return this.f17931j;
            }

            public final List<h> b() {
                return this.f17930i;
            }

            public final String c() {
                return this.f17922a;
            }

            public final float d() {
                return this.f17924c;
            }

            public final float e() {
                return this.f17925d;
            }

            public final float f() {
                return this.f17923b;
            }

            public final float g() {
                return this.f17926e;
            }

            public final float h() {
                return this.f17927f;
            }

            public final float i() {
                return this.f17928g;
            }

            public final float j() {
                return this.f17929h;
            }
        }

        private a(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10) {
            this.f17911a = str;
            this.f17912b = f10;
            this.f17913c = f11;
            this.f17914d = f12;
            this.f17915e = f13;
            this.f17916f = j10;
            this.f17917g = i10;
            this.f17918h = z10;
            ArrayList<C0380a> arrayList = new ArrayList<>();
            this.f17919i = arrayList;
            C0380a c0380a = new C0380a(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, null, 1023, null);
            this.f17920j = c0380a;
            e.f(arrayList, c0380a);
        }

        public /* synthetic */ a(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10, int i11, ae.j jVar) {
            this((i11 & 1) != 0 ? "" : str, f10, f11, f12, f13, (i11 & 32) != 0 ? j0.f14524b.j() : j10, (i11 & 64) != 0 ? v.f14592a.z() : i10, (i11 & 128) != 0 ? false : z10, null);
        }

        public /* synthetic */ a(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10, ae.j jVar) {
            this(str, f10, f11, f12, f13, j10, i10, z10);
        }

        private final n e(C0380a c0380a) {
            return new n(c0380a.c(), c0380a.f(), c0380a.d(), c0380a.e(), c0380a.g(), c0380a.h(), c0380a.i(), c0380a.j(), c0380a.b(), c0380a.a());
        }

        private final void h() {
            if (!(!this.f17921k)) {
                throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector".toString());
            }
        }

        private final C0380a i() {
            return (C0380a) e.d(this.f17919i);
        }

        public final a a(String str, float f10, float f11, float f12, float f13, float f14, float f15, float f16, List<? extends h> list) {
            h();
            e.f(this.f17919i, new C0380a(str, f10, f11, f12, f13, f14, f15, f16, list, null, 512, null));
            return this;
        }

        public final a c(List<? extends h> list, int i10, String str, z zVar, float f10, z zVar2, float f11, float f12, int i11, int i12, float f13, float f14, float f15, float f16) {
            h();
            i().a().add(new s(str, list, i10, zVar, f10, zVar2, f11, f12, i11, i12, f13, f14, f15, f16, null));
            return this;
        }

        public final d f() {
            h();
            while (this.f17919i.size() > 1) {
                g();
            }
            d dVar = new d(this.f17911a, this.f17912b, this.f17913c, this.f17914d, this.f17915e, e(this.f17920j), this.f17916f, this.f17917g, this.f17918h, 0, 512, null);
            this.f17921k = true;
            return dVar;
        }

        public final a g() {
            h();
            i().a().add(e((C0380a) e.e(this.f17919i)));
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(ae.j jVar) {
            this();
        }

        public final int a() {
            int i10;
            synchronized (this) {
                i10 = d.f17900l;
                d.f17900l = i10 + 1;
            }
            return i10;
        }
    }

    private d(String str, float f10, float f11, float f12, float f13, n nVar, long j10, int i10, boolean z10, int i11) {
        this.f17901a = str;
        this.f17902b = f10;
        this.f17903c = f11;
        this.f17904d = f12;
        this.f17905e = f13;
        this.f17906f = nVar;
        this.f17907g = j10;
        this.f17908h = i10;
        this.f17909i = z10;
        this.f17910j = i11;
    }

    public /* synthetic */ d(String str, float f10, float f11, float f12, float f13, n nVar, long j10, int i10, boolean z10, int i11, int i12, ae.j jVar) {
        this(str, f10, f11, f12, f13, nVar, j10, i10, z10, (i12 & 512) != 0 ? f17899k.a() : i11, null);
    }

    public /* synthetic */ d(String str, float f10, float f11, float f12, float f13, n nVar, long j10, int i10, boolean z10, int i11, ae.j jVar) {
        this(str, f10, f11, f12, f13, nVar, j10, i10, z10, i11);
    }

    public final boolean c() {
        return this.f17909i;
    }

    public final float d() {
        return this.f17903c;
    }

    public final float e() {
        return this.f17902b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!ae.r.b(this.f17901a, dVar.f17901a) || !w2.h.o(this.f17902b, dVar.f17902b) || !w2.h.o(this.f17903c, dVar.f17903c)) {
            return false;
        }
        if (this.f17904d == dVar.f17904d) {
            return ((this.f17905e > dVar.f17905e ? 1 : (this.f17905e == dVar.f17905e ? 0 : -1)) == 0) && ae.r.b(this.f17906f, dVar.f17906f) && j0.w(this.f17907g, dVar.f17907g) && v.E(this.f17908h, dVar.f17908h) && this.f17909i == dVar.f17909i;
        }
        return false;
    }

    public final int f() {
        return this.f17910j;
    }

    public final String g() {
        return this.f17901a;
    }

    public final n h() {
        return this.f17906f;
    }

    public int hashCode() {
        return (((((((((((((((this.f17901a.hashCode() * 31) + w2.h.p(this.f17902b)) * 31) + w2.h.p(this.f17903c)) * 31) + Float.hashCode(this.f17904d)) * 31) + Float.hashCode(this.f17905e)) * 31) + this.f17906f.hashCode()) * 31) + j0.C(this.f17907g)) * 31) + v.F(this.f17908h)) * 31) + Boolean.hashCode(this.f17909i);
    }

    public final int i() {
        return this.f17908h;
    }

    public final long j() {
        return this.f17907g;
    }

    public final float k() {
        return this.f17905e;
    }

    public final float l() {
        return this.f17904d;
    }
}
