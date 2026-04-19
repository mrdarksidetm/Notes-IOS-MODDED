package l1;

import android.graphics.Path;
import android.graphics.PathMeasure;

/* JADX INFO: loaded from: classes.dex */
public final class n implements i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final PathMeasure f14557a;

    public n(PathMeasure pathMeasure) {
        this.f14557a = pathMeasure;
    }

    @Override // l1.i1
    public void a(f1 f1Var, boolean z10) {
        Path pathS;
        PathMeasure pathMeasure = this.f14557a;
        if (f1Var == null) {
            pathS = null;
        } else {
            if (!(f1Var instanceof k)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            pathS = ((k) f1Var).s();
        }
        pathMeasure.setPath(pathS, z10);
    }

    @Override // l1.i1
    public float b() {
        return this.f14557a.getLength();
    }

    @Override // l1.i1
    public boolean c(float f10, float f11, f1 f1Var, boolean z10) {
        PathMeasure pathMeasure = this.f14557a;
        if (f1Var instanceof k) {
            return pathMeasure.getSegment(f10, f11, ((k) f1Var).s(), z10);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }
}
