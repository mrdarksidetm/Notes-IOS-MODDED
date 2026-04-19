package g5;

import org.chromium.support_lib_boundary.WebResourceRequestBoundaryInterface;

/* JADX INFO: loaded from: classes.dex */
public class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WebResourceRequestBoundaryInterface f11468a;

    public j0(WebResourceRequestBoundaryInterface webResourceRequestBoundaryInterface) {
        this.f11468a = webResourceRequestBoundaryInterface;
    }

    public boolean a() {
        return this.f11468a.isRedirect();
    }
}
