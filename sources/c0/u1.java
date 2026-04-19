package c0;

import c0.q;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class u1<V extends q> implements p1<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<Integer, md.s<V, b0>> f6206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f6207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private V f6209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private V f6210e;

    /* JADX WARN: Multi-variable type inference failed */
    public u1(Map<Integer, ? extends md.s<? extends V, ? extends b0>> map, int i10, int i11) {
        this.f6206a = map;
        this.f6207b = i10;
        this.f6208c = i11;
    }

    private final void h(V v10) {
        if (this.f6209d == null) {
            this.f6209d = (V) r.g(v10);
            this.f6210e = (V) r.g(v10);
        }
    }

    @Override // c0.m1
    public V d(long j10, V v10, V v11, V v12) {
        int iB = (int) n1.b(this, j10 / 1000000);
        if (this.f6206a.containsKey(Integer.valueOf(iB))) {
            return (V) ((md.s) nd.r0.f(this.f6206a, Integer.valueOf(iB))).c();
        }
        if (iB >= f()) {
            return v11;
        }
        if (iB <= 0) {
            return v10;
        }
        int iF = f();
        b0 b0VarD = d0.d();
        int i10 = 0;
        V vC = v10;
        int i11 = 0;
        for (Map.Entry<Integer, md.s<V, b0>> entry : this.f6206a.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            md.s<V, b0> value = entry.getValue();
            if (iB > iIntValue && iIntValue >= i11) {
                vC = value.c();
                b0VarD = value.d();
                i11 = iIntValue;
            } else if (iB < iIntValue && iIntValue <= iF) {
                v11 = value.c();
                iF = iIntValue;
            }
        }
        float fA = b0VarD.a((iB - i11) / (iF - i11));
        h(v10);
        int iB2 = vC.b();
        while (true) {
            V v13 = null;
            if (i10 >= iB2) {
                break;
            }
            V v14 = this.f6209d;
            if (v14 == null) {
                ae.r.t("valueVector");
            } else {
                v13 = v14;
            }
            v13.e(i10, l1.k(vC.a(i10), v11.a(i10), fA));
            i10++;
        }
        V v15 = this.f6209d;
        if (v15 != null) {
            return v15;
        }
        ae.r.t("valueVector");
        return null;
    }

    @Override // c0.p1
    public int e() {
        return this.f6208c;
    }

    @Override // c0.p1
    public int f() {
        return this.f6207b;
    }

    @Override // c0.m1
    public V g(long j10, V v10, V v11, V v12) {
        long jB = n1.b(this, j10 / 1000000);
        if (jB <= 0) {
            return v12;
        }
        q qVarD = n1.d(this, jB - 1, v10, v11, v12);
        q qVarD2 = n1.d(this, jB, v10, v11, v12);
        h(v10);
        int i10 = 0;
        int iB = qVarD.b();
        while (true) {
            V v13 = null;
            if (i10 >= iB) {
                break;
            }
            V v14 = this.f6210e;
            if (v14 == null) {
                ae.r.t("velocityVector");
            } else {
                v13 = v14;
            }
            v13.e(i10, (qVarD.a(i10) - qVarD2.a(i10)) * 1000.0f);
            i10++;
        }
        V v15 = this.f6210e;
        if (v15 != null) {
            return v15;
        }
        ae.r.t("velocityVector");
        return null;
    }
}
