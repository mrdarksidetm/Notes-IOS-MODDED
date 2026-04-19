package sf;

import java.util.regex.Pattern;
import uf.a0;

/* JADX INFO: loaded from: classes2.dex */
public class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f20586a = Pattern.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");

    @Override // sf.h
    public j a(i iVar) {
        m mVarA = iVar.a();
        mVarA.h();
        char cL = mVarA.l();
        if (cL == '\n') {
            mVarA.h();
            return j.b(new uf.i(), mVarA.o());
        }
        if (!f20586a.matcher(String.valueOf(cL)).matches()) {
            return j.b(new a0("\\"), mVarA.o());
        }
        mVarA.h();
        return j.b(new a0(String.valueOf(cL)), mVarA.o());
    }
}
