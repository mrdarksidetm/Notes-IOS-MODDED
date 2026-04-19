package a3;

import md.q;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f415a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.SecureOff.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.SecureOn.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.Inherit.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f415a = iArr;
        }
    }

    public static final boolean a(g gVar, boolean z10) {
        int i10 = a.f415a[gVar.ordinal()];
        if (i10 == 1) {
            return false;
        }
        if (i10 == 2) {
            return true;
        }
        if (i10 == 3) {
            return z10;
        }
        throw new q();
    }
}
