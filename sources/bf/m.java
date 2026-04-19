package bf;

import cf.u0;

/* JADX INFO: loaded from: classes2.dex */
final class m extends a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(f fVar, df.c cVar) {
        super(fVar, cVar, null);
        ae.r.f(fVar, "configuration");
        ae.r.f(cVar, "module");
        h();
    }

    private final void h() {
        if (ae.r.b(a(), df.d.a())) {
            return;
        }
        a().a(new u0(f().l(), f().c()));
    }
}
