package sf;

import uf.a0;

/* JADX INFO: loaded from: classes2.dex */
public class d implements h {
    @Override // sf.h
    public j a(i iVar) {
        m mVarA = iVar.a();
        l lVarO = mVarA.o();
        int iG = mVarA.g('`');
        l lVarO2 = mVarA.o();
        while (mVarA.b('`') > 0) {
            l lVarO3 = mVarA.o();
            if (mVarA.g('`') == iG) {
                uf.d dVar = new uf.d();
                String strReplace = mVarA.d(lVarO2, lVarO3).c().replace('\n', ' ');
                if (strReplace.length() >= 3 && strReplace.charAt(0) == ' ' && strReplace.charAt(strReplace.length() - 1) == ' ' && tf.f.e(strReplace)) {
                    strReplace = strReplace.substring(1, strReplace.length() - 1);
                }
                dVar.o(strReplace);
                return j.b(dVar, mVarA.o());
            }
        }
        return j.b(new a0(mVarA.d(lVarO, lVarO2).c()), lVarO2);
    }
}
