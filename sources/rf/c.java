package rf;

/* JADX INFO: loaded from: classes2.dex */
public class c extends wf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final uf.b f19475a = new uf.b();

    public static class a extends wf.b {
        @Override // wf.e
        public wf.f a(wf.h hVar, wf.g gVar) {
            int iE = hVar.e();
            if (!c.l(hVar, iE)) {
                return wf.f.c();
            }
            int iA = hVar.a() + hVar.c() + 1;
            if (tf.f.j(hVar.d().a(), iE + 1)) {
                iA++;
            }
            return wf.f.d(new c()).a(iA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(wf.h hVar, int i10) {
        CharSequence charSequenceA = hVar.d().a();
        return hVar.c() < tf.f.f21413a && i10 < charSequenceA.length() && charSequenceA.charAt(i10) == '>';
    }

    @Override // wf.a, wf.d
    public boolean a() {
        return true;
    }

    @Override // wf.d
    public wf.c e(wf.h hVar) {
        int iE = hVar.e();
        if (!l(hVar, iE)) {
            return wf.c.d();
        }
        int iA = hVar.a() + hVar.c() + 1;
        if (tf.f.j(hVar.d().a(), iE + 1)) {
            iA++;
        }
        return wf.c.a(iA);
    }

    @Override // wf.a, wf.d
    public boolean h(uf.a aVar) {
        return true;
    }

    @Override // wf.d
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public uf.b g() {
        return this.f19475a;
    }
}
