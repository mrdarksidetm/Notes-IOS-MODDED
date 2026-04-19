package t8;

import android.content.Intent;

/* JADX INFO: loaded from: classes.dex */
public class p extends Exception {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Intent f21343a;

    public p(String str, Intent intent) {
        super(str);
        this.f21343a = intent;
    }

    public Intent a() {
        return new Intent(this.f21343a);
    }
}
