package i0;

/* JADX INFO: loaded from: classes.dex */
public interface b0 {

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class a extends ae.s implements zd.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f12050a = new a();

        a() {
            super(1);
        }

        public final Void a(int i10) {
            return null;
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).intValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void a(b0 b0Var, int i10, zd.l lVar, zd.p pVar, zd.l lVar2, zd.r rVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
        zd.l lVar3 = (i11 & 2) != 0 ? null : lVar;
        zd.p pVar2 = (i11 & 4) != 0 ? null : pVar;
        if ((i11 & 8) != 0) {
            lVar2 = a.f12050a;
        }
        b0Var.b(i10, lVar3, pVar2, lVar2, rVar);
    }

    void b(int i10, zd.l<? super Integer, ? extends Object> lVar, zd.p<? super s, ? super Integer, b> pVar, zd.l<? super Integer, ? extends Object> lVar2, zd.r<? super q, ? super Integer, ? super t0.l, ? super Integer, md.i0> rVar);
}
