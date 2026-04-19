package o5;

import ae.r;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import androidx.window.extensions.layout.FoldingFeature;
import androidx.window.extensions.layout.WindowLayoutInfo;
import java.util.ArrayList;
import java.util.List;
import m5.c;
import m5.d;
import m5.k;
import m5.l;
import m5.n;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f16373a = new f();

    private f() {
    }

    private final boolean d(l lVar, i5.b bVar) {
        Rect rectA = lVar.a();
        if (bVar.e()) {
            return false;
        }
        if (bVar.d() != rectA.width() && bVar.a() != rectA.height()) {
            return false;
        }
        if (bVar.d() >= rectA.width() || bVar.a() >= rectA.height()) {
            return (bVar.d() == rectA.width() && bVar.a() == rectA.height()) ? false : true;
        }
        return false;
    }

    public final m5.c a(l lVar, FoldingFeature foldingFeature) {
        d.b bVarA;
        c.C0352c c0352c;
        r.f(lVar, "windowMetrics");
        r.f(foldingFeature, "oemFeature");
        int type = foldingFeature.getType();
        if (type == 1) {
            bVarA = d.b.f15431b.a();
        } else {
            if (type != 2) {
                return null;
            }
            bVarA = d.b.f15431b.b();
        }
        int state = foldingFeature.getState();
        if (state == 1) {
            c0352c = c.C0352c.f15424c;
        } else {
            if (state != 2) {
                return null;
            }
            c0352c = c.C0352c.f15425d;
        }
        Rect bounds = foldingFeature.getBounds();
        r.e(bounds, "oemFeature.bounds");
        if (!d(lVar, new i5.b(bounds))) {
            return null;
        }
        Rect bounds2 = foldingFeature.getBounds();
        r.e(bounds2, "oemFeature.bounds");
        return new m5.d(new i5.b(bounds2), bVarA, c0352c);
    }

    public final k b(Context context, WindowLayoutInfo windowLayoutInfo) throws Exception {
        l lVarD;
        r.f(context, "context");
        r.f(windowLayoutInfo, "info");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            lVarD = n.f15472b.c(context);
        } else {
            if (i10 < 29 || !(context instanceof Activity)) {
                throw new UnsupportedOperationException("Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q.");
            }
            lVarD = n.f15472b.d((Activity) context);
        }
        return c(lVarD, windowLayoutInfo);
    }

    public final k c(l lVar, WindowLayoutInfo windowLayoutInfo) {
        m5.c cVarA;
        r.f(lVar, "windowMetrics");
        r.f(windowLayoutInfo, "info");
        List<FoldingFeature> displayFeatures = windowLayoutInfo.getDisplayFeatures();
        r.e(displayFeatures, "info.displayFeatures");
        ArrayList arrayList = new ArrayList();
        for (FoldingFeature foldingFeature : displayFeatures) {
            if (foldingFeature instanceof FoldingFeature) {
                f fVar = f16373a;
                r.e(foldingFeature, "feature");
                cVarA = fVar.a(lVar, foldingFeature);
            } else {
                cVarA = null;
            }
            if (cVarA != null) {
                arrayList.add(cVarA);
            }
        }
        return new k(arrayList);
    }
}
