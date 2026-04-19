package o3;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f16327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f16328b;

    public g0(ViewGroup viewGroup) {
    }

    public int a() {
        return this.f16327a | this.f16328b;
    }

    public void b(View view, View view2, int i10) {
        c(view, view2, i10, 0);
    }

    public void c(View view, View view2, int i10, int i11) {
        if (i11 == 1) {
            this.f16328b = i10;
        } else {
            this.f16327a = i10;
        }
    }

    public void d(View view) {
        e(view, 0);
    }

    public void e(View view, int i10) {
        if (i10 == 1) {
            this.f16328b = 0;
        } else {
            this.f16327a = 0;
        }
    }
}
