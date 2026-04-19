package rf;

/* JADX INFO: loaded from: classes2.dex */
public class i extends wf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final uf.h f19518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f19519b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private StringBuilder f19520c;

    public static class a extends wf.b {
        @Override // wf.e
        public wf.f a(wf.h hVar, wf.g gVar) {
            int iC = hVar.c();
            if (iC >= tf.f.f21413a) {
                return wf.f.c();
            }
            int iE = hVar.e();
            i iVarL = i.l(hVar.d().a(), iE, iC);
            return iVarL != null ? wf.f.d(iVarL).b(iE + iVarL.f19518a.q()) : wf.f.c();
        }
    }

    public i(char c10, int i10, int i11) {
        uf.h hVar = new uf.h();
        this.f19518a = hVar;
        this.f19520c = new StringBuilder();
        hVar.s(c10);
        hVar.u(i10);
        hVar.t(i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static i l(CharSequence charSequence, int i10, int i11) {
        int length = charSequence.length();
        int i12 = 0;
        int i13 = 0;
        for (int i14 = i10; i14 < length; i14++) {
            char cCharAt = charSequence.charAt(i14);
            if (cCharAt == '`') {
                i12++;
            } else {
                if (cCharAt != '~') {
                    break;
                }
                i13++;
            }
        }
        if (i12 >= 3 && i13 == 0) {
            if (tf.f.b('`', charSequence, i10 + i12) != -1) {
                return null;
            }
            return new i('`', i12, i11);
        }
        if (i13 < 3 || i12 != 0) {
            return null;
        }
        return new i('~', i13, i11);
    }

    private boolean m(CharSequence charSequence, int i10) {
        char cO = this.f19518a.o();
        int iQ = this.f19518a.q();
        int iM = tf.f.m(cO, charSequence, i10, charSequence.length()) - i10;
        return iM >= iQ && tf.f.o(charSequence, i10 + iM, charSequence.length()) == charSequence.length();
    }

    @Override // wf.a, wf.d
    public void b() {
        this.f19518a.v(tf.c.d(this.f19519b.trim()));
        this.f19518a.w(this.f19520c.toString());
    }

    @Override // wf.d
    public wf.c e(wf.h hVar) {
        int iE = hVar.e();
        int index = hVar.getIndex();
        CharSequence charSequenceA = hVar.d().a();
        if (hVar.c() < tf.f.f21413a && iE < charSequenceA.length() && charSequenceA.charAt(iE) == this.f19518a.o() && m(charSequenceA, iE)) {
            return wf.c.c();
        }
        int length = charSequenceA.length();
        for (int iP = this.f19518a.p(); iP > 0 && index < length && charSequenceA.charAt(index) == ' '; iP--) {
            index++;
        }
        return wf.c.b(index);
    }

    @Override // wf.d
    public uf.a g() {
        return this.f19518a;
    }

    @Override // wf.a, wf.d
    public void i(vf.g gVar) {
        if (this.f19519b == null) {
            this.f19519b = gVar.a().toString();
        } else {
            this.f19520c.append(gVar.a());
            this.f19520c.append('\n');
        }
    }
}
