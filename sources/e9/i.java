package e9;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class i {
    public static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }
}
