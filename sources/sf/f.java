package sf;

import uf.a0;

/* JADX INFO: loaded from: classes2.dex */
public class f implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final tf.a f20588a = tf.a.b().d('0', '9').d('A', 'F').d('a', 'f').b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final tf.a f20589b = tf.a.b().d('0', '9').b();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final tf.a f20590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final tf.a f20591d;

    static {
        tf.a aVarB = tf.a.b().d('A', 'Z').d('a', 'z').b();
        f20590c = aVarB;
        f20591d = aVarB.c().d('0', '9').b();
    }

    private j b(m mVar, l lVar) {
        return j.b(new a0(tf.d.a(mVar.d(lVar, mVar.o()).c())), mVar.o());
    }

    @Override // sf.h
    public j a(i iVar) {
        m mVarA = iVar.a();
        l lVarO = mVarA.o();
        mVarA.h();
        char cL = mVarA.l();
        if (cL == '#') {
            mVarA.h();
            if (mVarA.i('x') || mVarA.i('X')) {
                int iF = mVarA.f(f20588a);
                if (1 <= iF && iF <= 6 && mVarA.i(';')) {
                    return b(mVarA, lVarO);
                }
            } else {
                int iF2 = mVarA.f(f20589b);
                if (1 <= iF2 && iF2 <= 7 && mVarA.i(';')) {
                    return b(mVarA, lVarO);
                }
            }
        } else if (f20590c.a(cL)) {
            mVarA.f(f20591d);
            if (mVarA.i(';')) {
                return b(mVarA, lVarO);
            }
        }
        return j.a();
    }
}
