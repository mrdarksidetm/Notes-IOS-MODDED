package p1;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f17955a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f17956b;

    public static final class a extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f17957c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f17958d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f17959e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f17960f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f17961g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final float f17962h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final float f17963i;

        /* JADX WARN: Illegal instructions before constructor call */
        public a(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            boolean z12 = false;
            super(z12, z12, 3, null);
            this.f17957c = f10;
            this.f17958d = f11;
            this.f17959e = f12;
            this.f17960f = z10;
            this.f17961g = z11;
            this.f17962h = f13;
            this.f17963i = f14;
        }

        public final float c() {
            return this.f17962h;
        }

        public final float d() {
            return this.f17963i;
        }

        public final float e() {
            return this.f17957c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f17957c, aVar.f17957c) == 0 && Float.compare(this.f17958d, aVar.f17958d) == 0 && Float.compare(this.f17959e, aVar.f17959e) == 0 && this.f17960f == aVar.f17960f && this.f17961g == aVar.f17961g && Float.compare(this.f17962h, aVar.f17962h) == 0 && Float.compare(this.f17963i, aVar.f17963i) == 0;
        }

        public final float f() {
            return this.f17959e;
        }

        public final float g() {
            return this.f17958d;
        }

        public final boolean h() {
            return this.f17960f;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.f17957c) * 31) + Float.hashCode(this.f17958d)) * 31) + Float.hashCode(this.f17959e)) * 31) + Boolean.hashCode(this.f17960f)) * 31) + Boolean.hashCode(this.f17961g)) * 31) + Float.hashCode(this.f17962h)) * 31) + Float.hashCode(this.f17963i);
        }

        public final boolean i() {
            return this.f17961g;
        }

        public String toString() {
            return "ArcTo(horizontalEllipseRadius=" + this.f17957c + ", verticalEllipseRadius=" + this.f17958d + ", theta=" + this.f17959e + ", isMoreThanHalf=" + this.f17960f + ", isPositiveArc=" + this.f17961g + ", arcStartX=" + this.f17962h + ", arcStartY=" + this.f17963i + ')';
        }
    }

    public static final class b extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final b f17964c = new b();

        /* JADX WARN: Illegal instructions before constructor call */
        private b() {
            boolean z10 = false;
            super(z10, z10, 3, null);
        }
    }

    public static final class c extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f17965c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f17966d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f17967e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f17968f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float f17969g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final float f17970h;

        public c(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(true, false, 2, null);
            this.f17965c = f10;
            this.f17966d = f11;
            this.f17967e = f12;
            this.f17968f = f13;
            this.f17969g = f14;
            this.f17970h = f15;
        }

        public final float c() {
            return this.f17965c;
        }

        public final float d() {
            return this.f17967e;
        }

        public final float e() {
            return this.f17969g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Float.compare(this.f17965c, cVar.f17965c) == 0 && Float.compare(this.f17966d, cVar.f17966d) == 0 && Float.compare(this.f17967e, cVar.f17967e) == 0 && Float.compare(this.f17968f, cVar.f17968f) == 0 && Float.compare(this.f17969g, cVar.f17969g) == 0 && Float.compare(this.f17970h, cVar.f17970h) == 0;
        }

        public final float f() {
            return this.f17966d;
        }

        public final float g() {
            return this.f17968f;
        }

        public final float h() {
            return this.f17970h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f17965c) * 31) + Float.hashCode(this.f17966d)) * 31) + Float.hashCode(this.f17967e)) * 31) + Float.hashCode(this.f17968f)) * 31) + Float.hashCode(this.f17969g)) * 31) + Float.hashCode(this.f17970h);
        }

        public String toString() {
            return "CurveTo(x1=" + this.f17965c + ", y1=" + this.f17966d + ", x2=" + this.f17967e + ", y2=" + this.f17968f + ", x3=" + this.f17969g + ", y3=" + this.f17970h + ')';
        }
    }

    public static final class d extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f17971c;

        /* JADX WARN: Illegal instructions before constructor call */
        public d(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f17971c = f10;
        }

        public final float c() {
            return this.f17971c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Float.compare(this.f17971c, ((d) obj).f17971c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f17971c);
        }

        public String toString() {
            return "HorizontalTo(x=" + this.f17971c + ')';
        }
    }

    public static final class e extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f17972c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f17973d;

        /* JADX WARN: Illegal instructions before constructor call */
        public e(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f17972c = f10;
            this.f17973d = f11;
        }

        public final float c() {
            return this.f17972c;
        }

        public final float d() {
            return this.f17973d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return Float.compare(this.f17972c, eVar.f17972c) == 0 && Float.compare(this.f17973d, eVar.f17973d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f17972c) * 31) + Float.hashCode(this.f17973d);
        }

        public String toString() {
            return "LineTo(x=" + this.f17972c + ", y=" + this.f17973d + ')';
        }
    }

    public static final class f extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f17974c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f17975d;

        /* JADX WARN: Illegal instructions before constructor call */
        public f(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f17974c = f10;
            this.f17975d = f11;
        }

        public final float c() {
            return this.f17974c;
        }

        public final float d() {
            return this.f17975d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Float.compare(this.f17974c, fVar.f17974c) == 0 && Float.compare(this.f17975d, fVar.f17975d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f17974c) * 31) + Float.hashCode(this.f17975d);
        }

        public String toString() {
            return "MoveTo(x=" + this.f17974c + ", y=" + this.f17975d + ')';
        }
    }

    public static final class g extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f17976c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f17977d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f17978e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f17979f;

        public g(float f10, float f11, float f12, float f13) {
            super(false, true, true ? 1 : 0, null);
            this.f17976c = f10;
            this.f17977d = f11;
            this.f17978e = f12;
            this.f17979f = f13;
        }

        public final float c() {
            return this.f17976c;
        }

        public final float d() {
            return this.f17978e;
        }

        public final float e() {
            return this.f17977d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Float.compare(this.f17976c, gVar.f17976c) == 0 && Float.compare(this.f17977d, gVar.f17977d) == 0 && Float.compare(this.f17978e, gVar.f17978e) == 0 && Float.compare(this.f17979f, gVar.f17979f) == 0;
        }

        public final float f() {
            return this.f17979f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f17976c) * 31) + Float.hashCode(this.f17977d)) * 31) + Float.hashCode(this.f17978e)) * 31) + Float.hashCode(this.f17979f);
        }

        public String toString() {
            return "QuadTo(x1=" + this.f17976c + ", y1=" + this.f17977d + ", x2=" + this.f17978e + ", y2=" + this.f17979f + ')';
        }
    }

    /* JADX INFO: renamed from: p1.h$h, reason: collision with other inner class name */
    public static final class C0381h extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f17980c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f17981d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f17982e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f17983f;

        public C0381h(float f10, float f11, float f12, float f13) {
            super(true, false, 2, null);
            this.f17980c = f10;
            this.f17981d = f11;
            this.f17982e = f12;
            this.f17983f = f13;
        }

        public final float c() {
            return this.f17980c;
        }

        public final float d() {
            return this.f17982e;
        }

        public final float e() {
            return this.f17981d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0381h)) {
                return false;
            }
            C0381h c0381h = (C0381h) obj;
            return Float.compare(this.f17980c, c0381h.f17980c) == 0 && Float.compare(this.f17981d, c0381h.f17981d) == 0 && Float.compare(this.f17982e, c0381h.f17982e) == 0 && Float.compare(this.f17983f, c0381h.f17983f) == 0;
        }

        public final float f() {
            return this.f17983f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f17980c) * 31) + Float.hashCode(this.f17981d)) * 31) + Float.hashCode(this.f17982e)) * 31) + Float.hashCode(this.f17983f);
        }

        public String toString() {
            return "ReflectiveCurveTo(x1=" + this.f17980c + ", y1=" + this.f17981d + ", x2=" + this.f17982e + ", y2=" + this.f17983f + ')';
        }
    }

    public static final class i extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f17984c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f17985d;

        public i(float f10, float f11) {
            super(false, true, true ? 1 : 0, null);
            this.f17984c = f10;
            this.f17985d = f11;
        }

        public final float c() {
            return this.f17984c;
        }

        public final float d() {
            return this.f17985d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Float.compare(this.f17984c, iVar.f17984c) == 0 && Float.compare(this.f17985d, iVar.f17985d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f17984c) * 31) + Float.hashCode(this.f17985d);
        }

        public String toString() {
            return "ReflectiveQuadTo(x=" + this.f17984c + ", y=" + this.f17985d + ')';
        }
    }

    public static final class j extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f17986c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f17987d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f17988e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f17989f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final boolean f17990g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final float f17991h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final float f17992i;

        /* JADX WARN: Illegal instructions before constructor call */
        public j(float f10, float f11, float f12, boolean z10, boolean z11, float f13, float f14) {
            boolean z12 = false;
            super(z12, z12, 3, null);
            this.f17986c = f10;
            this.f17987d = f11;
            this.f17988e = f12;
            this.f17989f = z10;
            this.f17990g = z11;
            this.f17991h = f13;
            this.f17992i = f14;
        }

        public final float c() {
            return this.f17991h;
        }

        public final float d() {
            return this.f17992i;
        }

        public final float e() {
            return this.f17986c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return Float.compare(this.f17986c, jVar.f17986c) == 0 && Float.compare(this.f17987d, jVar.f17987d) == 0 && Float.compare(this.f17988e, jVar.f17988e) == 0 && this.f17989f == jVar.f17989f && this.f17990g == jVar.f17990g && Float.compare(this.f17991h, jVar.f17991h) == 0 && Float.compare(this.f17992i, jVar.f17992i) == 0;
        }

        public final float f() {
            return this.f17988e;
        }

        public final float g() {
            return this.f17987d;
        }

        public final boolean h() {
            return this.f17989f;
        }

        public int hashCode() {
            return (((((((((((Float.hashCode(this.f17986c) * 31) + Float.hashCode(this.f17987d)) * 31) + Float.hashCode(this.f17988e)) * 31) + Boolean.hashCode(this.f17989f)) * 31) + Boolean.hashCode(this.f17990g)) * 31) + Float.hashCode(this.f17991h)) * 31) + Float.hashCode(this.f17992i);
        }

        public final boolean i() {
            return this.f17990g;
        }

        public String toString() {
            return "RelativeArcTo(horizontalEllipseRadius=" + this.f17986c + ", verticalEllipseRadius=" + this.f17987d + ", theta=" + this.f17988e + ", isMoreThanHalf=" + this.f17989f + ", isPositiveArc=" + this.f17990g + ", arcStartDx=" + this.f17991h + ", arcStartDy=" + this.f17992i + ')';
        }
    }

    public static final class k extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f17993c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f17994d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f17995e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f17996f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final float f17997g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final float f17998h;

        public k(float f10, float f11, float f12, float f13, float f14, float f15) {
            super(true, false, 2, null);
            this.f17993c = f10;
            this.f17994d = f11;
            this.f17995e = f12;
            this.f17996f = f13;
            this.f17997g = f14;
            this.f17998h = f15;
        }

        public final float c() {
            return this.f17993c;
        }

        public final float d() {
            return this.f17995e;
        }

        public final float e() {
            return this.f17997g;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return Float.compare(this.f17993c, kVar.f17993c) == 0 && Float.compare(this.f17994d, kVar.f17994d) == 0 && Float.compare(this.f17995e, kVar.f17995e) == 0 && Float.compare(this.f17996f, kVar.f17996f) == 0 && Float.compare(this.f17997g, kVar.f17997g) == 0 && Float.compare(this.f17998h, kVar.f17998h) == 0;
        }

        public final float f() {
            return this.f17994d;
        }

        public final float g() {
            return this.f17996f;
        }

        public final float h() {
            return this.f17998h;
        }

        public int hashCode() {
            return (((((((((Float.hashCode(this.f17993c) * 31) + Float.hashCode(this.f17994d)) * 31) + Float.hashCode(this.f17995e)) * 31) + Float.hashCode(this.f17996f)) * 31) + Float.hashCode(this.f17997g)) * 31) + Float.hashCode(this.f17998h);
        }

        public String toString() {
            return "RelativeCurveTo(dx1=" + this.f17993c + ", dy1=" + this.f17994d + ", dx2=" + this.f17995e + ", dy2=" + this.f17996f + ", dx3=" + this.f17997g + ", dy3=" + this.f17998h + ')';
        }
    }

    public static final class l extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f17999c;

        /* JADX WARN: Illegal instructions before constructor call */
        public l(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f17999c = f10;
        }

        public final float c() {
            return this.f17999c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && Float.compare(this.f17999c, ((l) obj).f17999c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f17999c);
        }

        public String toString() {
            return "RelativeHorizontalTo(dx=" + this.f17999c + ')';
        }
    }

    public static final class m extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f18000c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f18001d;

        /* JADX WARN: Illegal instructions before constructor call */
        public m(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f18000c = f10;
            this.f18001d = f11;
        }

        public final float c() {
            return this.f18000c;
        }

        public final float d() {
            return this.f18001d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return Float.compare(this.f18000c, mVar.f18000c) == 0 && Float.compare(this.f18001d, mVar.f18001d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f18000c) * 31) + Float.hashCode(this.f18001d);
        }

        public String toString() {
            return "RelativeLineTo(dx=" + this.f18000c + ", dy=" + this.f18001d + ')';
        }
    }

    public static final class n extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f18002c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f18003d;

        /* JADX WARN: Illegal instructions before constructor call */
        public n(float f10, float f11) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f18002c = f10;
            this.f18003d = f11;
        }

        public final float c() {
            return this.f18002c;
        }

        public final float d() {
            return this.f18003d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return Float.compare(this.f18002c, nVar.f18002c) == 0 && Float.compare(this.f18003d, nVar.f18003d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f18002c) * 31) + Float.hashCode(this.f18003d);
        }

        public String toString() {
            return "RelativeMoveTo(dx=" + this.f18002c + ", dy=" + this.f18003d + ')';
        }
    }

    public static final class o extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f18004c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f18005d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f18006e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f18007f;

        public o(float f10, float f11, float f12, float f13) {
            super(false, true, true ? 1 : 0, null);
            this.f18004c = f10;
            this.f18005d = f11;
            this.f18006e = f12;
            this.f18007f = f13;
        }

        public final float c() {
            return this.f18004c;
        }

        public final float d() {
            return this.f18006e;
        }

        public final float e() {
            return this.f18005d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return Float.compare(this.f18004c, oVar.f18004c) == 0 && Float.compare(this.f18005d, oVar.f18005d) == 0 && Float.compare(this.f18006e, oVar.f18006e) == 0 && Float.compare(this.f18007f, oVar.f18007f) == 0;
        }

        public final float f() {
            return this.f18007f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f18004c) * 31) + Float.hashCode(this.f18005d)) * 31) + Float.hashCode(this.f18006e)) * 31) + Float.hashCode(this.f18007f);
        }

        public String toString() {
            return "RelativeQuadTo(dx1=" + this.f18004c + ", dy1=" + this.f18005d + ", dx2=" + this.f18006e + ", dy2=" + this.f18007f + ')';
        }
    }

    public static final class p extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f18008c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f18009d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final float f18010e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final float f18011f;

        public p(float f10, float f11, float f12, float f13) {
            super(true, false, 2, null);
            this.f18008c = f10;
            this.f18009d = f11;
            this.f18010e = f12;
            this.f18011f = f13;
        }

        public final float c() {
            return this.f18008c;
        }

        public final float d() {
            return this.f18010e;
        }

        public final float e() {
            return this.f18009d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return Float.compare(this.f18008c, pVar.f18008c) == 0 && Float.compare(this.f18009d, pVar.f18009d) == 0 && Float.compare(this.f18010e, pVar.f18010e) == 0 && Float.compare(this.f18011f, pVar.f18011f) == 0;
        }

        public final float f() {
            return this.f18011f;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.f18008c) * 31) + Float.hashCode(this.f18009d)) * 31) + Float.hashCode(this.f18010e)) * 31) + Float.hashCode(this.f18011f);
        }

        public String toString() {
            return "RelativeReflectiveCurveTo(dx1=" + this.f18008c + ", dy1=" + this.f18009d + ", dx2=" + this.f18010e + ", dy2=" + this.f18011f + ')';
        }
    }

    public static final class q extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f18012c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float f18013d;

        public q(float f10, float f11) {
            super(false, true, true ? 1 : 0, null);
            this.f18012c = f10;
            this.f18013d = f11;
        }

        public final float c() {
            return this.f18012c;
        }

        public final float d() {
            return this.f18013d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof q)) {
                return false;
            }
            q qVar = (q) obj;
            return Float.compare(this.f18012c, qVar.f18012c) == 0 && Float.compare(this.f18013d, qVar.f18013d) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f18012c) * 31) + Float.hashCode(this.f18013d);
        }

        public String toString() {
            return "RelativeReflectiveQuadTo(dx=" + this.f18012c + ", dy=" + this.f18013d + ')';
        }
    }

    public static final class r extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f18014c;

        /* JADX WARN: Illegal instructions before constructor call */
        public r(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f18014c = f10;
        }

        public final float c() {
            return this.f18014c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof r) && Float.compare(this.f18014c, ((r) obj).f18014c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f18014c);
        }

        public String toString() {
            return "RelativeVerticalTo(dy=" + this.f18014c + ')';
        }
    }

    public static final class s extends h {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final float f18015c;

        /* JADX WARN: Illegal instructions before constructor call */
        public s(float f10) {
            boolean z10 = false;
            super(z10, z10, 3, null);
            this.f18015c = f10;
        }

        public final float c() {
            return this.f18015c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && Float.compare(this.f18015c, ((s) obj).f18015c) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.f18015c);
        }

        public String toString() {
            return "VerticalTo(y=" + this.f18015c + ')';
        }
    }

    private h(boolean z10, boolean z11) {
        this.f17955a = z10;
        this.f17956b = z11;
    }

    public /* synthetic */ h(boolean z10, boolean z11, int i10, ae.j jVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, null);
    }

    public /* synthetic */ h(boolean z10, boolean z11, ae.j jVar) {
        this(z10, z11);
    }

    public final boolean a() {
        return this.f17955a;
    }

    public final boolean b() {
        return this.f17956b;
    }
}
