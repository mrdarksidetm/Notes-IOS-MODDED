package i0;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class w implements u, y1.f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final z f12225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f12226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f12227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f12228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f12229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<x> f12230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f12231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f12232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f12233i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f12234j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final e0.r f12235k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f12236l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f12237m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final /* synthetic */ y1.f0 f12238n;

    public w(z zVar, int i10, boolean z10, float f10, y1.f0 f0Var, boolean z11, List<x> list, int i11, int i12, int i13, boolean z12, e0.r rVar, int i14, int i15) {
        this.f12225a = zVar;
        this.f12226b = i10;
        this.f12227c = z10;
        this.f12228d = f10;
        this.f12229e = z11;
        this.f12230f = list;
        this.f12231g = i11;
        this.f12232h = i12;
        this.f12233i = i13;
        this.f12234j = z12;
        this.f12235k = rVar;
        this.f12236l = i14;
        this.f12237m = i15;
        this.f12238n = f0Var;
    }

    @Override // y1.f0
    public void a() {
        this.f12238n.a();
    }

    @Override // i0.u
    public int b() {
        return this.f12233i;
    }

    @Override // i0.u
    public List<x> c() {
        return this.f12230f;
    }

    @Override // y1.f0
    public Map<y1.a, Integer> d() {
        return this.f12238n.d();
    }

    public final boolean e() {
        z zVar = this.f12225a;
        return ((zVar != null ? zVar.a() : 0) == 0 && this.f12226b == 0) ? false : true;
    }

    public final boolean f() {
        return this.f12227c;
    }

    public final float g() {
        return this.f12228d;
    }

    @Override // y1.f0
    public int getHeight() {
        return this.f12238n.getHeight();
    }

    @Override // y1.f0
    public int getWidth() {
        return this.f12238n.getWidth();
    }

    public final z h() {
        return this.f12225a;
    }

    public final int i() {
        return this.f12226b;
    }

    public e0.r j() {
        return this.f12235k;
    }

    public int k() {
        return this.f12232h;
    }

    public int l() {
        return this.f12231g;
    }

    public final boolean m(int i10) {
        z zVar;
        if (this.f12229e || c().isEmpty() || (zVar = this.f12225a) == null) {
            return false;
        }
        int iD = zVar.d();
        int i11 = this.f12226b - i10;
        if (!(i11 >= 0 && i11 < iD)) {
            return false;
        }
        x xVar = (x) nd.c0.Y(c());
        x xVar2 = (x) nd.c0.j0(c());
        if (xVar.l() || xVar2.l()) {
            return false;
        }
        if (!(i10 >= 0 ? Math.min(l() - f0.a.a(xVar, j()), k() - f0.a.a(xVar2, j())) > i10 : Math.min((f0.a.a(xVar, j()) + xVar.k()) - l(), (f0.a.a(xVar2, j()) + xVar2.k()) - k()) > (-i10))) {
            return false;
        }
        this.f12226b -= i10;
        List<x> listC = c();
        int size = listC.size();
        for (int i12 = 0; i12 < size; i12++) {
            listC.get(i12).d(i10);
        }
        this.f12228d = i10;
        if (!this.f12227c && i10 > 0) {
            this.f12227c = true;
        }
        return true;
    }
}
