package wc;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public abstract class h {
    private final sc.h<Object> createArgsCodec;

    public h(sc.h<Object> hVar) {
        this.createArgsCodec = hVar;
    }

    public abstract g create(Context context, int i10, Object obj);

    public final sc.h<Object> getCreateArgsCodec() {
        return this.createArgsCodec;
    }
}
