package s7;

import ae.r;
import android.content.Context;
import java.io.File;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f20424a = new a();

    private a() {
    }

    public final File a(Context context) {
        r.f(context, "context");
        String string = UUID.randomUUID().toString();
        r.e(string, "toString(...)");
        return new File(context.getCacheDir(), string);
    }
}
