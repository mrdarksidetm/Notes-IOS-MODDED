package f5;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebResourceResponse;
import g5.y;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<e> f11145a;

    public static final class a implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private y f11146a;

        public a(Context context) {
            this.f11146a = new y(context);
        }

        @Override // f5.q.d
        public WebResourceResponse handle(String str) {
            try {
                return new WebResourceResponse(y.f(str), null, this.f11146a.h(str));
            } catch (IOException e10) {
                Log.e("WebViewAssetLoader", "Error opening asset path: " + str, e10);
                return new WebResourceResponse(null, null, null);
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f11147a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f11148b = "appassets.androidplatform.net";

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List<n3.d<String, d>> f11149c = new ArrayList();

        public b a(String str, d dVar) {
            this.f11149c.add(n3.d.a(str, dVar));
            return this;
        }

        public q b() {
            ArrayList arrayList = new ArrayList();
            for (n3.d<String, d> dVar : this.f11149c) {
                arrayList.add(new e(this.f11148b, dVar.f15913a, this.f11147a, dVar.f15914b));
            }
            return new q(arrayList);
        }

        public b c(String str) {
            this.f11148b = str;
            return this;
        }

        public b d(boolean z10) {
            this.f11147a = z10;
            return this;
        }
    }

    public static final class c implements d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final String[] f11150b = {"app_webview/", "databases/", "lib/", "shared_prefs/", "code_cache/"};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final File f11151a;

        public c(Context context, File file) {
            try {
                this.f11151a = new File(y.a(file));
                if (a(context)) {
                    return;
                }
                throw new IllegalArgumentException("The given directory \"" + file + "\" doesn't exist under an allowed app internal storage directory");
            } catch (IOException e10) {
                throw new IllegalArgumentException("Failed to resolve the canonical path for the given directory: " + file.getPath(), e10);
            }
        }

        private boolean a(Context context) throws IOException {
            String strA = y.a(this.f11151a);
            String strA2 = y.a(context.getCacheDir());
            String strA3 = y.a(y.c(context));
            if ((!strA.startsWith(strA2) && !strA.startsWith(strA3)) || strA.equals(strA2) || strA.equals(strA3)) {
                return false;
            }
            for (String str : f11150b) {
                if (strA.startsWith(strA3 + str)) {
                    return false;
                }
            }
            return true;
        }

        @Override // f5.q.d
        public WebResourceResponse handle(String str) {
            File fileB;
            try {
                fileB = y.b(this.f11151a, str);
            } catch (IOException e10) {
                Log.e("WebViewAssetLoader", "Error opening the requested path: " + str, e10);
            }
            if (fileB != null) {
                return new WebResourceResponse(y.f(str), null, y.i(fileB));
            }
            Log.e("WebViewAssetLoader", String.format("The requested file: %s is outside the mounted directory: %s", str, this.f11151a));
            return new WebResourceResponse(null, null, null);
        }
    }

    public interface d {
        WebResourceResponse handle(String str);
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final boolean f11152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f11153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final String f11154c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final d f11155d;

        e(String str, String str2, boolean z10, d dVar) {
            if (str2.isEmpty() || str2.charAt(0) != '/') {
                throw new IllegalArgumentException("Path should start with a slash '/'.");
            }
            if (!str2.endsWith("/")) {
                throw new IllegalArgumentException("Path should end with a slash '/'");
            }
            this.f11153b = str;
            this.f11154c = str2;
            this.f11152a = z10;
            this.f11155d = dVar;
        }

        public String a(String str) {
            return str.replaceFirst(this.f11154c, "");
        }

        public d b(Uri uri) {
            if (uri.getScheme().equals("http") && !this.f11152a) {
                return null;
            }
            if ((uri.getScheme().equals("http") || uri.getScheme().equals("https")) && uri.getAuthority().equals(this.f11153b) && uri.getPath().startsWith(this.f11154c)) {
                return this.f11155d;
            }
            return null;
        }
    }

    public static final class f implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private y f11156a;

        public f(Context context) {
            this.f11156a = new y(context);
        }

        @Override // f5.q.d
        public WebResourceResponse handle(String str) {
            StringBuilder sb2;
            String str2;
            try {
                return new WebResourceResponse(y.f(str), null, this.f11156a.j(str));
            } catch (Resources.NotFoundException e10) {
                e = e10;
                sb2 = new StringBuilder();
                str2 = "Resource not found from the path: ";
                sb2.append(str2);
                sb2.append(str);
                Log.e("WebViewAssetLoader", sb2.toString(), e);
                return new WebResourceResponse(null, null, null);
            } catch (IOException e11) {
                e = e11;
                sb2 = new StringBuilder();
                str2 = "Error opening resource from the path: ";
                sb2.append(str2);
                sb2.append(str);
                Log.e("WebViewAssetLoader", sb2.toString(), e);
                return new WebResourceResponse(null, null, null);
            }
        }
    }

    q(List<e> list) {
        this.f11145a = list;
    }

    public WebResourceResponse a(Uri uri) {
        WebResourceResponse webResourceResponseHandle;
        for (e eVar : this.f11145a) {
            d dVarB = eVar.b(uri);
            if (dVarB != null && (webResourceResponseHandle = dVarB.handle(eVar.a(uri.getPath()))) != null) {
                return webResourceResponseHandle;
            }
        }
        return null;
    }
}
