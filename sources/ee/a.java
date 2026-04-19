package ee;

import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a extends c {
    @Override // ee.c
    public int b(int i10) {
        return d.e(g().nextInt(), i10);
    }

    @Override // ee.c
    public int c() {
        return g().nextInt();
    }

    @Override // ee.c
    public int d(int i10) {
        return g().nextInt(i10);
    }

    @Override // ee.c
    public long e() {
        return g().nextLong();
    }

    public abstract Random g();
}
