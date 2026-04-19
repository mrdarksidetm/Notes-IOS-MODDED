package cf;

/* JADX INFO: loaded from: classes2.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final af.v f6916a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f6917b;

    /* synthetic */ class a extends ae.o implements zd.p<ye.f, Integer, Boolean> {
        a(Object obj) {
            super(2, obj, b0.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0);
        }

        public final Boolean d(ye.f fVar, int i10) {
            ae.r.f(fVar, "p0");
            return Boolean.valueOf(((b0) this.receiver).e(fVar, i10));
        }

        @Override // zd.p
        public /* bridge */ /* synthetic */ Boolean invoke(ye.f fVar, Integer num) {
            return d(fVar, num.intValue());
        }
    }

    public b0(ye.f fVar) {
        ae.r.f(fVar, "descriptor");
        this.f6916a = new af.v(fVar, new a(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(ye.f fVar, int i10) {
        boolean z10 = !fVar.j(i10) && fVar.i(i10).c();
        this.f6917b = z10;
        return z10;
    }

    public final boolean b() {
        return this.f6917b;
    }

    public final void c(int i10) {
        this.f6916a.a(i10);
    }

    public final int d() {
        return this.f6916a.d();
    }
}
