package sf;

import uf.s;

/* JADX INFO: loaded from: classes2.dex */
public abstract class j {
    protected j() {
    }

    public static j a() {
        return null;
    }

    public static j b(s sVar, l lVar) {
        if (sVar == null) {
            throw new NullPointerException("node must not be null");
        }
        if (lVar != null) {
            return new k(sVar, lVar);
        }
        throw new NullPointerException("position must not be null");
    }
}
