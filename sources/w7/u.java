package w7;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
abstract class u implements Closeable {

    interface a {
        a a(Context context);

        u build();
    }

    u() {
    }

    abstract e8.d a();

    abstract t b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        a().close();
    }
}
