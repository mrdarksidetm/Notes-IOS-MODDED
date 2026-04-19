package g5;

import android.net.Uri;
import android.webkit.WebResourceRequest;

/* JADX INFO: loaded from: classes.dex */
public class a {
    public static Uri a(WebResourceRequest webResourceRequest) {
        return webResourceRequest.getUrl();
    }

    public static boolean b(WebResourceRequest webResourceRequest) {
        return webResourceRequest.isForMainFrame();
    }
}
