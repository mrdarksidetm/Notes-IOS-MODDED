package sf;

import java.util.regex.Pattern;
import uf.a0;
import uf.o;

/* JADX INFO: loaded from: classes2.dex */
public class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f20584a = Pattern.compile("^[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Pattern f20585b = Pattern.compile("^([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)$");

    @Override // sf.h
    public j a(i iVar) {
        String str;
        m mVarA = iVar.a();
        mVarA.h();
        l lVarO = mVarA.o();
        if (mVarA.b('>') > 0) {
            vf.h hVarD = mVarA.d(lVarO, mVarA.o());
            String strC = hVarD.c();
            mVarA.h();
            if (f20584a.matcher(strC).matches()) {
                str = strC;
            } else if (f20585b.matcher(strC).matches()) {
                str = "mailto:" + strC;
            } else {
                str = null;
            }
            if (str != null) {
                o oVar = new o(str, null);
                a0 a0Var = new a0(strC);
                a0Var.k(hVarD.e());
                oVar.b(a0Var);
                return j.b(oVar, mVarA.o());
            }
        }
        return j.a();
    }
}
