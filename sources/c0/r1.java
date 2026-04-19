package c0;

import c0.q;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class r1<V extends q> implements q1<V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f6186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private V f6187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private V f6188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private V f6189d;

    public static final class a implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ f0 f6190a;

        a(f0 f0Var) {
            this.f6190a = f0Var;
        }

        @Override // c0.s
        public f0 get(int i10) {
            return this.f6190a;
        }
    }

    public r1(f0 f0Var) {
        this(new a(f0Var));
    }

    public r1(s sVar) {
        this.f6186a = sVar;
    }

    @Override // c0.m1
    public long b(V v10, V v11, V v12) {
        Iterator<Integer> it = ge.o.t(0, v10.b()).iterator();
        long jMax = 0;
        while (it.hasNext()) {
            int iNextInt = ((nd.l0) it).nextInt();
            jMax = Math.max(jMax, this.f6186a.get(iNextInt).c(v10.a(iNextInt), v11.a(iNextInt), v12.a(iNextInt)));
        }
        return jMax;
    }

    @Override // c0.m1
    public V c(V v10, V v11, V v12) {
        if (this.f6189d == null) {
            this.f6189d = (V) r.g(v12);
        }
        V v13 = this.f6189d;
        if (v13 == null) {
            ae.r.t("endVelocityVector");
            v13 = null;
        }
        int iB = v13.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v14 = this.f6189d;
            if (v14 == null) {
                ae.r.t("endVelocityVector");
                v14 = null;
            }
            v14.e(i10, this.f6186a.get(i10).d(v10.a(i10), v11.a(i10), v12.a(i10)));
        }
        V v15 = this.f6189d;
        if (v15 != null) {
            return v15;
        }
        ae.r.t("endVelocityVector");
        return null;
    }

    @Override // c0.m1
    public V d(long j10, V v10, V v11, V v12) {
        if (this.f6187b == null) {
            this.f6187b = (V) r.g(v10);
        }
        V v13 = this.f6187b;
        if (v13 == null) {
            ae.r.t("valueVector");
            v13 = null;
        }
        int iB = v13.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v14 = this.f6187b;
            if (v14 == null) {
                ae.r.t("valueVector");
                v14 = null;
            }
            v14.e(i10, this.f6186a.get(i10).e(j10, v10.a(i10), v11.a(i10), v12.a(i10)));
        }
        V v15 = this.f6187b;
        if (v15 != null) {
            return v15;
        }
        ae.r.t("valueVector");
        return null;
    }

    @Override // c0.m1
    public V g(long j10, V v10, V v11, V v12) {
        if (this.f6188c == null) {
            this.f6188c = (V) r.g(v12);
        }
        V v13 = this.f6188c;
        if (v13 == null) {
            ae.r.t("velocityVector");
            v13 = null;
        }
        int iB = v13.b();
        for (int i10 = 0; i10 < iB; i10++) {
            V v14 = this.f6188c;
            if (v14 == null) {
                ae.r.t("velocityVector");
                v14 = null;
            }
            v14.e(i10, this.f6186a.get(i10).b(j10, v10.a(i10), v11.a(i10), v12.a(i10)));
        }
        V v15 = this.f6188c;
        if (v15 != null) {
            return v15;
        }
        ae.r.t("velocityVector");
        return null;
    }
}
