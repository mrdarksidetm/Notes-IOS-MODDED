package w0;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public interface f<K, V> extends Map, be.a {

    public interface a<K, V> extends Map<K, V>, be.e {
        f<K, V> build();
    }

    a<K, V> builder();
}
