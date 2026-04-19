package okhttp3;

import ae.r;
import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLCredentialContract;
import hf.f;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes2.dex */
public final class Credentials {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Credentials f16802a = new Credentials();

    private Credentials() {
    }

    public static final String a(String str, String str2, Charset charset) {
        r.f(str, URLCredentialContract.FeedEntry.COLUMN_NAME_USERNAME);
        r.f(str2, URLCredentialContract.FeedEntry.COLUMN_NAME_PASSWORD);
        r.f(charset, "charset");
        return r.m("Basic ", f.f11960d.c(str + ':' + str2, charset).a());
    }
}
