package j0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import y1.d1;
import y1.t0;

/* JADX INFO: loaded from: classes.dex */
public final class w implements v, y1.g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f13778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final d1 f13779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q f13780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HashMap<Integer, List<t0>> f13781d = new HashMap<>();

    public w(o oVar, d1 d1Var) {
        this.f13778a = oVar;
        this.f13779b = d1Var;
        this.f13780c = oVar.d().invoke();
    }

    @Override // y1.n
    public boolean C0() {
        return this.f13779b.C0();
    }

    @Override // w2.d
    public float G0(float f10) {
        return this.f13779b.G0(f10);
    }

    @Override // y1.g0
    public y1.f0 J0(int i10, int i11, Map<y1.a, Integer> map, zd.l<? super t0.a, md.i0> lVar) {
        return this.f13779b.J0(i10, i11, map, lVar);
    }

    @Override // w2.d
    public long N(long j10) {
        return this.f13779b.N(j10);
    }

    @Override // w2.l
    public float Q(long j10) {
        return this.f13779b.Q(j10);
    }

    @Override // w2.d
    public int a1(float f10) {
        return this.f13779b.a1(f10);
    }

    @Override // j0.v, w2.l
    public long g(float f10) {
        return this.f13779b.g(f10);
    }

    @Override // w2.d
    public float getDensity() {
        return this.f13779b.getDensity();
    }

    @Override // y1.n
    public w2.r getLayoutDirection() {
        return this.f13779b.getLayoutDirection();
    }

    @Override // w2.d
    public float l0(int i10) {
        return this.f13779b.l0(i10);
    }

    @Override // j0.v
    public List<t0> m0(int i10, long j10) {
        List<t0> list = this.f13781d.get(Integer.valueOf(i10));
        if (list != null) {
            return list;
        }
        Object objA = this.f13780c.a(i10);
        List<y1.d0> listF0 = this.f13779b.F0(objA, this.f13778a.b(i10, objA, this.f13780c.d(i10)));
        int size = listF0.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i11 = 0; i11 < size; i11++) {
            arrayList.add(listF0.get(i11).I(j10));
        }
        this.f13781d.put(Integer.valueOf(i10), arrayList);
        return arrayList;
    }

    @Override // w2.d
    public float n0(float f10) {
        return this.f13779b.n0(f10);
    }

    @Override // w2.d
    public float o1(long j10) {
        return this.f13779b.o1(j10);
    }

    @Override // j0.v, w2.d
    public long q(float f10) {
        return this.f13779b.q(f10);
    }

    @Override // j0.v, w2.d
    public long w(long j10) {
        return this.f13779b.w(j10);
    }

    @Override // w2.l
    public float y0() {
        return this.f13779b.y0();
    }
}
