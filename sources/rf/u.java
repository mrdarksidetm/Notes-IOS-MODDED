package rf;

import uf.b0;

/* JADX INFO: loaded from: classes2.dex */
public class u extends wf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b0 f19577a = new b0();

    public static class a extends wf.b {
        @Override // wf.e
        public wf.f a(wf.h hVar, wf.g gVar) {
            if (hVar.c() >= 4) {
                return wf.f.c();
            }
            int iE = hVar.e();
            CharSequence charSequenceA = hVar.d().a();
            return u.k(charSequenceA, iE) ? wf.f.d(new u()).b(charSequenceA.length()) : wf.f.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean k(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i10 < length) {
            char cCharAt = charSequence.charAt(i10);
            if (cCharAt != '\t' && cCharAt != ' ') {
                if (cCharAt == '*') {
                    i13++;
                } else if (cCharAt == '-') {
                    i11++;
                } else {
                    if (cCharAt != '_') {
                        return false;
                    }
                    i12++;
                }
            }
            i10++;
        }
        return (i11 >= 3 && i12 == 0 && i13 == 0) || (i12 >= 3 && i11 == 0 && i13 == 0) || (i13 >= 3 && i11 == 0 && i12 == 0);
    }

    @Override // wf.d
    public wf.c e(wf.h hVar) {
        return wf.c.d();
    }

    @Override // wf.d
    public uf.a g() {
        return this.f19577a;
    }
}
