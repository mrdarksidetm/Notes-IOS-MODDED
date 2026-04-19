package g5;

import java.util.List;
import org.chromium.support_lib_boundary.WebViewCookieManagerBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WebViewCookieManagerBoundaryInterface f11455a;

    public a0(WebViewCookieManagerBoundaryInterface webViewCookieManagerBoundaryInterface) {
        this.f11455a = webViewCookieManagerBoundaryInterface;
    }

    public List<String> a(String str) {
        return this.f11455a.getCookieInfo(str);
    }
}
