package c5;

import android.view.ViewGroup;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewGroup f6465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Runnable f6466b;

    public static k b(ViewGroup viewGroup) {
        return (k) viewGroup.getTag(i.f6462b);
    }

    static void c(ViewGroup viewGroup, k kVar) {
        viewGroup.setTag(i.f6462b, kVar);
    }

    public void a() {
        Runnable runnable;
        if (b(this.f6465a) != this || (runnable = this.f6466b) == null) {
            return;
        }
        runnable.run();
    }
}
