package t0;

/* JADX INFO: loaded from: classes.dex */
public class d3<T> extends d1.h0 implements d1.u<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e3<T> f20658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a<T> f20659c;

    private static final class a<T> extends d1.i0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private T f20660c;

        public a(T t10) {
            this.f20660c = t10;
        }

        @Override // d1.i0
        public void c(d1.i0 i0Var) {
            ae.r.d(i0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord>");
            this.f20660c = ((a) i0Var).f20660c;
        }

        @Override // d1.i0
        public d1.i0 d() {
            return new a(this.f20660c);
        }

        public final T i() {
            return this.f20660c;
        }

        public final void j(T t10) {
            this.f20660c = t10;
        }
    }

    public d3(T t10, e3<T> e3Var) {
        this.f20658b = e3Var;
        this.f20659c = new a<>(t10);
    }

    @Override // d1.u
    public e3<T> d() {
        return this.f20658b;
    }

    @Override // d1.g0
    public d1.i0 f() {
        return this.f20659c;
    }

    @Override // t0.k1, t0.p3
    public T getValue() {
        return (T) ((a) d1.p.X(this.f20659c, this)).i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // d1.g0
    public d1.i0 l(d1.i0 i0Var, d1.i0 i0Var2, d1.i0 i0Var3) {
        ae.r.d(i0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar = (a) i0Var;
        ae.r.d(i0Var2, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar2 = (a) i0Var2;
        ae.r.d(i0Var3, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        a aVar3 = (a) i0Var3;
        if (d().a(aVar2.i(), aVar3.i())) {
            return i0Var2;
        }
        Object objB = d().b(aVar.i(), aVar2.i(), aVar3.i());
        if (objB == null) {
            return null;
        }
        d1.i0 i0VarD = aVar3.d();
        ae.r.d(i0VarD, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl.mergeRecords$lambda$2>");
        ((a) i0VarD).j(objB);
        return i0VarD;
    }

    @Override // d1.g0
    public void n(d1.i0 i0Var) {
        ae.r.d(i0Var, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutableStateImpl.StateStateRecord<T of androidx.compose.runtime.SnapshotMutableStateImpl>");
        this.f20659c = (a) i0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // t0.k1
    public void setValue(T t10) {
        d1.k kVarD;
        a aVar = (a) d1.p.F(this.f20659c);
        if (d().a(aVar.i(), t10)) {
            return;
        }
        a<T> aVar2 = this.f20659c;
        d1.p.J();
        synchronized (d1.p.I()) {
            kVarD = d1.k.f9368e.d();
            ((a) d1.p.S(aVar2, this, kVarD, aVar)).j(t10);
            md.i0 i0Var = md.i0.f15558a;
        }
        d1.p.Q(kVarD, this);
    }

    public String toString() {
        return "MutableState(value=" + ((a) d1.p.F(this.f20659c)).i() + ")@" + hashCode();
    }
}
