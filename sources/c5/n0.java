package c5;

import android.view.View;
import android.view.WindowId;

/* JADX INFO: loaded from: classes.dex */
class n0 implements o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WindowId f6526a;

    n0(View view) {
        this.f6526a = view.getWindowId();
    }

    public boolean equals(Object obj) {
        return (obj instanceof n0) && ((n0) obj).f6526a.equals(this.f6526a);
    }

    public int hashCode() {
        return this.f6526a.hashCode();
    }
}
