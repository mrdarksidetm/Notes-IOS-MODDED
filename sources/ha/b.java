package ha;

import ga.d;
import ha.b;

/* JADX INFO: loaded from: classes2.dex */
public interface b<T extends b<T>> {
    <U> T registerEncoder(Class<U> cls, d<? super U> dVar);
}
