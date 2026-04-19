package v2;

import ie.g;
import ie.o;

/* JADX INFO: loaded from: classes.dex */
public interface a<T> {
    default int getCount() {
        return o.k(getValues());
    }

    g<T> getValues();
}
